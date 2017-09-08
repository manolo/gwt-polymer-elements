/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-localize-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after the resources have been loaded.</p>
 */
public class AppLocalizeResourcesLoadedEvent extends DomEvent<AppLocalizeResourcesLoadedEventHandler> {

    public static Type<AppLocalizeResourcesLoadedEventHandler> TYPE = new Type<AppLocalizeResourcesLoadedEventHandler>(
       com.vaadin.polymer.app.event.AppLocalizeResourcesLoadedEvent.NAME, new AppLocalizeResourcesLoadedEvent());


    public AppLocalizeResourcesLoadedEvent() {
    }

    public Type<AppLocalizeResourcesLoadedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppLocalizeResourcesLoadedEventHandler handler) {
        handler.onAppLocalizeResourcesLoaded(this);
    }

    public com.vaadin.polymer.app.event.AppLocalizeResourcesLoadedEvent getPolymerEvent() {
        return (com.vaadin.polymer.app.event.AppLocalizeResourcesLoadedEvent)super.getNativeEvent();
    }


}
