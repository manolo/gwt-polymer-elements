package com.github.taras.gwt.polymer.client.interop;

import com.github.taras.gwt.polymer.client.html.HTMLElement;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperButton extends HTMLElement {
    
    @JsProperty
    boolean toggle();
    

    @JsProperty
    boolean active();

    @JsProperty
    void raised(boolean val);
    
    
}
