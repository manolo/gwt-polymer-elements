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
 * <p>Fired when retry upload is requested. If the default is prevented, then<br>retry would not be performed.</p>
 */
public class UploadRetryEvent extends DomEvent<UploadRetryEventHandler> {

    public static Type<UploadRetryEventHandler> TYPE = new Type<UploadRetryEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadRetryEvent.NAME, new UploadRetryEvent());


    public UploadRetryEvent() {
    }

    public Type<UploadRetryEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadRetryEventHandler handler) {
        handler.onUploadRetry(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadRetryEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadRetryEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the previous upload xhr</p>
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
