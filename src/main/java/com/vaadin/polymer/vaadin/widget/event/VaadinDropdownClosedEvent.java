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
 * <p>Fired after the <code>vaadin-dropdown</code> closes.</p>
 */
public class VaadinDropdownClosedEvent extends DomEvent<VaadinDropdownClosedEventHandler> {

    public static Type<VaadinDropdownClosedEventHandler> TYPE = new Type<VaadinDropdownClosedEventHandler>(
       com.vaadin.polymer.vaadin.event.VaadinDropdownClosedEvent.NAME, new VaadinDropdownClosedEvent());


    public VaadinDropdownClosedEvent() {
    }

    public Type<VaadinDropdownClosedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(VaadinDropdownClosedEventHandler handler) {
        handler.onVaadinDropdownClosed(this);
    }

    public com.vaadin.polymer.vaadin.event.VaadinDropdownClosedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.VaadinDropdownClosedEvent)super.getNativeEvent();
    }


}
