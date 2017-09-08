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
 * <p>Fired when retry abort is requested. If the default is prevented, then the<br>file upload would not be aborted.</p>
 */
public class UploadAbortEvent extends DomEvent<UploadAbortEventHandler> {

    public static Type<UploadAbortEventHandler> TYPE = new Type<UploadAbortEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadAbortEvent.NAME, new UploadAbortEvent());


    public UploadAbortEvent() {
    }

    public Type<UploadAbortEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadAbortEventHandler handler) {
        handler.onUploadAbort(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadAbortEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadAbortEvent)super.getNativeEvent();
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
