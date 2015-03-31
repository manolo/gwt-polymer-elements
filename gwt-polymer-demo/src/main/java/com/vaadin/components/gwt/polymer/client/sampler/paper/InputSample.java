package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 24.03.2015.
 */
public class InputSample extends Composite {
    interface InputSampleUiBinder extends UiBinder<HTMLPanel, InputSample> {
    }

    private static InputSampleUiBinder ourUiBinder = GWT.create(InputSampleUiBinder.class);

    public InputSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}