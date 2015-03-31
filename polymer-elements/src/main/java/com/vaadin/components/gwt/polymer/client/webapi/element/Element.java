package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Element extends Node {
    
    @JsProperty
    String innerHTML();

    @JsProperty
    DOMTokenList classList();
    
    void setAttribute(String name, String value);
    String getAttribute(String name);
    void removeAttribute(String name);
}
