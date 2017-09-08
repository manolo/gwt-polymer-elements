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
 * <p>Fired when the overlay is canceled, but before it is closed.</p>
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


    /**
     * <p>The closing of the overlay can be prevented<br>by calling <code>event.preventDefault()</code>. The <code>event.detail</code> is the original event that<br>originated the canceling (e.g. ESC keyboard event or click event outside the overlay).</p>
     */
    public JavaScriptObject getEvent() {
        return getPolymerEvent().getDetail().getEvent();
    }

}
