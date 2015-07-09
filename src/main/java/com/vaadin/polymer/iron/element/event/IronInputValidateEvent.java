/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>  The <code>iron-input-validate</code> event is fired whenever <code>validate()</code> is called.</p>
 */
@JsType
public interface IronInputValidateEvent extends Event {

    static final String NAME = "iron-input-validate";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronInputValidateEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronInputValidateEvent) event);
        }
    }
}
