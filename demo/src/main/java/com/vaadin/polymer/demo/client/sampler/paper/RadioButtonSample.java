package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class RadioButtonSample extends Composite {
    interface ButtonSampleUiBinder extends UiBinder<HTMLPanel, RadioButtonSample> {
    }

    private static ButtonSampleUiBinder ourUiBinder = GWT.create(ButtonSampleUiBinder.class);

    public RadioButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(RadioButtonSample.this));
    }
}
