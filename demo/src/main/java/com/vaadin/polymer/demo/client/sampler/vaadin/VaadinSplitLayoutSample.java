package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class VaadinSplitLayoutSample extends Composite {
    


    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinSplitLayoutSample> {
    }
    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    public VaadinSplitLayoutSample() {
        initWidget(myUiBinder.createAndBindUi(this));
        
    }
    
    
}
