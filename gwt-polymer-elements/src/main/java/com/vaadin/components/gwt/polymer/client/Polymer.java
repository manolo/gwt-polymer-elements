package com.vaadin.components.gwt.polymer.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.vaadin.components.gwt.polymer.client.element.ImportsMap;

public class Polymer {
    
    private static Polymer instance = new Polymer();

    private static Set<String> urlImported = new HashSet<>();
    
    /*
	 * Injects the correspondent html template to page head section.
	 */
    public static void ensureHTMLImport(Class<?> clazz) {
        String tagName = computeTagName(clazz);
        GWT.log(tagName);
        ensureHTMLImport(tagName);
    }

    public static void ensureHTMLImport(String tagName) {
        String href = "bower_components/" + ImportsMap.getInstance().get(tagName);
        if (!urlImported.contains(href)) {
            Element head = Document.get().getElementsByTagName("head").getItem(0);
            Element htmlImport = Document.get().createLinkElement();
            htmlImport.setAttribute("rel", "import");
            htmlImport.setAttribute("href", GWT.getModuleBaseForStaticFiles() + href);
            head.appendChild(htmlImport);
            urlImported.add(href);
        }
    }

    private static String computeTagName(Class<?> clazz) {
        return clazz.getSimpleName().replaceAll("([A-Z])", "-$1").replaceFirst("^-+", "").toLowerCase();
    }

    public static Polymer getInstance() {
        return instance;
    }

    private Polymer() {
    }
}
