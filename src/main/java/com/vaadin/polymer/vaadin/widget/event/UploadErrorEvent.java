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
 * <p>Fired in case the upload process failed.</p>
 */
public class UploadErrorEvent extends DomEvent<UploadErrorEventHandler> {

    public static Type<UploadErrorEventHandler> TYPE = new Type<UploadErrorEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadErrorEvent.NAME, new UploadErrorEvent());


    public UploadErrorEvent() {
    }

    public Type<UploadErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadErrorEventHandler handler) {
        handler.onUploadError(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadErrorEvent)super.getNativeEvent();
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
     * <p>the file being uploaded</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
