/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the <code>iron-overlay</code> opens.</p>
 */
public class IronOverlayOpenedEvent extends GwtEvent<IronOverlayOpenedEventHandler> {

    public static Type<IronOverlayOpenedEventHandler> TYPE = new Type<IronOverlayOpenedEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent nativeEvent;

    public IronOverlayOpenedEvent(com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronOverlayOpenedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayOpenedEventHandler handler) {
        handler.onIronOverlayOpened(this);
    }

    public com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent getNativeEvent() {
        return nativeEvent;
    }

}
