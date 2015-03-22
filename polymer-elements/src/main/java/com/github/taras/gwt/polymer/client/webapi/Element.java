package com.github.taras.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Element extends Node {
    
    @JsProperty
    String innerHTML();

    @JsProperty
    DOMTokenList classList();
    
    void setAttribute(String name, String value);
    void removeAttribute(String name);
}
