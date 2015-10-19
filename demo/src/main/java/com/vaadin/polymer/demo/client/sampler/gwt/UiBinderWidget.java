package com.vaadin.polymer.demo.client.sampler.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.paper.element.PaperTabElement;
import com.vaadin.polymer.paper.widget.PaperTab;
import com.vaadin.polymer.paper.widget.PaperTabs;
import com.vaadin.polymer.paper.widget.PaperToast;

public class UiBinderWidget extends Composite {
    interface PaperTabsWidgetUiBinder extends UiBinder<HTMLPanel, UiBinderWidget> {
    }

    private static PaperTabsWidgetUiBinder ourUiBinder = GWT.create(PaperTabsWidgetUiBinder.class);

    @UiField PaperTabs tabs;
    @UiField PaperToast toast;
    @UiField Button button1;
    @UiField Button button2;

    public UiBinderWidget() {
        initWidget(ourUiBinder.createAndBindUi(this));

        PaperTab tab = new PaperTab("dynamically created item");
        tabs.add(tab);

        // wait until toast has been loaded and initialized
        toast.ready((o) -> {
            tabs.setSelected("0");
            return null;
        });
    }

    @UiHandler("tabs")
    void tabSelected(IronSelectEvent event) {
        PaperTabElement tab = (PaperTabElement) event.getItem();
        toast.setText("widget event handler:" + tab.getTextContent());
        toast.show();
    }

    @UiHandler({"button1", "button2"})
    void buttonClicked(ClickEvent event) {
        toast.setText("widget event handler:" + ((Button)event.getSource()).getElement().getInnerText());
        toast.show();
    }
}
