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
 * <p>Fired after the animation to hide the element has finished. It is listened<br>by <code>vaadin-upload</code> which will actually remove the file from the upload<br>file list.</p>
 */
public class FileRemoveEvent extends DomEvent<FileRemoveEventHandler> {

    public static Type<FileRemoveEventHandler> TYPE = new Type<FileRemoveEventHandler>(
       com.vaadin.polymer.vaadin.event.FileRemoveEvent.NAME, new FileRemoveEvent());


    public FileRemoveEvent() {
    }

    public Type<FileRemoveEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(FileRemoveEventHandler handler) {
        handler.onFileRemove(this);
    }

    public com.vaadin.polymer.vaadin.event.FileRemoveEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.FileRemoveEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>file to remove from the  upload of</p>
     */
    public JavaScriptObject getFile() {
        return getPolymerEvent().getDetail().getFile();
    }

}
