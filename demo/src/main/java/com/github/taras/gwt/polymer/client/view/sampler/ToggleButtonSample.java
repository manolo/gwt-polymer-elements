package com.github.taras.gwt.polymer.client.view.sampler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ToggleButtonSample extends Composite {
    interface ToggleButtonSampleUiBinder extends UiBinder<HTMLPanel, ToggleButtonSample> {
    }

    private static ToggleButtonSampleUiBinder ourUiBinder = GWT.create(ToggleButtonSampleUiBinder.class);

    public ToggleButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}