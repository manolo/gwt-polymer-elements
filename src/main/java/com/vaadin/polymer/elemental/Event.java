package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface Event {

    @JsProperty
    Detail getDetail();

    @JsProperty
    EventTarget getTarget();

    @JsType(isNative=true)
    public interface Detail {
    }
}
