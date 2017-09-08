/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the overlay opens.</p>
 */
public class IronOverlayOpenedEvent extends DomEvent<IronOverlayOpenedEventHandler> {

    public static Type<IronOverlayOpenedEventHandler> TYPE = new Type<IronOverlayOpenedEventHandler>(
       com.vaadin.polymer.iron.event.IronOverlayOpenedEvent.NAME, new IronOverlayOpenedEvent());


    public IronOverlayOpenedEvent() {
    }

    public Type<IronOverlayOpenedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayOpenedEventHandler handler) {
        handler.onIronOverlayOpened(this);
    }

    public com.vaadin.polymer.iron.event.IronOverlayOpenedEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronOverlayOpenedEvent)super.getNativeEvent();
    }


}
