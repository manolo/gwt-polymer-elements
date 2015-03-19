package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.elements.CoreField;
import com.github.taras.gwt.polymer.client.elements.CoreLabel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PolymerInjector {
    
    private static PolymerInjector instance = new PolymerInjector();

    private static Set<String> urlImported = new HashSet<>();
    
    private static Map<Class, String> importMap = new HashMap<>();
    static {
        importMap.put(CoreField.class, "components/core-field/core-field.html");
        importMap.put(CoreLabel.class, "components/core-label/core-label.html");
    }

    /*
	 * Injects the correspondent html template to page head section.
	 */
    public static void ensureHTMLImport(Class clazz) {
        String href = importMap.get(clazz);
        ensureHTMLImport(href);
    }

    /*
	 * Injects the html template to page head section.
	 */
    public static void ensureHTMLImport(String href) {
        if (!urlImported.contains(href)) {
            Element head = Document.get().getElementsByTagName("head").getItem(0);
            Element htmlImport = Document.get().createLinkElement();
            htmlImport.setAttribute("rel", "import");
            htmlImport.setAttribute("href", GWT.getModuleBaseForStaticFiles() + href);
            head.appendChild(htmlImport);
            urlImported.add(href);
        }
    }

    public static PolymerInjector getInstance() {
        return instance;
    }

    private PolymerInjector() {
    }
}
