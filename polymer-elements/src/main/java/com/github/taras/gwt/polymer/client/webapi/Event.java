package com.github.taras.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Event {

    @JsProperty
    Detail getDetail();
    
    @JsProperty
    EventTarget target();

    @JsType
    public interface Detail {
    }
}
