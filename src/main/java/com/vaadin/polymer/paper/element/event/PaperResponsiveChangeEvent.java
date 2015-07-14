/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the narrow layout changes.</p>
 */
@JsType
public interface PaperResponsiveChangeEvent extends Event {

    static final String NAME = "paper-responsive-change";

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
         * <p>narrow: true if the panel is in narrow layout.</p>
         */
        @JsProperty boolean getNarrow();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperResponsiveChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperResponsiveChangeEvent) event);
        }
    }
}
