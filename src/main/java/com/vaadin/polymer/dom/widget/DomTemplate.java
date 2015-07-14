/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.dom.widget;

import com.vaadin.polymer.dom.element.*;

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
        return (DomTemplateElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public String getExtends(){
        return getPolymerElement().getExtends();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public void setExtends(String value) {
        getPolymerElement().setExtends(value);
    }
   
  


}
