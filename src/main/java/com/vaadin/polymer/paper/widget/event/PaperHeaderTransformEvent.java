/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the header is transformed.</p>
 */
public class PaperHeaderTransformEvent extends DomEvent<PaperHeaderTransformEventHandler> {

    public static Type<PaperHeaderTransformEventHandler> TYPE = new Type<PaperHeaderTransformEventHandler>(
       com.vaadin.polymer.paper.event.PaperHeaderTransformEvent.NAME, new PaperHeaderTransformEvent());


    public PaperHeaderTransformEvent() {
    }

    public Type<PaperHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperHeaderTransformEventHandler handler) {
        handler.onPaperHeaderTransform(this);
    }

    public com.vaadin.polymer.paper.event.PaperHeaderTransformEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperHeaderTransformEvent)super.getNativeEvent();
    }


}
