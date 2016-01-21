/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from table-of-contents project by Jouni Koivuviita <jouni@jouni.me>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.table;

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
public interface TableOfContentsElement extends HTMLElement {

    @JsOverlay public static final String TAG = "table-of-contents";
    @JsOverlay public static final String SRC = "table-of-contents/table-of-contents.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property idCount
     * @type number
     * 
     */
    @JsProperty double getIdCount();
    /**
     * 
     *
     * JavaScript Info:
     * @property idCount
     * @type number
     * 
     */
    @JsProperty void setIdCount(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property select
     * @type string
     * 
     */
    @JsProperty String getSelect();
    /**
     * 
     *
     * JavaScript Info:
     * @property select
     * @type string
     * 
     */
    @JsProperty void setSelect(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method addLink
     * @param {} el  
     * @param {} level  
     * @param {} tocContext  
     * 
     * 
     */
    void addLink(Object el, Object level, Object tocContext);

    /**
     * 
     *
     * JavaScript Info:
     * @method level
     * @param {} selectors  
     * @param {} level  
     * @param {} context  
     * @param {} tocContext  
     * 
     * 
     */
    void level(Object selectors, Object level, Object context, Object tocContext);

}
