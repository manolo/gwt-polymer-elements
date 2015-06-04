"use strict";
var gulp = require('gulp');
var bower = require('gulp-bower')
var map = require('map-stream');
var rename = require('gulp-rename');
var fs = require('fs-extra');
var gutil = require('gulp-util');
var _ = require('lodash');
var helpers = require("./template/helpers");
var hyd = require("hydrolysis");
var StreamFromArray = require('stream-from-array');

var imports = [];
var parsed = [];

var ns = "/com/vaadin/components/gwt/polymer/";
var namespace = "./src/main/java" + ns + "client/";
var resources = "./src/main/resources" + ns + "public/";
var bowerdir = resources + "bower_components/";

gulp.task('api:clean', function() {
  fs.removeSync(namespace + 'element');
  fs.removeSync(namespace + 'widget');
});

gulp.task('clean', function() {
  fs.removeSync(resources);
});

gulp.task('bower', function() {
  return bower({ cmd: 'update', directory: bowerdir});
});

gulp.task('api:parse', ['api:clean'], function() {
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
      gutil.log('Parsing -> "' + bowerdir + file.relative + '"');
      hyd.Analyzer.analyze(bowerdir + file.relative).then(function(result){
        var jsonArray = result.elements;
        jsonArray.forEach(function(item) {
          // saves the result object as JSON
          var dirname = 'dist-tmp/';
          var path = dirname + item.is + '.json';
          if (item.is) {
            item.name = item.is;
            // Hydrolysis repeat certain attributes
            helpers.removeDuplicates(item.properties, 'name');
            // We don't want to wrap private api
            helpers.removePrivateApi(item.properties, 'name');
            // Save all items in an array for later processing
            parsed.push(item);
            // remember href in separate java file
            imports.push({
              element: item.is,
              path: file.relative.replace(/\\/, '/')
            });
          }
        });
        cb(null, file);
      }).catch(function(e){
        gutil.log(e.stack);
        cb(null, file);
      });
    }));
});

// Parse a template. It should be in the /template/ folder and have .template ext.
// dir is relative to the namespace (gwt client) folder.
function parseTemplate(template, obj, name, dir, suffix) {
  var file = helpers.camelCase(name) + suffix;
  var path = namespace + dir + file;
  gutil.log("Generating: ", name, path);

  var tpl = _.template(fs.readFileSync('./template/' + template + '.template'));
  fs.ensureFileSync(path);
  fs.writeFileSync(path, new Buffer(tpl(_.merge({}, null, obj, helpers))));
}

gulp.task('api:gen:imports-map', ['api:parse'], function() {
  parseTemplate('ImportsMap', {"imports" : imports}, 'imports-map', 'element/', '.java');
});

gulp.task('api:gen:elements', ['api:parse'], function() {
  StreamFromArray(parsed,{objectMode: true})
   .on('data', function(item) {
      parseTemplate('Element', item, item.is, 'element/', 'Element.java');
   })
});

gulp.task('api:gen:events', ['api:parse'], function() {
  StreamFromArray(parsed,{objectMode: true})
   .on('data', function(item) {
      if (item.events) {
        item.events.forEach(function(event) {
          parseTemplate('ElementEvent', event, event.name, 'element/event/', 'Event.java');
        });
      }
   })
});

gulp.task('api:gen:widgets', ['api:parse'], function() {
  StreamFromArray(parsed,{objectMode: true})
   .on('data', function(item) {
      parseTemplate('Widget', item, item.is, 'widget/', '.java');
   })
});

gulp.task('api:gen:widget-events', ['api:parse'], function() {
  StreamFromArray(parsed,{objectMode: true})
   .on('data', function(item) {
      if (item.events) {
        item.events.forEach(function(event) {
          parseTemplate('WidgetEvent', event, event.name, 'widget/event/', 'Event.java');
          parseTemplate('WidgetEventHandler', event, event.name, 'widget/event/', 'EventHandler.java');
        });
      }
   })
});

gulp.task('api:elements', ['api:gen:imports-map','api:gen:elements', 'api:gen:events']);

gulp.task('api:widgets', ['api:elements', 'api:gen:widgets', 'api:gen:widget-events']);

gulp.task('api', ['clean', 'bower', 'api:elements', 'api:widgets']);
