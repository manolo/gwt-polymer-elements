package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class RippleSample extends Composite {
    interface ButtonSampleUiBinder extends UiBinder<HTMLPanel, RippleSample> {
    }

    private static ButtonSampleUiBinder ourUiBinder = GWT.create(ButtonSampleUiBinder.class);

    public RippleSample() {
        initWidget(ourUiBinder.createAndBindUi(RippleSample.this));
    }
}
