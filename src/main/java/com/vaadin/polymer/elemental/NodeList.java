package com.vaadin.polymer.elemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface NodeList {

    @JsProperty
    int getLength();

    <T extends Node> T item(int index);
}
