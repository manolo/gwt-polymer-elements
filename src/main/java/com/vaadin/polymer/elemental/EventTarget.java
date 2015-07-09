package com.vaadin.polymer.elemental;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
    void addEventListener(String type, EventListener listener);
}
