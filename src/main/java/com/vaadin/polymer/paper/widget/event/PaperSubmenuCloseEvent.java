/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the submenu is closed.</p>
 */
public class PaperSubmenuCloseEvent extends GwtEvent<PaperSubmenuCloseEventHandler> {

    public static Type<PaperSubmenuCloseEventHandler> TYPE = new Type<PaperSubmenuCloseEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperSubmenuCloseEvent nativeEvent;

    public PaperSubmenuCloseEvent(com.vaadin.polymer.paper.element.event.PaperSubmenuCloseEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperSubmenuCloseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSubmenuCloseEventHandler handler) {
        handler.onPaperSubmenuClose(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperSubmenuCloseEvent getNativeEvent() {
        return nativeEvent;
    }

}
