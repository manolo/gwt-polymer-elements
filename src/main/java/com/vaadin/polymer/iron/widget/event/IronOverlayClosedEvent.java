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
 * <p>Fired after the overlay closes.</p>
 */
public class IronOverlayClosedEvent extends DomEvent<IronOverlayClosedEventHandler> {

    public static Type<IronOverlayClosedEventHandler> TYPE = new Type<IronOverlayClosedEventHandler>(
       com.vaadin.polymer.iron.event.IronOverlayClosedEvent.NAME, new IronOverlayClosedEvent());


    public IronOverlayClosedEvent() {
    }

    public Type<IronOverlayClosedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayClosedEventHandler handler) {
        handler.onIronOverlayClosed(this);
    }

    public com.vaadin.polymer.iron.event.IronOverlayClosedEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronOverlayClosedEvent)super.getNativeEvent();
    }


    /**
     * <p>The <code>event.detail</code> is the <code>closingReason</code> property<br>(contains <code>canceled</code>, whether the overlay was canceled).</p>
     */
    public JavaScriptObject getEvent() {
        return getPolymerEvent().getDetail().getEvent();
    }

}
