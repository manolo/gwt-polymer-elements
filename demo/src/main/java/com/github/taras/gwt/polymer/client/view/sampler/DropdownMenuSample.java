package com.github.taras.gwt.polymer.client.view.sampler;

import com.github.taras.gwt.polymer.client.widget.CoreCollapse;
import com.github.taras.gwt.polymer.client.widget.CoreMenu;
import com.github.taras.gwt.polymer.client.widget.CoreOverlay;
import com.github.taras.gwt.polymer.client.widget.PaperItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class DropdownMenuSample extends Composite {
    interface DropdownMenuSampleUiBinder extends
            UiBinder<HTMLPanel, DropdownMenuSample> {
    }

    private static DropdownMenuSampleUiBinder ourUiBinder = GWT
            .create(DropdownMenuSampleUiBinder.class);

    private static String[] pastries = { "Apple fritter", "Croissant", "Donut",
            "Financier", "Jello", "Madeleine", "Pound cake", "Pretzel",
            "Sfogliatelle"
    };

    @UiField CoreMenu menu0;
    @UiField CoreMenu menu1;
    @UiField CoreMenu menu2;
    @UiField CoreMenu menu3;
    @UiField CoreMenu menu4;
    @UiField Button button1;
    @UiField CoreOverlay overlay;
    @UiField Button button2;
    @UiField CoreCollapse collapse;

    public DropdownMenuSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        for (String pastry : pastries) {
            menu0.add(new PaperItem(pastry));
            menu1.add(new PaperItem(pastry));
            menu2.add(new PaperItem(pastry));
            menu3.add(new PaperItem(pastry));
            menu4.add(new PaperItem(pastry));
        }
        
        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                overlay.toggle();
            }
        });

        button2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse.toggle();
            }
        });
    }
}