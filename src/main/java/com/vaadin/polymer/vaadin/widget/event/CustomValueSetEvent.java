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
 * <p>Fired when the user sets a custom value.</p>
 */
public class CustomValueSetEvent extends DomEvent<CustomValueSetEventHandler> {

    public static Type<CustomValueSetEventHandler> TYPE = new Type<CustomValueSetEventHandler>(
       com.vaadin.polymer.vaadin.event.CustomValueSetEvent.NAME, new CustomValueSetEvent());


    public CustomValueSetEvent() {
    }

    public Type<CustomValueSetEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CustomValueSetEventHandler handler) {
        handler.onCustomValueSet(this);
    }

    public com.vaadin.polymer.vaadin.event.CustomValueSetEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.CustomValueSetEvent)super.getNativeEvent();
    }


    /**
     * <p>the custom value</p>
     */
    public String getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
