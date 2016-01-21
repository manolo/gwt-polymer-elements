/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired if the form cannot be submitted because it’s invalid.</p>
 */
public class IronFormInvalidEvent extends DomEvent<IronFormInvalidEventHandler> {

    public static Type<IronFormInvalidEventHandler> TYPE = new Type<IronFormInvalidEventHandler>(
       com.vaadin.polymer.iron.event.IronFormInvalidEvent.NAME, new IronFormInvalidEvent());


    public IronFormInvalidEvent() {
    }

    public Type<IronFormInvalidEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormInvalidEventHandler handler) {
        handler.onIronFormInvalid(this);
    }

    public com.vaadin.polymer.iron.event.IronFormInvalidEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormInvalidEvent)super.getNativeEvent();
    }


}
