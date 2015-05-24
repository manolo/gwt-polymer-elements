package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(prototype="CustomEvent")
public interface Event {

    @JsProperty
    Detail getDetail();
    
    @JsProperty
    EventTarget getTarget();

    @JsType
    public interface Detail {
    }
}
