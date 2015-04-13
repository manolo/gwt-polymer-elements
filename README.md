# gwt-polymer
Allows to use polymer elements in GWT projects.

## [Showcase](http://vaadin.github.io/gwt-polymer/demo.html)


## Instructions:

1.  Go to the `gwt-polymer-elements` directory
2.  Run `npm install`
3.  Add/remove components in the "dependencies" section of the `bower.json` file
3.  The "dependencies" section of the `bower.json` file includes all paper
elements, if you Add/remove any component remember to run `bower install` after any modification.
5.  Run `gulp gwt-api` in order to create all Element and Widgets java files in the  `gwt-polymer-elements/src/main/java/` folder
6.  Run `mvn clean install` to install the components library in you local maven repo
6.  Go to the demo folder `../gwt-polymer-demo`
7.  Run `mvn gwt:run` to run the demo in SuperDevMode, otherwise run `mvn clean package` to
get produce the `target/demo.war` application

 - example with polymer GWT widgets: [all-in-one](http://prntscr.com/6k8np9)
 - example with polymer GWT elements: [all-in-one](http://prntscr.com/6k8nm6)
 - [demo in browser](http://screencast.com/t/6R0HQ9squnc)
 - generator in action: [Screencast](http://screencast.com/t/UMz0MG9nxhs)

