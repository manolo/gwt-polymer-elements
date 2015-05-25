package com.vaadin.components.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Element extends Node {

    @JsProperty
    String getInnerHTML();

    @JsProperty
    DOMTokenList getClassList();

    void setAttribute(String name, Object value);
    String getAttribute(String name);
    void removeAttribute(String name);
}
