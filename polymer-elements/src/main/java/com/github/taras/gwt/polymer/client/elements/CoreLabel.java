package com.github.taras.gwt.polymer.client.elements;

import com.github.taras.gwt.polymer.client.BaseWidget;
import com.github.taras.gwt.polymer.client.PolymerInjector;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

public class CoreLabel extends BaseWidget {

	public CoreLabel() {
		super(CoreLabel.class);
	}
    
    public void setFor(String val) {
        getElement().setAttribute("for", val);
    }
}
