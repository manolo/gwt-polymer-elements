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
public class IronSelectEvent extends GwtEvent<IronSelectEventHandler> {

    public static Type<IronSelectEventHandler> TYPE = new Type<IronSelectEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronSelectEvent nativeEvent;

    public IronSelectEvent(com.vaadin.polymer.iron.element.event.IronSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronSelectEventHandler handler) {
        handler.onIronSelect(this);
    }

    public com.vaadin.polymer.iron.element.event.IronSelectEvent getNativeEvent() {
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
