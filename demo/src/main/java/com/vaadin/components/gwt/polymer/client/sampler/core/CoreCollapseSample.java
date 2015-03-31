package com.vaadin.components.gwt.polymer.client.sampler.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.CoreCollapse;

public class CoreCollapseSample extends Composite {
    interface CoreCollapseSampleUiBinder extends UiBinder<HTMLPanel, CoreCollapseSample> {
    }

    private static CoreCollapseSampleUiBinder ourUiBinder = GWT.create(CoreCollapseSampleUiBinder.class);
    
    @UiField
    FlowPanel heading1;
    @UiField
    CoreCollapse collapse1;
    @UiField
    FlowPanel heading2;
    @UiField
    CoreCollapse collapse2;
    @UiField
    FlowPanel heading3;
    @UiField
    CoreCollapse collapse3;

    public CoreCollapseSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        heading1.addDomHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse1.toggle();
            }
        }, ClickEvent.getType());

        heading2.addDomHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse2.toggle();
            }
        }, ClickEvent.getType());

        heading3.addDomHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse3.toggle();
            }
        }, ClickEvent.getType());
    }
}