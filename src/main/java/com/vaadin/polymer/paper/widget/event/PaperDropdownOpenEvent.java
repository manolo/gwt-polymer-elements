/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the dropdown opens.</p>
 */
public class PaperDropdownOpenEvent extends GwtEvent<PaperDropdownOpenEventHandler> {

    public static Type<PaperDropdownOpenEventHandler> TYPE = new Type<PaperDropdownOpenEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent nativeEvent;

    public PaperDropdownOpenEvent(com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperDropdownOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperDropdownOpenEventHandler handler) {
        handler.onPaperDropdownOpen(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent getNativeEvent() {
        return nativeEvent;
    }

}
