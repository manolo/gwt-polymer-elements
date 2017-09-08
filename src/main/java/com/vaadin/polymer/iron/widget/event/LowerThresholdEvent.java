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
 * <p>Fires when the lower threshold has been reached.</p>
 */
public class LowerThresholdEvent extends DomEvent<LowerThresholdEventHandler> {

    public static Type<LowerThresholdEventHandler> TYPE = new Type<LowerThresholdEventHandler>(
       com.vaadin.polymer.iron.event.LowerThresholdEvent.NAME, new LowerThresholdEvent());


    public LowerThresholdEvent() {
    }

    public Type<LowerThresholdEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(LowerThresholdEventHandler handler) {
        handler.onLowerThreshold(this);
    }

    public com.vaadin.polymer.iron.event.LowerThresholdEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.LowerThresholdEvent)super.getNativeEvent();
    }


}
