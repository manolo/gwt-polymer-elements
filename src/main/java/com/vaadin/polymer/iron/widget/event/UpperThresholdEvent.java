/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-scroll-threshold project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fires when the upper threshold has been reached.</p>
 */
public class UpperThresholdEvent extends DomEvent<UpperThresholdEventHandler> {

    public static Type<UpperThresholdEventHandler> TYPE = new Type<UpperThresholdEventHandler>(
       com.vaadin.polymer.iron.event.UpperThresholdEvent.NAME, new UpperThresholdEvent());


    public UpperThresholdEvent() {
    }

    public Type<UpperThresholdEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UpperThresholdEventHandler handler) {
        handler.onUpperThreshold(this);
    }

    public com.vaadin.polymer.iron.event.UpperThresholdEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.UpperThresholdEvent)super.getNativeEvent();
    }


}
