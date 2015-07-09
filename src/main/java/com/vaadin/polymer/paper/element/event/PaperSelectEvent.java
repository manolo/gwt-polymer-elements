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
 * <p>Fired when the selected panel changes.</p>
 * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is selected and deselected.<br>The <code>isSelected</code> detail property contains the selection state.</p>
 */
@JsType
public interface PaperSelectEvent extends Event {

    static final String NAME = "paper-select";

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
         * 
         */
        @JsProperty boolean getIsSelected();

        /**
         * <p>isSelected: True for selection and false for deselection.<br>    item: The panel that the event refers to.</p>
         */
        @JsProperty JavaScriptObject getItem();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperSelectEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperSelectEvent) event);
        }
    }
}
