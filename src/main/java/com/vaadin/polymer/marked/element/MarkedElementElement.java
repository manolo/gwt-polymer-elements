/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Element wrapper for the <a href="http://marked.org/">marked</a> library.</p>
 * <p><code>&lt;marked-element&gt;</code> accepts Markdown source either via its <code>markdown</code> attribute:</p>
 * <pre><code>&lt;marked-element markdown=&quot;`Markdown` is _awesome_!&quot;&gt;&lt;/marked-element&gt;
 * 
 * 
 * </code></pre><p>Or, you can provide it via a <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> element child:</p>
 * <pre><code>&lt;marked-element&gt;
 *   &lt;script type=&quot;text/markdown&quot;&gt;
 *     Check out my markdown!
 * 
 *     We can even embed elements without fear of the HTML parser mucking up their
 *     textual representation:
 * 
 *     ```html
 *     &lt;awesome-sauce&gt;
 *       &lt;div&gt;Oops, I&#39;m about to forget to close this div.
 *     &lt;/awesome-sauce&gt;
 *     ```
 *   &lt;/script&gt;
 * &lt;/marked-element&gt;
 * 
 * 
 * </code></pre><p>Note that the <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> approach is <em>static</em>. Changes to<br>the script content will <em>not</em> update the rendered markdown!</p>
 */
@JsType
public interface MarkedElementElement extends HTMLElement {

    public static final String TAG = "marked-element";
    public static final String SRC = "marked-element/marked-element.html";


    /**
     * <p>The markdown source that should be rendered by this element. </p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty String getMarkdown();
    /**
     * <p>The markdown source that should be rendered by this element. </p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty void setMarkdown(String value);
  
    /**
     * <p>Renders <code>markdown</code> into this element’s DOM.</p>
     * <p>This is automatically called whenever the <code>markdown</code> property is changed.</p>
     * <p>The only case where you should be calling this is if you are providing<br>markdown via <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> after this element has been<br>constructed (or updating that markdown).</p>
     *
     * JavaScript Info:
     * @method render
     * 
     */
    void render();

    /**
     * <p>Renders <code>markdown</code> to HTML when the element is attached.</p>
     * <p>This serves a dual purpose:</p>
     * <ul>
     * <li><p>Prevents unnecessary work (no need to render when not visible).</p>
     * </li>
     * <li><p><code>attached</code> fires top-down, so we can give ancestors a chance to<br>register listeners for the <code>syntax-highlight</code> event <em>before</em> we render<br>any markdown.</p>
     * </li>
     * </ul>
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
