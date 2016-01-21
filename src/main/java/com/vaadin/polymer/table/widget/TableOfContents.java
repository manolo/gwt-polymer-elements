/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from table-of-contents project by Jouni Koivuviita <jouni@jouni.me>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.table.widget;

import com.vaadin.polymer.table.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class TableOfContents extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public TableOfContents() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public TableOfContents(String html) {
        super(TableOfContentsElement.TAG, TableOfContentsElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public TableOfContentsElement getPolymerElement() {
        try {
            return (TableOfContentsElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property idCount
     * @type number
     * 
     */
    public double getIdCount() {
        return getPolymerElement().getIdCount();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property idCount
     * @type number
     * 
     */
    public void setIdCount(double value) {
        getPolymerElement().setIdCount(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property select
     * @type string
     * 
     */
    public String getSelect() {
        return getPolymerElement().getSelect();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property select
     * @type string
     * 
     */
    public void setSelect(String value) {
        getPolymerElement().setSelect(value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @attribute id-count
     * 
     */
    public void setIdCount(String value) {
        getPolymerElement().setAttribute("id-count", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method addLink
     * @param {} el  
     * @param {} level  
     * @param {} tocContext  
     * 
     * 
     */
    public void addLink(Object el, Object level, Object tocContext) {
        getPolymerElement().addLink(el, level, tocContext);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method level
     * @param {} selectors  
     * @param {} level  
     * @param {} context  
     * @param {} tocContext  
     * 
     * 
     */
    public void level(Object selectors, Object level, Object context, Object tocContext) {
        getPolymerElement().level(selectors, level, context, tocContext);
    }


}
