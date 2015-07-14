/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.content.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the content has been scrolled.</p>
 */
public class ContentScrollEvent extends GwtEvent<ContentScrollEventHandler> {

    public static Type<ContentScrollEventHandler> TYPE = new Type<ContentScrollEventHandler>();

    private com.vaadin.polymer.content.element.event.ContentScrollEvent nativeEvent;

    public ContentScrollEvent(com.vaadin.polymer.content.element.event.ContentScrollEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ContentScrollEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ContentScrollEventHandler handler) {
        handler.onContentScroll(this);
    }

    public com.vaadin.polymer.content.element.event.ContentScrollEvent getNativeEvent() {
        return nativeEvent;
    }

}
