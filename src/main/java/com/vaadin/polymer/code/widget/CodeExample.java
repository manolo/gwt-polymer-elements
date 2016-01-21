/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from code-example project by Jouni Koivuviita <jouni@jouni.me>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.code.widget;

import com.vaadin.polymer.code.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class CodeExample extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public CodeExample() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public CodeExample(String html) {
        super(CodeExampleElement.TAG, CodeExampleElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public CodeExampleElement getPolymerElement() {
        try {
            return (CodeExampleElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }




    /**
     * 
     *
     * JavaScript Info:
     * @method toggleSourceVisible
     * 
     * 
     */
    public void toggleSourceVisible() {
        getPolymerElement().toggleSourceVisible();
    }


}
