/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when loaded value does not exist.<br>Event handler can be used to initialize default value.</p>
 */
public class IronLocalstorageLoadEmptyEvent extends DomEvent<IronLocalstorageLoadEmptyEventHandler> {

    public static Type<IronLocalstorageLoadEmptyEventHandler> TYPE = new Type<IronLocalstorageLoadEmptyEventHandler>(
       com.vaadin.polymer.iron.event.IronLocalstorageLoadEmptyEvent.NAME, new IronLocalstorageLoadEmptyEvent());


    public IronLocalstorageLoadEmptyEvent() {
    }

    public Type<IronLocalstorageLoadEmptyEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronLocalstorageLoadEmptyEventHandler handler) {
        handler.onIronLocalstorageLoadEmpty(this);
    }

    public com.vaadin.polymer.iron.event.IronLocalstorageLoadEmptyEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronLocalstorageLoadEmptyEvent)super.getNativeEvent();
    }


    /**
     * <pre><code>externalChange: true if change occured in different window.
     * </code></pre>
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
