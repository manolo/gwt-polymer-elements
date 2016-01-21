/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-container project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a child element is swiped away.</p>
 */
public class IronSwipeEvent extends DomEvent<IronSwipeEventHandler> {

    public static Type<IronSwipeEventHandler> TYPE = new Type<IronSwipeEventHandler>(
       com.vaadin.polymer.iron.event.IronSwipeEvent.NAME, new IronSwipeEvent());


    public IronSwipeEvent() {
    }

    public Type<IronSwipeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronSwipeEventHandler handler) {
        handler.onIronSwipe(this);
    }

    public com.vaadin.polymer.iron.event.IronSwipeEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronSwipeEvent)super.getNativeEvent();
    }


}
