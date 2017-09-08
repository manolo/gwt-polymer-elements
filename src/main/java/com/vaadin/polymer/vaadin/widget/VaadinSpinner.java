/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinSpinner extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinSpinner() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinSpinner(String html) {
        super(VaadinSpinnerElement.TAG, VaadinSpinnerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinSpinnerElement getPolymerElement() {
        return (VaadinSpinnerElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public boolean getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }




}
