package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperSlider;
import com.vaadin.polymer.value.widget.event.ValueChangeEvent;
import com.vaadin.polymer.value.widget.event.ValueChangeEventHandler;

public class SliderSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, SliderSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField PaperSlider ratings;
    @UiField SpanElement ratingsLabel;


    public SliderSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        ratings.addValueChangeHandler(new ValueChangeEventHandler() {
            @Override
            public void onValueChange(ValueChangeEvent event) {
                ratingsLabel.setInnerText("" + ratings.getValue());
            }
        });
    }
}
