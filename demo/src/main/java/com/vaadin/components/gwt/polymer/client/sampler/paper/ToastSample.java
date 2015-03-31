package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.PaperButton;
import com.vaadin.components.gwt.polymer.client.widget.PaperToast;

public class ToastSample extends Composite {
    interface ToastSampleUiBinder extends UiBinder<HTMLPanel, ToastSample> {
    }

    private static ToastSampleUiBinder ourUiBinder = GWT.create(ToastSampleUiBinder.class);
    
    @UiField PaperButton button1;
    @UiField PaperButton button2;
    @UiField PaperButton button3;
    @UiField PaperToast toast1;
    @UiField PaperToast toast2;
    @UiField PaperToast toast3;

    public ToastSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                toast1.toggle();
            }
        });
        button2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                toast2.toggle();
            }
        });
        button3.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                toast3.toggle();
            }
        });
    }
}