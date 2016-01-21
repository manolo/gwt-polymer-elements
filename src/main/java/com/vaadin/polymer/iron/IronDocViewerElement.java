/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Renders documentation describing an element’s API.</p>
 * <p><code>iron-doc-viewer</code> renders element and behavior descriptions as extracted by<br><a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>. You can provide them<br>either via binding…</p>
 * <pre><code>&lt;iron-doc-viewer descriptor=&quot;{{elementDescriptor}}&quot;&gt;&lt;/iron-doc-viewer&gt;
 * 
 * 
 * </code></pre><p>…or by placing the element descriptor in JSON as the text content of an<br><code>iron-doc-viewer</code>:</p>
 * <pre><code>&lt;iron-doc-viewer&gt;
 *   {
 *     &quot;is&quot;: &quot;awesome-sauce&quot;,
 *     &quot;properties&quot;: [
 *       {&quot;name&quot;: &quot;isAwesome&quot;, &quot;type&quot;: &quot;boolean&quot;, &quot;desc&quot;: &quot;Is it awesome?&quot;},
 *     ]
 *   }
 * &lt;/iron-doc-viewer&gt;
 * 
 * 
 * </code></pre><p>However, be aware that due to current limitations in Polymer 0.8, <em>changes</em> to<br>the text content will not be respected, only the initial value will be loaded.<br>If you wish to update the documented element, please set it via the <code>descriptor</code><br>property.</p>
 */
@JsType(isNative=true)
public interface IronDocViewerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-doc-viewer";
    @JsOverlay public static final String SRC = "iron-doc-viewer/iron-doc-viewer.html";


    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.ElementDescriptor
     * 
     */
    @JsProperty JavaScriptObject getDescriptor();
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.ElementDescriptor
     * 
     */
    @JsProperty void setDescriptor(JavaScriptObject value);

    /**
     * <p>Prefix for fragment identifiers used in anchors.<br>For static routing <code>iron-component-page</code> can<br>set this to a string identifying the current component.</p>
     *
     * JavaScript Info:
     * @property prefix
     * @type String
     * 
     */
    @JsProperty String getPrefix();
    /**
     * <p>Prefix for fragment identifiers used in anchors.<br>For static routing <code>iron-component-page</code> can<br>set this to a string identifying the current component.</p>
     *
     * JavaScript Info:
     * @property prefix
     * @type String
     * 
     */
    @JsProperty void setPrefix(String value);


    /**
     * <p>Scrolls to the currently selected anchor, as identified<br>by the URL hash. Whichever element or script is in charge<br>of routing should call this method on initial page load and<br>on hashchange events.</p>
     *
     * JavaScript Info:
     * @method scrollToAnchor
     * @param {} hash  
     * 
     * 
     */
    void scrollToAnchor(Object hash);

}
