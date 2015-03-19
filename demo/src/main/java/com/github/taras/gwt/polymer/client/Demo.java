package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.elements.CoreField;
import com.github.taras.gwt.polymer.elements.CoreLabel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().clear();
        RootPanel.get().add(new HTML(
                "<h2>Look at the core-field element below. Try to type something.</h2>"));

        VerticalPanel panel = new VerticalPanel();
        
        CoreField coreField = new CoreField();
        coreField.getElement().setInnerHTML(
                "<label>I'm a label!</label>"
                        + "<input placeholder='I have a label' flex>");
        panel.add(coreField);

        CoreLabel coreLabel1 = new CoreLabel();
        coreLabel1.getElement().setInnerHTML(
                "label next to checkbox<input for type=\"checkbox\">something");
        panel.add(coreLabel1);

        CoreLabel coreLabel2 = new CoreLabel();
        coreLabel2.getElement().setAttribute("for", "#quux");
        coreLabel2.getElement().setInnerHTML(
                "label for checkbox");
        panel.add(coreLabel2);

        Element inputCheck = DOM.createInputCheck();
        inputCheck.setId("quux");
        panel.getElement().appendChild(inputCheck);

        RootPanel.get().add(panel);
    }
}
