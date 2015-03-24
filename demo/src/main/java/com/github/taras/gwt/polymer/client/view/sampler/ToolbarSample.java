package com.github.taras.gwt.polymer.client.view.sampler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 24.03.2015.
 */
public class ToolbarSample extends Composite {
    interface ToolbarSampleUiBinder extends UiBinder<HTMLPanel, ToolbarSample> {
    }

    private static ToolbarSampleUiBinder ourUiBinder = GWT.create(ToolbarSampleUiBinder.class);

    public ToolbarSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}