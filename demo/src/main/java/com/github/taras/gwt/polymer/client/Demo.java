package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.elements.CoreField;
import com.github.taras.gwt.polymer.elements.CoreLabel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        HTML desc = new HTML(
                "<h2>Look at the core-field element below. Try to type something.</h2>");

        RootPanel.get().clear();
        RootPanel.get().add(desc);

        CoreField coreField = new CoreField();
        coreField.getElement().setInnerHTML(
                "<label>I'm a label!</label>"
                        + "<input placeholder='I have a label' flex>");
        RootPanel.get().add(coreField);

        CoreLabel coreLabel1 = new CoreLabel();
        coreLabel1.getElement().setInnerHTML(
                "label next to checkbox<input for type=\"checkbox\">something");
        RootPanel.get().add(coreLabel1);

        RootPanel.get().add(new HTML("<core-label for=\"#quux\">" +
                "    label for checkbox" +
                "  </core-label>" +
                "  <input id=\"quux\" type=\"checkbox\">"));
    }
}
