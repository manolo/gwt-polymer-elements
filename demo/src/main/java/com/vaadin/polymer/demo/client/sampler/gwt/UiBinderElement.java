package com.vaadin.polymer.demo.client.sampler.gwt;

import java.util.Arrays;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.iron.event.IronSelectEvent;
import com.vaadin.polymer.paper.PaperTabElement;
import com.vaadin.polymer.paper.PaperTabsElement;
import com.vaadin.polymer.paper.PaperToastElement;

public class UiBinderElement extends Widget {
    interface PaperTabsViewUiBinder extends UiBinder<DivElement, UiBinderElement> {}
    private static PaperTabsViewUiBinder ourUiBinder = GWT.create(PaperTabsViewUiBinder.class);

    @UiField PaperTabsElement paperTabs;
    @UiField PaperToastElement toast;

    public UiBinderElement() {
        setElement(ourUiBinder.createAndBindUi(this));

        // Since we are using pure elements in UiBinder, they are created via
        // DOM.createElement instead of Polymer.createElement, so we need to
        // import web components hrefs by hand, and continue the flow
        // asynchronously
        Polymer.importHref(Arrays.asList(PaperTabsElement.SRC, PaperTabElement.SRC), o -> {
            paperTabs.addEventListener(IronSelectEvent.NAME, new EventListener<IronSelectEvent>() {
                public void handleEvent(IronSelectEvent event) {
                    PaperTabElement tab = (PaperTabElement)event.getDetail().getItem();
                    toast.setText("Tab \"" + tab.getTextContent() + "\" has been selected");
                    toast.open();
                }
            });
            return null;
        });
    }
}
