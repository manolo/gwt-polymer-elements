/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when iron-selector is activated (selected or deselected).<br>It is fired before the selected items are changed.<br>Cancel the event to abort selection.</p>
 */
@JsType(isNative=true)
public interface IronActivateEvent extends Event {

    @JsOverlay static final String NAME = "iron-activate";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * 
         */
        @JsProperty JavaScriptObject getDetail();

        /**
         * <p>the item element</p>
         */
        @JsProperty JavaScriptObject getItem();

    }

}
