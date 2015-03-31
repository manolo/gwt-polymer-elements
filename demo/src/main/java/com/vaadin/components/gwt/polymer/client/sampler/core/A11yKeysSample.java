package com.vaadin.components.gwt.polymer.client.sampler.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.PreElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.widget.CoreA11yKeys;
import com.vaadin.components.gwt.polymer.client.widget.event.KeysPressedEvent;
import com.vaadin.components.gwt.polymer.client.widget.event.KeysPressedEventHandler;

public class A11yKeysSample extends Composite {
    interface A11yKeysSampleUiBinder extends UiBinder<HTMLPanel, A11yKeysSample> {
    }

    private static A11yKeysSampleUiBinder ourUiBinder = GWT.create(A11yKeysSampleUiBinder.class);

    private String keys = "* pageup pagedown left right down up shift+a alt+a home end space enter";
    
    @UiField
    Element label;
    @UiField
    CoreA11yKeys a11y;
    @UiField
    PreElement output;

    public A11yKeysSample() {
        Polymer.ensureHTMLImport("core-a11y-keys");
        initWidget(ourUiBinder.createAndBindUi(this));
        
        label.setInnerText(keys);
        // TODO: set target directly
        a11y.getElement().setPropertyObject("target", RootPanel.getBodyElement());
//        a11y.setTarget(RootPanel.getBodyElement());
        a11y.setKeys(keys);

        a11y.addKeysPressedHandler(new KeysPressedEventHandler() {
            @Override
            public void onKeysPressed(KeysPressedEvent event) {
                output.setInnerText(output.getInnerText() + event.getKey() + "\n");
            }
        });
    }
}