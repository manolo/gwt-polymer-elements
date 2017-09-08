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
 * <p>Fired as many times as the progress is updated.</p>
 */
public class UploadProgressEvent extends DomEvent<UploadProgressEventHandler> {

    public static Type<UploadProgressEventHandler> TYPE = new Type<UploadProgressEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadProgressEvent.NAME, new UploadProgressEvent());


    public UploadProgressEvent() {
    }

    public Type<UploadProgressEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadProgressEventHandler handler) {
        handler.onUploadProgress(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadProgressEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadProgressEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the xhr</p>
     */
    public JavaScriptObject getXhr() {
        return getPolymerEvent().getDetail().getXhr();
    }

    /**
     * <p>the file being uploaded with loaded info</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
