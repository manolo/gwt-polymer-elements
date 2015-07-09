/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.immediate.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the slider’s immediateValue changes.</p>
 */
@JsType
public interface ImmediateValueChangeEvent extends Event {

    static final String NAME = "immediate-value-change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ImmediateValueChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ImmediateValueChangeEvent) event);
        }
    }
}
