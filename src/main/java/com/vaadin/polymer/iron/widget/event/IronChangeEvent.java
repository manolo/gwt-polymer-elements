/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the checked state changes.</p>
 */
public class IronChangeEvent extends DomEvent<IronChangeEventHandler> {

    public static Type<IronChangeEventHandler> TYPE = new Type<IronChangeEventHandler>(
       com.vaadin.polymer.iron.event.IronChangeEvent.NAME, new IronChangeEvent());


    public IronChangeEvent() {
    }

    public Type<IronChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronChangeEventHandler handler) {
        handler.onIronChange(this);
    }

    public com.vaadin.polymer.iron.event.IronChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronChangeEvent)super.getNativeEvent();
    }


}
