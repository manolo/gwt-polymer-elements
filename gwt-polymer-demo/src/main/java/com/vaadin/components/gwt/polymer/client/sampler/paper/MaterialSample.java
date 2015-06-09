package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.IronCollapse;
import com.vaadin.components.gwt.polymer.client.widget.PaperMaterial;

public class MaterialSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, MaterialSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField
    PaperMaterial material;
    @UiField
    PaperMaterial fabMaterial;


    public MaterialSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        material.addClickHandler(new MyClickHandler());
        fabMaterial.addClickHandler(new MyClickHandler());
    }

    private class MyClickHandler implements ClickHandler {
        private boolean down;

        @Override
        public void onClick(ClickEvent event) {
            PaperMaterial source = (PaperMaterial) event.getSource();
            if (!down) {
                source.setElevation(material.getElevation() + 1);
                if (source.getElevation() == 5) {
                    down = true;
                }
            } else {
                source.setElevation(material.getElevation() - 1);
                if (source.getElevation() == 0) {
                    down = false;
                }
            }
        }
    }
}
