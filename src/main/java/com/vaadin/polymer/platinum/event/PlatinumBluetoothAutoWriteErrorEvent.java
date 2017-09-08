/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when an error occurs while writing automatically to a characteristic.</p>
 */
@JsType(isNative=true)
public interface PlatinumBluetoothAutoWriteErrorEvent extends Event {

    @JsOverlay static final String NAME = "platinum-bluetooth-auto-write-error";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>error message</p>
         */
        @JsProperty String getThe();

    }

}
