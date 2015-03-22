package com.github.taras.gwt.polymer.client.widget1;

import com.github.taras.gwt.polymer.client.PolymerWidget;

public class PaperTabs extends PolymerWidget {

//    private final com.github.taras.gwt.polymer.client.element.PaperTabs element;

    public PaperTabs(String html) {
        super("paper-tabs", html);
//        element = (com.github.taras.gwt.polymer.client.element.PaperTabs) getElement();
    }
    
    public com.github.taras.gwt.polymer.client.element.PaperTabs getPolymerElement() {
        return (com.github.taras.gwt.polymer.client.element.PaperTabs) getElement();
    }
    
    
    
    public void setSelected(int selected) {
        getPolymerElement().selected(selected);
    }
}
