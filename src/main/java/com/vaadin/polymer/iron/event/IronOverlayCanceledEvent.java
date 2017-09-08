/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the overlay is canceled, but before it is closed.</p>
 */
@JsType(isNative=true)
public interface IronOverlayCanceledEvent extends Event {

    @JsOverlay static final String NAME = "iron-overlay-canceled";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>The closing of the overlay can be prevented<br>by calling <code>event.preventDefault()</code>. The <code>event.detail</code> is the original event that<br>originated the canceling (e.g. ESC keyboard event or click event outside the overlay).</p>
         */
        @JsProperty JavaScriptObject getEvent();

    }

}
