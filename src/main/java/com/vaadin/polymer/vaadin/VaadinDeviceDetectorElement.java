/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface VaadinDeviceDetectorElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-device-detector";
    @JsOverlay public static final String SRC = "vaadin-context-menu/vaadin-context-menu.html";


    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty boolean getPhone();
    /**
     * <p><code>true</code>, when running in a phone.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty void setPhone(boolean value);

    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    @JsProperty boolean getTouch();
    /**
     * <p><code>true</code>, when running in a touch device.</p>
     *
     * JavaScript Info:
     * @property touch
     * @type Boolean
     * 
     */
    @JsProperty void setTouch(boolean value);

    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    @JsProperty boolean getWide();
    /**
     * <p><code>true</code>, when running in a tablet/desktop device.</p>
     *
     * JavaScript Info:
     * @property wide
     * @type Boolean
     * 
     */
    @JsProperty void setWide(boolean value);


}
