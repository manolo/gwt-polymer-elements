package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsType;

@JsType(prototype="EventTarget")
public interface EventTarget {
    void addEventListener(String type, EventListener<?> listener);
}
