/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.change.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the slider’s value changes due to user interaction.</p>
 * <p>Changes to the slider’s value due to changes in an underlying<br>bound variable will not trigger this event.</p>
 */
public class ChangeEvent extends GwtEvent<ChangeEventHandler> {

    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>();

    private com.vaadin.polymer.change.element.event.ChangeEvent nativeEvent;

    public ChangeEvent(com.vaadin.polymer.change.element.event.ChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }

    public com.vaadin.polymer.change.element.event.ChangeEvent getNativeEvent() {
        return nativeEvent;
    }

}
