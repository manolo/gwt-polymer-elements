package com.vaadin.components.gwt.polymer.client.sampler.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class CoreSelectionSample extends Composite {
    interface CoreSelectionSampleUiBinder extends UiBinder<HTMLPanel, CoreSelectionSample> {
    }

    private static CoreSelectionSampleUiBinder ourUiBinder = GWT.create(CoreSelectionSampleUiBinder.class);
    
    @UiField
    HTMLPanel panel;

    public CoreSelectionSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        
    }
}