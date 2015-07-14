/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.keys.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class KeysPressedEvent extends GwtEvent<KeysPressedEventHandler> {

    public static Type<KeysPressedEventHandler> TYPE = new Type<KeysPressedEventHandler>();

    private com.vaadin.polymer.keys.element.event.KeysPressedEvent nativeEvent;

    public KeysPressedEvent(com.vaadin.polymer.keys.element.event.KeysPressedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<KeysPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(KeysPressedEventHandler handler) {
        handler.onKeysPressed(this);
    }

    public com.vaadin.polymer.keys.element.event.KeysPressedEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>true if shift key is pressed</p>
     */
    public boolean getShift() {
        return getNativeEvent().getDetail().getShift();
    }

    /**
     * <p>true if ctrl key is pressed</p>
     */
    public boolean getCtrl() {
        return getNativeEvent().getDetail().getCtrl();
    }

    /**
     * <p>true if meta key is pressed</p>
     */
    public boolean getMeta() {
        return getNativeEvent().getDetail().getMeta();
    }

    /**
     * <p>true if alt key is pressed</p>
     */
    public boolean getAlt() {
        return getNativeEvent().getDetail().getAlt();
    }

    /**
     * <p>the normalized key</p>
     */
    public String getKey() {
        return getNativeEvent().getDetail().getKey();
    }

}
