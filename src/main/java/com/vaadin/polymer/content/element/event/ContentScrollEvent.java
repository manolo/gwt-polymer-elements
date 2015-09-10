/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.content.element.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Fired when the content has been scrolled.</p>
 */
@JsType
public interface ContentScrollEvent extends Event {

    static final String NAME = "content-scroll";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ContentScrollEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ContentScrollEvent) event);
        }
    }
}
