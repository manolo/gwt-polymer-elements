/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
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
 * <p>Fired when an event registered in the <code>detailedEvents</code> array is fired.<br>The name of the event depends of the original event type, for instance if the<br>original event is <code>contextmenu</code> the event name will be <code>detailed-contextmenu</code>.</p>
 */
@JsType(isNative=true)
public interface DetailedEventEvent extends Event {

    @JsOverlay static final String NAME = "detailed-event";

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
         * <p>The original event.</p>
         */
        @JsProperty JavaScriptObject getEvent();

        /**
         * <p>The column index where the element is located.</p>
         */
        @JsProperty double getColumn();

        /**
         * <p>The row index where the element is located</p>
         */
        @JsProperty double getRow();

        /**
         * <p>The section name in the grid (header|body|footer)</p>
         */
        @JsProperty String getSection();

        /**
         * <p>The row data if the event was on the body, otherwise undefined</p>
         */
        @JsProperty JavaScriptObject getData();

    }

}
