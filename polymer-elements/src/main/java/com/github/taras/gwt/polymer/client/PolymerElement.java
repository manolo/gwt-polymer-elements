package com.github.taras.gwt.polymer.client;

import com.google.gwt.dom.client.Element;

public class PolymerElement extends Element {

    protected PolymerElement() {
    }

    public final void setNoink(boolean val) {
        setPropertyBoolean("noink", val);
    }
}
