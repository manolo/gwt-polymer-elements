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
 * <p>Fired when the initial service worker installation completes successfully.<br>The service worker will normally only be installed once, the first time a page with a<br><code>&lt;platinum-sw-register&gt;</code> element is visited in a given browser. If the same page is visited<br>again, the existing service worker will be reused, and there won’t be another<br><code>service-worker-installed</code> fired.</p>
 */
@JsType(isNative=true)
public interface ServiceWorkerInstalledEvent extends Event {

    @JsOverlay static final String NAME = "service-worker-installed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>message indicating that the installation succeeded.</p>
         */
        @JsProperty String getA();

    }

}
