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
 * <p>Fired when a notification is clicked that had the current page as the<br>click URL.</p>
 */
@JsType(isNative=true)
public interface PlatinumPushMessagingClickEvent extends Event {

    @JsOverlay static final String NAME = "platinum-push-messaging-click";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>push message data used to create the notification</p>
         */
        @JsProperty JavaScriptObject getThe();

    }

}
