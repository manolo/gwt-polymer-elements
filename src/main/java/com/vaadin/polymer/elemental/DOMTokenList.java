package com.vaadin.polymer.elemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface DOMTokenList {

    @JsProperty
    int getLength();
    
    boolean contains();
}
