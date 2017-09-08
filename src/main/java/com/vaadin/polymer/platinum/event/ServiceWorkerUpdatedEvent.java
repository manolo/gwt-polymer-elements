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
 * <p>Fired when the service worker update flow completes successfully.<br>If you make changes to your <code>&lt;platinum-sw-register&gt;</code> configuration (i.e. by adding in new<br><code>&lt;platinum-sw-*&gt;</code> child elements, or changing their attributes), users who had the old<br>service worker installed will get the update installed when they see the modified elements.</p>
 */
@JsType(isNative=true)
public interface ServiceWorkerUpdatedEvent extends Event {

    @JsOverlay static final String NAME = "service-worker-updated";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>message indicating that the update succeeded.</p>
         */
        @JsProperty String getA();

    }

}
