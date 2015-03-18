package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.CoreField;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    private CoreField coreField = new CoreField();

    public void onModuleLoad() {
        HTML desc = new HTML(
                "<h2>Look at the core-field element below. Try to type something.</h2>");

        RootPanel.get().clear();
        RootPanel.get().add(desc);

        coreField.getElement().setInnerHTML(
                "<label>I'm a label!</label>"
                        + "<input placeholder='I have a label' flex>");
        RootPanel.get().add(coreField);
    }
}
