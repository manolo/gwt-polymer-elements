package com.github.taras.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 25.03.2015.
 */
public class ButtonSample extends Composite {
    interface ButtonSampleUiBinder extends UiBinder<HTMLPanel, ButtonSample> {
    }

    private static ButtonSampleUiBinder ourUiBinder = GWT.create(ButtonSampleUiBinder.class);

    public ButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}