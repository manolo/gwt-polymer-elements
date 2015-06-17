package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.paper.element.PaperDialogElement;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperDialog;

public class DialogSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, DialogSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField PaperButton dialogBtn;
    @UiField PaperButton scrollingBtn;
    @UiField PaperButton actionsBtn;
    @UiField PaperButton modalBtn;
    
    @UiField PaperDialog dialog;
    @UiField PaperDialog scrollingDlg;
    @UiField PaperDialog actionsDlg;
    @UiField PaperDialogElement modalDlg;
    
    @UiField PaperButton colorsBtn;
    @UiField PaperButton positionBtn;    
    
    @UiField PaperDialogElement colorsDlg;
    @UiField PaperDialogElement positionDlg;
    
    @UiField PaperButton animatedBtn;
    
    @UiField PaperDialogElement animatedDlg;

    public DialogSample() {
        initWidget(ourUiBinder.createAndBindUi(DialogSample.this));
        
        dialogBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog.getPolymerElement().open();
            }
        });

        scrollingBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                scrollingDlg.getPolymerElement().open();
            }
        });

        actionsBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                actionsDlg.getPolymerElement().open();
            }
        });

        modalBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                modalDlg.open();
            }
        });

        colorsBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                colorsDlg.open();
            }
        });

        positionBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                positionDlg.open();
            }
        });

        animatedBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                animatedDlg.open();
            }
        });
    }
}
