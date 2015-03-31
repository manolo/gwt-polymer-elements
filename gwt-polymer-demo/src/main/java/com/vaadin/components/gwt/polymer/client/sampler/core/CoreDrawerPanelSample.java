package com.vaadin.components.gwt.polymer.client.sampler.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class CoreDrawerPanelSample extends Composite {
    interface CoreDrawerPanelUiBinder extends UiBinder<HTMLPanel, CoreDrawerPanelSample> {
    }

    private static CoreDrawerPanelUiBinder ourUiBinder = GWT.create(CoreDrawerPanelUiBinder.class);

    public CoreDrawerPanelSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}