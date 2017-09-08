/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the scroller reaches the target scrolling position.</p>
 */
@JsType(isNative=true)
public interface ScrollAnimationFinishedEvent extends Event {

    @JsOverlay static final String NAME = "scroll-animation-finished";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>new position</p>
         */
        @JsProperty double getPosition();

        /**
         * <p>old position</p>
         */
        @JsProperty double getOldPosition();

    }

}
