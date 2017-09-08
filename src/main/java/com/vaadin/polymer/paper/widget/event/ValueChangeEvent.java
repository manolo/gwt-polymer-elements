/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the slider’s value changes.</p>
 */
public class ValueChangeEvent extends DomEvent<ValueChangeEventHandler> {

    public static Type<ValueChangeEventHandler> TYPE = new Type<ValueChangeEventHandler>(
       com.vaadin.polymer.paper.event.ValueChangeEvent.NAME, new ValueChangeEvent());


    public ValueChangeEvent() {
    }

    public Type<ValueChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ValueChangeEventHandler handler) {
        handler.onValueChange(this);
    }

    public com.vaadin.polymer.paper.event.ValueChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.ValueChangeEvent)super.getNativeEvent();
    }


}
