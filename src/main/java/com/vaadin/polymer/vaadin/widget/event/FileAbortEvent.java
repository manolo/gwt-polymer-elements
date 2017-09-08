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
 * <p>Fired when abort button is pressed. It is listened by <code>vaadin-upload</code> which<br>will abort the upload in progress, but will not remove the file from the list<br>to allow the animation to hide the element to be run.</p>
 */
public class FileAbortEvent extends DomEvent<FileAbortEventHandler> {

    public static Type<FileAbortEventHandler> TYPE = new Type<FileAbortEventHandler>(
       com.vaadin.polymer.vaadin.event.FileAbortEvent.NAME, new FileAbortEvent());


    public FileAbortEvent() {
    }

    public Type<FileAbortEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(FileAbortEventHandler handler) {
        handler.onFileAbort(this);
    }

    public com.vaadin.polymer.vaadin.event.FileAbortEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.FileAbortEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>file to abort upload of</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
