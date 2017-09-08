/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when value gets changed during a notification session.</p>
 */
public class ValueChangedEvent extends DomEvent<ValueChangedEventHandler> {

    public static Type<ValueChangedEventHandler> TYPE = new Type<ValueChangedEventHandler>(
       com.vaadin.polymer.platinum.event.ValueChangedEvent.NAME, new ValueChangedEvent());


    public ValueChangedEvent() {
    }

    public Type<ValueChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ValueChangedEventHandler handler) {
        handler.onValueChanged(this);
    }

    public com.vaadin.polymer.platinum.event.ValueChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.ValueChangedEvent)super.getNativeEvent();
    }


    /**
     * <p>value</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
