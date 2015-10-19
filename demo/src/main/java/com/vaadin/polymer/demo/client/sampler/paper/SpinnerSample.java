package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.element.PaperSpinnerElement;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperSpinner;

public class SpinnerSample extends Composite {
    interface SpinnerSampleUiBinder extends UiBinder<HTMLPanel, SpinnerSample> {
    }

    private static SpinnerSampleUiBinder ourUiBinder = GWT.create(SpinnerSampleUiBinder.class);

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
    }

    @UiHandler("toggleBtn1")
    protected void toggle1(ClickEvent e) {
        toggle1_1.setActive(!toggle1_1.getActive());
        toggle1_2.setActive(!toggle1_2.getActive());
        toggle1_3.setActive(!toggle1_3.getActive());
        toggle1_4.setActive(!toggle1_4.getActive());
    }

    @UiHandler("toggleBtn2")
    protected void toggle2(ClickEvent e) {
        toggle2_1.setActive(!toggle2_1.getActive());
        toggle2_2.setActive(!toggle2_2.getActive());
        toggle2_3.setActive(!toggle2_3.getActive());
        toggleAttribute(toggle2_4);
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
