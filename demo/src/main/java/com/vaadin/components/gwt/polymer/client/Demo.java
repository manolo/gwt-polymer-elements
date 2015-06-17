package com.vaadin.components.gwt.polymer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.sampler.Sampler;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.importHref("paper-styles/paper-styles.html");
        Polymer.importHref("paper-styles/demo-pages.html");
        Polymer.importHref("iron-icons/iron-icons.html", new Function() {
            public Object call(Object arg) {
                RootPanel.get().add(new Sampler());
                return null;
            }
        });
    }
}
