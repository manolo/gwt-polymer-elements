/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired if the form cannot be submitted because it’s invalid.</p>
 */
public class IronFormInvalidEvent extends GwtEvent<IronFormInvalidEventHandler> {

    public static Type<IronFormInvalidEventHandler> TYPE = new Type<IronFormInvalidEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronFormInvalidEvent nativeEvent;

    public IronFormInvalidEvent(com.vaadin.polymer.iron.element.event.IronFormInvalidEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormInvalidEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormInvalidEventHandler handler) {
        handler.onIronFormInvalid(this);
    }

    public com.vaadin.polymer.iron.element.event.IronFormInvalidEvent getNativeEvent() {
        return nativeEvent;
    }

}
