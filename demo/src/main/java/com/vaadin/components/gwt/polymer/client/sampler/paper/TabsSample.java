package com.vaadin.components.gwt.polymer.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;

public class TabsSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, TabsSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    public TabsSample() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        fixTabsSelection();
    }

    // A temporary workaround to fix the underline tab issue
    // Not a solution.
    private native void fixTabsSelection() /*-{

      setTimeout(function(){

        [].forEach.call($doc.querySelectorAll("paper-tabs"), function(tabs) {
          tabs._onResize();
        });
      }, 3000);
    }-*/;
}
