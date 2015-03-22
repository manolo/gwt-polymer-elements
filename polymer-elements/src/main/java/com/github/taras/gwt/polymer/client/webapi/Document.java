package com.github.taras.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface Document extends Node {

    EventTarget getElementById(String id);
}
