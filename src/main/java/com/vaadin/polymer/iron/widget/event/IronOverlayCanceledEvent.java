/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
 */
public class IronOverlayCanceledEvent extends DomEvent<IronOverlayCanceledEventHandler> {

    public static Type<IronOverlayCanceledEventHandler> TYPE = new Type<IronOverlayCanceledEventHandler>(
       com.vaadin.polymer.iron.event.IronOverlayCanceledEvent.NAME, new IronOverlayCanceledEvent());


    public IronOverlayCanceledEvent() {
    }

    public Type<IronOverlayCanceledEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayCanceledEventHandler handler) {
        handler.onIronOverlayCanceled(this);
    }

    public com.vaadin.polymer.iron.event.IronOverlayCanceledEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronOverlayCanceledEvent)super.getNativeEvent();
    }


}
