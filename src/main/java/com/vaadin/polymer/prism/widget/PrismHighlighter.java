/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from prism-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.prism.widget;

import com.vaadin.polymer.prism.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Syntax highlighting via <a href="http://prismjs.com/">Prism</a>.</p>
 * <p>Place a <code>&lt;prism-highlighter&gt;</code> in your document, preferably as a direct child of<br><code>&lt;body&gt;</code>. It will listen for <code>syntax-highlight</code> events on its parent element,<br>and annotate the code being provided via that event.</p>
 * <p>The <code>syntax-highlight</code> event’s detail is expected to have a <code>code</code> property<br>containing the source to highlight. The event detail can optionally contain a<br><code>lang</code> property, containing a string like <code>&quot;html&quot;</code>, <code>&quot;js&quot;</code>, etc.</p>
 * <p>This flow is supported by <a href="https://github.com/PolymerElements/marked-element"><code>&lt;marked-element&gt;</code></a>.</p>
 */
public class PrismHighlighter extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PrismHighlighter() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PrismHighlighter(String html) {
        super(PrismHighlighterElement.TAG, PrismHighlighterElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PrismHighlighterElement getPolymerElement() {
        return (PrismHighlighterElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    public void detached() {
        getPolymerElement().detached();
    }
  


}
