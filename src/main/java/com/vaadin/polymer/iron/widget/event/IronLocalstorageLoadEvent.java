/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when value loads from localStorage.</p>
 */
public class IronLocalstorageLoadEvent extends GwtEvent<IronLocalstorageLoadEventHandler> {

    public static Type<IronLocalstorageLoadEventHandler> TYPE = new Type<IronLocalstorageLoadEventHandler>();

    private com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent nativeEvent;

    public IronLocalstorageLoadEvent(com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronLocalstorageLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronLocalstorageLoadEventHandler handler) {
        handler.onIronLocalstorageLoad(this);
    }

    public com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * <pre><code>externalChange: true if change occured in different window.
     * </code></pre>
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

}
