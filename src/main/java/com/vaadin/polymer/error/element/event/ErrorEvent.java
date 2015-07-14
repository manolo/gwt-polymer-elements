/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.error.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when an error is received.</p>
 */
@JsType
public interface ErrorEvent extends Event {

    static final String NAME = "error";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ErrorEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ErrorEvent) event);
        }
    }
}
