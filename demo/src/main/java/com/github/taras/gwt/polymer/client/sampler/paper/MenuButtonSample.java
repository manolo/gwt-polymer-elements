package com.github.taras.gwt.polymer.client.sampler.paper;

import com.github.taras.gwt.polymer.client.widget.CoreCollapse;
import com.github.taras.gwt.polymer.client.widget.CoreMenu;
import com.github.taras.gwt.polymer.client.widget.PaperItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MenuButtonSample extends Composite {
    interface MenuButtonSampleUiBinder extends UiBinder<HTMLPanel, MenuButtonSample> {
    }

    private static MenuButtonSampleUiBinder ourUiBinder = GWT.create(MenuButtonSampleUiBinder.class);

    private static String[] pastries = { "Apple fritter", "Croissant", "Donut",
            "Financier", "Jello", "Madeleine", "Pound cake", "Pretzel",
            "Sfogliatelle"
    };
    
    @UiField CoreMenu menu1;
    @UiField CoreMenu menu2;
    @UiField CoreMenu menu3;
    @UiField CoreMenu menu4;
    @UiField CoreMenu menu5;
    @UiField CoreMenu menu6;
    @UiField Button button1;
    @UiField CoreCollapse collapse;

    public MenuButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        for (String pastry : pastries) {
            menu1.add(new PaperItem(pastry));
            menu2.add(new PaperItem(pastry));
            menu3.add(new PaperItem(pastry));
            menu4.add(new PaperItem(pastry));
            menu5.add(new PaperItem(pastry));
            menu6.add(new PaperItem(pastry));
        }

        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse.toggle();
            }
        });
    }
}