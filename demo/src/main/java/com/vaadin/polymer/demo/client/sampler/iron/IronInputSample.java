package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.elemental.Template;
import com.vaadin.polymer.iron.IronInputElement;

import elemental2.dom.NodeList;

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
        Polymer.ready(bindTemplate, o -> {
            NodeList inputs = PolymerElement.as(getElement()).querySelectorAll("input");
            ironInput = ((PolymerElement)inputs.item(0)).cast();
            input1 = ((PolymerElement)inputs.item(1)).cast();
            input2 = ((PolymerElement)inputs.item(2)).cast();
            return null;
        });

        // Bind functions to the template
        Polymer.function(bindTemplate, "function1", o -> {
            ironInput.setBindValue(input1.getValue());
            return null;
        });
        Polymer.function(bindTemplate, "function2", o -> {
            // TODO: casting because api-generator does not support extending
            // native elements yet, hence we use gwt input.value instead.
            ironInput.<InputElement>cast().setValue(input2.getValue());
            return null;
        });
    }
}
