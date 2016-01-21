/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired before the form is submitted.</p>
 */
public class IronFormPresubmitEvent extends DomEvent<IronFormPresubmitEventHandler> {

    public static Type<IronFormPresubmitEventHandler> TYPE = new Type<IronFormPresubmitEventHandler>(
       com.vaadin.polymer.iron.event.IronFormPresubmitEvent.NAME, new IronFormPresubmitEvent());


    public IronFormPresubmitEvent() {
    }

    public Type<IronFormPresubmitEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormPresubmitEventHandler handler) {
        handler.onIronFormPresubmit(this);
    }

    public com.vaadin.polymer.iron.event.IronFormPresubmitEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormPresubmitEvent)super.getNativeEvent();
    }


}
