/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the user sets a custom value.</p>
 */
@JsType(isNative=true)
public interface CustomValueSetEvent extends Event {

    @JsOverlay static final String NAME = "custom-value-set";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>the custom value</p>
         */
        @JsProperty String getDetail();

    }

}
