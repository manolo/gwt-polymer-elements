package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.widget.PaperButton;
import com.vaadin.components.gwt.polymer.client.widget.PaperDialog;

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
    @UiField Element modalDlg;
    
    @UiField PaperButton colorsBtn;
    @UiField PaperButton positionBtn;    
    
    @UiField Element colorsDlg;
    @UiField Element positionDlg;
    
    @UiField PaperButton animatedBtn;
    
    @UiField Element animatedDlg;

    public DialogSample() {
        Polymer.ensureHTMLImport("paper-dialog/paper-dialog.html");
        Polymer.ensureHTMLImport("../paper/dialog-sample-styles.html");
        
        initWidget(ourUiBinder.createAndBindUi(DialogSample.this));
        
        dialogBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                // TODO: fix when behaviours will be supported
//                dialog.open();
            }
        });
    }
}
