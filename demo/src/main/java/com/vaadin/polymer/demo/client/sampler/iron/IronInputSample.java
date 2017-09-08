package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.PolymerTemplate;
import com.vaadin.polymer.iron.IronInputElement;

import elemental2.dom.Element;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.NodeList;
import jsinterop.base.Js;

public class IronInputSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronInputSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField PolymerTemplate bindTemplate;

    // NOTE: @UiField on poly-filled browsers only works for the
    // top level template. In chrome everything works as expected though.
    // We will get references to these elements once they are in the dom.
    IronInputElement ironInput;
    HTMLInputElement input1;
    HTMLInputElement input2;

    public IronInputSample() {
        // We can import elements before we create the UIBinder instance
        Polymer.importHref(IronInputElement.SRC);

        initWidget(ourUiBinder.createAndBindUi(this));

        // Wait until the template has been rendered by polymer to query the dom.
        Polymer.ready(bindTemplate, o -> {
            NodeList<Element> inputs = Js.<PolymerElement>cast(getElement()).querySelectorAll("input");
            ironInput = (IronInputElement)inputs.item(0);
            input1 = (HTMLInputElement)inputs.item(1);
            input2 = (HTMLInputElement)inputs.item(2);
            return null;
        });

        // Bind functions to the template
        Polymer.function(bindTemplate, "function1", o -> {
            ironInput.setBindValue(input1.value);
            return null;
        });
        Polymer.function(bindTemplate, "function2", o -> {
            // TODO: casting because api-generator does not support extending
            // native elements yet, hence we cast to elemental2 input.
            Js.<HTMLInputElement>cast(ironInput).value = input2.value;
            return null;
        });
    }
}
