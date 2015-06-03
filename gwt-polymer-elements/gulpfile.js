"use strict";
var gulp = require('gulp');
var map = require('map-stream');
var rename = require('gulp-rename');
var fs = require('fs-extra');
var gutil = require('gulp-util');
var _ = require('lodash');
var ContextFreeParser = require("polymer-context-free-parser");
var helpers = require("./template/helpers");
var hyd = require("hydrolysis");

var imports = [];

gulp.task('gwt-api:clean', function() {
  fs.removeSync('src/main/java/com/vaadin/components/gwt/polymer/client/element');
  fs.removeSync('src/main/java/com/vaadin/components/gwt/polymer/client/widget');
});

gulp.task('clean', function() {
  fs.removeSync('src/main/resources/com/vaadin/components/gwt/polymer/public');
});

function serializeJson(path, item) {
  // Sometime the property is defined twice
  helpers.removeDuplicates(item.properties, 'name');
  fs.ensureFileSync(path);
  fs.writeFileSync(path, new Buffer(JSON.stringify(item)));
  // remember href in separate json
  imports.push({
    element: item.is,
    path: file.relative.replace(/\\/, '/')
  });
}
gulp.task('gwt-api:parse', ['gwt-api:clean'], function() {
  var path = "src/main/resources/com/vaadin/components/gwt/polymer/public/bower_components/";
  return gulp.src([path + "*/*.html", 
    "!" + path + "*/*demo.html",        // ignore all the demo.html files
    "!" + path + "*/*index.html",       // ignore all the index.html files
    "!" + path + "*/*metadata.html",
    "!" + path + "*/*web-animations.html", // it includes a set of js files only, and some do not exist
    ])   // ignore all the metadata.html files
    .pipe(map(function(file, cb) {
      gutil.log('Parsing -> "' + path + file.relative + '"');
      hyd.Analyzer.analyze(path + file.relative).then(function(result){
        var jsonArray = result.elements;
        jsonArray.forEach(function(item) {
          // saves the result object as JSON
          var dirname = 'dist-tmp/';
          var path = dirname + item.is + '.json';
          item.name = item.is;
          item.description = item.description || item.is;
          if (item.name) {
            gutil.log("Serializing " + path + " from: " + file.relative);
            serializeJson(path, item);
          } else {
            // Use old parser
            gutil.log("Using old parser -> " + item.name);
            path = dirname + file.relative + '.json';
            var jsonArray = ContextFreeParser.parse(file.contents.toString());
            jsonArray.forEach(function(item) {
              serializeJson(path, item);
            })
          }
        });
        cb(null, file);
      }).catch(function(e){
        cb(null, file);
      });
    }));
});

gulp.task('gwt-api:generate-elements', ['gwt-api:parse'], function() {
  return gulp.src('dist-tmp/**.json')
    .pipe(map(function(file, cb) {
      gutil.log('Generating element interface from ' + file.relative);

      var tpl = _.template(fs.readFileSync('./template/Interop.template'));
      file.contents = new Buffer(tpl(_.merge({}, null, JSON.parse(file.contents), helpers)));

      cb(null, file);
    }))
    .pipe(rename(function (file) {
      file.basename = helpers.camelCase(file.basename) + 'Element';
      file.extname = '.java';
    }))
    .pipe(gulp.dest('./src/main/java/com/vaadin/components/gwt/polymer/client/element'));
});

gulp.task('gwt-api:generate-events', ['gwt-api:parse'], function() {
  var tpl = _.template(fs.readFileSync('./template/Event.template'));
  
  return gulp.src('dist-tmp/**.json')
    .pipe(map(function(file, cb) {
      var json = JSON.parse(file.contents);
      if (json.events) {
        json.events.forEach(function(event) {
          var content = tpl(_.merge({}, null, event, helpers));

          // saves the result object as JSON
          var dirname = 'src/main/java/com/vaadin/components/gwt/polymer/client/element/event/';
          var filename = helpers.camelCase(event.name) + 'Event.java';
          gutil.log('Generating ' + filename + ' from ' + file.relative);
          var path = dirname + filename;
          fs.ensureFileSync(path);
          fs.writeFileSync(path, new Buffer(content));
        });
      }

      cb(null, file);
    }));
});

gulp.task('gwt-api:generate-widgets', ['gwt-api:parse'], function() {
  return gulp.src('dist-tmp/**.json')
    .pipe(map(function(file, cb) {
      gutil.log('Generating widget class from ' + file.relative);

      var tpl = _.template(fs.readFileSync('./template/Widget.template'));
      file.contents = new Buffer(tpl(_.merge({}, null, JSON.parse(file.contents), helpers)));

      cb(null, file);
    }))
    .pipe(rename(function (file) {
      file.basename = helpers.camelCase(file.basename);
      file.extname = '.java';
    }))
    .pipe(gulp.dest('./src/main/java/com/vaadin/components/gwt/polymer/client/widget'));
});

gulp.task('gwt-api:generate-widget-events', ['gwt-api:parse'], function() {
  var eventTpl = _.template(fs.readFileSync('./template/WidgetEvent.template'));
  var handlerTpl = _.template(fs.readFileSync('./template/WidgetEventHandler.template'));

  return gulp.src('dist-tmp/**.json')
    .pipe(map(function(file, cb) {
      var json = JSON.parse(file.contents);
      if (json.events) {
        json.events.forEach(function(event) {
          var dirname = 'src/main/java/com/vaadin/components/gwt/polymer/client/widget/event/';
          var filename = helpers.camelCase(event.name) + 'Event.java';
          gutil.log('Generating ' + filename + ' from ' + file.relative);
          var path = dirname + filename;
          fs.ensureFileSync(path);
          fs.writeFileSync(path, new Buffer(eventTpl(_.merge({}, null, event, helpers))));

          dirname = 'src/main/java/com/vaadin/components/gwt/polymer/client/widget/event/';
          filename = helpers.camelCase(event.name) + 'EventHandler.java';
          gutil.log('Generating ' + filename + ' from ' + file.relative);
          path = dirname + filename;
          fs.ensureFileSync(path);
          fs.writeFileSync(path, new Buffer(handlerTpl(_.merge({}, null, event, helpers))));
        });
      }

      cb(null, file);
    }));
});

gulp.task('gwt-api:generate-imports-map', ['gwt-api:parse'], function() {
  return gulp.src('./template/ImportsMap.template')
    .pipe(map(function(file, cb) {
      gutil.log('Generating ImportsMap class');

      var tpl = _.template(file.contents);
      file.contents = new Buffer(tpl(_.merge({}, null, {"imports": imports})));

      cb(null, file);
    }))
    .pipe(rename(function (file) {
      file.extname = '.java';
    }))
    .pipe(gulp.dest('./src/main/java/com/vaadin/components/gwt/polymer/client/element'));
});

gulp.task('gwt-api', ['gwt-api:generate-elements', 'gwt-api:generate-events', 'gwt-api:generate-widgets', 'gwt-api:generate-widget-events', 'gwt-api:generate-imports-map']);
