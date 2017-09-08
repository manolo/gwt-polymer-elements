package com.vaadin.polymer.elemental;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface EventListener<T extends Event> {
    void handleEvent(T event);
}
