/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-location project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

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
public interface IronQueryParamsElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-query-params";
    @JsOverlay public static final String SRC = "iron-location/iron-query-params.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property paramsObject
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getParamsObject();
    /**
     * 
     *
     * JavaScript Info:
     * @property paramsObject
     * @type Object
     * 
     */
    @JsProperty void setParamsObject(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property paramsString
     * @type String
     * 
     */
    @JsProperty String getParamsString();
    /**
     * 
     *
     * JavaScript Info:
     * @property paramsString
     * @type String
     * 
     */
    @JsProperty void setParamsString(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method paramsObjectChanged
     * 
     * 
     */
    void paramsObjectChanged();

}
