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
 * <p>Fired if the form cannot be submitted because it’s invalid.</p>
 */
@JsType
public interface IronFormInvalidEvent extends Event {

    static final String NAME = "iron-form-invalid";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronFormInvalidEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronFormInvalidEvent) event);
        }
    }
}
