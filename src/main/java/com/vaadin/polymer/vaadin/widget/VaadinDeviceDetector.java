/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
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
public class VaadinDeviceDetector extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinDeviceDetector() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinDeviceDetector(String html) {
        super(VaadinDeviceDetectorElement.TAG, VaadinDeviceDetectorElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinDeviceDetectorElement getPolymerElement() {
        return (VaadinDeviceDetectorElement) getElement();
    }


    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    public boolean getPhone() {
        return getPolymerElement().getPhone();
    }
    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    public void setPhone(boolean value) {
        getPolymerElement().setPhone(value);
    }

    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    public boolean getTouch() {
        return getPolymerElement().getTouch();
    }
    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    public void setTouch(boolean value) {
        getPolymerElement().setTouch(value);
    }

    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    public boolean getWide() {
        return getPolymerElement().getWide();
    }
    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    public void setWide(boolean value) {
        getPolymerElement().setWide(value);
    }




}
