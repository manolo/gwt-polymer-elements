/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the checked state changes.</p>
 */
public class IronChangeEvent extends GwtEvent<IronChangeEventHandler> {

    public static Type<IronChangeEventHandler> TYPE = new Type<IronChangeEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronChangeEvent nativeEvent;

    public IronChangeEvent(com.vaadin.polymer.iron.element.event.IronChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronChangeEventHandler handler) {
        handler.onIronChange(this);
    }

    public com.vaadin.polymer.iron.element.event.IronChangeEvent getNativeEvent() {
        return nativeEvent;
    }

}
