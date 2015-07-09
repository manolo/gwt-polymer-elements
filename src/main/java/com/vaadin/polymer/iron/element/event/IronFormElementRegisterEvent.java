/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the element is added to an <code>iron-form</code>.</p>
 */
@JsType
public interface IronFormElementRegisterEvent extends Event {

    static final String NAME = "iron-form-element-register";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronFormElementRegisterEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronFormElementRegisterEvent) event);
        }
    }
}
