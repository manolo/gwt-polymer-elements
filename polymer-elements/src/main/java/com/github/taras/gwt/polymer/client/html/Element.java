package com.github.taras.gwt.polymer.client.html;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Element extends Node {
    
    @JsProperty
    String innerHTML();
}
