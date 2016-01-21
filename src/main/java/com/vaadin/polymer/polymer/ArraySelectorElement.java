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
public interface ArraySelectorElement extends HTMLElement {

    @JsOverlay public static final String TAG = "array-selector";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


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
     * @type Boolean
     * 
     */
    @JsProperty boolean getMulti();
    /**
     * 
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    @JsProperty void setMulti(boolean value);

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
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * 
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    @JsProperty boolean getToggle();
    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    @JsProperty void setToggle(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method deselect
     * @param {} item  
     * 
     * 
     */
    void deselect(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method isSelected
     * @param {} item  
     * 
     * 
     */
    void isSelected(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} item  
     * 
     * 
     */
    void select(Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     * 
     */
    void clearSelection();

}
