/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>paper-toast</code> provides a subtle notification toast.</p>
 */
@JsType(isNative=true)
public interface PaperToastElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-toast";
    @JsOverlay public static final String SRC = "paper-toast/paper-toast.html";


    /**
     * <p>The duration in milliseconds to show the toast.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    @JsProperty double getDuration();
    /**
     * <p>The duration in milliseconds to show the toast.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    @JsProperty void setDuration(double value);

    /**
     * <p>True if the toast is currently visible.</p>
     *
     * JavaScript Info:
     * @property visible
     * @type Boolean
     * 
     */
    @JsProperty boolean getVisible();
    /**
     * <p>True if the toast is currently visible.</p>
     *
     * JavaScript Info:
     * @property visible
     * @type Boolean
     * 
     */
    @JsProperty void setVisible(boolean value);

    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    @JsProperty String getText();
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    @JsProperty void setText(String value);


    /**
     * <p>Hide the toast</p>
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    void hide();

    /**
     * <p>Show the toast.</p>
     *
     * JavaScript Info:
     * @method show
     * 
     * 
     */
    void show();

    /**
     * <p>Toggle the opened state of the toast.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    void toggle();

}
