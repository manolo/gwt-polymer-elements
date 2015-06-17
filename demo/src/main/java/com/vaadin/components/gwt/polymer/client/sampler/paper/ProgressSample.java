package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.js.JsUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.elemental.Window;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperProgress;

public class ProgressSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, ProgressSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField
    PaperButton startButton;
    @UiField
    PaperProgress progress;

    public ProgressSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        startButton.addClickHandler(new ClickHandler() {
            
            private int repeat = 0;
            private int maxRepeat = 5;
            private boolean animating = false;
            
            @Override
            public void onClick(ClickEvent clickEvent) {
                startProgress();
            }

            private void startProgress() {
                repeat = 0;
                progress.setValue(progress.getMin());
                startButton.setDisabled(true);
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
                        startButton.setDisabled(false);
                        return;
                    }
                    progress.setValue(progress.getMin());
                }

                getWindow().requestAnimationFrame(JsUtils.wrapFunction(new Function() {
                    @Override
                    public void f() {
                        nextProgress();
                    }
                }));
            }

            private native Window getWindow() /*-{
              return $wnd;
            }-*/;
        });
    }
}
