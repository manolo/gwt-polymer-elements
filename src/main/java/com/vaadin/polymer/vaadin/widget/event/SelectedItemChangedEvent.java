/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when selected item changes.</p>
 */
public class SelectedItemChangedEvent extends DomEvent<SelectedItemChangedEventHandler> {

    public static Type<SelectedItemChangedEventHandler> TYPE = new Type<SelectedItemChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.SelectedItemChangedEvent.NAME, new SelectedItemChangedEvent());


    public SelectedItemChangedEvent() {
    }

    public Type<SelectedItemChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SelectedItemChangedEventHandler handler) {
        handler.onSelectedItemChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.SelectedItemChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.SelectedItemChangedEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the selected item. Type is the same as the type of <code>items</code>.</p>
     */
    public Object getValue() {
        return getPolymerEvent().getDetail().getValue();
    }

}
