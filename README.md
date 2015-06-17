# gwt-polymer-elements
Allows to use polymer elements in GWT projects.

## Demo
  http://vaadin.github.io/gwt-polymer-elements/demo/
  
## Javadocs
  http://vaadin.github.io/gwt-polymer-elements/api/

## The ready to use Polymer/Paper library for GWT

We have produced a `.jar` file which includes all the visual components of
Polymer and Paper collections, so as you don't have to deal with the process of
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
       <version>1.0-SNAPSHOT</version>
       <scope>provided</scope>
     </dependency>
   </dependencies>
  ```

- otherwise you can [download](https://oss.sonatype.org/content/repositories/snapshots/com/vaadin/polymer/gwt-polymer-elements/1.0-SNAPSHOT/)
  the `.jar` archive and put it in your gwt project classpath

- Add this line to your GWT module file:
 ```xml
  <inherits name="com.vaadin.polymer.Elements"/>

 ```
 
- Finally you must add the JsInterop flag to your compiler in order to make it run: `-XjsInteropMode JS`
 

## Building your own set of components.

You might want to select the components for your project, in this case you need to
follow these steps:

 1. Clone the repository with `$ git checkout https://github.com/vaadin/gwt-polymer-elements.git`
 1. Open the repository `$ cd gwt-polymer-elements`
 1. Modify the `--package`, `--artifactId` and `--groupId` arguments in `package.json` to fit your needs
 1. Run `npm install` to create all java files needed for GWT in the
     `src/main/java/` folder and to install the components library in you local maven repo.

## Running the demo locally

 1. If you want to run the demo, go to the demo folder `demo`
 1. Run `mvn gwt:run` to run the demo in SuperDevMode, otherwise run `mvn clean package` to
 build the demo application under `target`
 1. Host the demo by running for example `$ serve target/gwt-polymer-demo` (requires [serve](https://npmjs.org/packages/serve)

## Usage

 - Consuming Polymer components in Java using the Element API
```java
  // Create a new instance of PaperButton
  PaperButtonElement button = Polymer.create(PaperButtonElement.TAG);

  // Set some properties
  button.icon("polymer")
        .label("Polymer")
        .raisedButton(false);

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
  <p:PaperButton toggle="" raised="" active="" addStyleNames="{style.colored}">active</p:PaperButton>
	<!-- As Element -->	 	
  <paper-button raised="" noink="">Click me</paper-button>
</g:HTMLPanel>

```
