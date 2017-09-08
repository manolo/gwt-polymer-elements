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
 * <p>Fired when the XHR finishes loading</p>
 */
public class MarkedLoadendEvent extends DomEvent<MarkedLoadendEventHandler> {

    public static Type<MarkedLoadendEventHandler> TYPE = new Type<MarkedLoadendEventHandler>(
       com.vaadin.polymer.marked.event.MarkedLoadendEvent.NAME, new MarkedLoadendEvent());


    public MarkedLoadendEvent() {
    }

    public Type<MarkedLoadendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(MarkedLoadendEventHandler handler) {
        handler.onMarkedLoadend(this);
    }

    public com.vaadin.polymer.marked.event.MarkedLoadendEvent getPolymerEvent() {
        return (com.vaadin.polymer.marked.event.MarkedLoadendEvent)super.getNativeEvent();
    }


}
