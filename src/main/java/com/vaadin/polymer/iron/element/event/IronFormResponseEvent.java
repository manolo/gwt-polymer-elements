/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired after the form is submitted and a response is received.</p>
 */
@JsType
public interface IronFormResponseEvent extends Event {

    static final String NAME = "iron-form-response";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronFormResponseEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronFormResponseEvent) event);
        }
    }
}
