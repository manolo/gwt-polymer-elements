/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the dropdown opens.</p>
 */
public class PaperDropdownOpenEvent extends DomEvent<PaperDropdownOpenEventHandler> {

    public static Type<PaperDropdownOpenEventHandler> TYPE = new Type<PaperDropdownOpenEventHandler>(
       com.vaadin.polymer.paper.event.PaperDropdownOpenEvent.NAME, new PaperDropdownOpenEvent());


    public PaperDropdownOpenEvent() {
    }

    public Type<PaperDropdownOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperDropdownOpenEventHandler handler) {
        handler.onPaperDropdownOpen(this);
    }

    public com.vaadin.polymer.paper.event.PaperDropdownOpenEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperDropdownOpenEvent)super.getNativeEvent();
    }


}
