package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.widget.PaperActionDialog;
import com.github.taras.gwt.polymer.client.widget.PaperDialog;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class DialogSample extends Composite {
    interface DialogSampleUiBinder extends UiBinder<HTMLPanel, DialogSample> {
    }

    private static DialogSampleUiBinder ourUiBinder = GWT.create(DialogSampleUiBinder.class);
    
    private static String[] transitions = {
            "core-transition-center",
            "core-transition-top",
            "core-transition-bottom",
            "core-transition-left",
            "core-transition-right"
    };
    
    @UiField Button button1;
    @UiField Button button2;
    @UiField Button button3;
    @UiField Button button4;
    @UiField PaperDialog dialog1;
    @UiField PaperDialog dialog2;
    @UiField PaperActionDialog dialog3;
    @UiField PaperActionDialog dialog4;

    @UiField Button buttonS1;
    @UiField Button buttonS2;
    @UiField PaperDialog dialogS1;
    @UiField PaperActionDialog dialogS2;
    
    @UiField FlowPanel transitionButtons;
    @UiField PaperDialog transitionDialog;
    
    @UiField Button buttonC1;
    @UiField PaperDialog dialogC1;
    @UiField Button buttonC2;
    @UiField PaperDialog dialogC2;

    public DialogSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog1.toggle();
            }
        });
        button2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog2.toggle();
            }
        });
        button3.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog3.toggle();
            }
        });
        button4.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog4.toggle();
            }
        });

        buttonS1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialogS1.toggle();
            }
        });
        buttonS2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialogS2.toggle();
            }
        });

        for (final String transition : transitions) {
            transitionButtons.add(new Button(transition, new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    transitionDialog.setHeading(transition);
                    transitionDialog.setTransition(transition);
                    transitionDialog.toggle();
                }
            }));
        }

        buttonC1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialogC1.toggle();
            }
        });
        buttonC2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialogC2.toggle();
            }
        });
    }
}