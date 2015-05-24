package com.vaadin.components.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Event {

    @JsProperty
    Detail getDetail();
    
    @JsProperty
    EventTarget getTarget();

    @JsType
    public interface Detail {
    }
}
