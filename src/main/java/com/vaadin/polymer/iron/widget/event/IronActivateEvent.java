/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when iron-selector is activated (selected or deselected).<br>It is fired before the selected items are changed.<br>Cancel the event to abort selection.</p>
 */
public class IronActivateEvent extends DomEvent<IronActivateEventHandler> {

    public static Type<IronActivateEventHandler> TYPE = new Type<IronActivateEventHandler>(
       com.vaadin.polymer.iron.event.IronActivateEvent.NAME, new IronActivateEvent());


    public IronActivateEvent() {
    }

    public Type<IronActivateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronActivateEventHandler handler) {
        handler.onIronActivate(this);
    }

    public com.vaadin.polymer.iron.event.IronActivateEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronActivateEvent)super.getNativeEvent();
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
