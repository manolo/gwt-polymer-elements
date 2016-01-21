package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface Promise {
    void then(Function func);

    // Cannot use catch in java, using fail like jQuery does
    @JsMethod(name = "catch")
    void fail(Function func);

    // Not in the native JS implementation
    // but used in some libs like pouchdb
    void on(Function func);
}
