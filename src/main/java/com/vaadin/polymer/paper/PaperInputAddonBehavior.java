/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
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
 * <p>Use <code>Polymer.PaperInputAddonBehavior</code> to implement an add-on for <code>&lt;paper-input-container&gt;</code>. A<br>add-on appears below the input, and may display information based on the input value and<br>validity such as a character counter or an error message.</p>
 */
@JsType(isNative=true)
public interface PaperInputAddonBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperInputAddonBehavior";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";



    /**
     * <p>The function called by <code>&lt;paper-input-container&gt;</code> when the input value or validity changes.</p>
     *
     * JavaScript Info:
     * @method update
     * @param {{inputElement: (Element|undefined), value: (string|undefined), invalid: boolean}} state  
     * 
     * 
     */
    void update(Object state);

}
