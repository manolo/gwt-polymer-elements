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
public interface DbPromise {

    @JsOverlay public static final String NAME = "DbPromise";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/vaadin-pouchdb.html";



    /**
     * 
     *
     * JavaScript Info:
     * @method then
     * @param {Function} func  
     * 
     * 
     */
    void then(Function func);

    /**
     * 
     *
     * JavaScript Info:
     * @method on
     * @param {String} evntName  
     * @param {Function} func  
     * 
     * 
     */
    void on(String evntName, Function func);

}
