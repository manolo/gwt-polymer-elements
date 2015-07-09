/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class IronDeselectEvent extends GwtEvent<IronDeselectEventHandler> {

    public static Type<IronDeselectEventHandler> TYPE = new Type<IronDeselectEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronDeselectEvent nativeEvent;

    public IronDeselectEvent(com.vaadin.polymer.iron.element.event.IronDeselectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronDeselectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronDeselectEventHandler handler) {
        handler.onIronDeselect(this);
    }

    public com.vaadin.polymer.iron.element.event.IronDeselectEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>the item element</p>
     */
    public JavaScriptObject getItem() {
        return getNativeEvent().getDetail().getItem();
    }

}
