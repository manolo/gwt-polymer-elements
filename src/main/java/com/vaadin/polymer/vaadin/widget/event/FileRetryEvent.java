/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the retry button is pressed. It is listened by <code>vaadin-upload</code><br>which will start a new upload process of this file.</p>
 */
public class FileRetryEvent extends DomEvent<FileRetryEventHandler> {

    public static Type<FileRetryEventHandler> TYPE = new Type<FileRetryEventHandler>(
       com.vaadin.polymer.vaadin.event.FileRetryEvent.NAME, new FileRetryEvent());


    public FileRetryEvent() {
    }

    public Type<FileRetryEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(FileRetryEventHandler handler) {
        handler.onFileRetry(this);
    }

    public com.vaadin.polymer.vaadin.event.FileRetryEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.FileRetryEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>file to retry upload of</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
