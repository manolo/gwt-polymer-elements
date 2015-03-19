package com.github.taras.gwt.polymer.client.elements;

import java.util.HashMap;

public class ImportsMap extends HashMap<String, String> {

    private static ImportsMap instance = new ImportsMap();
    
    static {
        instance.put("core-field", "components/core-field/core-field.html");
        instance.put("core-label", "components/core-label/core-label.html");
        instance.put("paper-button", "components/paper-button/paper-button.html");
    }

    public static ImportsMap getInstance() {
        return instance;
    }

    private ImportsMap() {
    }
}
