package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;

public class HeaderPanelSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, HeaderPanelSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    public HeaderPanelSample() {
        Polymer.ensureHTMLImport("paper-header-panel/paper-header-panel.html");

        initWidget(ourUiBinder.createAndBindUi(HeaderPanelSample.this));
    }
}
