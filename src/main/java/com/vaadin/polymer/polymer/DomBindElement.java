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
public interface DomBindElement extends HTMLElement {

    @JsOverlay public static final String TAG = "dom-bind";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    @JsProperty boolean getNotifyDomChange();
    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    @JsProperty void setNotifyDomChange(boolean value);


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
