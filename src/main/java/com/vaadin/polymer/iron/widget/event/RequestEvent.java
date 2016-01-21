/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a request is sent.</p>
 */
public class RequestEvent extends DomEvent<RequestEventHandler> {

    public static Type<RequestEventHandler> TYPE = new Type<RequestEventHandler>(
       com.vaadin.polymer.iron.event.RequestEvent.NAME, new RequestEvent());


    public RequestEvent() {
    }

    public Type<RequestEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(RequestEventHandler handler) {
        handler.onRequest(this);
    }

    public com.vaadin.polymer.iron.event.RequestEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.RequestEvent)super.getNativeEvent();
    }


}
