/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
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
 * <p>Fired when an error prevents the service worker installation from completing.</p>
 */
@JsType(isNative=true)
public interface ServiceWorkerErrorEvent extends Event {

    @JsOverlay static final String NAME = "service-worker-error";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>message indicating what went wrong.</p>
         */
        @JsProperty String getA();

    }

}
