/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the submenu is opened.</p>
 */
public class PaperSubmenuOpenEvent extends DomEvent<PaperSubmenuOpenEventHandler> {

    public static Type<PaperSubmenuOpenEventHandler> TYPE = new Type<PaperSubmenuOpenEventHandler>(
       com.vaadin.polymer.paper.event.PaperSubmenuOpenEvent.NAME, new PaperSubmenuOpenEvent());


    public PaperSubmenuOpenEvent() {
    }

    public Type<PaperSubmenuOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSubmenuOpenEventHandler handler) {
        handler.onPaperSubmenuOpen(this);
    }

    public com.vaadin.polymer.paper.event.PaperSubmenuOpenEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperSubmenuOpenEvent)super.getNativeEvent();
    }


}
