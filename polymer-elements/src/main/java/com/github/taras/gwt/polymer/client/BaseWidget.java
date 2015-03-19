package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.elements.CoreLabel;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

public class BaseWidget extends Widget {

    /*
     * Constuctor. Ensures that needed html templates are added and injects a
     * correspondent html template to the page.
     */
    public BaseWidget(Class<?> clazz) {
        PolymerInjector.ensureHTMLImport(clazz);
        Element el = DOM.createElement(getTagName(clazz));
        setElement(el);
    }

    private static String getTagName(Class<?> clazz) {
        return clazz.getSimpleName().replaceAll("([A-Z])", "-$1").replaceFirst("^-+", "").toLowerCase();
    }

    public void setAttribute(String name, String value) {
        getElement().setAttribute(name, value);
    }
}
