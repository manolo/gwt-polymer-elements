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
 * <p>Fired after the form is reset.</p>
 */
public class IronFormResetEvent extends DomEvent<IronFormResetEventHandler> {

    public static Type<IronFormResetEventHandler> TYPE = new Type<IronFormResetEventHandler>(
       com.vaadin.polymer.iron.event.IronFormResetEvent.NAME, new IronFormResetEvent());


    public IronFormResetEvent() {
    }

    public Type<IronFormResetEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormResetEventHandler handler) {
        handler.onIronFormReset(this);
    }

    public com.vaadin.polymer.iron.event.IronFormResetEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormResetEvent)super.getNativeEvent();
    }


}
