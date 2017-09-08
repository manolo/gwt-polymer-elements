/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when Bluetooth device picked by user gets updated.</p>
 */
public class DeviceChangedEvent extends DomEvent<DeviceChangedEventHandler> {

    public static Type<DeviceChangedEventHandler> TYPE = new Type<DeviceChangedEventHandler>(
       com.vaadin.polymer.platinum.event.DeviceChangedEvent.NAME, new DeviceChangedEvent());


    public DeviceChangedEvent() {
    }

    public Type<DeviceChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(DeviceChangedEventHandler handler) {
        handler.onDeviceChanged(this);
    }

    public com.vaadin.polymer.platinum.event.DeviceChangedEvent getPolymerEvent() {
        return (com.vaadin.polymer.platinum.event.DeviceChangedEvent)super.getNativeEvent();
    }


    /**
     * <p>device</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
