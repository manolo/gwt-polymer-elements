/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the form is submitted.</p>
 */
public class IronFormSubmitEvent extends GwtEvent<IronFormSubmitEventHandler> {

    public static Type<IronFormSubmitEventHandler> TYPE = new Type<IronFormSubmitEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronFormSubmitEvent nativeEvent;

    public IronFormSubmitEvent(com.vaadin.polymer.iron.element.event.IronFormSubmitEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormSubmitEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormSubmitEventHandler handler) {
        handler.onIronFormSubmit(this);
    }

    public com.vaadin.polymer.iron.element.event.IronFormSubmitEvent getNativeEvent() {
        return nativeEvent;
    }

}
