package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.paper.element.PaperTabElement;
import com.vaadin.polymer.paper.widget.PaperTab;
import com.vaadin.polymer.paper.widget.PaperTabs;
import com.vaadin.polymer.paper.widget.PaperToast;

public class PaperTabsWidgetView extends Composite {
    interface PaperTabsWidgetUiBinder extends UiBinder<HTMLPanel, PaperTabsWidgetView> {
    }

    private static PaperTabsWidgetUiBinder ourUiBinder = GWT.create(PaperTabsWidgetUiBinder.class);

    @UiField
    PaperTabs tabs;
    @UiField
    PaperToast toast;

    public PaperTabsWidgetView() {
        initWidget(ourUiBinder.createAndBindUi(this));

        // wait until paper-toast has been loaded and initialized
        // TODO: get rid of timer
        (new Timer() {
            @Override
            public void run() {
                tabs.setSelected("0");
            }
        }).schedule(2000);

        PaperTab tab = new PaperTab("dynamically created item");
        tabs.add(tab);
    }

    @UiHandler("tabs")
    void onNameGotPressed(IronSelectEvent event) {
        PaperTabElement tab = (PaperTabElement) event.getItem();
        toast.setText("widget event handler:" + tab.getTextContent());
        toast.show();
    }
}
