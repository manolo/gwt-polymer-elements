/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <pre><code>  Fired when the animation finishes.
 *   This is useful if you want to wait until
 *   the ripple animation finishes to perform some action.
 * 
 * 
 * </code></pre>
 */
public class TransitionendEvent extends DomEvent<TransitionendEventHandler> {

    public static Type<TransitionendEventHandler> TYPE = new Type<TransitionendEventHandler>(
       com.vaadin.polymer.paper.event.TransitionendEvent.NAME, new TransitionendEvent());


    public TransitionendEvent() {
    }

    public Type<TransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(TransitionendEventHandler handler) {
        handler.onTransitionend(this);
    }

    public com.vaadin.polymer.paper.event.TransitionendEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.TransitionendEvent)super.getNativeEvent();
    }


    /**
     * <p>Contains the animated node.</p>
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
