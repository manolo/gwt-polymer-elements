package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.iron.widget.IronList;

public class IronListSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronListSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField IronList list;

    public IronListSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        list.setItems(Sampler.contacts);
    }
}
