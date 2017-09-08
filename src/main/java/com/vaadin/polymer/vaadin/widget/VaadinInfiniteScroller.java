/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
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
public class VaadinInfiniteScroller extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinInfiniteScroller() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinInfiniteScroller(String html) {
        super(VaadinInfiniteScrollerElement.TAG, VaadinInfiniteScrollerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinInfiniteScrollerElement getPolymerElement() {
        return (VaadinInfiniteScrollerElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property active
     * @type boolean
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
     * @type boolean
     * 
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }

    /**
     * <p>Count of individual items in each buffer.<br>The scroller has 2 buffers altogether so bufferSize of 20<br>will result in 40 buffered DOM items in total.<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property bufferSize
     * @type Number
     * 
     */
    public double getBufferSize() {
        return getPolymerElement().getBufferSize();
    }
    /**
     * <p>Count of individual items in each buffer.<br>The scroller has 2 buffers altogether so bufferSize of 20<br>will result in 40 buffered DOM items in total.<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property bufferSize
     * @type Number
     * 
     */
    public void setBufferSize(double value) {
        getPolymerElement().setBufferSize(value);
    }

    /**
     * <p>Height of individual items (in pixels).<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property itemHeight
     * @type Number
     * 
     */
    public double getItemHeight() {
        return getPolymerElement().getItemHeight();
    }
    /**
     * <p>Height of individual items (in pixels).<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @property itemHeight
     * @type Number
     * 
     */
    public void setItemHeight(double value) {
        getPolymerElement().setItemHeight(value);
    }

    /**
     * <p>Current scroller position as index. Can be a fractional number.</p>
     *
     * JavaScript Info:
     * @property position
     * @type Number
     * 
     */
    public double getPosition() {
        return getPolymerElement().getPosition();
    }
    /**
     * <p>Current scroller position as index. Can be a fractional number.</p>
     *
     * JavaScript Info:
     * @property position
     * @type Number
     * 
     */
    public void setPosition(double value) {
        getPolymerElement().setPosition(value);
    }


    // Needed in UIBinder
    /**
     * <p>Count of individual items in each buffer.<br>The scroller has 2 buffers altogether so bufferSize of 20<br>will result in 40 buffered DOM items in total.<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @attribute buffer-size
     * 
     */
    public void setBufferSize(String value) {
        Polymer.property(this.getPolymerElement(), "bufferSize", value);
    }

    // Needed in UIBinder
    /**
     * <p>Height of individual items (in pixels).<br>Changing after initialization not supported.</p>
     *
     * JavaScript Info:
     * @attribute item-height
     * 
     */
    public void setItemHeight(String value) {
        Polymer.property(this.getPolymerElement(), "itemHeight", value);
    }

    // Needed in UIBinder
    /**
     * <p>Current scroller position as index. Can be a fractional number.</p>
     *
     * JavaScript Info:
     * @attribute position
     * 
     */
    public void setPosition(String value) {
        Polymer.property(this.getPolymerElement(), "position", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
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
     * @behavior VaadinInfiniteScroller
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
     * @behavior VaadinInfiniteScroller
     * 
     */
    public void templatize(Object template) {
        getPolymerElement().templatize(template);
    }


}
