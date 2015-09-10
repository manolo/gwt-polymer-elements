/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the dropdown closes.</p>
 */
public class PaperDropdownCloseEvent extends GwtEvent<PaperDropdownCloseEventHandler> {

    public static Type<PaperDropdownCloseEventHandler> TYPE = new Type<PaperDropdownCloseEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent nativeEvent;

    public PaperDropdownCloseEvent(com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperDropdownCloseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperDropdownCloseEventHandler handler) {
        handler.onPaperDropdownClose(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent getNativeEvent() {
        return nativeEvent;
    }

}
