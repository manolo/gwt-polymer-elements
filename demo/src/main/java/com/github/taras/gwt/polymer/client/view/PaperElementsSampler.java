package com.github.taras.gwt.polymer.client.view;

import com.github.taras.gwt.polymer.client.element.CoreItem;
import com.github.taras.gwt.polymer.client.view.sampler.CheckboxSample;
import com.github.taras.gwt.polymer.client.widget.SamplerScaffold;
import com.github.taras.gwt.polymer.client.widget.event.CoreSelectEvent;
import com.github.taras.gwt.polymer.client.widget.event.CoreSelectEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PaperElementsSampler extends Composite {
    interface PaperElementsSamplerUiBinder extends UiBinder<HTMLPanel, PaperElementsSampler> {
    }

    private static PaperElementsSamplerUiBinder ourUiBinder = GWT.create(PaperElementsSamplerUiBinder.class);
    
    @UiField
    SamplerScaffold scaffold;

    public PaperElementsSampler() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        scaffold.addCoreSelectHandler(new CoreSelectEventHandler() {
            @Override
            public void onCoreSelect(CoreSelectEvent event) {
//                GWT.log("tada");
//                if (event.isSelected()) {
                    CoreItem item = (CoreItem) event.getItem();
//                String tag = item.getAttribute("tag");
//                GWT.log(new Button("eeee").toString());
                if ("Checkbox".equals(item.getAttribute("label"))) {
                    scaffold.setContent(new CheckboxSample().toString());
                } else {
                    scaffold.setContent(new Button("eeee").toString());
                }
//                }
            }
        });
    }
}