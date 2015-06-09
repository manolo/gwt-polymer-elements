package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
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
    @UiField PaperSpinner toggle2_4;

    public SpinnerSample() {
        Polymer.ensureHTMLImport("../paper/spinner-sample-styles.html");
        Polymer.ensureHTMLImport("paper-spinner/paper-spinner.html");

        initWidget(ourUiBinder.createAndBindUi(SpinnerSample.this));

        toggle1_1.getPolymerElement().setAttribute("active", "");
        toggle1_2.getPolymerElement().setAttribute("active", "");
        toggle1_3.getPolymerElement().setAttribute("active", "");
        toggle1_4.getPolymerElement().setAttribute("active", "");

        toggle2_1.getPolymerElement().setAttribute("active", "");
        toggle2_2.getPolymerElement().setAttribute("active", "");
        toggle2_3.getPolymerElement().setAttribute("active", "");
        toggle2_4.getPolymerElement().setAttribute("active", "");

        toggle2_1.getPolymerElement().setAttribute("class", "blue");
        toggle2_2.getPolymerElement().setAttribute("class", "red");
        toggle2_3.getPolymerElement().setAttribute("class", "orange");
        toggle2_4.getPolymerElement().setAttribute("class", "green");

        toggleBtn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                PaperSpinnerElement el = toggle1_1.getPolymerElement();
                if (el.hasAttribute("active")) {
                    el.removeAttribute("active");
                    toggle1_2.getPolymerElement().removeAttribute("active");
                    toggle1_3.getPolymerElement().removeAttribute("active");
                    toggle1_4.getPolymerElement().removeAttribute("active");
                } else {
                    el.setAttribute("active", "");
                    toggle1_2.getPolymerElement().setAttribute("active", "");
                    toggle1_3.getPolymerElement().setAttribute("active", "");
                    toggle1_4.getPolymerElement().setAttribute("active", "");
                }
            }
        });

        toggleBtn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                PaperSpinnerElement el = toggle2_1.getPolymerElement();
                if (el.hasAttribute("active")) {
                    el.removeAttribute("active");
                    toggle2_2.getPolymerElement().removeAttribute("active");
                    toggle2_3.getPolymerElement().removeAttribute("active");
                    toggle2_4.getPolymerElement().removeAttribute("active");
                } else {
                    el.setAttribute("active", "");
                    toggle2_2.getPolymerElement().setAttribute("active", "");
                    toggle2_3.getPolymerElement().setAttribute("active", "");
                    toggle2_4.getPolymerElement().setAttribute("active", "");
                }
            }
        });
    }
}
