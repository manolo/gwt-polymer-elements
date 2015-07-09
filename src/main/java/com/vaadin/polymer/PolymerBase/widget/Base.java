/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.PolymerBase.widget;

import com.vaadin.polymer.PolymerBase.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>Polymer.Base</code> acts as a base prototype for all Polymer elements. It is composed via various calls to <code>Polymer.Base._addFeature()</code>.</p>
 * <p>The properties reflected here are the combined view of all features found in this library. There may be more properties added via other libraries, as well.</p>
 */
public class Base extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public Base() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public Base(String html) {
        super(BaseElement.TAG, BaseElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public BaseElement getPolymerElement() {
        return (BaseElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @method $$
     * @param {} slctr  
     * 
     */
    public void $$(JavaScriptObject slctr) {
        getPolymerElement().$$(slctr);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method arrayDelete
     * @param {} path  
     * @param {} item  
     * 
     */
    public void arrayDelete(JavaScriptObject path, JavaScriptObject item) {
        getPolymerElement().arrayDelete(path, item);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method async
     * @param {} callback  
     * @param {} waitTime  
     * 
     */
    public void async(JavaScriptObject callback, JavaScriptObject waitTime) {
        getPolymerElement().async(callback, waitTime);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attachedCallback
     * 
     */
    public void attachedCallback() {
        getPolymerElement().attachedCallback();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attributeFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     */
    public void attributeFollows(JavaScriptObject name, JavaScriptObject toElement, JavaScriptObject fromElement) {
        getPolymerElement().attributeFollows(name, toElement, fromElement);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    public JsArray getBehaviors(){
        return getPolymerElement().getBehaviors();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    public void setBehaviors(JsArray value) {
        getPolymerElement().setBehaviors(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method cancelAsync
     * @param {} handle  
     * 
     */
    public void cancelAsync(JavaScriptObject handle) {
        getPolymerElement().cancelAsync(handle);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method cancelDebouncer
     * @param {} jobName  
     * 
     */
    public void cancelDebouncer(JavaScriptObject jobName) {
        getPolymerElement().cancelDebouncer(jobName);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method classFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     */
    public void classFollows(JavaScriptObject name, JavaScriptObject toElement, JavaScriptObject fromElement) {
        getPolymerElement().classFollows(name, toElement, fromElement);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method create
     * @param {} tag  
     * @param {} props  
     * 
     */
    public void create(JavaScriptObject tag, JavaScriptObject props) {
        getPolymerElement().create(tag, props);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method debounce
     * @param {} jobName  
     * @param {} callback  
     * @param {} wait  
     * 
     */
    public void debounce(JavaScriptObject jobName, JavaScriptObject callback, JavaScriptObject wait) {
        getPolymerElement().debounce(jobName, callback, wait);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method deserialize
     * @param {} value  
     * @param {} type  
     * 
     */
    public void deserialize(JavaScriptObject value, JavaScriptObject type) {
        getPolymerElement().deserialize(value, type);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * 
     */
    public void distributeContent() {
        getPolymerElement().distributeContent();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method domHost
     * 
     */
    public void domHost() {
        getPolymerElement().domHost();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method elementMatches
     * @param {} selector  
     * @param {} node  
     * 
     */
    public void elementMatches(JavaScriptObject selector, JavaScriptObject node) {
        getPolymerElement().elementMatches(selector, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method fire
     * @param {} type  
     * @param {} detail  
     * @param {} options  
     * 
     */
    public void fire(JavaScriptObject type, JavaScriptObject detail, JavaScriptObject options) {
        getPolymerElement().fire(type, detail, options);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method flushDebouncer
     * @param {} jobName  
     * 
     */
    public void flushDebouncer(JavaScriptObject jobName) {
        getPolymerElement().flushDebouncer(jobName);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method get
     * @param {} path  
     * @param {} root  
     * 
     */
    public void get(JavaScriptObject path, JavaScriptObject root) {
        getPolymerElement().get(path, root);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildNodes
     * @param {} slctr  
     * 
     */
    public void getContentChildNodes(JavaScriptObject slctr) {
        getPolymerElement().getContentChildNodes(slctr);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildren
     * @param {} slctr  
     * 
     */
    public void getContentChildren(JavaScriptObject slctr) {
        getPolymerElement().getContentChildren(slctr);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method getNativePrototype
     * @param {} tag  
     * 
     */
    public void getNativePrototype(JavaScriptObject tag) {
        getPolymerElement().getNativePrototype(tag);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method getPropertyInfo
     * @param {} property  
     * 
     */
    public void getPropertyInfo(JavaScriptObject property) {
        getPolymerElement().getPropertyInfo(property);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method importHref
     * @param {} href  
     * @param {} onload  
     * @param {} onerror  
     * 
     */
    public void importHref(JavaScriptObject href, JavaScriptObject onload, JavaScriptObject onerror) {
        getPolymerElement().importHref(href, onload, onerror);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method instanceTemplate
     * @param {} template  
     * 
     */
    public void instanceTemplate(JavaScriptObject template) {
        getPolymerElement().instanceTemplate(template);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method isDebouncerActive
     * @param {} jobName  
     * 
     */
    public void isDebouncerActive(JavaScriptObject jobName) {
        getPolymerElement().isDebouncerActive(jobName);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method linkPaths
     * @param {} to  
     * @param {} from  
     * 
     */
    public void linkPaths(JavaScriptObject to, JavaScriptObject from) {
        getPolymerElement().linkPaths(to, from);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method listen
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     */
    public void listen(JavaScriptObject node, JavaScriptObject eventName, JavaScriptObject methodName) {
        getPolymerElement().listen(node, eventName, methodName);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method notifyPath
     * @param {} path  
     * @param {} value  
     * @param {} fromAbove  
     * 
     */
    public void notifyPath(JavaScriptObject path, JavaScriptObject value, JavaScriptObject fromAbove) {
        getPolymerElement().notifyPath(path, value, fromAbove);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method pop
     * @param {} path  
     * 
     */
    public void pop(JavaScriptObject path) {
        getPolymerElement().pop(path);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property properties
     * @type Object
     * 
     */
    public JavaScriptObject getProperties(){
        return getPolymerElement().getProperties();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property properties
     * @type Object
     * 
     */
    public void setProperties(JavaScriptObject value) {
        getPolymerElement().setProperties(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method push
     * @param {} path  
     * 
     */
    public void push(JavaScriptObject path) {
        getPolymerElement().push(path);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method reflectPropertyToAttribute
     * @param {} name  
     * 
     */
    public void reflectPropertyToAttribute(JavaScriptObject name) {
        getPolymerElement().reflectPropertyToAttribute(name);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method resolveUrl
     * @param {} url  
     * 
     */
    public void resolveUrl(JavaScriptObject url) {
        getPolymerElement().resolveUrl(url);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method scopeSubtree
     * @param {} container  
     * @param {} shouldObserve  
     * 
     */
    public void scopeSubtree(JavaScriptObject container, JavaScriptObject shouldObserve) {
        getPolymerElement().scopeSubtree(container, shouldObserve);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method serialize
     * @param {} value  
     * 
     */
    public void serialize(JavaScriptObject value) {
        getPolymerElement().serialize(value);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method serializeValueToAttribute
     * @param {} value  
     * @param {} attribute  
     * @param {} node  
     * 
     */
    public void serializeValueToAttribute(JavaScriptObject value, JavaScriptObject attribute, JavaScriptObject node) {
        getPolymerElement().serializeValueToAttribute(value, attribute, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method set
     * @param {} path  
     * @param {} value  
     * @param {} root  
     * 
     */
    public void set(JavaScriptObject path, JavaScriptObject value, JavaScriptObject root) {
        getPolymerElement().set(path, value, root);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method setScrollDirection
     * @param {} direction  
     * @param {} node  
     * 
     */
    public void setScrollDirection(JavaScriptObject direction, JavaScriptObject node) {
        getPolymerElement().setScrollDirection(direction, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method shift
     * @param {} path  
     * 
     */
    public void shift(JavaScriptObject path) {
        getPolymerElement().shift(path);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method splice
     * @param {} path  
     * @param {} start  
     * @param {} deleteCount  
     * 
     */
    public void splice(JavaScriptObject path, JavaScriptObject start, JavaScriptObject deleteCount) {
        getPolymerElement().splice(path, start, deleteCount);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method toggleAttribute
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     */
    public void toggleAttribute(JavaScriptObject name, JavaScriptObject bool, JavaScriptObject node) {
        getPolymerElement().toggleAttribute(name, bool, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method toggleClass
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     */
    public void toggleClass(JavaScriptObject name, JavaScriptObject bool, JavaScriptObject node) {
        getPolymerElement().toggleClass(name, bool, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method transform
     * @param {} transform  
     * @param {} node  
     * 
     */
    public void transform(JavaScriptObject transform, JavaScriptObject node) {
        getPolymerElement().transform(transform, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method translate3d
     * @param {} x  
     * @param {} y  
     * @param {} z  
     * @param {} node  
     * 
     */
    public void translate3d(JavaScriptObject x, JavaScriptObject y, JavaScriptObject z, JavaScriptObject node) {
        getPolymerElement().translate3d(x, y, z, node);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method unlinkPaths
     * @param {} path  
     * 
     */
    public void unlinkPaths(JavaScriptObject path) {
        getPolymerElement().unlinkPaths(path);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method unlisten
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     */
    public void unlisten(JavaScriptObject node, JavaScriptObject eventName, JavaScriptObject methodName) {
        getPolymerElement().unlisten(node, eventName, methodName);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method unshift
     * @param {} path  
     * 
     */
    public void unshift(JavaScriptObject path) {
        getPolymerElement().unshift(path);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method updateStyles
     * @param {} properties  
     * 
     */
    public void updateStyles(JavaScriptObject properties) {
        getPolymerElement().updateStyles(properties);
    }
  


}
