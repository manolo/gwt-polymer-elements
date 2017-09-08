/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-location project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class IronQueryParams extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronQueryParams() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronQueryParams(String html) {
        super(IronQueryParamsElement.TAG, IronQueryParamsElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronQueryParamsElement getPolymerElement() {
        return (IronQueryParamsElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property paramsObject
     * @type Object
     * 
     */
    public JavaScriptObject getParamsObject() {
        return getPolymerElement().getParamsObject();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property paramsObject
     * @type Object
     * 
     */
    public void setParamsObject(JavaScriptObject value) {
        getPolymerElement().setParamsObject(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property paramsString
     * @type String
     * 
     */
    public String getParamsString() {
        return getPolymerElement().getParamsString();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property paramsString
     * @type String
     * 
     */
    public void setParamsString(String value) {
        getPolymerElement().setParamsString(value);
    }


    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute params-object
     * 
     */
    public void setParamsObject(String value) {
        Polymer.property(this.getPolymerElement(), "paramsObject", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method paramsObjectChanged
     * 
     * 
     */
    public void paramsObjectChanged() {
        getPolymerElement().paramsObjectChanged();
    }


}
