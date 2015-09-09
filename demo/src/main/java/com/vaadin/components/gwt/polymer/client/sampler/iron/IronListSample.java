package com.vaadin.components.gwt.polymer.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.widget.IronAjax;
import com.vaadin.polymer.iron.widget.IronImage;
import com.vaadin.polymer.iron.widget.IronList;
import com.vaadin.polymer.response.widget.event.ResponseEvent;
import com.vaadin.polymer.response.widget.event.ResponseEventHandler;

public class IronListSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronListSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField
    IronAjax ajax;

    @UiField
    IronList list;

    public IronListSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        ajax.addResponseHandler(new ResponseEventHandler() {
            @Override
            public void onResponse(ResponseEvent event) {
                log(ajax.getLastResponse());
                list.setItems((JsArray) ajax.getLastResponse());
            }
        });
    }

    private native void log(Object o) /*-{
        $wnd.console.log(o);
    }-*/;
}
