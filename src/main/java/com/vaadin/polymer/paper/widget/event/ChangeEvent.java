/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the checked state changes due to user interaction.</p>
 */
public class ChangeEvent extends DomEvent<ChangeEventHandler> {

    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>(
       com.vaadin.polymer.paper.event.ChangeEvent.NAME, new ChangeEvent());


    public ChangeEvent() {
    }

    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }

    public com.vaadin.polymer.paper.event.ChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.ChangeEvent)super.getNativeEvent();
    }


}
