/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the form is submitted and an error is received. An<br>IronRequestElement is included as the event.detail object.</p>
 */
public class IronFormErrorEvent extends DomEvent<IronFormErrorEventHandler> {

    public static Type<IronFormErrorEventHandler> TYPE = new Type<IronFormErrorEventHandler>(
       com.vaadin.polymer.iron.event.IronFormErrorEvent.NAME, new IronFormErrorEvent());


    public IronFormErrorEvent() {
    }

    public Type<IronFormErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormErrorEventHandler handler) {
        handler.onIronFormError(this);
    }

    public com.vaadin.polymer.iron.event.IronFormErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormErrorEvent)super.getNativeEvent();
    }


}
