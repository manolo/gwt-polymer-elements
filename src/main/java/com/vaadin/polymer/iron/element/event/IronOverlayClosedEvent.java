/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
 */
@JsType
public interface IronOverlayClosedEvent extends Event {

    static final String NAME = "iron-overlay-closed";

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
         * <p>canceled: True if the overlay was canceled.</p>
         */
        @JsProperty boolean getCanceled();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronOverlayClosedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronOverlayClosedEvent) event);
        }
    }
}
