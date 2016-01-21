/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a list of mutation<br>records that describe what changed.</p>
 */
public class IronItemsChangedEvent extends DomEvent<IronItemsChangedEventHandler> {

    public static Type<IronItemsChangedEventHandler> TYPE = new Type<IronItemsChangedEventHandler>(
       com.vaadin.polymer.iron.event.IronItemsChangedEvent.NAME, new IronItemsChangedEvent());


    public IronItemsChangedEvent() {
    }

    public Type<IronItemsChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronItemsChangedEventHandler handler) {
        handler.onIronItemsChanged(this);
    }

    public com.vaadin.polymer.iron.event.IronItemsChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronItemsChangedEvent)super.getNativeEvent();
    }


}
