/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget;

import com.vaadin.polymer.marked.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Element wrapper for the <a href="https://github.com/chjj/marked">marked</a> library.</p>
 * <p><code>&lt;marked-element&gt;</code> accepts Markdown source, and renders it to a child<br>element with the class <code>markdown-html</code>. This child element can be styled<br>as you would a normal DOM element. If you do not provide a child element<br>with the <code>markdown-html</code> class, the Markdown source will still be rendered,<br>but to a shadow DOM child that cannot be styled.</p>
 * <p>The Markdown source can be specified either via the <code>markdown</code> attribute:</p>
 * <pre><code>&lt;marked-element markdown=&quot;`Markdown` is _awesome_!&quot;&gt;
 *   &lt;div class=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 * &lt;/marked-element&gt;
 * 
 * 
 * </code></pre><p>Or, you can provide it via a <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> element child:</p>
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
 * </code></pre><p>Note that the <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> approach is <em>static</em>. Changes to<br>the script content will <em>not</em> update the rendered markdown!</p>
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
        try {
            return (MarkedElementElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>The markdown source that should be rendered by this element. </p>
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
     * <p>The markdown source that should be rendered by this element. </p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    public void setMarkdown(String value) {
        getPolymerElement().setMarkdown(value);
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


}
