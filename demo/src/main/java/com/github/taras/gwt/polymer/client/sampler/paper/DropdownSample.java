package com.github.taras.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 25.03.2015.
 */
public class DropdownSample extends Composite {
    interface DropdownSampleUiBinder extends UiBinder<HTMLPanel, DropdownSample> {
    }

    private static DropdownSampleUiBinder ourUiBinder = GWT.create(DropdownSampleUiBinder.class);

    public DropdownSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}