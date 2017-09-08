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
 * <p>Fired after the form is submitted.</p>
 */
public class IronFormSubmitEvent extends DomEvent<IronFormSubmitEventHandler> {

    public static Type<IronFormSubmitEventHandler> TYPE = new Type<IronFormSubmitEventHandler>(
       com.vaadin.polymer.iron.event.IronFormSubmitEvent.NAME, new IronFormSubmitEvent());


    public IronFormSubmitEvent() {
    }

    public Type<IronFormSubmitEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormSubmitEventHandler handler) {
        handler.onIronFormSubmit(this);
    }

    public com.vaadin.polymer.iron.event.IronFormSubmitEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormSubmitEvent)super.getNativeEvent();
    }


}
