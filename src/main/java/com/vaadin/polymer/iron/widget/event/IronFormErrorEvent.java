/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the form is submitted and an error is received.</p>
 */
public class IronFormErrorEvent extends GwtEvent<IronFormErrorEventHandler> {

    public static Type<IronFormErrorEventHandler> TYPE = new Type<IronFormErrorEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronFormErrorEvent nativeEvent;

    public IronFormErrorEvent(com.vaadin.polymer.iron.element.event.IronFormErrorEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormErrorEventHandler handler) {
        handler.onIronFormError(this);
    }

    public com.vaadin.polymer.iron.element.event.IronFormErrorEvent getNativeEvent() {
        return nativeEvent;
    }

}
