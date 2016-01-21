/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an item is deselected</p>
 */
public class IronDeselectEvent extends DomEvent<IronDeselectEventHandler> {

    public static Type<IronDeselectEventHandler> TYPE = new Type<IronDeselectEventHandler>(
       com.vaadin.polymer.iron.event.IronDeselectEvent.NAME, new IronDeselectEvent());


    public IronDeselectEvent() {
    }

    public Type<IronDeselectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronDeselectEventHandler handler) {
        handler.onIronDeselect(this);
    }

    public com.vaadin.polymer.iron.event.IronDeselectEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronDeselectEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the item element</p>
     */
    public JavaScriptObject getItem() {
        return getPolymerEvent().getDetail().getItem();
    }

}
