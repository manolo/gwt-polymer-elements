/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

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
public interface VaadinComboBoxItemElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-combo-box-item";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";


    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty boolean getFocused();
    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty void setFocused(boolean value);

    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty double getIndex();
    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty void setIndex(double value);

    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    @JsProperty Object getItem();
    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    @JsProperty void setItem(Object value);

    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    @JsProperty boolean getSelected();
    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    @JsProperty void setSelected(boolean value);

    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty void setLabel(String value);


}
