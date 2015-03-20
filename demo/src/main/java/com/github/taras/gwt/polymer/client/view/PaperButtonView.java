package com.github.taras.gwt.polymer.client.view;

import com.github.taras.gwt.polymer.client.html.Event;
import com.github.taras.gwt.polymer.client.html.EventListener;
import com.github.taras.gwt.polymer.client.html.EventTarget;
import com.github.taras.gwt.polymer.client.html.HTMLElement;
import com.github.taras.gwt.polymer.client.interop.PaperButton;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PaperButtonView extends Composite {
    interface PaperButtonViewUiBinder extends
            UiBinder<HTMLPanel, PaperButtonView> {
    }

    private static PaperButtonViewUiBinder ourUiBinder = GWT
            .create(PaperButtonViewUiBinder.class);

    @UiField
    PaperButton flatColoredButton;

    public PaperButtonView() {
        initWidget(ourUiBinder.createAndBindUi(this));

        flatColoredButton.addEventListener("click", new EventListener() {
            @Override
            public void handleEvent(Event event) {
                HTMLElement target = (HTMLElement) event.target();
                consoleLog(target);
                Window.alert("You pressed the " + target.innerHTML() + "!");
            }
        });
    }

    native void consoleLog(EventTarget event) /*-{
        console.dir(event );
    }-*/;
}