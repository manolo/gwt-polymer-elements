/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
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
public interface DbResp {

    @JsOverlay public static final String NAME = "DbResp";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/vaadin-pouchdb.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty double getOffset();
    /**
     * 
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty void setOffset(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @JsProperty JsArray getRows();
    /**
     * 
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @JsProperty void setRows(JsArray value);

    /**
     * 
     *
     * JavaScript Info:
     * @property total_rows
     * @type Number
     * 
     */
    @JsProperty double getTotal_rows();
    /**
     * 
     *
     * JavaScript Info:
     * @property total_rows
     * @type Number
     * 
     */
    @JsProperty void setTotal_rows(double value);


}
