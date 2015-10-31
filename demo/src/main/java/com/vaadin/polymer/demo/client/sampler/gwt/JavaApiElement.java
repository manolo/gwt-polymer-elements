package com.vaadin.polymer.demo.client.sampler.gwt;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.user.client.ui.FlowPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.element.PaperDialogElement;
import com.vaadin.polymer.paper.element.PaperIconButtonElement;

public class JavaApiElement extends FlowPanel {

    public JavaApiElement() {
        HeadingElement h2 = Document.get().createHElement(2);
        h2.setInnerText("Java API using Elements");
        this.getElement().appendChild(h2);

        PaperDialogElement dialog = Polymer.createElement(PaperDialogElement.TAG);
        dialog.setInnerHTML("<div>Welcome Polymer to GWT</div>");
        this.getElement().appendChild((Element)dialog);

        PaperIconButtonElement iconElem = Polymer.createElement(PaperIconButtonElement.TAG);
        iconElem.setIcon("open-in-browser");
        iconElem.setAttribute("title", "Click to say Hello");
        iconElem.addEventListener("click", new EventListener() {
            public void handleEvent(Event event) {
                dialog.open();
            }
        });
        this.getElement().appendChild((Element)iconElem);
    }
}
