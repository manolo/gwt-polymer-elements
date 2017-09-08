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
 * <p>Fired when the XHR has been opened but not sent yet. Useful for appending<br>data keys to the FormData object, for changing some parameters like<br>headers, etc. If the event is preventDefault, <code>vaadin-upload</code> will not<br>send the request allowing the user to do something on his own.</p>
 */
public class UploadRequestEvent extends DomEvent<UploadRequestEventHandler> {

    public static Type<UploadRequestEventHandler> TYPE = new Type<UploadRequestEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadRequestEvent.NAME, new UploadRequestEvent());


    public UploadRequestEvent() {
    }

    public Type<UploadRequestEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadRequestEventHandler handler) {
        handler.onUploadRequest(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadRequestEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadRequestEvent)super.getNativeEvent();
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

    /**
     * <p>the FormData object</p>
     */
    public JavaScriptObject getFormData() {
        return getPolymerEvent().getDetail().getFormData();
    }

}
