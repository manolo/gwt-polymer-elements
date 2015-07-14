/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the form is submitted and a response is received.</p>
 */
public class IronFormResponseEvent extends GwtEvent<IronFormResponseEventHandler> {

    public static Type<IronFormResponseEventHandler> TYPE = new Type<IronFormResponseEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronFormResponseEvent nativeEvent;

    public IronFormResponseEvent(com.vaadin.polymer.iron.element.event.IronFormResponseEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormResponseEventHandler handler) {
        handler.onIronFormResponse(this);
    }

    public com.vaadin.polymer.iron.element.event.IronFormResponseEvent getNativeEvent() {
        return nativeEvent;
    }

}
