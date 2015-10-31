package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class CheckboxSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, CheckboxSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public CheckboxSample() {
        initWidget(ourUiBinder.createAndBindUi(CheckboxSample.this));
    }
}
