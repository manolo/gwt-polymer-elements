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
public class ArraySelector extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public ArraySelector() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public ArraySelector(String html) {
        super(ArraySelectorElement.TAG, ArraySelectorElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public ArraySelectorElement getPolymerElement() {
        try {
            return (ArraySelectorElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public JsArray getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    public boolean getMulti() {
        return getPolymerElement().getMulti();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    public void setMulti(boolean value) {
        getPolymerElement().setMulti(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    public JavaScriptObject getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Object
     * 
     */
    public void setSelected(JavaScriptObject value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    public boolean getToggle() {
        return getPolymerElement().getToggle();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property toggle
     * @type Boolean
     * 
     */
    public void setToggle(boolean value) {
        getPolymerElement().setToggle(value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        getPolymerElement().setAttribute("items", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute selected
     * 
     */
    public void setSelected(String value) {
        getPolymerElement().setAttribute("selected", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute selected-item
     * 
     */
    public void setSelectedItem(String value) {
        getPolymerElement().setAttribute("selected-item", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method deselect
     * @param {} item  
     * 
     * 
     */
    public void deselect(Object item) {
        getPolymerElement().deselect(item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method isSelected
     * @param {} item  
     * 
     * 
     */
    public void isSelected(Object item) {
        getPolymerElement().isSelected(item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} item  
     * 
     * 
     */
    public void select(Object item) {
        getPolymerElement().select(item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     * 
     */
    public void clearSelection() {
        getPolymerElement().clearSelection();
    }


}
