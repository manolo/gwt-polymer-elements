package com.vaadin.components.gwt.polymer.client;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.components.gwt.polymer.client.sampler.iron.IronCollapseSample;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        // Although gwt-polymer-elements takes care of dynamic loading of components
        // if they are created using Polymer.createElement or Polymer Widgets,
        // there are certain features which must be loaded previously to start
        // the application. Hence you have to add import tags to your host page or
        // import those additional features dynamically, in this case it might be
        // necessary to wait until the components are ready.
        // The `Polymer` utility class provide a set of methods for facilitating it,
        // you can pass tag-names for standard component locations (tag-name/tag-name.html)
        // or relative urls otherwise. Also you can pass success and error call-backs.

        // Paper applications must always import paper-styles
        Polymer.importHref("paper-styles");

        // Styles for paper examples
        Polymer.importHref("paper-styles/demo-pages.html");

        // Icon sets must be loaded before using any component depending on them
        // Iron comes with the collections:
        // communication, device, editor, hardware, image, iron, maps, notifications, social.
        Polymer.importHref(Arrays.asList(
                "iron-icons/iron-icons.html",
                "iron-icons/communication-icons.html"
                ), new Function() {
            public Object call(Object arg) {
                // The app is executed when all imports succeed.
                RootPanel.get().add(new IronCollapseSample());
                return null;
            }
        });
    }
}
