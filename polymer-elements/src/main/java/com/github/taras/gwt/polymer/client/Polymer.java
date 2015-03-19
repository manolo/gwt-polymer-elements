package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.elements.CoreField;
import com.github.taras.gwt.polymer.client.elements.CoreLabel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Polymer {
    
    private static Polymer instance = new Polymer();

    private static Set<String> urlImported = new HashSet<>();
    
    private static Map<String, String> importMap = new HashMap<>();
    static {
        importMap.put("core-field", "components/core-field/core-field.html");
        importMap.put("core-label", "components/core-label/core-label.html");
        importMap.put("paper-button", "components/paper-button/paper-button.html");
    }
    
    public static <T extends PolymerElement> T create(String tagName) {
        Polymer.ensureHTMLImport(tagName);
        return DOM.createElement(tagName).cast();
    }

    /*
	 * Injects the correspondent html template to page head section.
	 */
    public static void ensureHTMLImport(String tagName) {
        String href = importMap.get(tagName);
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
