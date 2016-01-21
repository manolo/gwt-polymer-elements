/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
 */
@JsType(isNative=true)
public interface IronOverlayClosedEvent extends Event {

    @JsOverlay static final String NAME = "iron-overlay-closed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>to the <code>closingReason</code> attribute</p>
         */
        @JsProperty Object getSet();

    }

}
