package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.elemental.Template;
import com.vaadin.polymer.iron.IronInputElement;

public class IronInputSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronInputSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);
    
    @UiField Template bindTemplate;
    @UiField IronInputElement ironInput;
    @UiField InputElement input1;
    @UiField InputElement input2;

    public IronInputSample() {
        Polymer.importHref(IronInputElement.SRC);

        initWidget(ourUiBinder.createAndBindUi(this));
        
        Polymer.property(bindTemplate, "function1",
                (Function<?,?>) e -> {
                    ironInput.setBindValue(input1.getValue());
                    return null;
                });

        Polymer.property(bindTemplate, "function2",
                (Function<?,?>) e -> {
                    // TODO: casting because api-generator does not support extends and
                    // input.value is not wrapped
                    ((InputElement)ironInput).setValue(input2.getValue());
                    return null;
                });
    }
}
