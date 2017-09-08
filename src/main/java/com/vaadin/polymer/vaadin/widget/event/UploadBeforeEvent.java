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
 * <p>Fired before the XHR is opened. Could be used for changing the request<br>URL. If the default is prevented, then XHR would not be opened.</p>
 */
public class UploadBeforeEvent extends DomEvent<UploadBeforeEventHandler> {

    public static Type<UploadBeforeEventHandler> TYPE = new Type<UploadBeforeEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadBeforeEvent.NAME, new UploadBeforeEvent());


    public UploadBeforeEvent() {
    }

    public Type<UploadBeforeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadBeforeEventHandler handler) {
        handler.onUploadBefore(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadBeforeEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadBeforeEvent)super.getNativeEvent();
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
