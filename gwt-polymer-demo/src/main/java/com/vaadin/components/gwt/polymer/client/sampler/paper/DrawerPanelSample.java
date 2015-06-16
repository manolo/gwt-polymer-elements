package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;

public class DrawerPanelSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, DrawerPanelSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField PaperDrawerPanel panel;
    @UiField PaperButton flipButton;

    public DrawerPanelSample() {
        Polymer.ensureHTMLImport("paper-drawer-panel/paper-drawer-panel.html");

        initWidget(ourUiBinder.createAndBindUi(DrawerPanelSample.this));

        flipButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                PaperDrawerPanelElement el = panel.getPolymerElement();
                if (el.hasAttribute("right-drawer")) {
                    el.removeAttribute("right-drawer");
                } else {
                    el.setAttribute("right-drawer", "");
                }
            }
        });
    }
}
