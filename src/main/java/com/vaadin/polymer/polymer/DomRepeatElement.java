/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface DomRepeatElement extends HTMLElement {

    @JsOverlay public static final String TAG = "dom-repeat";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    @JsProperty double getInitialCount();
    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    @JsProperty void setInitialCount(double value);

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
     * @property targetFramerate
     * @type Number
     * 
     */
    @JsProperty double getTargetFramerate();
    /**
     * 
     *
     * JavaScript Info:
     * @property targetFramerate
     * @type Number
     * 
     */
    @JsProperty void setTargetFramerate(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    @JsProperty Function getFilter();
    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    @JsProperty void setFilter(Function value);

    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    @JsProperty Function getSort();
    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    @JsProperty void setSort(Function value);

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
     * @method stamp
     * @param {} model  
     * @behavior DomIf
     * 
     */
    void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior DomIf
     * 
     */
    void templatize(Object template);

    /**
     * 
     *
     * JavaScript Info:
     * @method itemForElement
     * @param {} el  
     * 
     * 
     */
    void itemForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method keyForElement
     * @param {} el  
     * 
     * 
     */
    void keyForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * 
     * 
     */
    void modelForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method indexForElement
     * @param {} el  
     * 
     * 
     */
    void indexForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    void render();

}
