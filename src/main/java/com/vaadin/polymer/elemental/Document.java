package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface Document extends Node {
    EventTarget getElementById(String id);
    <T> T createElement(String tag);
    @JsProperty HTMLElement getHead();
    @JsProperty HTMLElement getBody();
}
