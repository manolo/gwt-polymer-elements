/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-spinner project by The Polymer Authors
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
 * 
 */
@JsType(isNative=true)
public interface PaperSpinnerBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperSpinnerBehavior";
    @JsOverlay public static final String SRC = "paper-spinner/paper-spinner.html";


    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty boolean getActive();
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty void setActive(boolean value);

    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty String getAlt();
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty void setAlt(String value);


}
