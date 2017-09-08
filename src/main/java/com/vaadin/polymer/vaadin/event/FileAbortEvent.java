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
 * <p>Fired when abort button is pressed. It is listened by <code>vaadin-upload</code> which<br>will abort the upload in progress, but will not remove the file from the list<br>to allow the animation to hide the element to be run.</p>
 */
@JsType(isNative=true)
public interface FileAbortEvent extends Event {

    @JsOverlay static final String NAME = "file-abort";

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
         * <p>file to abort upload of</p>
         */
        @JsProperty JavaScriptObject getFile();

    }

}
