package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface CSSStyleDeclaration {

    String getPropertyValue(String property);
    void setProperty(String property, String value);

}
