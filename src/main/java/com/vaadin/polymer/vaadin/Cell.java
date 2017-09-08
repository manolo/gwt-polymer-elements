/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
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
 * <p>Object referencing a cell in the grid body and its data.</p>
 * <p>A <code>Cell</code> object is passed as a parameter for both column renderers and for<br>the cell class generator.</p>
 */
@JsType(isNative=true)
public interface Cell {

    @JsOverlay public static final String NAME = "Cell";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Contents of the cell, as it is retrieved from the <code>items</code> array/function.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getData();
    /**
     * <p>Contents of the cell, as it is retrieved from the <code>items</code> array/function.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty void setData(JavaScriptObject value);

    /**
     * <p>The <code>td</code> element of the cell.</p>
     *
     * JavaScript Info:
     * @property element
     * @type HTMLElement
     * 
     */
    @JsProperty JavaScriptObject getElement();
    /**
     * <p>The <code>td</code> element of the cell.</p>
     *
     * JavaScript Info:
     * @property element
     * @type HTMLElement
     * 
     */
    @JsProperty void setElement(JavaScriptObject value);

    /**
     * <p>Column index of the cell.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty double getIndex();
    /**
     * <p>Column index of the cell.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty void setIndex(double value);

    /**
     * <p>Owner row of the cell. See the API documentation for <code>Row</code> for more<br>details.</p>
     *
     * JavaScript Info:
     * @property row
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getRow();
    /**
     * <p>Owner row of the cell. See the API documentation for <code>Row</code> for more<br>details.</p>
     *
     * JavaScript Info:
     * @property row
     * @type Object
     * 
     */
    @JsProperty void setRow(JavaScriptObject value);

    /**
     * <p>Column name of the cell, if specified.</p>
     *
     * JavaScript Info:
     * @property columnName
     * @type string
     * 
     */
    @JsProperty String getColumnName();
    /**
     * <p>Column name of the cell, if specified.</p>
     *
     * JavaScript Info:
     * @property columnName
     * @type string
     * 
     */
    @JsProperty void setColumnName(String value);


}
