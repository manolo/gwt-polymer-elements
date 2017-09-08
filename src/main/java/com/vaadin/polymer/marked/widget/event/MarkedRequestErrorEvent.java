/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an error is received while fetching remote markdown content.</p>
 */
public class MarkedRequestErrorEvent extends DomEvent<MarkedRequestErrorEventHandler> {

    public static Type<MarkedRequestErrorEventHandler> TYPE = new Type<MarkedRequestErrorEventHandler>(
       com.vaadin.polymer.marked.event.MarkedRequestErrorEvent.NAME, new MarkedRequestErrorEvent());


    public MarkedRequestErrorEvent() {
    }

    public Type<MarkedRequestErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(MarkedRequestErrorEventHandler handler) {
        handler.onMarkedRequestError(this);
    }

    public com.vaadin.polymer.marked.event.MarkedRequestErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.marked.event.MarkedRequestErrorEvent)super.getNativeEvent();
    }


}
