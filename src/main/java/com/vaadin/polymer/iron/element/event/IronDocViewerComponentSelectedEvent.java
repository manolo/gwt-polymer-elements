/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Broadcast when another component is clicked on</p>
 */
@JsType
public interface IronDocViewerComponentSelectedEvent extends Event {

    static final String NAME = "iron-doc-viewer-component-selected";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * <p>name of the component<br>iron-doc-viewer container should load component if possible</p>
         */
        @JsProperty String getDetail();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronDocViewerComponentSelectedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronDocViewerComponentSelectedEvent) event);
        }
    }
}
