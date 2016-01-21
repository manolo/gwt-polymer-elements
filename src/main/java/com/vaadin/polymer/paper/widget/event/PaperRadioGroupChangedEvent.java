/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-group project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the radio group selection changes.</p>
 */
public class PaperRadioGroupChangedEvent extends DomEvent<PaperRadioGroupChangedEventHandler> {

    public static Type<PaperRadioGroupChangedEventHandler> TYPE = new Type<PaperRadioGroupChangedEventHandler>(
       com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent.NAME, new PaperRadioGroupChangedEvent());


    public PaperRadioGroupChangedEvent() {
    }

    public Type<PaperRadioGroupChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperRadioGroupChangedEventHandler handler) {
        handler.onPaperRadioGroupChanged(this);
    }

    public com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent)super.getNativeEvent();
    }


}
