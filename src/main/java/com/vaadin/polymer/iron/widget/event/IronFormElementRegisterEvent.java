/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the element is added to an <code>iron-form</code>.</p>
 */
public class IronFormElementRegisterEvent extends DomEvent<IronFormElementRegisterEventHandler> {

    public static Type<IronFormElementRegisterEventHandler> TYPE = new Type<IronFormElementRegisterEventHandler>(
       com.vaadin.polymer.iron.event.IronFormElementRegisterEvent.NAME, new IronFormElementRegisterEvent());


    public IronFormElementRegisterEvent() {
    }

    public Type<IronFormElementRegisterEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormElementRegisterEventHandler handler) {
        handler.onIronFormElementRegister(this);
    }

    public com.vaadin.polymer.iron.event.IronFormElementRegisterEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormElementRegisterEvent)super.getNativeEvent();
    }


}
