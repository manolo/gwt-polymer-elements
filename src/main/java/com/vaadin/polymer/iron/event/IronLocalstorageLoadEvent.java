/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
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
 * <p>Fired when value loads from localStorage.</p>
 */
@JsType(isNative=true)
public interface IronLocalstorageLoadEvent extends Event {

    @JsOverlay static final String NAME = "iron-localstorage-load";

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
