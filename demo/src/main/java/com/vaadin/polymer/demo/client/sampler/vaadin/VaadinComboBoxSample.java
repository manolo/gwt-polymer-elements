package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.widget.IronAjax;
import com.vaadin.polymer.paper.widget.PaperToast;
import com.vaadin.polymer.vaadin.widget.VaadinComboBox;
import com.vaadin.polymer.vaadin.widget.event.ValueChangedEvent;

public class VaadinComboBoxSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinComboBoxSample> {
    }
    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinComboBox comboBox;
    @UiField IronAjax ironAjax;
    @UiField PaperToast toast;

    public static JsArray<?> elements;

    public VaadinComboBoxSample() {
        initWidget(myUiBinder.createAndBindUi(this));

        ironAjax.addResponseHandler(event -> {
            elements = ironAjax.getLastResponse().cast();
            comboBox.setItems(elements);
        });
    }

    @UiHandler("comboBox")
    public void valueChanged(ValueChangedEvent e) {
        if (!comboBox.getValue().isEmpty()) {
            toast.close();
            toast.setText("Value Changed: " + comboBox.getValue());
            toast.open();
        }
    }
}
