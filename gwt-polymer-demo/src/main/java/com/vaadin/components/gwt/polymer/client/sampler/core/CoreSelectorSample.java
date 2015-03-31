package com.vaadin.components.gwt.polymer.client.sampler.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.FormElement;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.widget.CoreSelector;
import com.vaadin.components.gwt.polymer.client.widget.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.widget.event.CoreSelectEventHandler;

public class CoreSelectorSample extends Composite {
    interface CoreSelectorSampleUiBinder extends UiBinder<HTMLPanel, CoreSelectorSample> {
    }

    private static CoreSelectorSampleUiBinder ourUiBinder = GWT.create(CoreSelectorSampleUiBinder.class);
    
    @UiField
    CoreSelector multiSelector;
    @UiField
    CoreSelector listSelector;
    @UiField
    UListElement list;
    @UiField
    CoreSelector radioSelector;
    @UiField
    FormElement myForm;
    @UiField
    Element em;

    public CoreSelectorSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
        
        multiSelector.getPolymerElement().selected(new int[]{1, 3});

        listSelector.getPolymerElement().target(list);
        
        radioSelector.getPolymerElement().target(myForm);
        radioSelector.addCoreSelectHandler(new CoreSelectEventHandler() {
            @Override
            public void onCoreSelect(CoreSelectEvent event) {
                consoleLog(radioSelector.getSelected());
            }
        });
    }

    native void consoleLog( Object message) /*-{
      console.log(message);
    }-*/;
}