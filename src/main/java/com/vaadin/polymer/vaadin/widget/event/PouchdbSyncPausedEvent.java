/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Synchronisation paused</p>
 */
public class PouchdbSyncPausedEvent extends DomEvent<PouchdbSyncPausedEventHandler> {

    public static Type<PouchdbSyncPausedEventHandler> TYPE = new Type<PouchdbSyncPausedEventHandler>(
       com.vaadin.polymer.vaadin.event.PouchdbSyncPausedEvent.NAME, new PouchdbSyncPausedEvent());


    public PouchdbSyncPausedEvent() {
    }

    public Type<PouchdbSyncPausedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PouchdbSyncPausedEventHandler handler) {
        handler.onPouchdbSyncPaused(this);
    }

    public com.vaadin.polymer.vaadin.event.PouchdbSyncPausedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.PouchdbSyncPausedEvent)super.getNativeEvent();
    }


}
