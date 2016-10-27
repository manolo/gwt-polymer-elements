package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.vaadin.polymer.vaadin.widget.VaadinDatePicker;
import com.vaadin.polymer.vaadin.widget.event.ValueChangedEvent;

public class VaadinDatePickerSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinDatePickerSample> {
    }
    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinDatePicker datePicker;

    public VaadinDatePickerSample() {
        initWidget(myUiBinder.createAndBindUi(this));
    }
    
    @UiHandler("datePicker")
    public void valueChanged(ValueChangedEvent e) {
    }
    
}
