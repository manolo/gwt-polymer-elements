/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface KeysPressedEvent extends Event {

    @JsOverlay static final String NAME = "keys-pressed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * 
         */
        @JsProperty JavaScriptObject getDetail();

        /**
         * <p>true if shift key is pressed</p>
         */
        @JsProperty boolean getShift();

        /**
         * <p>true if ctrl key is pressed</p>
         */
        @JsProperty boolean getCtrl();

        /**
         * <p>true if meta key is pressed</p>
         */
        @JsProperty boolean getMeta();

        /**
         * <p>true if alt key is pressed</p>
         */
        @JsProperty boolean getAlt();

        /**
         * <p>the normalized key</p>
         */
        @JsProperty String getKey();

    }

}
