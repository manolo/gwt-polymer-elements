package com.vaadin.polymer.elemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
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
