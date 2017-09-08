/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when value changes.<br>To comply with <a href="https://developer.mozilla.org/en-US/docs/Web/Events/change">https://developer.mozilla.org/en-US/docs/Web/Events/change</a></p>
 */
public class ChangeEvent extends DomEvent<ChangeEventHandler> {

    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>(
       com.vaadin.polymer.vaadin.event.ChangeEvent.NAME, new ChangeEvent());


    public ChangeEvent() {
    }

    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }

    public com.vaadin.polymer.vaadin.event.ChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.ChangeEvent)super.getNativeEvent();
    }


}
