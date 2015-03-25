package com.github.taras.gwt.polymer.client.view.sampler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 25.03.2015.
 */
public class ShadowSample extends Composite {
    interface ShadowSampleUiBinder extends UiBinder<HTMLPanel, ShadowSample> {
    }

    private static ShadowSampleUiBinder ourUiBinder = GWT.create(ShadowSampleUiBinder.class);

    public ShadowSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}