/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an event registered in the <code>detailedEvents</code> array is fired.<br>The name of the event depends of the original event type, for instance if the<br>original event is <code>contextmenu</code> the event name will be <code>detailed-contextmenu</code>.</p>
 */
public class DetailedEventEvent extends DomEvent<DetailedEventEventHandler> {

    public static Type<DetailedEventEventHandler> TYPE = new Type<DetailedEventEventHandler>(
       com.vaadin.polymer.vaadin.event.DetailedEventEvent.NAME, new DetailedEventEvent());


    public DetailedEventEvent() {
    }

    public Type<DetailedEventEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(DetailedEventEventHandler handler) {
        handler.onDetailedEvent(this);
    }

    public com.vaadin.polymer.vaadin.event.DetailedEventEvent getPolymerEvent() {
        return (com.vaadin.polymer.vaadin.event.DetailedEventEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>The original event.</p>
     */
    public JavaScriptObject getEvent() {
        return getPolymerEvent().getDetail().getEvent();
    }

    /**
     * <p>The column index where the element is located.</p>
     */
    public double getColumn() {
        return getPolymerEvent().getDetail().getColumn();
    }

    /**
     * <p>The row index where the element is located</p>
     */
    public double getRow() {
        return getPolymerEvent().getDetail().getRow();
    }

    /**
     * <p>The section name in the grid (header|body|footer)</p>
     */
    public String getSection() {
        return getPolymerEvent().getDetail().getSection();
    }

    /**
     * <p>The row data if the event was on the body, otherwise undefined</p>
     */
    public JavaScriptObject getData() {
        return getPolymerEvent().getDetail().getData();
    }

}
