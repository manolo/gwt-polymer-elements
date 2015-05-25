package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.element.PaperIconButtonElement;
import com.vaadin.components.gwt.polymer.client.webapi.Event;
import com.vaadin.components.gwt.polymer.client.webapi.EventListener;
import com.vaadin.components.gwt.polymer.client.widget.PaperIconButton;

public class PaperJavaAPI extends FlowPanel {

    public PaperJavaAPI() {

        this.getElement().getStyle().setPadding(20, Unit.PX);
        Label label = new Label("Buttons created with Paper Java API");
        label.getElement().getStyle().setFontSize(20, Unit.PX);
        this.add(label);

        // GWT Element API
        PaperIconButtonElement iconElem = Polymer.createElement(PaperIconButtonElement.TAG);
        iconElem.setIcon("polymer");
        iconElem.setAttribute("title", "huge");
        iconElem.addEventListener("click", new EventListener() {
            public void handleEvent(Event event) {
                Window.alert("Hi");
            }
        });
        this.getElement().appendChild((Element)iconElem);

        // GWT Widget API
        PaperIconButton iconWidget = new PaperIconButton("");
        iconWidget.setIcon("language");
        iconWidget.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                Window.alert("Hi");
            }
        });
        this.add(iconWidget);
    }
}
