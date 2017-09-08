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
 * <p>Fired when the XHR has been opened but not sent yet. Useful for appending<br>data keys to the FormData object, for changing some parameters like<br>headers, etc. If the event is preventDefault, <code>vaadin-upload</code> will not<br>send the request allowing the user to do something on his own.</p>
 */
@JsType(isNative=true)
public interface UploadRequestEvent extends Event {

    @JsOverlay static final String NAME = "upload-request";

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

        /**
         * <p>the FormData object</p>
         */
        @JsProperty JavaScriptObject getFormData();

    }

}
