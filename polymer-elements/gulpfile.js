"use strict";
var gulp = require('gulp');
var rext = require('replace-ext');
var map = require('map-stream');
var cheerio = require('cheerio');
var jsdocParse = require("jsdoc-parse");
var rename = require('gulp-rename');
var fs = require('fs-extra');
var gutil = require('gulp-util');
var _ = require('lodash');
var Path = require("path");

var imports = [];

function camelCase(s) {
  return (s || '').toLowerCase().replace(/(\b|-)\w/g, function (m) {
    return m.toUpperCase().replace(/-/, '');
  });
}

// helps to extract metadata from <polymer-component>.html
function metadata(file, el) {
  gutil.log('Extracting metadata from "' + file.relative + '"');
  
  imports.push({
    element: el.attr('name'),
    path: file.relative.replace(/\\/, '/')
  });
  
  // object which holds polymer component metadata
  var result = {
    className: null,
    baseClass: null,
    dependencies: []
  };

  var $ = cheerio.load(file.contents);

  // gets component's name and base component name
  result.className = camelCase(el.attr('name'));
  result.baseClass = camelCase(el.attr('extends'));

  // gets component's dependencies from HTML5 imports
  var skipped = ['polymer', 'core-a11y-keys'];
  $('link[rel=import]').each(function () {
    var href = $(this).attr('href');
    var dependency = href.match(/(\b|.*\/)(.*).html/)[2];
    if (skipped.indexOf(dependency) === -1) {
      result.dependencies.push(camelCase(dependency));
    }
  });

  // saves the result object as JSON
  var dirname = 'dist-tmp/';
  var path = dirname + el.attr('name') + '.meta';
  fs.ensureFileSync(path);
  fs.writeFileSync(path, new Buffer(JSON.stringify(result)));
}

// helps to extract script from <polymer-component>.html
function script(file, el) {
  gutil.log('Extracting script from "' + file.relative + '"');
  
  // gets component's script
  var script = el.find('script').text();

  // saves script text
  var dirname = 'dist-tmp/';
  var path = dirname + el.attr('name') + '.js';
  fs.ensureFileSync(path);
  fs.writeFileSync(path, new Buffer(script));
}


function extract(modifier) {
  function parse(file, cb) {
    if (file.isNull()) return cb(null, file); // pass along
    if (file.isStream()) return cb(new Error("Streaming not supported in this function"));

    // init cheerio
    var $ = cheerio.load(file.contents);

    // try to find all polymer component in the file
    $('polymer-element[name]').each(function(index, el) {
      modifier(file, $(el));
    });
    cb(null, file);
  }
  
  // Return a stream
  return map(parse);
}

gulp.task('gwt-api:clean', function() {
  fs.removeSync('src/main/java/com/github/taras/gwt/polymer/client/elements');
  fs.removeSync('dist-tmp');
});

// extracts polymer component name, base component name, dependencies, etc
gulp.task('gwt-api:extract-metadata', ['gwt-api:clean'], function () {
  return gulp.src("src/main/resources/com/github/taras/gwt/polymer/public/components/*/*.html")
    .pipe(extract(metadata));
});

// extracts javascript from .html files which is necessary to parse jsdoc (see task "jsdoc")
gulp.task('gwt-api:extract-script', ['gwt-api:clean'], function () {
  return gulp.src("src/main/resources/com/github/taras/gwt/polymer/public/components/*/*.html")
    .pipe(extract(script));
});

// parses .js file and generates correspondent JSON from jsdoc
gulp.task('gwt-api:jsdoc', ['gwt-api:extract-script'], function () {
  return gulp.src("dist-tmp/**.js")
    .pipe(map(function(file, cb) {
      gutil.log('Parsing jsdoc from "' + file.relative + '"');
      file.contents = Buffer.concat([jsdocParse(file.path)]);
      cb(null, file);
    }))
    .pipe(rename(function (file) {
      file.extname = '.jsdoc';
    }))
    .pipe(gulp.dest('./dist-tmp'));
});

// merges two JSON files (<component-name.meta> and <component-name.jsdoc>) into one <component-name.json> file
gulp.task('gwt-api:merge-json', ['gwt-api:extract-metadata', 'gwt-api:jsdoc'], function () {
  return gulp.src("dist-tmp/**.meta")
    .pipe(map(function(file, cb) {
      try {
        var json = JSON.parse(file.contents);
        json.jsdoc = fs.readJsonFileSync(rext(file.path, '.jsdoc'));

        file.contents = new Buffer(JSON.stringify(json));
        file.path = rext(file.path, '.json');

        cb(null, file);
      } catch (e) {
        cb(new Error('JSON merge failed for "'+ file.relative +'"'));
      }
    }))
    .pipe(gulp.dest('./dist-tmp'));
});

gulp.task('gwt-api:generate-classes', ['gwt-api:merge-json'], function() {
  return gulp.src('dist-tmp/**.json')
    .pipe(map(function(file, cb) {
      gutil.log('Generating java class from ' + file.relative);

      var tpl = _.template(fs.readFileSync('./template/Element.template'));
      file.contents = new Buffer(tpl(_.merge({}, null, JSON.parse(file.contents))));

      cb(null, file);
    }))
    .pipe(rename(function (file) {
      file.basename = camelCase(file.basename);
      file.extname = '.java';
    }))
    .pipe(gulp.dest('./src/main/java/com/github/taras/gwt/polymer/client/elements'));
});

gulp.task('gwt-api:generate-imports-map', ['gwt-api:merge-json'], function() {
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
    .pipe(gulp.dest('./src/main/java/com/github/taras/gwt/polymer/client/elements'));
});

gulp.task('gwt-api', ['gwt-api:generate-classes', 'gwt-api:generate-imports-map']);
