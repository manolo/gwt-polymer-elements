package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.elements.CoreField;
import com.github.taras.gwt.polymer.client.elements.CoreLabel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().clear();
        HTML html = new HTML("<h2>Look at the core-field element below."
                + " Try to type something.</h2>");
        RootPanel.get().add(html);

        Element div = DOM.createDiv();

        CoreField coreField = Polymer.create("core-field");
        coreField.setInnerHTML("<label>I'm a label!</label>"
                + "<input placeholder='I have a label' flex>");
        div.appendChild(coreField);

        CoreLabel coreLabel1 = Polymer.create("core-label");
        coreLabel1.setInnerHTML("label next to checkbox"
                + "<input for type='checkbox'>something");
        div.appendChild(coreLabel1);
        div.appendChild(DOM.createElement("br"));

        CoreLabel coreLabel2 = Polymer.create("core-label");
        coreLabel2.setFor("#quux");
        coreLabel2.setInnerHTML("label for checkbox");
        div.appendChild(coreLabel2);

        Element inputCheck = DOM.createInputCheck();
        inputCheck.setId("quux");
        div.appendChild(inputCheck);

        RootPanel.get().getElement().appendChild(div);
    }
}
