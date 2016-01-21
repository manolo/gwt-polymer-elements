/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an item is selected</p>
 */
public class IronSelectEvent extends DomEvent<IronSelectEventHandler> {

    public static Type<IronSelectEventHandler> TYPE = new Type<IronSelectEventHandler>(
       com.vaadin.polymer.iron.event.IronSelectEvent.NAME, new IronSelectEvent());


    public IronSelectEvent() {
    }

    public Type<IronSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronSelectEventHandler handler) {
        handler.onIronSelect(this);
    }

    public com.vaadin.polymer.iron.event.IronSelectEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronSelectEvent)super.getNativeEvent();
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
