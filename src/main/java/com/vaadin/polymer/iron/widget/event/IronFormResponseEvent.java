/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the form is submitted and a response is received. An<br>IronRequestElement is included as the event.detail object.</p>
 */
public class IronFormResponseEvent extends DomEvent<IronFormResponseEventHandler> {

    public static Type<IronFormResponseEventHandler> TYPE = new Type<IronFormResponseEventHandler>(
       com.vaadin.polymer.iron.event.IronFormResponseEvent.NAME, new IronFormResponseEvent());


    public IronFormResponseEvent() {
    }

    public Type<IronFormResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormResponseEventHandler handler) {
        handler.onIronFormResponse(this);
    }

    public com.vaadin.polymer.iron.event.IronFormResponseEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormResponseEvent)super.getNativeEvent();
    }


}
