package com.github.taras.gwt.polymer.client.sampler.paper;

import com.github.taras.gwt.polymer.client.widget.CoreMediaQuery;
import com.github.taras.gwt.polymer.client.widget.event.CoreMediaChangeEvent;
import com.github.taras.gwt.polymer.client.widget.event.CoreMediaChangeEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ToolbarSample extends Composite {
    interface ToolbarSampleUiBinder extends UiBinder<HTMLPanel, ToolbarSample> {
    }

    private static ToolbarSampleUiBinder ourUiBinder = GWT.create(ToolbarSampleUiBinder.class);
    @UiField
    CoreMediaQuery mediaQuery;

    public ToolbarSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        mediaQuery.addCoreMediaChangeHandler(new CoreMediaChangeEventHandler() {
            @Override
            public void onCoreMediaChange(CoreMediaChangeEvent event) {
                // TODO: investigate details of the CoreMediaChangeEvent
//                if (event.getNativeEvent().getDetail().)
            }
        });
    }
}