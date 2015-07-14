/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Broadcast when another component is clicked on</p>
 */
public class IronDocViewerComponentSelectedEvent extends GwtEvent<IronDocViewerComponentSelectedEventHandler> {

    public static Type<IronDocViewerComponentSelectedEventHandler> TYPE = new Type<IronDocViewerComponentSelectedEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronDocViewerComponentSelectedEvent nativeEvent;

    public IronDocViewerComponentSelectedEvent(com.vaadin.polymer.iron.element.event.IronDocViewerComponentSelectedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronDocViewerComponentSelectedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronDocViewerComponentSelectedEventHandler handler) {
        handler.onIronDocViewerComponentSelected(this);
    }

    public com.vaadin.polymer.iron.element.event.IronDocViewerComponentSelectedEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * <p>name of the component<br>iron-doc-viewer container should load component if possible</p>
     */
    public String getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

}
