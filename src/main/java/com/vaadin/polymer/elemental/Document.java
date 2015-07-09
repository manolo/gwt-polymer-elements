package com.vaadin.polymer.elemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Document extends Node {
    EventTarget getElementById(String id);
    <T> T createElement(String tag);
    @JsProperty HTMLElement getHead();
    @JsProperty HTMLElement getBody();
}
