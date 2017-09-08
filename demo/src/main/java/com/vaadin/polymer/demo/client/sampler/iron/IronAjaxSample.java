package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerTemplate;
import com.vaadin.polymer.iron.widget.IronAjax;
import com.vaadin.polymer.iron.widget.event.ResponseEvent;

public class IronAjaxSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronAjaxSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField IronAjax ajax;
    @UiField PolymerTemplate repeat;

    public IronAjaxSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
    
    @UiHandler("ajax")
    void onResponse(ResponseEvent e) {
        repeat.setItems(Polymer.property(ajax.getLastResponse(), "items"));
    }
}
