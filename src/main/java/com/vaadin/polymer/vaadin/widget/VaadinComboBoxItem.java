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
public class VaadinComboBoxItem extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinComboBoxItem() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinComboBoxItem(String html) {
        super(VaadinComboBoxItemElement.TAG, VaadinComboBoxItemElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinComboBoxItemElement getPolymerElement() {
        return (VaadinComboBoxItemElement) getElement();
    }


    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>True when item is focused</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    public double getIndex() {
        return getPolymerElement().getIndex();
    }
    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    public void setIndex(double value) {
        getPolymerElement().setIndex(value);
    }

    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    public Object getItem() {
        return getPolymerElement().getItem();
    }
    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @property item
     * @type (String|Object)
     * 
     */
    public void setItem(Object value) {
        getPolymerElement().setItem(value);
    }

    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    public boolean getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>True when item is selected</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Boolean
     * 
     */
    public void setSelected(boolean value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    public String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The text label corresponding to the item</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    public void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }


    // Needed in UIBinder
    /**
     * <p>The index of the item</p>
     *
     * JavaScript Info:
     * @attribute index
     * 
     */
    public void setIndex(String value) {
        Polymer.property(this.getPolymerElement(), "index", value);
    }

    // Needed in UIBinder
    /**
     * <p>The item to render</p>
     *
     * JavaScript Info:
     * @attribute item
     * 
     */
    public void setItem(String value) {
        Polymer.property(this.getPolymerElement(), "item", value);
    }



}
