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
 * <p>Fired when retry abort is requested. If the default is prevented, then the<br>file upload would not be aborted.</p>
 */
@JsType(isNative=true)
public interface UploadAbortEvent extends Event {

    @JsOverlay static final String NAME = "upload-abort";

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
         * <p>the xhr</p>
         */
        @JsProperty JavaScriptObject getXhr();

        /**
         * <p>the file being uploaded</p>
         */
        @JsProperty JavaScriptObject getFile();

    }

}
