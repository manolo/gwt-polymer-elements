/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the service worker update flow completes successfully.<br>If you make changes to your <code>&lt;platinum-sw-register&gt;</code> configuration (i.e. by adding in new<br><code>&lt;platinum-sw-*&gt;</code> child elements, or changing their attributes), users who had the old<br>service worker installed will get the update installed when they see the modified elements.</p>
 */
public class ServiceWorkerUpdatedEvent extends DomEvent<ServiceWorkerUpdatedEventHandler> {

    public static Type<ServiceWorkerUpdatedEventHandler> TYPE = new Type<ServiceWorkerUpdatedEventHandler>(
       com.vaadin.polymer.platinum.event.ServiceWorkerUpdatedEvent.NAME, new ServiceWorkerUpdatedEvent());


    public ServiceWorkerUpdatedEvent() {
    }

    public Type<ServiceWorkerUpdatedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ServiceWorkerUpdatedEventHandler handler) {
        handler.onServiceWorkerUpdated(this);
    }

    public com.vaadin.polymer.platinum.event.ServiceWorkerUpdatedEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.ServiceWorkerUpdatedEvent)super.getNativeEvent();
    }


    /**
     * <p>message indicating that the update succeeded.</p>
     */
    public String getA() {
        return getPolymerEvent().getDetail().getA();
    }

}
