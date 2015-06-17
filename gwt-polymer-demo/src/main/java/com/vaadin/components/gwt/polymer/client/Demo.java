package com.vaadin.components.gwt.polymer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.sampler.Sampler;
import com.vaadin.polymer.Polymer;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.ensureHTMLImport("paper-styles/paper-styles.html");
        Polymer.ensureHTMLImport("paper-styles/demo-pages.html");
        Polymer.ensureHTMLImport("iron-icons/iron-icons.html");

        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");

        Polymer.ensureHTMLImport("paper-dialog-scrollable/paper-dialog-scrollable.html");
        Polymer.ensureHTMLImport("neon-animation/neon-animations.html");
        Polymer.ensureHTMLImport("paper-dialog/paper-dialog.html");

        Polymer.ensureHTMLImport("iron-icon/iron-icon.html");
        Polymer.ensureHTMLImport("iron-icons/iron-icons.html");
        Polymer.ensureHTMLImport("iron-icons/communication-icons.html");
        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");
        Polymer.ensureHTMLImport("paper-toggle-button/paper-toggle-button.html");
        Polymer.ensureHTMLImport("paper-item/paper-icon-item.html");
        Polymer.ensureHTMLImport("paper-item/paper-item.html");

        Polymer.ensureHTMLImport("paper-button/paper-button.html");

        Polymer.ensureHTMLImport("paper-drawer-panel/paper-drawer-panel.html");

        Polymer.ensureHTMLImport("paper-header-panel/paper-header-panel.html");

        Polymer.ensureHTMLImport("paper-icon-button/paper-icon-button.html");
        Polymer.ensureHTMLImport("paper-toolbar/paper-toolbar.html");

        Polymer.ensureHTMLImport("iron-collapse/iron-collapse.html");

        Polymer.ensureHTMLImport("iron-selector/iron-selector.html");

        Polymer.ensureTag("paper-toast");

        Polymer.ensureHTMLImport("paper-fab/paper-fab.html");

        Polymer.ensureHTMLImport("paper-icon-button/paper-icon-button.html");

        Polymer.ensureHTMLImport("paper-input/paper-input.html");
        Polymer.ensureHTMLImport("paper-input/paper-textarea.html");

        Polymer.ensureHTMLImport("paper-styles/typography.html");
        Polymer.ensureHTMLImport("paper-material/paper-material.html");

        Polymer.ensureHTMLImport("paper-spinner/paper-spinner.html");

        Polymer.ensureHTMLImport("paper-menu/paper-menu.html");

        Polymer.ensureHTMLImport("../paper/progress-sample-styles.html");
        Polymer.ensureHTMLImport("paper-progress/paper-progress.html");

        Polymer.ensureHTMLImport("paper-radio-button/paper-radio-button.html");
        
        Polymer.ensureHTMLImport("paper-radio-group/paper-radio-group.html");

        Polymer.ensureHTMLImport("paper-ripple/paper-ripple.html");

        Polymer.ensureHTMLImport("paper-slider/paper-slider.html");

        (new Timer() {
            @Override
            public void run() {
                RootPanel.get().add(new Sampler());
            }
        }).schedule(2000);
    }
}
