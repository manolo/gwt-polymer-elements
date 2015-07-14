/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
 */
public class IronOverlayClosedEvent extends GwtEvent<IronOverlayClosedEventHandler> {

    public static Type<IronOverlayClosedEventHandler> TYPE = new Type<IronOverlayClosedEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent nativeEvent;

    public IronOverlayClosedEvent(com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronOverlayClosedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayClosedEventHandler handler) {
        handler.onIronOverlayClosed(this);
    }

    public com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>canceled: True if the overlay was canceled.</p>
     */
    public boolean getCanceled() {
        return getNativeEvent().getDetail().getCanceled();
    }

}
