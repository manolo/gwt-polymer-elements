/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when value loads from localStorage.</p>
 */
public class IronLocalstorageLoadEvent extends DomEvent<IronLocalstorageLoadEventHandler> {

    public static Type<IronLocalstorageLoadEventHandler> TYPE = new Type<IronLocalstorageLoadEventHandler>(
       com.vaadin.polymer.iron.event.IronLocalstorageLoadEvent.NAME, new IronLocalstorageLoadEvent());


    public IronLocalstorageLoadEvent() {
    }

    public Type<IronLocalstorageLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronLocalstorageLoadEventHandler handler) {
        handler.onIronLocalstorageLoad(this);
    }

    public com.vaadin.polymer.iron.event.IronLocalstorageLoadEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronLocalstorageLoadEvent)super.getNativeEvent();
    }


    /**
     * <pre><code>externalChange: true if change occured in different window.
     * </code></pre>
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

}
