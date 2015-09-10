/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from prism-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.prism.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Syntax highlighting via <a href="http://prismjs.com/">Prism</a>.</p>
 * <p>Place a <code>&lt;prism-highlighter&gt;</code> in your document, preferably as a direct child of<br><code>&lt;body&gt;</code>. It will listen for <code>syntax-highlight</code> events on its parent element,<br>and annotate the code being provided via that event.</p>
 * <p>The <code>syntax-highlight</code> event’s detail is expected to have a <code>code</code> property<br>containing the source to highlight. The event detail can optionally contain a<br><code>lang</code> property, containing a string like <code>&quot;html&quot;</code>, <code>&quot;js&quot;</code>, etc.</p>
 * <p>This flow is supported by <a href="https://github.com/PolymerElements/marked-element"><code>&lt;marked-element&gt;</code></a>.</p>
 */
@JsType
public interface PrismHighlighterElement extends HTMLElement {

    public static final String TAG = "prism-highlighter";
    public static final String SRC = "prism-element/prism-highlighter.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

}
