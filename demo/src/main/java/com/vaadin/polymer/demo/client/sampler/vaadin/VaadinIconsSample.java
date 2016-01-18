package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.elemental.Template;

public class VaadinIconsSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, VaadinIconsSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField Template bindTemplate;
    @UiField Template repeatTemplate;

    public VaadinIconsSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        repeatTemplate.setFilter(iconSet -> Polymer.property(iconSet, "name") == "vaadin-icons");

        Polymer.property(bindTemplate, "getIconNames",
                (Function<?,?>) iconSet -> Polymer.apply(iconSet, "getIconNames"));

    }
}
