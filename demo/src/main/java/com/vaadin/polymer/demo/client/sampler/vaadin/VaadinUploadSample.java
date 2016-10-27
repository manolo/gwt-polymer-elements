package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.vaadin.widget.VaadinUpload;

public class VaadinUploadSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinUploadSample> {
    }
    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinUpload uploader;

    public VaadinUploadSample() {
        Polymer.importHref("vaadin-mock-xhr");

        initWidget(myUiBinder.createAndBindUi(this));
    }


}
