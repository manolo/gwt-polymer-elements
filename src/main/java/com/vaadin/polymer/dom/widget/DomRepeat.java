/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.dom.widget;

import com.vaadin.polymer.dom.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class DomRepeat extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DomRepeat() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DomRepeat(String html) {
        super(DomRepeatElement.TAG, DomRepeatElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DomRepeatElement getPolymerElement() {
        return (DomRepeatElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public String getAs(){
        return getPolymerElement().getAs();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public void setAs(String value) {
        getPolymerElement().setAs(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    public double getDelay(){
        return getPolymerElement().getDelay();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    public void setDelay(double value) {
        getPolymerElement().setDelay(value);
    }
   
    /**
     * 
     *
     * JavaScript Info:
     * @attribute delay
     * 
     */
    public void setDelay(String value) {
        getPolymerElement().setAttribute("delay", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method filter
     * 
     */
    public void filter() {
        getPolymerElement().filter();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public String getIndexAs(){
        return getPolymerElement().getIndexAs();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public void setIndexAs(String value) {
        getPolymerElement().setIndexAs(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method indexForElement
     * @param {} el  
     * 
     */
    public void indexForElement(JavaScriptObject el) {
        getPolymerElement().indexForElement(el);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method itemForElement
     * @param {} el  
     * 
     */
    public void itemForElement(JavaScriptObject el) {
        getPolymerElement().itemForElement(el);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public JsArray getItems(){
        return getPolymerElement().getItems();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }
   
    /**
     * 
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        getPolymerElement().setAttribute("items", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyForElement
     * @param {} el  
     * 
     */
    public void keyForElement(JavaScriptObject el) {
        getPolymerElement().keyForElement(el);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    public String getObserve(){
        return getPolymerElement().getObserve();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    public void setObserve(String value) {
        getPolymerElement().setObserve(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     */
    public void render() {
        getPolymerElement().render();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method sort
     * 
     */
    public void sort() {
        getPolymerElement().sort();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public String getExtends(){
        return getPolymerElement().getExtends();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public void setExtends(String value) {
        getPolymerElement().setExtends(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  


}
