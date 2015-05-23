package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsFunction;

@JsFunction
public interface EventListener<T extends Event> {
    void handleEvent(T event);
}
