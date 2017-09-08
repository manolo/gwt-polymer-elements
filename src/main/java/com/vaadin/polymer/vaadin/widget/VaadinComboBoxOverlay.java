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
public class VaadinComboBoxOverlay extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinComboBoxOverlay() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinComboBoxOverlay(String html) {
        super(VaadinComboBoxOverlayElement.TAG, VaadinComboBoxOverlayElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinComboBoxOverlayElement getPolymerElement() {
        return (VaadinComboBoxOverlayElement) getElement();
    }


    /**
     * <p><code>true</code> when new items are being loaded.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p><code>true</code> when new items are being loaded.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
    }

    /**
     * <p>True if the device supports touch events.</p>
     *
     * JavaScript Info:
     * @property touchDevice
     * @type Boolean
     * 
     */
    public boolean getTouchDevice() {
        return getPolymerElement().getTouchDevice();
    }
    /**
     * <p>True if the device supports touch events.</p>
     *
     * JavaScript Info:
     * @property touchDevice
     * @type Boolean
     * 
     */
    public void setTouchDevice(boolean value) {
        getPolymerElement().setTouchDevice(value);
    }

    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public double getVerticalOffset() {
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public void setVerticalOffset(double value) {
        getPolymerElement().setVerticalOffset(value);
    }

    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    public JavaScriptObject getPositionTarget() {
        return getPolymerElement().getPositionTarget();
    }
    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    public void setPositionTarget(JavaScriptObject value) {
        getPolymerElement().setPositionTarget(value);
    }


    // Needed in UIBinder
    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * 
     */
    public void setVerticalOffset(String value) {
        Polymer.property(this.getPolymerElement(), "verticalOffset", value);
    }

    // Needed in UIBinder
    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @attribute position-target
     * 
     */
    public void setPositionTarget(String value) {
        Polymer.property(this.getPolymerElement(), "positionTarget", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Gets the index of the item with the provided label.</p>
     *
     * JavaScript Info:
     * @method indexOfLabel
     * @param {} label  
     * 
     * @return {double}
     */
    public double indexOfLabel(Object label) {
        return getPolymerElement().indexOfLabel(label);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Gets the label string for the item based on the <code>_itemLabelPath</code>.</p>
     *
     * JavaScript Info:
     * @method getItemLabel
     * @param {} item  
     * 
     * @return {String}
     */
    public String getItemLabel(Object item) {
        return getPolymerElement().getItemLabel(item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method ensureItemsRendered
     * 
     * 
     */
    public void ensureItemsRendered() {
        getPolymerElement().ensureItemsRendered();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method updateViewportBoundaries
     * 
     * 
     */
    public void updateViewportBoundaries() {
        getPolymerElement().updateViewportBoundaries();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method adjustScrollPosition
     * 
     * 
     */
    public void adjustScrollPosition() {
        getPolymerElement().adjustScrollPosition();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
