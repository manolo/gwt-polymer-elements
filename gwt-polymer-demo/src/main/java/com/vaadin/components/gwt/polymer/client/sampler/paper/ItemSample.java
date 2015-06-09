package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;

public class ItemSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, ItemSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public ItemSample() {
        Polymer.ensureHTMLImport("iron-icon/iron-icon.html");
        Polymer.ensureHTMLImport("iron-icons/iron-icons.html");
        Polymer.ensureHTMLImport("iron-icons/communication-icons.html");
        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");
        Polymer.ensureHTMLImport("paper-toggle-button/paper-toggle-button.html");
        Polymer.ensureHTMLImport("paper-item/paper-icon-item.html");
        Polymer.ensureHTMLImport("paper-item/paper-item.html");
        Polymer.ensureHTMLImport("../paper/item-sample-styles.html");

        initWidget(ourUiBinder.createAndBindUi(ItemSample.this));
    }
}
