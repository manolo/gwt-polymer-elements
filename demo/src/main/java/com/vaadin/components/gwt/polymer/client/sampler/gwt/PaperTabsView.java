package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
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
        Polymer.ensureTag("paper-tabs");
        Polymer.ensureTag("paper-toast");

        initWidget(ourUiBinder.createAndBindUi(this));

        // TODO: fix using iron-select event which is not supported yet
//        paperTabs.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
//            @Override
//            public void handleEvent(CoreSelectEvent event) {
//                PaperTabElement tab = (PaperTabElement) event.getDetail().getItem();
//                toast.setText("Tab \"" + tab.getInnerHTML() + "\" has been selected");
//                toast.show();
//            }
//        });
    }
}
