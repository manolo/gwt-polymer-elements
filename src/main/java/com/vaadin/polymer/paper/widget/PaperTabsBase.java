package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.Element;
import com.vaadin.polymer.paper.element.PaperTabsElement;

/**
 * This class will be extended by PaperTabs.java and
 * contains a workaround to fix a problem with yellow
 * line when a tab is selected. It happens if the tabs
 * component is added at the very beginning to the UI.
 */
public abstract class PaperTabsBase extends PolymerWidget {

    public PaperTabsBase(String tag, String src, String html) {
        super(tag, src, html);
    }

    @Override
    protected void onAttach() {
        super.onAttach();
        fixTabsSelection((PaperTabsElement)getElement());
    }
    
    // A temporary workaround to fix the underline tab issue
    // Not a solution.
    private native void fixTabsSelection(Element e) /*-{
        @com.vaadin.polymer.Polymer::onReady(*)(e, function(){
          setTimeout(function() {
            e._onResize();
          }, 400);
        });
    }-*/;
  }
