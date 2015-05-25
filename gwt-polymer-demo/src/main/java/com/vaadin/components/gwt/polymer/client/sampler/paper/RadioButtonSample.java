package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class RadioButtonSample extends Composite {
    interface RadioButtonSampleUiBinder extends UiBinder<HTMLPanel, RadioButtonSample> {
    }

    private static RadioButtonSampleUiBinder ourUiBinder = GWT.create(RadioButtonSampleUiBinder.class);

    public RadioButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
