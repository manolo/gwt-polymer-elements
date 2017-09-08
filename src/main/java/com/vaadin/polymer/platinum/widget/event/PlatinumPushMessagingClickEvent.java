/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-push-messaging project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a notification is clicked that had the current page as the<br>click URL.</p>
 */
public class PlatinumPushMessagingClickEvent extends DomEvent<PlatinumPushMessagingClickEventHandler> {

    public static Type<PlatinumPushMessagingClickEventHandler> TYPE = new Type<PlatinumPushMessagingClickEventHandler>(
       com.vaadin.polymer.platinum.event.PlatinumPushMessagingClickEvent.NAME, new PlatinumPushMessagingClickEvent());


    public PlatinumPushMessagingClickEvent() {
    }

    public Type<PlatinumPushMessagingClickEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PlatinumPushMessagingClickEventHandler handler) {
        handler.onPlatinumPushMessagingClick(this);
    }

    public com.vaadin.polymer.platinum.event.PlatinumPushMessagingClickEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.PlatinumPushMessagingClickEvent)super.getNativeEvent();
    }


    /**
     * <p>push message data used to create the notification</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
