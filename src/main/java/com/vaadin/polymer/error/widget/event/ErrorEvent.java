/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.error.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an error is received.</p>
 */
public class ErrorEvent extends GwtEvent<ErrorEventHandler> {

    public static Type<ErrorEventHandler> TYPE = new Type<ErrorEventHandler>();

    private com.vaadin.polymer.error.element.event.ErrorEvent nativeEvent;

    public ErrorEvent(com.vaadin.polymer.error.element.event.ErrorEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ErrorEventHandler handler) {
        handler.onError(this);
    }

    public com.vaadin.polymer.error.element.event.ErrorEvent getNativeEvent() {
        return nativeEvent;
    }

}
