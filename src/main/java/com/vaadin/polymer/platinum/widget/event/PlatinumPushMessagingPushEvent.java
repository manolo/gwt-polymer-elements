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
 * <p>Fired when a push message is received but no notification is shown.<br>This happens when the click URL is for this page and the page is<br>visible to the user on the screen.</p>
 */
public class PlatinumPushMessagingPushEvent extends DomEvent<PlatinumPushMessagingPushEventHandler> {

    public static Type<PlatinumPushMessagingPushEventHandler> TYPE = new Type<PlatinumPushMessagingPushEventHandler>(
       com.vaadin.polymer.platinum.event.PlatinumPushMessagingPushEvent.NAME, new PlatinumPushMessagingPushEvent());


    public PlatinumPushMessagingPushEvent() {
    }

    public Type<PlatinumPushMessagingPushEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PlatinumPushMessagingPushEventHandler handler) {
        handler.onPlatinumPushMessagingPush(this);
    }

    public com.vaadin.polymer.platinum.event.PlatinumPushMessagingPushEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.PlatinumPushMessagingPushEvent)super.getNativeEvent();
    }


    /**
     * <p>push message data that was received</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
