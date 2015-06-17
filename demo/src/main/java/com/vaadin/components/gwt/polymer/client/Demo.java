package com.vaadin.components.gwt.polymer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.sampler.Sampler;
import com.vaadin.polymer.Polymer;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.ensureTag(null, "paper-styles/paper-styles.html");
        Polymer.ensureTag(null, "paper-styles/demo-pages.html");
        Polymer.ensureTag(null, "iron-icons/iron-icons.html");

        (new Timer() {
            @Override
            public void run() {
                RootPanel.get().add(new Sampler());
            }
        }).schedule(2000);
    }
}
