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
 * <p>Fired after the animation to hide the element has finished. It is listened<br>by <code>vaadin-upload</code> which will actually remove the file from the upload<br>file list.</p>
 */
@JsType(isNative=true)
public interface FileRemoveEvent extends Event {

    @JsOverlay static final String NAME = "file-remove";

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
         * <p>file to remove from the  upload of</p>
         */
        @JsProperty JavaScriptObject getFile();

    }

}
