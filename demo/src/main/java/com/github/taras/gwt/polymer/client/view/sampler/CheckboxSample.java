package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.Polymer;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

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