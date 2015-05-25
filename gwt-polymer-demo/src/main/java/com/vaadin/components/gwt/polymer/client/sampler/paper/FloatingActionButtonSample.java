package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class FloatingActionButtonSample extends Composite {
    interface FloatingActionButtonSampleUiBinder extends UiBinder<HTMLPanel, FloatingActionButtonSample> {
    }

    private static FloatingActionButtonSampleUiBinder ourUiBinder = GWT.create(FloatingActionButtonSampleUiBinder.class);

    public FloatingActionButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
