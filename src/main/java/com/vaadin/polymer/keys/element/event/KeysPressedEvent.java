/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.keys.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * 
 */
@JsType
public interface KeysPressedEvent extends Event {

    static final String NAME = "keys-pressed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
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


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(KeysPressedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((KeysPressedEvent) event);
        }
    }
}
