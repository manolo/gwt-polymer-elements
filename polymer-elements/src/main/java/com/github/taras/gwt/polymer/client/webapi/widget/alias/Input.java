package com.github.taras.gwt.polymer.client.webapi.widget.alias;

import com.github.taras.gwt.polymer.client.PolymerWidget;
import com.google.gwt.safehtml.shared.SafeHtml;

public class Input extends PolymerWidget {
    
    public Input(String tag, String html) {
        super(tag, html);
    }

    public Input(String tag, SafeHtml safeHtml) {
        super(tag, safeHtml);
    }
}
