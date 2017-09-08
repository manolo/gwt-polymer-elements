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
 * <p>Fired when we have the actual server response, and before the component<br>analises it. It’s useful for developers to make the upload fail depending<br>on the server response. If the event is preventDefault the vaadin-upload<br>will return allowing the user to do something on his own like retry the<br>upload, etc. since he has full access to the <code>xhr</code> and <code>file</code> objects.<br>Otherwise, if the event is not prevented default <code>vaadin-upload</code> continues<br>with the normal workflow checking the <code>xhr.status</code> and <code>file.error</code><br>which also might be modified by the user to force a customised response.</p>
 */
public class UploadResponseEvent extends DomEvent<UploadResponseEventHandler> {

    public static Type<UploadResponseEventHandler> TYPE = new Type<UploadResponseEventHandler>(
       com.vaadin.polymer.vaadin.event.UploadResponseEvent.NAME, new UploadResponseEvent());


    public UploadResponseEvent() {
    }

    public Type<UploadResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UploadResponseEventHandler handler) {
        handler.onUploadResponse(this);
    }

    public com.vaadin.polymer.vaadin.event.UploadResponseEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.UploadResponseEvent)super.getNativeEvent();
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
