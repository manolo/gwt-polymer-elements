package com.github.taras.gwt.polymer.client.view.sampler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by Taras on 25.03.2015.
 */
public class ToastSample extends Composite {
    interface ToastSampleUiBinder extends UiBinder<HTMLPanel, ToastSample> {
    }

    private static ToastSampleUiBinder ourUiBinder = GWT.create(ToastSampleUiBinder.class);

    public ToastSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}