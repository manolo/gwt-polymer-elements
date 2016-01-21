package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Template;

public class IronIconsSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronIconsSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField Template bindTemplate;

    public IronIconsSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        // Example of how to bind functions to custom elements. 
        Polymer.function(bindTemplate, "getIconNames",
                iconSet -> Polymer.apply(iconSet, "getIconNames"));
    }
}
