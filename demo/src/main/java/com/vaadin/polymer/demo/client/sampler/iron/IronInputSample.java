package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.elemental.NodeList;
import com.vaadin.polymer.elemental.Template;
import com.vaadin.polymer.iron.IronInputElement;

public class IronInputSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronInputSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField Template bindTemplate;

    // NOTE: @UiField on poly-filled browsers only works for the
    // top level template. In chrome everything works as expected though.
    // We will get references to these elements once they are in the dom.
    IronInputElement ironInput;
    InputElement input1;
    InputElement input2;

    public IronInputSample() {
        // We can import elements before we create the UIBinder instance
        Polymer.importHref(IronInputElement.SRC);

        initWidget(ourUiBinder.createAndBindUi(this));

        // Wait until the template has been rendered by polymer to query the dom.
        Polymer.whenReady(o -> {
            NodeList inputs = ((HTMLElement)getElement()).querySelectorAll("input");
            ironInput = inputs.item(0);
            input1 = inputs.item(1);
            input2 = inputs.item(2);
            return null;
        });

        // Bind functions to the template
        Polymer.property(bindTemplate, "function1",
            (Function<?,?>) e -> {
                ironInput.setBindValue(input1.getValue());
                return null;
            });
        Polymer.property(bindTemplate, "function2",
            (Function<?,?>) e -> {
                // TODO: casting because api-generator does not support extending
                // native elements yet, hence we use gwt input.value instead.
                ((InputElement)ironInput).setValue(input2.getValue());
                return null;
            });
    }
}
