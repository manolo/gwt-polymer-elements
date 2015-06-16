package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class FabSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, FabSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public FabSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
