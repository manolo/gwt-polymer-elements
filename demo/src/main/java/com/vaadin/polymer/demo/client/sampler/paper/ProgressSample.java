package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.animation.client.Animation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperProgress;

public class ProgressSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, ProgressSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField PaperButton startButton;
    @UiField PaperProgress progress;

    public ProgressSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @UiHandler("startButton")
    public void onStartClick(ClickEvent clickEvent) {
        new Animation() {
            protected double interpolate(double p) {
                return p;
            }
            public void run(int duration) {
                startButton.setDisabled(true);
                super.run(duration);
            }
            protected void onUpdate(double p) {
                progress.setValue((int)(p * 5 * 100) % 100);
            }
            protected void onComplete() {
                super.onComplete();
                startButton.setDisabled(false);
            }
        }.run(5000);
    }
}
