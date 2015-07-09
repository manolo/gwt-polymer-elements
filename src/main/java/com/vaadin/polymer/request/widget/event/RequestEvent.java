/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.request.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a request is sent.</p>
 */
public class RequestEvent extends GwtEvent<RequestEventHandler> {

    public static Type<RequestEventHandler> TYPE = new Type<RequestEventHandler>();

    private com.vaadin.polymer.request.element.event.RequestEvent nativeEvent;

    public RequestEvent(com.vaadin.polymer.request.element.event.RequestEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<RequestEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(RequestEventHandler handler) {
        handler.onRequest(this);
    }

    public com.vaadin.polymer.request.element.event.RequestEvent getNativeEvent() {
        return nativeEvent;
    }

}
