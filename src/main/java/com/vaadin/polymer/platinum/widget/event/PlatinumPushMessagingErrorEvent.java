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
 * <p>Fired when an error occurs while enabling or disabling notifications</p>
 */
public class PlatinumPushMessagingErrorEvent extends DomEvent<PlatinumPushMessagingErrorEventHandler> {

    public static Type<PlatinumPushMessagingErrorEventHandler> TYPE = new Type<PlatinumPushMessagingErrorEventHandler>(
       com.vaadin.polymer.platinum.event.PlatinumPushMessagingErrorEvent.NAME, new PlatinumPushMessagingErrorEvent());


    public PlatinumPushMessagingErrorEvent() {
    }

    public Type<PlatinumPushMessagingErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PlatinumPushMessagingErrorEventHandler handler) {
        handler.onPlatinumPushMessagingError(this);
    }

    public com.vaadin.polymer.platinum.event.PlatinumPushMessagingErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.PlatinumPushMessagingErrorEvent)super.getNativeEvent();
    }


    /**
     * <p>error message</p>
     */
    public String getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
