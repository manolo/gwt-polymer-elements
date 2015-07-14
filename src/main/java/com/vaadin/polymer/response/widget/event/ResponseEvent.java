/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.response.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a response is received.</p>
 */
public class ResponseEvent extends GwtEvent<ResponseEventHandler> {

    public static Type<ResponseEventHandler> TYPE = new Type<ResponseEventHandler>();

    private com.vaadin.polymer.response.element.event.ResponseEvent nativeEvent;

    public ResponseEvent(com.vaadin.polymer.response.element.event.ResponseEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ResponseEventHandler handler) {
        handler.onResponse(this);
    }

    public com.vaadin.polymer.response.element.event.ResponseEvent getNativeEvent() {
        return nativeEvent;
    }

}
