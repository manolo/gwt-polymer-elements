package com.vaadin.polymer.demo.client.sampler.gwt;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.vaadin.polymer.paper.widget.PaperDialog;
import com.vaadin.polymer.paper.widget.PaperFab;
import com.vaadin.polymer.paper.widget.PaperMaterial;

public class JavaApiWidget extends FlowPanel {

    public JavaApiWidget() {


        PaperMaterial main = new PaperMaterial("<h2>Java API using Widgets</h2>");
        main.setElevation("4");
        main.setSize("80%", "150px");
        main.getElement().getStyle().setPadding(30, Unit.PX);

        this.add(main);

        PaperDialog dialog = new PaperDialog();
        dialog.setSize("400px", "100px");
        dialog.setEntryAnimation("slide-down-animation");
        dialog.setExitAnimation("slide-up-animation");
        dialog.add(new Label("Welcome Polymer to GWT"));
        this.add(dialog);

        PaperFab button = new PaperFab();
        button.setIcon("open-in-browser");
        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                dialog.open();
            }
        });
        main.add(button);
    }
}
