package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.iron.element.event.IronSelectEvent;
import com.vaadin.polymer.paper.element.PaperTabElement;
import com.vaadin.polymer.paper.element.PaperTabsElement;
import com.vaadin.polymer.paper.element.PaperToastElement;

public class PaperTabsView extends Composite {
    interface PaperTabsViewUiBinder extends UiBinder<HTMLPanel, PaperTabsView> {
    }

    private static PaperTabsViewUiBinder ourUiBinder = GWT.create(PaperTabsViewUiBinder.class);

    @UiField
    PaperTabsElement paperTabs;
    @UiField
    PaperToastElement toast;

    public PaperTabsView() {

        initWidget(ourUiBinder.createAndBindUi(this));

        paperTabs.addEventListener(IronSelectEvent.NAME, new IronSelectEvent.Listener() {
            @Override
            public void handleEvent(IronSelectEvent event) {
                PaperTabElement tab = (PaperTabElement) event.getDetail().getItem();
                toast.setText("Tab \"" + tab.getTextContent() + "\" has been selected");
                toast.show();
            }
        });
    }
}
