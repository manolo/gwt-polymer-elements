package com.vaadin.components.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface CSSStyleDeclaration {
    
    String getPropertyValue(String property);
    void setProperty(String property, String value);

}
