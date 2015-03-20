package com.github.taras.gwt.polymer.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PaperButtonView extends Composite {
    interface PaperButtonViewUiBinder extends UiBinder<HTMLPanel, PaperButtonView> {
    }

    private static PaperButtonViewUiBinder ourUiBinder = GWT.create(PaperButtonViewUiBinder.class);

    public PaperButtonView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}