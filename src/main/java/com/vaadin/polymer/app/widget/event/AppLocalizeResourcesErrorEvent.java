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
 * <p>Fired when the resources cannot be loaded due to an error.</p>
 */
public class AppLocalizeResourcesErrorEvent extends DomEvent<AppLocalizeResourcesErrorEventHandler> {

    public static Type<AppLocalizeResourcesErrorEventHandler> TYPE = new Type<AppLocalizeResourcesErrorEventHandler>(
       com.vaadin.polymer.app.event.AppLocalizeResourcesErrorEvent.NAME, new AppLocalizeResourcesErrorEvent());


    public AppLocalizeResourcesErrorEvent() {
    }

    public Type<AppLocalizeResourcesErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppLocalizeResourcesErrorEventHandler handler) {
        handler.onAppLocalizeResourcesError(this);
    }

    public com.vaadin.polymer.app.event.AppLocalizeResourcesErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.app.event.AppLocalizeResourcesErrorEvent)super.getNativeEvent();
    }


}
