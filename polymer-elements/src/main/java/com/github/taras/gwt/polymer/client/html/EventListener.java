package com.github.taras.gwt.polymer.client.html;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventListener {
    void handleEvent(Event event);
}
