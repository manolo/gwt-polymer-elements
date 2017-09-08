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
 * <p>Fired when we have the actual server response, and before the component<br>analises it. It’s useful for developers to make the upload fail depending<br>on the server response. If the event is preventDefault the vaadin-upload<br>will return allowing the user to do something on his own like retry the<br>upload, etc. since he has full access to the <code>xhr</code> and <code>file</code> objects.<br>Otherwise, if the event is not prevented default <code>vaadin-upload</code> continues<br>with the normal workflow checking the <code>xhr.status</code> and <code>file.error</code><br>which also might be modified by the user to force a customised response.</p>
 */
@JsType(isNative=true)
public interface UploadResponseEvent extends Event {

    @JsOverlay static final String NAME = "upload-response";

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
