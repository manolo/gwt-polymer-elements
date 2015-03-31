package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.PaperButton;
import com.vaadin.components.gwt.polymer.client.widget.PaperProgress;

public class ProgressBarSample extends Composite {
    interface ProgressBarSampleUiBinder extends UiBinder<HTMLPanel, ProgressBarSample> {
    }

    private static ProgressBarSampleUiBinder ourUiBinder = GWT.create(ProgressBarSampleUiBinder.class);

    @UiField
    PaperProgress progress;
    @UiField
    PaperButton button;

    public ProgressBarSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        button.addClickHandler(new ClickHandler() {

            private double repeat;
            private double maxRepeat = 5;
            private boolean animating = false;

            @Override
            public void onClick(ClickEvent event) {
                repeat = 0;
                progress.setValue(progress.getMin());
                button.setDisabled(true);
                if (!animating) {
                    nextProgress();
                }
            }

            private void nextProgress() {
                animating = true;
                if (progress.getValue() < progress.getMax()) {
                    progress.setValue(progress.getValue() + 1);
                } else {
                    if (++repeat >= maxRepeat) {
                        animating = false;
                        button.setDisabled(false);
                        return;
                    }
                    progress.setValue(progress.getMin());
                }
                // TODO: port this line to java
//                progress.async(nextProgress);
            }
        });
    }
}