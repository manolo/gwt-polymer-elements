/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * 
 */
@JsType
public interface IronSelectEvent extends Event {

    static final String NAME = "iron-select";

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
         * <p>the item element</p>
         */
        @JsProperty JavaScriptObject getItem();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronSelectEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronSelectEvent) event);
        }
    }
}
