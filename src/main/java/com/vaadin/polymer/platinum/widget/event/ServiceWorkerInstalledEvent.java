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
 * <p>Fired when the initial service worker installation completes successfully.<br>The service worker will normally only be installed once, the first time a page with a<br><code>&lt;platinum-sw-register&gt;</code> element is visited in a given browser. If the same page is visited<br>again, the existing service worker will be reused, and there won’t be another<br><code>service-worker-installed</code> fired.</p>
 */
public class ServiceWorkerInstalledEvent extends DomEvent<ServiceWorkerInstalledEventHandler> {

    public static Type<ServiceWorkerInstalledEventHandler> TYPE = new Type<ServiceWorkerInstalledEventHandler>(
       com.vaadin.polymer.platinum.event.ServiceWorkerInstalledEvent.NAME, new ServiceWorkerInstalledEvent());


    public ServiceWorkerInstalledEvent() {
    }

    public Type<ServiceWorkerInstalledEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ServiceWorkerInstalledEventHandler handler) {
        handler.onServiceWorkerInstalled(this);
    }

    public com.vaadin.polymer.platinum.event.ServiceWorkerInstalledEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.ServiceWorkerInstalledEvent)super.getNativeEvent();
    }


    /**
     * <p>message indicating that the installation succeeded.</p>
     */
    public String getA() {
        return getPolymerEvent().getDetail().getA();
    }

}
