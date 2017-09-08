/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-push-messaging project by The Polymer Authors
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
 * <p>Fired when a push message is received but no notification is shown.<br>This happens when the click URL is for this page and the page is<br>visible to the user on the screen.</p>
 */
@JsType(isNative=true)
public interface PlatinumPushMessagingPushEvent extends Event {

    @JsOverlay static final String NAME = "platinum-push-messaging-push";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>push message data that was received</p>
         */
        @JsProperty JavaScriptObject getThe();

    }

}
