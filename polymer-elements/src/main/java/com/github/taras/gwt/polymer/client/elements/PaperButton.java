package com.github.taras.gwt.polymer.client.elements;

import com.github.taras.gwt.polymer.client.PolymerElement;
import com.google.gwt.user.client.DOM;

public class PaperButton extends PolymerElement {

    protected PaperButton() {
    }

    public final void setRaised(boolean val) {
        setPropertyBoolean("raised", val);
    }
}
