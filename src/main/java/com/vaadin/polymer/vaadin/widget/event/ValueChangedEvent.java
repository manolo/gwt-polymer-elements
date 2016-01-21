/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the value changes.</p>
 */
public class ValueChangedEvent extends DomEvent<ValueChangedEventHandler> {

    public static Type<ValueChangedEventHandler> TYPE = new Type<ValueChangedEventHandler>(
       com.vaadin.polymer.vaadin.event.ValueChangedEvent.NAME, new ValueChangedEvent());


    public ValueChangedEvent() {
    }

    public Type<ValueChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ValueChangedEventHandler handler) {
        handler.onValueChanged(this);
    }

    public com.vaadin.polymer.vaadin.event.ValueChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.ValueChangedEvent)super.getNativeEvent();
    }


}
