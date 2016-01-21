/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the <code>vaadin-dropdown</code> opens.</p>
 */
public class VaadinDropdownOpenedEvent extends DomEvent<VaadinDropdownOpenedEventHandler> {

    public static Type<VaadinDropdownOpenedEventHandler> TYPE = new Type<VaadinDropdownOpenedEventHandler>(
       com.vaadin.polymer.vaadin.event.VaadinDropdownOpenedEvent.NAME, new VaadinDropdownOpenedEvent());


    public VaadinDropdownOpenedEvent() {
    }

    public Type<VaadinDropdownOpenedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(VaadinDropdownOpenedEventHandler handler) {
        handler.onVaadinDropdownOpened(this);
    }

    public com.vaadin.polymer.vaadin.event.VaadinDropdownOpenedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.VaadinDropdownOpenedEvent)super.getNativeEvent();
    }


}
