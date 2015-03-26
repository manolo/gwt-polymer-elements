package com.github.taras.gwt.polymer.client.sampler;

import com.github.taras.gwt.polymer.client.widget.PaperTab;
import com.github.taras.gwt.polymer.client.widget.PaperTabs;
import com.github.taras.gwt.polymer.client.widget.PaperToast;
import com.github.taras.gwt.polymer.client.widget.event.CoreSelectEvent;
import com.github.taras.gwt.polymer.client.widget.event.CoreSelectEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

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
        
        tabs.setSelected(0);

        PaperTab tab = new PaperTab("dynamically created item");
        tabs.add(tab);
        
        tabs.addCoreSelectHandler(new CoreSelectEventHandler() {
            @Override
            public void onCoreSelect(CoreSelectEvent event) {
                toast.setText("widget event handler");
                toast.show();
            }
        });
    }
}