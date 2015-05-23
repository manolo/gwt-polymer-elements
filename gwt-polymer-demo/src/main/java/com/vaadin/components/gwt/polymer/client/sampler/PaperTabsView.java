package com.vaadin.components.gwt.polymer.client.sampler;

import static com.google.gwt.query.client.GQuery.console;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.element.PaperTabElement;
import com.vaadin.components.gwt.polymer.client.element.PaperTabsElement;
import com.vaadin.components.gwt.polymer.client.element.PaperToastElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;

public class PaperTabsView extends Composite {
    interface PaperTabsViewUiBinder extends UiBinder<HTMLPanel, PaperTabsView> {
    }

    private static PaperTabsViewUiBinder ourUiBinder = GWT.create(PaperTabsViewUiBinder.class);

    @UiField
    PaperTabsElement paperTabs;
    @UiField
    PaperToastElement toast;

    public PaperTabsView() {
        Polymer.ensureHTMLImport("paper-tabs");
        Polymer.ensureHTMLImport("paper-toast");

        initWidget(ourUiBinder.createAndBindUi(this));

        paperTabs.addEventListener(CoreSelectEvent.NAME, new EventListener<CoreSelectEvent>() {
            @Override
            public void handleEvent(CoreSelectEvent event) {
                PaperTabElement tab = (PaperTabElement) event.getDetail().getItem();
                toast.setText("Tab \"" + tab.getInnerHTML() + "\" has been selected");
                toast.show();
            }
        });
    }
}
