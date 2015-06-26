# gwt-polymer-elements

[![Join the chat at https://gitter.im/vaadin/gwt-polymer-elements](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/vaadin/gwt-polymer-elements?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Allows to use Polymer [paper-elements](https://elements.polymer-project.org/browse?package=paper-elements) and [iron-elements](https://elements.polymer-project.org/browse?package=iron-elements) collections in GWT projects.

## Demo
 Visit our [show case](http://vaadin.github.io/gwt-polymer-elements/demo/) to see how components look like, and to take a look to the example code to use each component.
  
## Javadocs
 When we parse the original components to generate the Java API, we copy all the existing JS documentation so as it's available in the [javadoc](http://vaadin.github.io/gwt-polymer-elements/api/). Note that sometimes descriptions would refer to JS, but we consider that it's better to maintain the info.

## The ready to use GWT Polymer/Paper library

We have produced a `.jar` file which includes all the visual components of
Polymer Iron and Paper collections, so as you don't have to deal with the process of
creating it.

 - If your project uses maven, configure it to use the Sonatype snapshot repository and add the dependency:

  ```xml
   <repositories>
     <repository>
       <id>sonatype-snapshots</id>
       <url>http://oss.sonatype.org/content/repositories/snapshots</url>
       <snapshots><enabled>true</enabled></snapshots>
       <releases><enabled>false</enabled></releases>
     </repository>
    ...
   </repositories>
   <dependencies>
     <dependency>
       <groupId>com.vaadin.polymer</groupId>
       <artifactId>gwt-polymer-elements</artifactId>
       <version>1.0.2.0.alpha2-SNAPSHOT</version>
       <scope>provided</scope>
     </dependency>
   </dependencies>
  ```

- otherwise you can [download](https://oss.sonatype.org/content/repositories/snapshots/com/vaadin/polymer/gwt-polymer-elements/)
  the `.jar` archive and put it in your gwt project classpath

- Add this line to your GWT module file:
 ```xml
  <inherits name="com.vaadin.polymer.Elements"/>

 ```
 
- Finally you must add the experimental JsInterop flag to the GWT compiler in order to make it run: `-XjsInteropMode JS`.
 For instance if you use maven add this:

   ```xml
   <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>gwt-maven-plugin</artifactId>
      <configuration>
         ...
         <jsInteropMode>JS</jsInteropMode>
      </configuration>
      ...
   </plugin>
   ```

## Building the project

You might want to compile the `gwt-polymer-elements` library by yourself. 

 1. Clone the repository with `$ git checkout https://github.com/vaadin/gwt-polymer-elements.git`
 1. Change to the project folder `$ cd gwt-polymer-elements`
 1. Run `$ npm install` to download all components to the `src/main/resources` folder, to create all java files needed for GWT in the `src/main/java/` folder and to compile and install the components library in you local maven repo.

## Running the demo locally

 1. If you want to run the demo, go to the demo folder `$ cd demo`
 1. Run `$ mvn gwt:run` to run the demo in SuperDevMode, otherwise run `$ mvn clean package` to
 build the demo application under `target` directory.
 1. Host the demo by running for example `$ serve target/gwt-polymer-demo` (requires [serve](https://npmjs.org/packages/serve)) or deploying the generated `target/gwt-polymer-demo.war` to your favourite servlet container.

## Usage

 - Consuming Polymer components in Java using the Element API
```java
  // Create a new instance of PaperButton
  PaperButtonElement button = Polymer.create(PaperButtonElement.TAG);

  // Set some properties
  button.setIcon("polymer");
  button.setLabel("Polymer");
  button.setRaised(true);

  // Add event listeners
  button.addEventListener("click", new EventListener() {
      public void onBrowserEvent(Event event) {
      // ...    
      }
  });

  // Append to the document
  myContainerElement.appendChild(button);
```
 - Consuming Polymer components in Java using classic Widgets

```java
PaperButton button = new PaperButton();

button.addClickHandler(new ClickHandler() {
  public void onClick(ClickEvent event) {
    // ...
  }
});

RootPanel.get().add(button);
```

 - Consuming Polymer components in UiBinder
```xml
<ui:UiBinder xmlns:ui='urn:ui:com.google.gwt.uibinder'
    xmlns:g='urn:import:com.google.gwt.user.client.ui'
    xmlns:p='urn:import:com.vaadin.polymer.paper.widget'>

<ui:style>
  .container paper-button.colored {
    background: #4285f4;
    color: #fff;
  }
</ui:style>

<g:HTMLPanel>
  <!-- As Widget -->
  <p:PaperButton toggles="true" raised="true" active="true" addStyleNames="{style.colored}">active</p:PaperButton>
  
  <!-- As Element -->	 	
  <paper-button raised="" noink="">Click me</paper-button>
</g:HTMLPanel>

```
