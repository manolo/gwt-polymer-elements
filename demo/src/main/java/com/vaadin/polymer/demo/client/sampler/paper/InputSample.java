package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperInput;

public class InputSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, InputSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField PaperInput inputForValidation;
    @UiField Button validateButton;

    public InputSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        validateButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                inputForValidation.validate();
            }
        });
    }
}
