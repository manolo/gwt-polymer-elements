/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a response is received.</p>
 */
public class ResponseEvent extends DomEvent<ResponseEventHandler> {

    public static Type<ResponseEventHandler> TYPE = new Type<ResponseEventHandler>(
       com.vaadin.polymer.iron.event.ResponseEvent.NAME, new ResponseEvent());


    public ResponseEvent() {
    }

    public Type<ResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ResponseEventHandler handler) {
        handler.onResponse(this);
    }

    public com.vaadin.polymer.iron.event.ResponseEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.ResponseEvent)super.getNativeEvent();
    }


}
