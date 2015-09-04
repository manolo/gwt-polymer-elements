package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ToolbarSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, ToolbarSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public ToolbarSample() {
        initWidget(ourUiBinder.createAndBindUi(ToolbarSample.this));
    }
}
