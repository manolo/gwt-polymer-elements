package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;

public class CheckboxSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, CheckboxSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public CheckboxSample() {
        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");
        
        initWidget(ourUiBinder.createAndBindUi(CheckboxSample.this));
    }
}
