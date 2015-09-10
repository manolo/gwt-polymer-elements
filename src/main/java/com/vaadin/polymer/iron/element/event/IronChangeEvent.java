/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the checked state changes.</p>
 */
@JsType
public interface IronChangeEvent extends Event {

    static final String NAME = "iron-change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronChangeEvent) event);
        }
    }
}