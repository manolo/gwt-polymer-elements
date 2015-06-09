package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;

public class ButtonSample extends Composite {
    interface ButtonSampleUiBinder extends UiBinder<HTMLPanel, ButtonSample> {
    }

    private static ButtonSampleUiBinder ourUiBinder = GWT.create(ButtonSampleUiBinder.class);

    public ButtonSample() {
        Polymer.ensureHTMLImport("paper-button/paper-button.html");
        
        initWidget(ourUiBinder.createAndBindUi(ButtonSample.this));
    }
}
