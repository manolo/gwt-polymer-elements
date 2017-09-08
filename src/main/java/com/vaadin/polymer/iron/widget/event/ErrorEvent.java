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
 * <p>Fired when an error is received.</p>
 */
public class ErrorEvent extends DomEvent<ErrorEventHandler> {

    public static Type<ErrorEventHandler> TYPE = new Type<ErrorEventHandler>(
       com.vaadin.polymer.iron.event.ErrorEvent.NAME, new ErrorEvent());


    public ErrorEvent() {
    }

    public Type<ErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ErrorEventHandler handler) {
        handler.onError(this);
    }

    public com.vaadin.polymer.iron.event.ErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.ErrorEvent)super.getNativeEvent();
    }


}
