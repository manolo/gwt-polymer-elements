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
 * <p>Fired when a file cannot be added to the queue due to a constrain:<br> file-size, file-type or maxFiles</p>
 */
public class FileRejectEvent extends DomEvent<FileRejectEventHandler> {

    public static Type<FileRejectEventHandler> TYPE = new Type<FileRejectEventHandler>(
       com.vaadin.polymer.vaadin.event.FileRejectEvent.NAME, new FileRejectEvent());


    public FileRejectEvent() {
    }

    public Type<FileRejectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(FileRejectEventHandler handler) {
        handler.onFileReject(this);
    }

    public com.vaadin.polymer.vaadin.event.FileRejectEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.FileRejectEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the file added</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

    /**
     * <p>the cause</p>
     */
    public JavaScriptObject getError() {
        return getPolymerEvent().getDetail().getError();
    }

}
