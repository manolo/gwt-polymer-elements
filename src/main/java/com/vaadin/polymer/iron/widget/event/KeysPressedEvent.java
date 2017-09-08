/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class KeysPressedEvent extends DomEvent<KeysPressedEventHandler> {

    public static Type<KeysPressedEventHandler> TYPE = new Type<KeysPressedEventHandler>(
       com.vaadin.polymer.iron.event.KeysPressedEvent.NAME, new KeysPressedEvent());


    public KeysPressedEvent() {
    }

    public Type<KeysPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(KeysPressedEventHandler handler) {
        handler.onKeysPressed(this);
    }

    public com.vaadin.polymer.iron.event.KeysPressedEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.KeysPressedEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>true if shift key is pressed</p>
     */
    public boolean getShift() {
        return getPolymerEvent().getDetail().getShift();
    }

    /**
     * <p>true if ctrl key is pressed</p>
     */
    public boolean getCtrl() {
        return getPolymerEvent().getDetail().getCtrl();
    }

    /**
     * <p>true if meta key is pressed</p>
     */
    public boolean getMeta() {
        return getPolymerEvent().getDetail().getMeta();
    }

    /**
     * <p>true if alt key is pressed</p>
     */
    public boolean getAlt() {
        return getPolymerEvent().getDetail().getAlt();
    }

    /**
     * <p>the normalized key</p>
     */
    public String getKey() {
        return getPolymerEvent().getDetail().getKey();
    }

}
