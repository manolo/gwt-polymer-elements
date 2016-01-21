/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when loaded value does not exist.<br>Event handler can be used to initialize default value.</p>
 */
@JsType(isNative=true)
public interface IronLocalstorageLoadEmptyEvent extends Event {

    @JsOverlay static final String NAME = "iron-localstorage-load-empty";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <pre><code>externalChange: true if change occured in different window.
         * </code></pre>
         */
        @JsProperty JavaScriptObject getDetail();

    }

}
