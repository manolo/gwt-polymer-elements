/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>  The <code>iron-input-validate</code> event is fired whenever <code>validate()</code> is called.</p>
 */
public class IronInputValidateEvent extends DomEvent<IronInputValidateEventHandler> {

    public static Type<IronInputValidateEventHandler> TYPE = new Type<IronInputValidateEventHandler>(
       com.vaadin.polymer.iron.event.IronInputValidateEvent.NAME, new IronInputValidateEvent());


    public IronInputValidateEvent() {
    }

    public Type<IronInputValidateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronInputValidateEventHandler handler) {
        handler.onIronInputValidate(this);
    }

    public com.vaadin.polymer.iron.event.IronInputValidateEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronInputValidateEvent)super.getNativeEvent();
    }


}
