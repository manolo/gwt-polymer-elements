/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when loaded value does not exist.<br>Event handler can be used to initialize default value.</p>
 */
@JsType
public interface IronLocalstorageLoadEmptyEvent extends Event {

    static final String NAME = "iron-localstorage-load-empty";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * <pre><code>externalChange: true if change occured in different window.
         * </code></pre>
         */
        @JsProperty JavaScriptObject getDetail();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronLocalstorageLoadEmptyEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronLocalstorageLoadEmptyEvent) event);
        }
    }
}
