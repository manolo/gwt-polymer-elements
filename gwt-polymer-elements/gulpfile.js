"use strict";
var args = require('minimist')(process.argv.slice(2));
var gulp = require('gulp');
var bower = require('gulp-bower')
var map = require('map-stream');
var fs = require('fs-extra');
var gutil = require('gulp-util');
var _ = require('lodash');
var runSequence = require('run-sequence');
var helpers = require("./template/helpers");
var hyd = require("hydrolysis");
var StreamFromArray = require('stream-from-array');

// You can change the namespace of your package here.
var ns = "com.vaadin.components.gwt.polymer";
var target = "./src/main/java/" + ns.replace(/\./g,'/') + "/client/";
var resources = "./src/main/resources/" + ns.replace(/\./g,'/') + "/public/";
var bowerdir = resources + "bower_components/";

// Using global because if we try to pass it to templates via the helper or any object
// we need to call merge which makes a copy of the structure per template slowing down
// the performance.
global.parsed = []; // we store all parsed objects so as we can iterate or find behaviors
global.imports = []; // we store a table for elements and import files

gulp.task('clean:target', function() {
  fs.removeSync(target + 'element');
  fs.removeSync(target + 'widget');
});

gulp.task('clean:resources', function() {
  fs.removeSync(resources);
});

gulp.task('clean', ['clean:target', 'clean:resources']);

gulp.task('bower:install', ['clean'], function() {
  if(!args.package) {
    args.package = 'PolymerElements/paper-elements';
  }

  return bower({ cmd: 'install', directory: bowerdir}, [[args.package]])
    .pipe(map(function(file, cb){
      // iron-a11y-keys lacks the fire-keys-pressed annotation.
      if (/iron-a11y-keys.html/.test(file.relative)) {
        var s = "/**\n" +
                " * @event keys-pressed\n" +
                " * @param {Object} detail\n" +
                " *  @param {boolean} detail.shift true if shift key is pressed\n" +
                " *  @param {boolean} detail.ctrl true if ctrl key is pressed\n" +
                " *  @param {boolean} detail.meta true if meta key is pressed\n" +
                " *  @param {boolean} detail.alt true if alt key is pressed\n" +
                " *  @param {String} detail.key the normalized key\n" +
                " */\n";
        file.contents = new Buffer(String(file.contents)
          .replace(/(\n.*?_fireKeysPressed:)/, s + '$1')
        );
      }
      cb(null, file);
    }))
    .pipe(gulp.dest(bowerdir));
});

gulp.task('parse', ['analyze'], function(cb) {
  global.parsed.forEach(function(item) {
    if (!helpers.isBehavior(item) && item.behaviors && item.behaviors.length) {
      item.behaviors.forEach(function(name) {
        var behavior = helpers.findBehavior(name)
        if (behavior) {
          behavior.properties.forEach(function(prop) {
            prop.isBehavior = true;
            prop.behavior = helpers.className(item.is);
            item.properties.push(prop);
          });
        }
      });
    }
    // Hydrolysis duplicates attributes
    helpers.removeDuplicates(item.properties, 'name');
    // We don't want to wrap any private api
    helpers.removePrivateApi(item.properties, 'name');
  });
  cb();
});

gulp.task('analyze', ['clean:target'], function() {
  return gulp.src([bowerdir + "*/*.html",
    // ignore all demo.html, index.html and metadata.html files
    "!" + bowerdir + "*/*demo.html",
    "!" + bowerdir + "*/*index.html",
    "!" + bowerdir + "*/*metadata.html",
    // includes a set of js files only, and some do not exist
    "!" + bowerdir + "*/*web-animations.html",
    // Not useful in gwt and also has spurious event names
    "!" + bowerdir + "*/*iron-jsonp-library.html",
    ])
    .pipe(map(function(file, cb) {
      hyd.Analyzer.analyze(bowerdir + file.relative).then(function(result) {
        var jsonArray = result.elements && result.elements[0] ? result.elements : result.behaviors;
        jsonArray.forEach(function(item) {
          var path = file.relative.replace(/\\/, '/');
          if (item.is) {
            item.name = item.is;
            item.path = path;
            // Save all items in an array for later processing
            global.parsed.push(item);
            // remember href in a separate hash
            global.imports.push({
              element: item.is,
              path: path
            });
          }
        });
        cb(null, file);
      })
      .catch(function(e){
        gutil.log(e.stack);
        cb(null, file);
      });
    }));
});

// Parse a template. It should be in the /template/ folder and have .template ext.
// dir is relative to the namespace (gwt client) folder.
function parseTemplate(template, obj, name, dir, suffix) {
  var file = helpers.camelCase(name) + suffix;
  var path = target + dir + file;
  gutil.log("Generating: ", name, path);

  var tpl = _.template(fs.readFileSync('./template/' + template + '.template'));
  obj.ns = ns;
  fs.ensureFileSync(path);
  fs.writeFileSync(path, new Buffer(tpl(_.merge({}, null, obj, helpers))));
}

gulp.task('generate:imports-map', ['parse'], function() {
  parseTemplate('ImportsMap', {"imports" : global.imports}, 'imports-map', 'element/', '.java');
});

gulp.task('generate:elements', ['parse'], function() {
  return StreamFromArray(global.parsed,{objectMode: true})
   .on('data', function(item) {
     console.log("Data: ", item.is, item.type)
     var e = item.type == 'behavior'? '' : 'Element';
     parseTemplate('Element', item, item.is, 'element/', e + '.java');
   })
});

gulp.task('generate:events', ['parse'], function() {
  return StreamFromArray(global.parsed,{objectMode: true})
   .on('data', function(item) {
      if (item.events) {
        item.events.forEach(function(event) {
          parseTemplate('ElementEvent', event, event.name, 'element/event/', 'Event.java');
        });
      }
   })
});

gulp.task('generate:widgets', ['parse'], function() {
  return StreamFromArray(global.parsed,{objectMode: true})
   .on('data', function(item) {
      if (!helpers.isBehavior(item)) {
        parseTemplate('Widget', item, item.is, 'widget/', '.java');
      }
   })
});

gulp.task('generate:widget-events', ['parse'], function() {
  return StreamFromArray(global.parsed,{objectMode: true})
   .on('data', function(item) {
      if (item.events) {
        item.events.forEach(function(event) {
          parseTemplate('WidgetEvent', event, event.name, 'widget/event/', 'Event.java');
          parseTemplate('WidgetEventHandler', event, event.name, 'widget/event/', 'EventHandler.java');
        });
      }
   })
});

gulp.task('generate:elements-all', ['generate:imports-map','generate:elements', 'generate:events']);

gulp.task('generate:widgets-all', ['generate:widgets', 'generate:widget-events']);

gulp.task('generate', ['generate:elements-all', 'generate:widgets-all'], function() {
  gutil.log('Done.');
});

gulp.task('default', function(){
  runSequence('clean', 'bower:install', 'generate');
});
