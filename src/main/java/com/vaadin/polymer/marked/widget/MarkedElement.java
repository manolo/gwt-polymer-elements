/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget;

import com.vaadin.polymer.marked.*;

import com.vaadin.polymer.marked.widget.event.MarkedLoadendEvent;
import com.vaadin.polymer.marked.widget.event.MarkedLoadendEventHandler;

import com.vaadin.polymer.marked.widget.event.MarkedRenderCompleteEvent;
import com.vaadin.polymer.marked.widget.event.MarkedRenderCompleteEventHandler;

import com.vaadin.polymer.marked.widget.event.MarkedRequestErrorEvent;
import com.vaadin.polymer.marked.widget.event.MarkedRequestErrorEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class MarkedElement extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public MarkedElement() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public MarkedElement(String html) {
        super(MarkedElementElement.TAG, MarkedElementElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public MarkedElementElement getPolymerElement() {
        return (MarkedElementElement) getElement();
    }


    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    public boolean getBreaks() {
        return getPolymerElement().getBreaks();
    }
    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    public void setBreaks(boolean value) {
        getPolymerElement().setBreaks(value);
    }

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public JavaScriptObject getXhr() {
        return getPolymerElement().getXhr();
    }
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public void setXhr(JavaScriptObject value) {
        getPolymerElement().setXhr(value);
    }

    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    public boolean getPedantic() {
        return getPolymerElement().getPedantic();
    }
    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    public void setPedantic(boolean value) {
        getPolymerElement().setPedantic(value);
    }

    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    public boolean getSanitize() {
        return getPolymerElement().getSanitize();
    }
    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    public void setSanitize(boolean value) {
        getPolymerElement().setSanitize(value);
    }

    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    public boolean getSmartypants() {
        return getPolymerElement().getSmartypants();
    }
    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    public void setSmartypants(boolean value) {
        getPolymerElement().setSmartypants(value);
    }

    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.<br>It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    public Function getCallback() {
        return getPolymerElement().getCallback();
    }
    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.<br>It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    public void setCallback(Function value) {
        getPolymerElement().setCallback(value);
    }

    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked<br>library</a>.<br>It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    public Function getRenderer() {
        return getPolymerElement().getRenderer();
    }
    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked<br>library</a>.<br>It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    public void setRenderer(Function value) {
        getPolymerElement().setRenderer(value);
    }

    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    public String getMarkdown() {
        return getPolymerElement().getMarkdown();
    }
    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    public void setMarkdown(String value) {
        getPolymerElement().setMarkdown(value);
    }


    // Needed in UIBinder
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @attribute xhr
     * 
     */
    public void setXhr(String value) {
        Polymer.property(this.getPolymerElement(), "xhr", value);
    }


    /**
     * <p>Unindents the markdown source that will be rendered.</p>
     *
     * JavaScript Info:
     * @method unindent
     * @param {} text  
     * 
     * 
     */
    public void unindent(Object text) {
        getPolymerElement().unindent(text);
    }

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
    public void render() {
        getPolymerElement().render();
    }


    /**
     * <p>Fired when the XHR finishes loading</p>
     *
     * JavaScript Info:
     * @event marked-loadend
     */
    public HandlerRegistration addMarkedLoadendHandler(MarkedLoadendEventHandler handler) {
        return addDomHandler(handler, MarkedLoadendEvent.TYPE);
    }

    /**
     * <p>The <code>marked-render-complete</code> event is fired once Markdown to HTML<br>conversion has finished, and the DOM has been populated via the resulting<br>HTML.</p>
     *
     * JavaScript Info:
     * @event marked-render-complete
     */
    public HandlerRegistration addMarkedRenderCompleteHandler(MarkedRenderCompleteEventHandler handler) {
        return addDomHandler(handler, MarkedRenderCompleteEvent.TYPE);
    }

    /**
     * <p>Fired when an error is received while fetching remote markdown content.</p>
     *
     * JavaScript Info:
     * @event marked-request-error
     */
    public HandlerRegistration addMarkedRequestErrorHandler(MarkedRequestErrorEventHandler handler) {
        return addDomHandler(handler, MarkedRequestErrorEvent.TYPE);
    }

}
