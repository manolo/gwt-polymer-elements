/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.array.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * 
 */
@JsType
public interface ArraySelectorElement extends HTMLElement {

    public static final String TAG = "array-selector";
    public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method deselect
     * @param {} item  
     * 
     */
    void deselect(JavaScriptObject item);

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
     * @property multi
     * @type boolean
     * 
     */
    @JsProperty boolean getMulti();
    /**
     * 
     *
     * JavaScript Info:
     * @property multi
     * @type boolean
     * 
     */
    @JsProperty void setMulti(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} item  
     * 
     */
    void select(JavaScriptObject item);

    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSelected();
    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    @JsProperty void setSelected(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type boolean
     * 
     */
    @JsProperty boolean getToggle();
    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type boolean
     * 
     */
    @JsProperty void setToggle(boolean value);
  
}
