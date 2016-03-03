package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperToast;

public class ToastSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, ToastSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField PaperButton button1;
    @UiField PaperButton button2;
    @UiField PaperToast toast1;
    @UiField PaperToast toast2;

    public ToastSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                toast1.open();
            }
        });

        button2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                toast2.open();
            }
        });
    }
}
