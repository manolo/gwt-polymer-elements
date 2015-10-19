package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class IconButtonSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IconButtonSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public IconButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
