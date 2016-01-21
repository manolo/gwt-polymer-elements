/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Broadcast when another component is clicked on</p>
 */
public class IronDocViewerComponentSelectedEvent extends DomEvent<IronDocViewerComponentSelectedEventHandler> {

    public static Type<IronDocViewerComponentSelectedEventHandler> TYPE = new Type<IronDocViewerComponentSelectedEventHandler>(
       com.vaadin.polymer.iron.event.IronDocViewerComponentSelectedEvent.NAME, new IronDocViewerComponentSelectedEvent());


    public IronDocViewerComponentSelectedEvent() {
    }

    public Type<IronDocViewerComponentSelectedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronDocViewerComponentSelectedEventHandler handler) {
        handler.onIronDocViewerComponentSelected(this);
    }

    public com.vaadin.polymer.iron.event.IronDocViewerComponentSelectedEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronDocViewerComponentSelectedEvent)super.getNativeEvent();
    }


    /**
     * <p>name of the component<br>iron-doc-viewer container should load component if possible</p>
     */
    public String getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
