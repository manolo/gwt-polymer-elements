package com.vaadin.components.gwt.polymer.client.sampler.paper;

import static com.google.gwt.query.client.GQuery.console;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.PaperDropdown;
import com.vaadin.components.gwt.polymer.client.widget.PaperIconButton;

public class DropdownSample extends Composite {
    interface DropdownSampleUiBinder extends UiBinder<HTMLPanel, DropdownSample> {
    }

    private static DropdownSampleUiBinder ourUiBinder = GWT.create(DropdownSampleUiBinder.class);

    @UiField Button button;
    @UiField PaperIconButton pIcon1;
    @UiField PaperDropdown pDrop1;
    @UiField PaperIconButton pIcon2;
    @UiField PaperDropdown pDrop2;
    @UiField PaperIconButton pIcon3;
    @UiField PaperDropdown pDrop3;
    @UiField PaperIconButton pIcon4;
    @UiField PaperDropdown pDrop4;
    @UiField PaperIconButton pIcon5;
    @UiField PaperDropdown pDrop5;
    @UiField PaperIconButton pIcon6;
    @UiField PaperDropdown pDrop6;
    @UiField PaperIconButton pIcon7;
    @UiField PaperDropdown pDrop7;

    public DropdownSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        xTrigger(pIcon1, pDrop1);
        xTrigger(pIcon2, pDrop2);
        xTrigger(pIcon3, pDrop3);
        xTrigger(pIcon4, pDrop4);
        xTrigger(pIcon5, pDrop5);
        xTrigger(pIcon6, pDrop6);
        xTrigger(pIcon7, pDrop7);
    }

    private void xTrigger(PaperIconButton b, final PaperDropdown d) {
        b.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                d.toggle();
            }
        });
        d.setOpened(true);
    }

}
