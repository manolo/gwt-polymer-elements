package com.vaadin.components.gwt.polymer.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.vaadin.components.gwt.polymer.client.element.ImportsMap;

public abstract class Polymer {

    private static Set<String> urlImported = new HashSet<>();

    /**
     * Ensures that the tagName has been registered, otherwise injects
     * the appropriate <import> tag in the document header
     */
    public static void ensureHTMLImport(String tagName) {
        String href = "bower_components/" + ImportsMap.getInstance().get(tagName);
        if (!urlImported.contains(href)) {
            Element link = Document.get().createLinkElement();
            link.setAttribute("rel", "import");
            link.setAttribute("href", GWT.getModuleBaseForStaticFiles() + href);
            Document.get().getHead().appendChild(link);
            urlImported.add(href);
        }
    }

    /**
     * Returns a new instance of the Element. It loads the webcomponent
     * if not loaded yet.
     */
    public static <T> T createElement(String tagName) {
        ensureHTMLImport(tagName);
        return (T)Document.get().createElement(tagName);
    }

    public static com.vaadin.components.gwt.polymer.client.webapi.Document getDocument() {
        return (com.vaadin.components.gwt.polymer.client.webapi.Document)Document.get();
    }
}
