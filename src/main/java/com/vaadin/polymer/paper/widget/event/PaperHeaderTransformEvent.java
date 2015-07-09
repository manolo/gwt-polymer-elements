/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the header is transformed.</p>
 */
public class PaperHeaderTransformEvent extends GwtEvent<PaperHeaderTransformEventHandler> {

    public static Type<PaperHeaderTransformEventHandler> TYPE = new Type<PaperHeaderTransformEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperHeaderTransformEvent nativeEvent;

    public PaperHeaderTransformEvent(com.vaadin.polymer.paper.element.event.PaperHeaderTransformEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperHeaderTransformEventHandler handler) {
        handler.onPaperHeaderTransform(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperHeaderTransformEvent getNativeEvent() {
        return nativeEvent;
    }

}
