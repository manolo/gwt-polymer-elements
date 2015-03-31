package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;

public class CheckboxSample extends Composite {
    interface CheckboxUiBinder extends UiBinder<HTMLPanel, CheckboxSample> {
    }

    private static CheckboxUiBinder ourUiBinder = GWT.create(CheckboxUiBinder.class);

    public CheckboxSample() {
        Polymer.ensureHTMLImport("core-label");
        Polymer.ensureHTMLImport("paper-checkbox");
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}