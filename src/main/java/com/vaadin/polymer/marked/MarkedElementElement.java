/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Element wrapper for the <a href="https://github.com/chjj/marked">marked</a> library.</p>
 * <p><code>&lt;marked-element&gt;</code> accepts Markdown source and renders it to a child<br>element with the class <code>markdown-html</code>. This child element can be styled<br>as you would a normal DOM element. If you do not provide a child element<br>with the <code>markdown-html</code> class, the Markdown source will still be rendered,<br>but to a shadow DOM child that cannot be styled.</p>
 * <h3 id="markdown-content">Markdown Content</h3>
 * <p>The Markdown source can be specified several ways:</p>
 * <h4 id="use-the-markdown-attribute-to-bind-markdown">Use the <code>markdown</code> attribute to bind markdown</h4>
 * <pre><code>&lt;marked-element markdown=&quot;`Markdown` is _awesome_!&quot;&gt;
 *   &lt;div class=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 * &lt;/marked-element&gt;
 * 
 * 
 * </code></pre><h4 id="use-script-type-text-markdown-element-child-to-inline-markdown">Use <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> element child to inline markdown</h4>
 * <pre><code>&lt;marked-element&gt;
 *   &lt;div class=&quot;markdown-html&quot;&gt;&lt;/div&gt;
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
 * </code></pre><h4 id="use-script-type-text-markdown-src-url-element-child-to-specify-remote-markdown">Use <code>&lt;script type=&quot;text/markdown&quot; src=&quot;URL&quot;&gt;</code> element child to specify remote markdown</h4>
 * <pre><code>&lt;marked-element&gt;
 *   &lt;div class=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 *   &lt;script type=&quot;text/markdown&quot; src=&quot;../guidelines.md&quot;&gt;&lt;/script&gt;
 * &lt;/marked-element&gt;
 * 
 * 
 * </code></pre><p>Note that the <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> approach is <em>static</em>. Changes to<br>the script content will <em>not</em> update the rendered markdown!</p>
 * <p>Though, you can data bind to the <code>src</code> attribute to change the markdown.</p>
 * <pre><code class="lang-html">&lt;marked-element&gt;
 *   &lt;div class=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 *   &lt;script type=&quot;text/markdown&quot; src$=&quot;[[source]]&quot;&gt;&lt;/script&gt;
 * &lt;/marked-element&gt;
 * ...
 * &lt;script&gt;
 *   ...
 *   this.source = &#39;../guidelines.md&#39;;
 * &lt;/script&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>If you are using a child with the <code>markdown-html</code> class, you can style it<br>as you would a regular DOM element:</p>
 * <pre><code>.markdown-html p {
 *   color: red;
 * }
 * 
 * .markdown-html td:first-child {
 *   padding-left: 24px;
 * }
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface MarkedElementElement extends HTMLElement {

    @JsOverlay public static final String TAG = "marked-element";
    @JsOverlay public static final String SRC = "marked-element/marked-element.html";


    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    @JsProperty boolean getBreaks();
    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    @JsProperty void setBreaks(boolean value);

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty JavaScriptObject getXhr();
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty void setXhr(JavaScriptObject value);

    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    @JsProperty boolean getPedantic();
    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    @JsProperty void setPedantic(boolean value);

    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    @JsProperty boolean getSanitize();
    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    @JsProperty void setSanitize(boolean value);

    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    @JsProperty boolean getSmartypants();
    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    @JsProperty void setSmartypants(boolean value);

    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.<br>It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    @JsProperty Function getCallback();
    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.<br>It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    @JsProperty void setCallback(Function value);

    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked<br>library</a>.<br>It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    @JsProperty Function getRenderer();
    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked<br>library</a>.<br>It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    @JsProperty void setRenderer(Function value);

    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty String getMarkdown();
    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty void setMarkdown(String value);


    /**
     * <p>Unindents the markdown source that will be rendered.</p>
     *
     * JavaScript Info:
     * @method unindent
     * @param {} text  
     * 
     * 
     */
    void unindent(Object text);

    /**
     * <p>Renders <code>markdown</code> into this element’s DOM.</p>
     * <p>This is automatically called whenever the <code>markdown</code> property is changed.</p>
     * <p>The only case where you should be calling this is if you are providing<br>markdown via <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> after this element has been<br>constructed (or updating that markdown).</p>
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    void render();

}
