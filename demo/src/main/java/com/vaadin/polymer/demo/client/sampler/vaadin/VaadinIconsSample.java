package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerFunction;
import com.vaadin.polymer.PolymerTemplate;

public class VaadinIconsSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, VaadinIconsSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField PolymerTemplate bindTemplate;

    public VaadinIconsSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        Polymer.property(bindTemplate, "getIconNames",
                (PolymerFunction<?,?>) iconSet -> Polymer.apply(iconSet, "getIconNames"));

        Polymer.property(bindTemplate, "filterIconset",
                (PolymerFunction<?,?>) iconSet -> Polymer.property(iconSet, "name") == "vaadin-icons");
    }
}
