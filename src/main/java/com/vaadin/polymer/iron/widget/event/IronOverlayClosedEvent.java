/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
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
     * <p>to the <code>closingReason</code> attribute</p>
     */
    public Object getSet() {
        return getPolymerEvent().getDetail().getSet();
    }

}
