/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.polymer.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class DomTemplate extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DomTemplate() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DomTemplate(String html) {
        super(DomTemplateElement.TAG, DomTemplateElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DomTemplateElement getPolymerElement() {
        try {
            return (DomTemplateElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }




    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * 
     * 
     */
    public void modelForElement(Object el) {
        getPolymerElement().modelForElement(el);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * 
     * 
     */
    public void stamp(Object model) {
        getPolymerElement().stamp(model);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * 
     * 
     */
    public void templatize(Object template) {
        getPolymerElement().templatize(template);
    }


}
