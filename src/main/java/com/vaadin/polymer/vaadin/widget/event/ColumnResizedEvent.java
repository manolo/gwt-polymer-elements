/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>A change in column sizes</p>
 */
public class ColumnResizedEvent extends DomEvent<ColumnResizedEventHandler> {

    public static Type<ColumnResizedEventHandler> TYPE = new Type<ColumnResizedEventHandler>(
       com.vaadin.polymer.vaadin.event.ColumnResizedEvent.NAME, new ColumnResizedEvent());


    public ColumnResizedEvent() {
    }

    public Type<ColumnResizedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ColumnResizedEventHandler handler) {
        handler.onColumnResized(this);
    }

    public com.vaadin.polymer.vaadin.event.ColumnResizedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.ColumnResizedEvent)super.getNativeEvent();
    }


}
