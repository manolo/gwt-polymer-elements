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
 * <p>A change in the sorting order.</p>
 */
public class SortOrderChangedEvent extends DomEvent<SortOrderChangedEventHandler> {

    public static Type<SortOrderChangedEventHandler> TYPE = new Type<SortOrderChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.SortOrderChangedEvent.NAME, new SortOrderChangedEvent());


    public SortOrderChangedEvent() {
    }

    public Type<SortOrderChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SortOrderChangedEventHandler handler) {
        handler.onSortOrderChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.SortOrderChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.SortOrderChangedEvent)super.getNativeEvent();
    }


}
