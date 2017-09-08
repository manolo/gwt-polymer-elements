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
 * <p>Fired in case the upload process succeed.</p>
 */
public class UploadSuccessEvent extends DomEvent<UploadSuccessEventHandler> {

    public static Type<UploadSuccessEventHandler> TYPE = new Type<UploadSuccessEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadSuccessEvent.NAME, new UploadSuccessEvent());


    public UploadSuccessEvent() {
    }

    public Type<UploadSuccessEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadSuccessEventHandler handler) {
        handler.onUploadSuccess(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadSuccessEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadSuccessEvent)super.getNativeEvent();
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
