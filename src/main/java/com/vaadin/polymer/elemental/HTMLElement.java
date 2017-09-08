package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface HTMLElement extends Element {
    /**
     * Polymer’s custom property shim evaluates and applies custom property values once at element creation time.
     * In order to have an element (and its subtree) re- evaluate custom property values due to dynamic changes
     * such as application of CSS classes, etc., call updateStyles().
     */
    void updateStyles();

    @JsProperty HTMLElement getRoot();

    void debounce(String name, Function f, int timeout);
}
