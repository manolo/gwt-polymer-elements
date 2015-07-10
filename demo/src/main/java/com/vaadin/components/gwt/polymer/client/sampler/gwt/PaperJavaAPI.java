package com.vaadin.components.gwt.polymer.client.sampler.gwt;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.element.PaperIconButtonElement;
import com.vaadin.polymer.paper.widget.PaperIconButton;

public class PaperJavaAPI extends FlowPanel {

    public PaperJavaAPI() {
        Label label = new Label("Buttons created with Paper Java API");
        label.getElement().getStyle().setFontSize(1.5, Unit.EM);
        label.getElement().getStyle().setFontWeight(FontWeight.BOLD);
        this.add(label);

        // GWT Element API
        PaperIconButtonElement iconElem = Polymer.createElement(PaperIconButtonElement.TAG);
        iconElem.setIcon("polymer");
        iconElem.setAttribute("title", "Click to say Hello");
        iconElem.addEventListener("click", new EventListener() {
            public void handleEvent(Event event) {
                Window.alert("Hi");
            }
        });
        this.getElement().appendChild((Element)iconElem);

        // GWT Widget API
        PaperIconButton iconWidget = new PaperIconButton();
        iconWidget.setIcon("language");
        iconWidget.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                Window.alert("Hi");
            }
        });
        this.add(iconWidget);
    }
}
