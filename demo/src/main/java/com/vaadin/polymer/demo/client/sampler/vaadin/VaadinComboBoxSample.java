package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
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
import elemental2.core.Array;
import jsinterop.base.Js;

public class VaadinComboBoxSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinComboBoxSample> {
    }
    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinComboBox comboBox;
    @UiField VaadinComboBox comboBox2;
    @UiField IronAjax ironAjax;
    @UiField PaperToast toast;

    public static Array<Object> elements;

    public VaadinComboBoxSample() {
        initWidget(myUiBinder.createAndBindUi(this));

        ironAjax.addResponseHandler(event -> {
            elements = Js.cast(ironAjax.getLastResponse());
            comboBox.setItems(elements);
            comboBox2.setItems(elements);
            comboBox2.setValue("Bohrium");
        });
    }

    private void show(String message) {
        if (!message.isEmpty()) {
            toast.close();
            toast.setText("Value: " + message);
            toast.open();
        }
    }

    @UiHandler("comboBox")
    public void valueChanged(ValueChangedEvent e) {
        show(comboBox.getValue());
    }

    @UiHandler("comboBox2")
    public void valueChanged2(ValueChangedEvent e) {
        show(comboBox2.getValue());
    }
}
