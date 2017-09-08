/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.polymer.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class DomRepeat extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DomRepeat() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DomRepeat(String html) {
        super(DomRepeatElement.TAG, DomRepeatElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DomRepeatElement getPolymerElement() {
        return (DomRepeatElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    public double getInitialCount() {
        return getPolymerElement().getInitialCount();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property initialCount
     * @type Number
     * 
     */
    public void setInitialCount(double value) {
        getPolymerElement().setInitialCount(value);
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
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    public boolean getNotifyDomChange() {
        return getPolymerElement().getNotifyDomChange();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property notifyDomChange
     * @type Boolean
     * 
     */
    public void setNotifyDomChange(boolean value) {
        getPolymerElement().setNotifyDomChange(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    public double getDelay() {
        return getPolymerElement().getDelay();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property delay
     * @type number
     * 
     */
    public void setDelay(double value) {
        getPolymerElement().setDelay(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property renderedItemCount
     * @type Number
     * 
     */
    public double getRenderedItemCount() {
        return getPolymerElement().getRenderedItemCount();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property renderedItemCount
     * @type Number
     * 
     */
    public void setRenderedItemCount(double value) {
        getPolymerElement().setRenderedItemCount(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property targetFramerate
     * @type Number
     * 
     */
    public double getTargetFramerate() {
        return getPolymerElement().getTargetFramerate();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property targetFramerate
     * @type Number
     * 
     */
    public void setTargetFramerate(double value) {
        getPolymerElement().setTargetFramerate(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    public Function getFilter() {
        return getPolymerElement().getFilter();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property filter
     * @type Function
     * 
     */
    public void setFilter(Function value) {
        getPolymerElement().setFilter(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    public Function getSort() {
        return getPolymerElement().getSort();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property sort
     * @type Function
     * 
     */
    public void setSort(Function value) {
        getPolymerElement().setSort(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    public String getObserve() {
        return getPolymerElement().getObserve();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observe
     * @type String
     * 
     */
    public void setObserve(String value) {
        getPolymerElement().setObserve(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public String getIndexAs() {
        return getPolymerElement().getIndexAs();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public void setIndexAs(String value) {
        getPolymerElement().setIndexAs(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public String getAs() {
        return getPolymerElement().getAs();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public void setAs(String value) {
        getPolymerElement().setAs(value);
    }


    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        Polymer.property(this.getPolymerElement(), "items", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute delay
     * 
     */
    public void setDelay(String value) {
        Polymer.property(this.getPolymerElement(), "delay", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute rendered-item-count
     * 
     */
    public void setRenderedItemCount(String value) {
        Polymer.property(this.getPolymerElement(), "renderedItemCount", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute target-framerate
     * 
     */
    public void setTargetFramerate(String value) {
        Polymer.property(this.getPolymerElement(), "targetFramerate", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute initial-count
     * 
     */
    public void setInitialCount(String value) {
        Polymer.property(this.getPolymerElement(), "initialCount", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method indexForElement
     * @param {} el  
     * 
     * 
     */
    public void indexForElement(Object el) {
        getPolymerElement().indexForElement(el);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method keyForElement
     * @param {} el  
     * 
     * 
     */
    public void keyForElement(Object el) {
        getPolymerElement().keyForElement(el);
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

    /**
     * 
     *
     * JavaScript Info:
     * @method itemForElement
     * @param {} el  
     * 
     * 
     */
    public void itemForElement(Object el) {
        getPolymerElement().itemForElement(el);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    public void render() {
        getPolymerElement().render();
    }


}
