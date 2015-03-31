package com.github.taras.gwt.polymer.client.sampler;

import com.github.taras.gwt.polymer.client.Polymer;
import com.github.taras.gwt.polymer.client.element.PaperTabElement;
import com.github.taras.gwt.polymer.client.element.PaperTabsElement;
import com.github.taras.gwt.polymer.client.element.PaperToastElement;
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
    PaperTabsElement paperTabs;
    @UiField
    PaperToastElement toast;

    public PaperTabsView() {
        Polymer.ensureHTMLImport("paper-tabs");
        Polymer.ensureHTMLImport("paper-toast");

        initWidget(ourUiBinder.createAndBindUi(this));
        
        paperTabs.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            public void handleEvent(CoreSelectEvent event) {
                PaperTabElement tab = (PaperTabElement) event.getDetail().item();
                toast.text("Tab \"" + tab.innerHTML() + "\" has been selected");
                toast.show();
            }
        });
    }
}