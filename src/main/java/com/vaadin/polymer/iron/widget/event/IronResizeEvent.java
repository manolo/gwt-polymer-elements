/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-split-layout project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the splitter is dragged. Non-bubbing. Fired for the splitter<br>element and any nested elements with <code>IronResizableBehavior</code>.</p>
 */
public class IronResizeEvent extends DomEvent<IronResizeEventHandler> {

    public static Type<IronResizeEventHandler> TYPE = new Type<IronResizeEventHandler>(
       com.vaadin.polymer.iron.event.IronResizeEvent.NAME, new IronResizeEvent());


    public IronResizeEvent() {
    }

    public Type<IronResizeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronResizeEventHandler handler) {
        handler.onIronResize(this);
    }

    public com.vaadin.polymer.iron.event.IronResizeEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronResizeEvent)super.getNativeEvent();
    }


}
