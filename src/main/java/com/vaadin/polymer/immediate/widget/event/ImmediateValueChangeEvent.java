/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.immediate.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the slider’s immediateValue changes.</p>
 */
public class ImmediateValueChangeEvent extends GwtEvent<ImmediateValueChangeEventHandler> {

    public static Type<ImmediateValueChangeEventHandler> TYPE = new Type<ImmediateValueChangeEventHandler>();

    private com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent nativeEvent;

    public ImmediateValueChangeEvent(com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ImmediateValueChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ImmediateValueChangeEventHandler handler) {
        handler.onImmediateValueChange(this);
    }

    public com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent getNativeEvent() {
        return nativeEvent;
    }

}
