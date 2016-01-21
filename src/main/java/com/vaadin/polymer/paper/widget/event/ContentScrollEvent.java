/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the content has been scrolled.</p>
 */
public class ContentScrollEvent extends DomEvent<ContentScrollEventHandler> {

    public static Type<ContentScrollEventHandler> TYPE = new Type<ContentScrollEventHandler>(
       com.vaadin.polymer.paper.event.ContentScrollEvent.NAME, new ContentScrollEvent());


    public ContentScrollEvent() {
    }

    public Type<ContentScrollEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ContentScrollEventHandler handler) {
        handler.onContentScroll(this);
    }

    public com.vaadin.polymer.paper.event.ContentScrollEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.ContentScrollEvent)super.getNativeEvent();
    }


}
