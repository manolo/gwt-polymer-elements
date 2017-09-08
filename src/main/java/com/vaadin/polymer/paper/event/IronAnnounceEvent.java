/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when <code>paper-toast</code> is opened.</p>
 */
@JsType(isNative=true)
public interface IronAnnounceEvent extends Event {

    @JsOverlay static final String NAME = "iron-announce";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>Contains text that will be announced.</p>
         */
        @JsProperty JavaScriptObject getDetail();

    }

}
