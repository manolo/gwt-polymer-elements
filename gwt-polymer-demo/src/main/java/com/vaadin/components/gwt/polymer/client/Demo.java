package com.vaadin.components.gwt.polymer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.sampler.Sampler;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.ensureHTMLImport("paper-styles/paper-styles.html");
        Polymer.ensureHTMLImport("paper-styles/demo-pages.html");
        Polymer.ensureHTMLImport("iron-icons/iron-icons.html");
        
        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");
        Polymer.ensureHTMLImport("../paper/checkbox-sample-styles.html");
        
        Polymer.ensureHTMLImport("paper-dialog-scrollable/paper-dialog-scrollable.html");
        Polymer.ensureHTMLImport("neon-animation/neon-animations.html");
        Polymer.ensureHTMLImport("paper-dialog/paper-dialog.html");
        Polymer.ensureHTMLImport("../paper/dialog-sample-styles.html");

        Polymer.ensureHTMLImport("iron-icon/iron-icon.html");
        Polymer.ensureHTMLImport("iron-icons/iron-icons.html");
        Polymer.ensureHTMLImport("iron-icons/communication-icons.html");
        Polymer.ensureHTMLImport("paper-checkbox/paper-checkbox.html");
        Polymer.ensureHTMLImport("paper-toggle-button/paper-toggle-button.html");
        Polymer.ensureHTMLImport("paper-item/paper-icon-item.html");
        Polymer.ensureHTMLImport("paper-item/paper-item.html");
        Polymer.ensureHTMLImport("../paper/item-sample-styles.html");
        
        Polymer.ensureHTMLImport("paper-button/paper-button.html");
        
        Polymer.ensureHTMLImport("paper-drawer-panel/paper-drawer-panel.html");
        Polymer.ensureHTMLImport("../paper/drawer-panel-sample-styles.html");

        Polymer.ensureHTMLImport("paper-header-panel/paper-header-panel.html");
        Polymer.ensureHTMLImport("../paper/header-panel-sample-styles.html");

        Polymer.ensureHTMLImport("paper-icon-button/paper-icon-button.html");
        Polymer.ensureHTMLImport("paper-toolbar/paper-toolbar.html");
        Polymer.ensureHTMLImport("../paper/toolbar-sample-styles.html");
        
        Polymer.ensureHTMLImport("iron-collapse/iron-collapse.html");
        
        Polymer.ensureHTMLImport("iron-selector/iron-selector.html");
        
        Polymer.ensureTag("paper-toast");

        (new Timer() {
            @Override
            public void run() {
//                RootPanel.get().add(new ButtonSample());
//                RootPanel.get().add(new CheckboxSample());
//                RootPanel.get().add(new DialogSample());
//                RootPanel.get().add(new ItemSample());
//                RootPanel.get().add(new DrawerPanelSample());
//                RootPanel.get().add(new HeaderPanelSample());
//                RootPanel.get().add(new ToolbarSample());
//                RootPanel.get().add(new IronCollapseSample());
//                RootPanel.get().add(new IronSelectorSample());

                RootPanel.get().add(new Sampler());
            }
        }).schedule(500);


    }
}
