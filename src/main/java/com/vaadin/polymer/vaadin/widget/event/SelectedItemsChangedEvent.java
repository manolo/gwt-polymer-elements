/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>A row is selected or deselected.</p>
 */
public class SelectedItemsChangedEvent extends DomEvent<SelectedItemsChangedEventHandler> {

    public static Type<SelectedItemsChangedEventHandler> TYPE = new Type<SelectedItemsChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.SelectedItemsChangedEvent.NAME, new SelectedItemsChangedEvent());


    public SelectedItemsChangedEvent() {
    }

    public Type<SelectedItemsChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SelectedItemsChangedEventHandler handler) {
        handler.onSelectedItemsChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.SelectedItemsChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.SelectedItemsChangedEvent)super.getNativeEvent();
    }


}
