package com.github.taras.gwt.polymer.client.view;

import com.github.taras.gwt.polymer.client.Polymer;
import com.github.taras.gwt.polymer.client.element.PaperTab;
import com.github.taras.gwt.polymer.client.element.PaperTabs;
import com.github.taras.gwt.polymer.client.element.PaperToast;
import com.github.taras.gwt.polymer.client.element.event.CoreSelectEvent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PaperTabsView extends Composite {
    interface PaperTabsViewUiBinder extends UiBinder<HTMLPanel, PaperTabsView> {
    }

    private static PaperTabsViewUiBinder ourUiBinder = GWT.create(PaperTabsViewUiBinder.class);

    @UiField
    PaperTabs paperTabs;
    @UiField
    PaperToast toast;

    public PaperTabsView() {
        Polymer.ensureHTMLImport("paper-tabs");
        Polymer.ensureHTMLImport("paper-toast");

        initWidget(ourUiBinder.createAndBindUi(this));
        
        paperTabs.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            public void handleEvent(CoreSelectEvent event) {
                PaperTab tab = (PaperTab) event.getDetail().item();
                toast.text("Tab \"" + tab.innerHTML() + "\" has been selected");
                toast.show();
            }
        });
    }
}