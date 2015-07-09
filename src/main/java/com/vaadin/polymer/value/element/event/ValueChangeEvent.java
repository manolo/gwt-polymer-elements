/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.value.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the slider’s value changes.</p>
 */
@JsType
public interface ValueChangeEvent extends Event {

    static final String NAME = "value-change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ValueChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ValueChangeEvent) event);
        }
    }
}
