package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.vaadin.polymer.paper.widget.PaperDialog;
import com.vaadin.polymer.paper.widget.PaperIconButton;

public class JavaApiWidget extends FlowPanel {

    public JavaApiWidget() {
        
        HTMLPanel h2 = new HTMLPanel("h2", "Java API using Widgets");
        this.add(h2);
        
        PaperDialog dialog = new PaperDialog();
        dialog.add(new Label("Welcome Polymer to GWT"));
        this.add(dialog);

        PaperIconButton iconWidget = new PaperIconButton();
        iconWidget.setIcon("open-in-browser");
        iconWidget.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                dialog.open();
            }
        });
        this.add(iconWidget);
    }
}
