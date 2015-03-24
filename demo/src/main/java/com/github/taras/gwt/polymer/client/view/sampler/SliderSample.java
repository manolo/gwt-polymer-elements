package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.widget.PaperSlider;
import com.github.taras.gwt.polymer.client.widget.event.CoreChangeEvent;
import com.github.taras.gwt.polymer.client.widget.event.CoreChangeEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class SliderSample extends Composite {
    interface SliderSampleUiBinder extends UiBinder<HTMLPanel, SliderSample> {
    }

    private static SliderSampleUiBinder ourUiBinder = GWT.create(SliderSampleUiBinder.class);
    
    @UiField
    PaperSlider ratings;
    @UiField
    SpanElement ratingsLabel;

    public SliderSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        ratings.addCoreChangeHandler(new CoreChangeEventHandler() {
            @Override
            public void onCoreChange(CoreChangeEvent event) {
                ratingsLabel.setInnerText(String.valueOf(ratings.getValue()));
            }
        });
    }
}