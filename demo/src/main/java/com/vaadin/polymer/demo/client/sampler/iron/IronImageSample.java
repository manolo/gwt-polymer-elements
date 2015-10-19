package com.vaadin.polymer.demo.client.sampler.iron;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.iron.widget.IronCollapse;
import com.vaadin.polymer.iron.widget.IronImage;
import com.vaadin.polymer.paper.element.PaperMaterialElement;
import com.vaadin.polymer.paper.widget.PaperButton;

public class IronImageSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, IronImageSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField
    Button button1a;
    @UiField
    IronImage image1a;
    @UiField
    Button button1b;
    @UiField
    IronImage image1b;
    @UiField
    Button button1c;
    @UiField
    IronImage image1c;

    @UiField
    Button button3a;
    @UiField
    IronImage image3a;
    @UiField
    Button button3b;
    @UiField
    IronImage image3b;
    @UiField
    Button button3c;
    @UiField
    IronImage image3c;

    @UiField
    Button button3aFade;
    @UiField
    IronImage image3aFade;
    @UiField
    Button button3bFade;
    @UiField
    IronImage image3bFade;
    @UiField
    Button button3cFade;
    @UiField
    IronImage image3cFade;

    public IronImageSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        button1a.addClickHandler(event -> onButtonClick(button1a, image1a));
        button1b.addClickHandler(event -> onButtonClick(button1b, image1b));
        button1c.addClickHandler(event -> onButtonClick(button1c, image1c));

        button3a.addClickHandler(event -> onButtonClick(button3a, image3a));
        button3b.addClickHandler(event -> onButtonClick(button3b, image3b));
        button3c.addClickHandler(event -> onButtonClick(button3c, image3c));

        button3aFade.addClickHandler(event -> onButtonClick(button3aFade, image3aFade));
        button3bFade.addClickHandler(event -> onButtonClick(button3bFade, image3bFade));
        button3cFade.addClickHandler(event -> onButtonClick(button3cFade, image3cFade));
    }

    private void onButtonClick(Button button, IronImage image) {
        image.setSrc("gwtPolymerDemo/polymer.svg?" + Math.random());
        button.setText("Reload image");
    }
}
