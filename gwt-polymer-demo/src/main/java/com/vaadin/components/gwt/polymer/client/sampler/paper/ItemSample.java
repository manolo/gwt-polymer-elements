package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;

public class ItemSample extends Composite {
    interface ItemSampleUiBinder extends UiBinder<HTMLPanel, ItemSample> {
    }

    private static ItemSampleUiBinder ourUiBinder = GWT.create(ItemSampleUiBinder.class);

    public ItemSample() {
        // TODO: make icons work without this line
        Polymer.ensureHTMLImport("paper-icon-button");

        initWidget(ourUiBinder.createAndBindUi(this));
    }
}