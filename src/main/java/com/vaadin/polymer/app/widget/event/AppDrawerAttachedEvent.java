/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the layout of app-drawer is attached.</p>
 */
public class AppDrawerAttachedEvent extends DomEvent<AppDrawerAttachedEventHandler> {

    public static Type<AppDrawerAttachedEventHandler> TYPE = new Type<AppDrawerAttachedEventHandler>(
       com.vaadin.polymer.app.event.AppDrawerAttachedEvent.NAME, new AppDrawerAttachedEvent());


    public AppDrawerAttachedEvent() {
    }

    public Type<AppDrawerAttachedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppDrawerAttachedEventHandler handler) {
        handler.onAppDrawerAttached(this);
    }

    public com.vaadin.polymer.app.event.AppDrawerAttachedEvent getPolymerEvent() {
        return (com.vaadin.polymer.app.event.AppDrawerAttachedEvent)super.getNativeEvent();
    }


}
