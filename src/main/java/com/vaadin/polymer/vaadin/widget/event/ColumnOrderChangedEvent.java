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
 * <p>A change in the column order.</p>
 */
public class ColumnOrderChangedEvent extends DomEvent<ColumnOrderChangedEventHandler> {

    public static Type<ColumnOrderChangedEventHandler> TYPE = new Type<ColumnOrderChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.ColumnOrderChangedEvent.NAME, new ColumnOrderChangedEvent());


    public ColumnOrderChangedEvent() {
    }

    public Type<ColumnOrderChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ColumnOrderChangedEventHandler handler) {
        handler.onColumnOrderChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.ColumnOrderChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.ColumnOrderChangedEvent)super.getNativeEvent();
    }


}
