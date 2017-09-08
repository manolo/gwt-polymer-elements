/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the scroller reaches the target scrolling position.</p>
 */
public class ScrollAnimationFinishedEvent extends DomEvent<ScrollAnimationFinishedEventHandler> {

    public static Type<ScrollAnimationFinishedEventHandler> TYPE = new Type<ScrollAnimationFinishedEventHandler>(
       com.vaadin.polymer.vaadin.event.ScrollAnimationFinishedEvent.NAME, new ScrollAnimationFinishedEvent());


    public ScrollAnimationFinishedEvent() {
    }

    public Type<ScrollAnimationFinishedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ScrollAnimationFinishedEventHandler handler) {
        handler.onScrollAnimationFinished(this);
    }

    public com.vaadin.polymer.vaadin.event.ScrollAnimationFinishedEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.ScrollAnimationFinishedEvent)super.getNativeEvent();
    }


    /**
     * <p>new position</p>
     */
    public double getPosition() {
        return getPolymerEvent().getDetail().getPosition();
    }

    /**
     * <p>old position</p>
     */
    public double getOldPosition() {
        return getPolymerEvent().getDetail().getOldPosition();
    }

}
