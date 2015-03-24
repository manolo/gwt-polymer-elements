package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.widget.PaperSpinner;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class SpinnerSample extends Composite {
    interface SpinnerSampleUiBinder extends UiBinder<HTMLPanel, SpinnerSample> {
    }

    private static SpinnerSampleUiBinder ourUiBinder = GWT.create(SpinnerSampleUiBinder.class);
    
    @UiField
    Button button;
    @UiField
    PaperSpinner spinner1;
    @UiField
    PaperSpinner spinner2;
    @UiField
    PaperSpinner spinner3;
    @UiField
    PaperSpinner spinner4;
    @UiField
    PaperSpinner spinner5;

    public SpinnerSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                spinner1.setActive(!spinner1.isActive());
                spinner2.setActive(!spinner2.isActive());
                spinner3.setActive(!spinner3.isActive());
                spinner4.setActive(!spinner4.isActive());
                spinner5.setActive(!spinner5.isActive());
            }
        });
    }
}