package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface Node extends EventTarget {

    @JsProperty
    NodeList getChildNodes();

    @JsProperty
    Node getFirstChild();

    @JsProperty
    Node getLastChild();

    boolean hasChildNodes();

    void appendChild(Object child);
    void removeChild(Object child);
}
