package com.github.taras.gwt.polymer.client;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PolymerWidget extends HTMLPanel {

    public PolymerWidget(String tag, String html) {
        super(tag, html);
        Polymer.ensureHTMLImport(tag);
    }

    public PolymerWidget(String tag, SafeHtml safeHtml) {
        super(tag, safeHtml.asString());
    }

    public void setHorizontal(boolean horizontal) {
        setBooleanAttribute("horizontal", horizontal);
    }
    public void setHorizontal(String horizontal) {
        setBooleanAttribute("horizontal", true);
    }
    
    public void setLayout(boolean layout) {
        setBooleanAttribute("layout", layout);
    }
    public void setLayout(String layout) {
        setBooleanAttribute("layout", true);
    }

    public void setCenter(boolean center) {
        setBooleanAttribute("center", center);
    }
    public void setCenter(String center) {
        setBooleanAttribute("center", true);
    }

    private void setBooleanAttribute(String name, boolean value) {
        if (value) {
            getElement().setAttribute(name, "");
        } else {
            getElement().removeAttribute(name);
        }
    }


    public void setDisabled(String disabled) {
        setBooleanAttribute("disabled", true);
    }
    public void setChecked(String checked) {
        setBooleanAttribute("checked", true);
    }

    // TODO: Remove this hack for core-selector
    public void setSelected(String value) {
        getElement().setAttribute("selected", value);
    }

    // TODO: Remove this hack for paper-radio-button
    public void setName(String value) {
        getElement().setAttribute("name", value);
    }
}
