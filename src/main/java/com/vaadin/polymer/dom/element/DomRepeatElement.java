/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.dom.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * 
 */
@JsType
public interface DomRepeatElement extends HTMLElement {

    public static final String TAG = "dom-repeat";
    public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty String getAs();
    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty void setAs(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    @JsProperty double getDelay();
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    @JsProperty void setDelay(double value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method filter
     * 
     */
    void filter();

    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty String getIndexAs();
    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty void setIndexAs(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method indexForElement
     * @param {} el  
     * 
     */
    void indexForElement(JavaScriptObject el);

    /**
     * 
     *
     * JavaScript Info:
     * @method itemForElement
     * @param {} el  
     * 
     */
    void itemForElement(JavaScriptObject el);

    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty JsArray getItems();
    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty void setItems(JsArray value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyForElement
     * @param {} el  
     * 
     */
    void keyForElement(JavaScriptObject el);

    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    @JsProperty String getObserve();
    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    @JsProperty void setObserve(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     */
    void render();

    /**
     * 
     *
     * JavaScript Info:
     * @method sort
     * 
     */
    void sort();

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty String getExtends();
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty void setExtends(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
}
