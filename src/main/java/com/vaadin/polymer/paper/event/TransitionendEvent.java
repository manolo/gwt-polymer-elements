/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
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
 * <pre><code>  Fired when the animation finishes.
 *   This is useful if you want to wait until
 *   the ripple animation finishes to perform some action.
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface TransitionendEvent extends Event {

    @JsOverlay static final String NAME = "transitionend";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>Contains the animated node.</p>
         */
        @JsProperty JavaScriptObject getDetail();

    }

}
