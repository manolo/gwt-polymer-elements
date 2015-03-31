"use strict";
var gulp = require('gulp');
var map = require('map-stream');
var rename = require('gulp-rename');
var fs = require('fs-extra');
var gutil = require('gulp-util');
var _ = require('lodash');
var ContextFreeParser = require("polymer-context-free-parser");
var helpers = require("./template/helpers");

var imports = [];

function camelCase(s) {
  return (s || '').toLowerCase().replace(/(\b|-)\w/g, function (m) {
    return m.toUpperCase().replace(/-/, '');
  });
}

gulp.task('gwt-api:clean', function() {
  fs.removeSync('src/main/java/com/vaadin/components/gwt/polymer/client/element');
  fs.removeSync('dist-tmp');
});

gulp.task('gwt-api:parse', ['gwt-api:clean'], function() {
  var path = "src/main/resources/com/vaadin/components/gwt/polymer/public/bower_components/";
  return gulp.src([path + "*/*.html", 
    "!" + path + "*/*demo.html",        // ignore all the demo.html files
    "!" + path + "*/*index.html",       // ignore all the index.html files
    "!" + path + "*/*metadata.html"])   // ignore all the metadata.html files
    .pipe(map(function(file, cb) {
      gutil.log('Parsing "' + file.relative + '"');
      var jsonArray = ContextFreeParser.parse(file.contents.toString());

      jsonArray.forEach(function(item) {
        // saves the result object as JSON
        var dirname = 'dist-tmp/';
        var path = dirname + item.name + '.json';
        fs.ensureFileSync(path);
        fs.writeFileSync(path, new Buffer(JSON.stringify(item)));

        // remember href in separate json
        imports.push({
          element: item.name,
          path: file.relative.replace(/\\/, '/')
        });
      });
      cb(null, file);
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
      file.basename = camelCase(file.basename) + 'Element';
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
          var filename = camelCase(event.name) + 'Event.java';
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
      file.basename = camelCase(file.basename);
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
          var filename = camelCase(event.name) + 'Event.java';
          gutil.log('Generating ' + filename + ' from ' + file.relative);
          var path = dirname + filename;
          fs.ensureFileSync(path);
          fs.writeFileSync(path, new Buffer(eventTpl(_.merge({}, null, event, helpers))));

          dirname = 'src/main/java/com/vaadin/components/gwt/polymer/client/widget/event/';
          filename = camelCase(event.name) + 'EventHandler.java';
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
