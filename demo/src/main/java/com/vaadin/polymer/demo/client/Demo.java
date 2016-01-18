package com.vaadin.polymer.demo.client;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.Polymer;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        Polymer.startLoading();

        // Although gwt-polymer-elements takes care of dynamic loading of components
        // when they are created using Polymer.createElement or we use Polymer Widgets,
        // there are certain features which must be loaded previously to start
        // the application. Hence you have to add import tags to your host page or
        // import them dynamically, in this case it might be necessary to wait until
        // the components are ready.

        // The `Polymer` utility class provide a set of methods for facilitating it,
        // you can pass tag-names for standard component locations (tag-name/tag-name.html)
        // or relative urls otherwise.
        Polymer.importHref(Arrays.asList(
                // Paper applications must always import paper-styles
                "paper-styles",
                // Styles for paper examples
                "paper-styles/demo-pages.html",
                // Iconsets must be loaded before using any component depending on them.
                // We load all Iron and Vaadin collections.
                "iron-icons",
                "iron-icons/communication-icons.html",
                "iron-icons/av-icons.html",
                "iron-icons/device-icons.html",
                "iron-icons/editor-icons.html",
                "iron-icons/hardware-icons.html",
                "iron-icons/image-icons.html",
                "iron-icons/maps-icons.html",
                "iron-icons/notification-icons.html",
                "iron-icons/social-icons.html",
                "vaadin-icons",
                // Flex-layout and animations are used in all the app, loading it early.
                "iron-flex-layout",
                "neon-animation"
                ));

        Polymer.whenReady(o -> {
            // The app is executed when all imports succeed.
            RootPanel.get().add(new Sampler());
            return null;
        });
    }
}
