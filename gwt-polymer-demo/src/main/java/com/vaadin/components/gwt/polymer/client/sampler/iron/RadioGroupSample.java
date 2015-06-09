package com.vaadin.components.gwt.polymer.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class RadioGroupSample extends Composite {
    interface ButtonSampleUiBinder extends UiBinder<HTMLPanel, RadioGroupSample> {
    }

    private static ButtonSampleUiBinder ourUiBinder = GWT.create(ButtonSampleUiBinder.class);

    public RadioGroupSample() {
        initWidget(ourUiBinder.createAndBindUi(RadioGroupSample.this));
    }
}
