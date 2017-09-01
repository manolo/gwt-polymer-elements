package com.vaadin.polymer.demo.client.sampler.gwt;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.user.client.ui.FlowPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.paper.PaperDialogElement;
import com.vaadin.polymer.paper.PaperFabElement;

import elemental2.dom.Event;
import elemental2.dom.EventListener;

public class JavaApiElement extends FlowPanel {

    public JavaApiElement() {
        HeadingElement h2 = Document.get().createHElement(2);
        h2.setInnerText("Java API using Elements");
        this.getElement().appendChild(h2);

        PaperDialogElement dialog = Polymer.createElement(PaperDialogElement.TAG);
        dialog.innerHTML = "<div>Welcome Polymer to GWT</div>";
        dialog.setEntryAnimation("scale-up-animation");
        this.getElement().appendChild(dialog.cast());

        PaperFabElement iconElem = Polymer.createElement(PaperFabElement.TAG);
        iconElem.setIcon("open-in-browser");
        iconElem.setAttribute("title", "Click to say Hello");
        iconElem.addEventListener("click", new EventListener() {
            public void handleEvent(Event event) {
                dialog.open();
            }
        });

        this.getElement().appendChild(iconElem.cast());
    }
}
