package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.widget.PaperShadow;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ShadowSample extends Composite {
    interface ShadowSampleUiBinder extends UiBinder<HTMLPanel, ShadowSample> {
    }

    private static ShadowSampleUiBinder ourUiBinder = GWT.create(ShadowSampleUiBinder.class);
    
    @UiField PaperShadow shadow1;
    @UiField PaperShadow shadow2;

    public ShadowSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        shadow1.addClickHandler(new MyClickHandler(shadow1));
        shadow2.addClickHandler(new MyClickHandler(shadow2));
    }

    private static class MyClickHandler implements ClickHandler {

        private boolean down;
        private PaperShadow target;

        public MyClickHandler(PaperShadow target) {
            this.target = target;
        }

        @Override
        public void onClick(ClickEvent event) {
            if (down) {
                target.setZ(target.getZ() - 1);
                if (target.getZ() == 0) {
                    down = false;
                }
            } else {
                target.setZ(target.getZ() + 1);
                if (target.getZ() == 5) {
                    down = true;
                }
            }
        }
    }
}