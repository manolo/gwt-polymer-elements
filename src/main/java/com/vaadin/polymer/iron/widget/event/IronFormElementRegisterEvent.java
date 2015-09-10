/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the element is added to an <code>iron-form</code>.</p>
 */
public class IronFormElementRegisterEvent extends GwtEvent<IronFormElementRegisterEventHandler> {

    public static Type<IronFormElementRegisterEventHandler> TYPE = new Type<IronFormElementRegisterEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent nativeEvent;

    public IronFormElementRegisterEvent(com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormElementRegisterEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormElementRegisterEventHandler handler) {
        handler.onIronFormElementRegister(this);
    }

    public com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent getNativeEvent() {
        return nativeEvent;
    }

}
