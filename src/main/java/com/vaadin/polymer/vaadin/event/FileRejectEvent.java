/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
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
 * <p>Fired when a file cannot be added to the queue due to a constrain:<br> file-size, file-type or maxFiles</p>
 */
@JsType(isNative=true)
public interface FileRejectEvent extends Event {

    @JsOverlay static final String NAME = "file-reject";

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
         * <p>the file added</p>
         */
        @JsProperty JavaScriptObject getFile();

        /**
         * <p>the cause</p>
         */
        @JsProperty JavaScriptObject getError();

    }

}
