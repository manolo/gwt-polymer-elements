/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the narrow layout changes.</p>
 */
public class PaperResponsiveChangeEvent extends DomEvent<PaperResponsiveChangeEventHandler> {

    public static Type<PaperResponsiveChangeEventHandler> TYPE = new Type<PaperResponsiveChangeEventHandler>(
       com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent.NAME, new PaperResponsiveChangeEvent());


    public PaperResponsiveChangeEvent() {
    }

    public Type<PaperResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResponsiveChangeEventHandler handler) {
        handler.onPaperResponsiveChange(this);
    }

    public com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>narrow: true if the panel is in narrow layout.</p>
     */
    public boolean getNarrow() {
        return getPolymerEvent().getDetail().getNarrow();
    }

}
