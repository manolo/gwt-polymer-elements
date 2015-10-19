package com.vaadin.polymer.demo.client.sampler.paper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperItem;
import com.vaadin.polymer.paper.widget.PaperMenu;
import com.vaadin.polymer.paper.widget.PaperTab;
import com.vaadin.polymer.paper.widget.PaperTabs;

public class DropdownMenuSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, DropdownMenuSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    private static String[] letters = { "alpha", "beta", "gamma", "delta",
            "epsilon" };

    private static String[] dinosaurs = { "allosaurus", "brontosaurus",
            "carcharodontosaurus", "diplodocus", "ekrixinatosaurus",
            "fukuiraptor", "gallimimus", "hadrosaurus", "iguanodon",
            "jainosaurus", "kritosaurus", "liaoceratops", "megalosaurus",
            "nemegtosaurus", "ornithomimus", "protoceratops", "quetecsaurus",
            "rajasaurus", "stegosaurus", "triceratops", "utahraptor",
            "vulcanodon", "wannanosaurus", "xenoceratops", "yandusaurus",
            "zephyrosaurus" };

    @UiField PaperMenu menu1;
    @UiField PaperMenu menu2;
    @UiField PaperMenu menu3;
    @UiField PaperTabs tabs1;
    @UiField PaperMenu menu4;
    @UiField PaperMenu menu5;

    public DropdownMenuSample() {
        initWidget(ourUiBinder.createAndBindUi(this));

        for (String dinosaur : dinosaurs) {
            menu1.add(new PaperItem(dinosaur));
            menu2.add(new PaperItem(dinosaur));
            menu5.add(new PaperItem(dinosaur));
        }

        for (String letter : letters) {
            menu3.add(new PaperItem(letter));
            tabs1.add(new PaperTab(letter));
            menu4.add(new PaperItem(letter));
        }
    }
}
