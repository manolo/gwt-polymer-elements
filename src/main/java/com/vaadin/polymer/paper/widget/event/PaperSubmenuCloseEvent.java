/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the submenu is closed.</p>
 */
public class PaperSubmenuCloseEvent extends DomEvent<PaperSubmenuCloseEventHandler> {

    public static Type<PaperSubmenuCloseEventHandler> TYPE = new Type<PaperSubmenuCloseEventHandler>(
       com.vaadin.polymer.paper.event.PaperSubmenuCloseEvent.NAME, new PaperSubmenuCloseEvent());


    public PaperSubmenuCloseEvent() {
    }

    public Type<PaperSubmenuCloseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSubmenuCloseEventHandler handler) {
        handler.onPaperSubmenuClose(this);
    }

    public com.vaadin.polymer.paper.event.PaperSubmenuCloseEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperSubmenuCloseEvent)super.getNativeEvent();
    }


}
