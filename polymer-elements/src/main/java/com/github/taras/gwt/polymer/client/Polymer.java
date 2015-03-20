package com.github.taras.gwt.polymer.client;

import java.util.HashSet;
import java.util.Set;

import com.github.taras.gwt.polymer.client.elements.ImportsMap;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

public class Polymer {
    
    private static Polymer instance = new Polymer();

    private static Set<String> urlImported = new HashSet<>();
    
    public static <T extends PolymerElement> T create(String tagName) {
        Polymer.ensureHTMLImport(tagName);
        return DOM.createElement(tagName).cast();
    }

    /*
	 * Injects the correspondent html template to page head section.
	 */
    public static void ensureHTMLImport(String tagName) {
        String href = "components/" + ImportsMap.getInstance().get(tagName);
        if (!urlImported.contains(href)) {
            Element head = Document.get().getElementsByTagName("head").getItem(0);
            Element htmlImport = Document.get().createLinkElement();
            htmlImport.setAttribute("rel", "import");
            htmlImport.setAttribute("href", GWT.getModuleBaseForStaticFiles() + href);
            head.appendChild(htmlImport);
            urlImported.add(href);
        }
    }

    public static Polymer getInstance() {
        return instance;
    }

    private Polymer() {
    }
}
