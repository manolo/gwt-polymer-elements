package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.vaadin.polymer.iron.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.IronSelector;
import com.vaadin.polymer.paper.widget.PaperToast;

public class IronSelectorSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronSelectorSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField IronSelector selector1;
    @UiField IronSelector selector2;
    @UiField IronSelector selector3;
    @UiField PaperToast toast;

    public IronSelectorSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        selector1.addIronSelectHandler(e -> {
            Element elem = e.getItem().cast();
            show(elem.getInnerText());
        });

        selector2.getPolymerElement().addEventListener(IronSelectEvent.NAME, e -> {
            JsArrayString selected = selector2.getSelectedValues().cast();
            String s = "";
            for (int i = 0; i < selected.length(); i++) {
                s += selected.get(i) + " ";
            }
            show(s);
        });

        selector3.getPolymerElement().addEventListener(IronSelectEvent.NAME, e -> {
            show((String)selector3.getSelected());
        });

    }

    private void show(String message) {
        if (!message.isEmpty()) {
            toast.close();
            toast.setText("Value: " + message);
            toast.open();
        }
    }
}
