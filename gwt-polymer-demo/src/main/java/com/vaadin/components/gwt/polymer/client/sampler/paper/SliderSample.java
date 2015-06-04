package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.PaperSlider;
import com.vaadin.components.gwt.polymer.client.widget.event.ChangeEvent;
import com.vaadin.components.gwt.polymer.client.widget.event.ChangeEventHandler;
import com.vaadin.components.gwt.polymer.client.widget.event.IronChangeEvent;

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
        
        ratings.addChangeHandler(new ChangeEventHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                ratingsLabel.setInnerText(String.valueOf(ratings.getValue()));
            }
        });
    }
}