/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>marked-render-complete</code> event is fired once Markdown to HTML<br>conversion has finished, and the DOM has been populated via the resulting<br>HTML.</p>
 */
public class MarkedRenderCompleteEvent extends DomEvent<MarkedRenderCompleteEventHandler> {

    public static Type<MarkedRenderCompleteEventHandler> TYPE = new Type<MarkedRenderCompleteEventHandler>(
       com.vaadin.polymer.marked.event.MarkedRenderCompleteEvent.NAME, new MarkedRenderCompleteEvent());


    public MarkedRenderCompleteEvent() {
    }

    public Type<MarkedRenderCompleteEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(MarkedRenderCompleteEventHandler handler) {
        handler.onMarkedRenderComplete(this);
    }

    public com.vaadin.polymer.marked.event.MarkedRenderCompleteEvent getPolymerEvent() {
        return (com.vaadin.polymer.marked.event.MarkedRenderCompleteEvent)super.getNativeEvent();
    }


}
