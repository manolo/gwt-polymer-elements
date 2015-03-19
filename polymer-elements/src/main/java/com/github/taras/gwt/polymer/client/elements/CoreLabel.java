package com.github.taras.gwt.polymer.client.elements;

import com.github.taras.gwt.polymer.client.PolymerElement;

public class CoreLabel extends PolymerElement {

    protected CoreLabel() {
    }

    public final void setFor(String val) {
        setAttribute("for", val);
    }
}
