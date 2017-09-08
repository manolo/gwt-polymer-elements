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
 * <p>Fired when app-drawer has finished transitioning.</p>
 */
public class AppDrawerTransitionedEvent extends DomEvent<AppDrawerTransitionedEventHandler> {

    public static Type<AppDrawerTransitionedEventHandler> TYPE = new Type<AppDrawerTransitionedEventHandler>(
       com.vaadin.polymer.app.event.AppDrawerTransitionedEvent.NAME, new AppDrawerTransitionedEvent());


    public AppDrawerTransitionedEvent() {
    }

    public Type<AppDrawerTransitionedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppDrawerTransitionedEventHandler handler) {
        handler.onAppDrawerTransitioned(this);
    }

    public com.vaadin.polymer.app.event.AppDrawerTransitionedEvent getPolymerEvent() {
        return (com.vaadin.polymer.app.event.AppDrawerTransitionedEvent)super.getNativeEvent();
    }


}
