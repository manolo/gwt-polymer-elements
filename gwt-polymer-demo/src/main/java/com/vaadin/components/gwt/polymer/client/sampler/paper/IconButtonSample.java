package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class IconButtonSample extends Composite {
    interface IconButtonSampleUiBinder extends UiBinder<HTMLPanel, IconButtonSample> {
    }

    private static IconButtonSampleUiBinder ourUiBinder = GWT.create(IconButtonSampleUiBinder.class);

    public IconButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
