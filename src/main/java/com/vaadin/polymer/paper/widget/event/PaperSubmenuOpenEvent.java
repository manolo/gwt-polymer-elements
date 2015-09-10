/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the submenu is opened.</p>
 */
public class PaperSubmenuOpenEvent extends GwtEvent<PaperSubmenuOpenEventHandler> {

    public static Type<PaperSubmenuOpenEventHandler> TYPE = new Type<PaperSubmenuOpenEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperSubmenuOpenEvent nativeEvent;

    public PaperSubmenuOpenEvent(com.vaadin.polymer.paper.element.event.PaperSubmenuOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperSubmenuOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSubmenuOpenEventHandler handler) {
        handler.onPaperSubmenuOpen(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperSubmenuOpenEvent getNativeEvent() {
        return nativeEvent;
    }

}
