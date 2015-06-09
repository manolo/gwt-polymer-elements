#!/usr/bin/env node
'use strict';
var gulp = require('gulp')
require('../gulpfile');

require('coa').Cmd() // main (top level) command declaration
  .name(process.argv[1]) // set top level command name from program name
  .title('Vaadin GWT Metamorphosis GWT API Client Forge') // title for use in text messages
  .helpful() // make command "helpful", i.e. options -h --help with usage message
  .act(function() {
    console.log(this.usage());
  })
  .opt() // add some option
    .name('version') // name for use in API
    .title('Version') // title for use in text messages
    .short('v') // short key: -v
    .long('version') // long key: --version
    .flag() // for options without value
    .act(function(opts) { // add action for option
      //return message as result of action
      return JSON.parse(require('fs').readFileSync(__dirname + '/../package.json'))
        .version;
    })
    .end()
  .cmd()
    .name('polymer')
    .title('Generate GWT API from Polymer API')
    .helpful()
    .opt()
      .name('package')
      .req()
      .title('Bower package to use')
      .long('package')
      .act(function() {
        gulp.start('default');
      })
      .end()
    .end()
  .run(process.argv.slice(2));