package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.element.PaperSpinnerElement;
import com.vaadin.components.gwt.polymer.client.widget.PaperSpinner;

public class SpinnerSample extends Composite {
    interface SpinnerSampleUiBinder extends UiBinder<HTMLPanel, SpinnerSample> {
    }

    private static SpinnerSampleUiBinder ourUiBinder = GWT.create(SpinnerSampleUiBinder.class);

    @UiField Button toggleBtn1;
    @UiField Button toggleBtn2;

    @UiField PaperSpinner toggle1_1;
    @UiField PaperSpinner toggle1_2;
    @UiField PaperSpinner toggle1_3;
    @UiField PaperSpinner toggle1_4;

    @UiField PaperSpinner toggle2_1;
    @UiField PaperSpinner toggle2_2;
    @UiField PaperSpinner toggle2_3;
    @UiField PaperSpinnerElement toggle2_4;

    public SpinnerSample() {
        initWidget(ourUiBinder.createAndBindUi(SpinnerSample.this));

        toggleBtn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                toggleAttribute(toggle1_1);
                toggleAttribute(toggle1_2);
                toggleAttribute(toggle1_3);
                toggleAttribute(toggle1_4);
            }
        });

        toggleBtn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                toggleAttribute(toggle2_1);
                toggleAttribute(toggle2_2);
                toggleAttribute(toggle2_3);
                toggleAttribute(toggle2_4);
            }
        });
    }

    private void toggleAttribute(PaperSpinner spinner) {
        toggleAttribute(spinner.getPolymerElement());
    }

    private void toggleAttribute(PaperSpinnerElement element) {
        String name = "active";
        if (element.hasAttribute(name)) {
            element.removeAttribute(name);
        } else {
            element.setAttribute(name, "");
        }
    }
}
