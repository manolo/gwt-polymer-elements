/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-scroll-target-behavior project by The Polymer Authors
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
 * <p><code>Polymer.IronScrollTargetBehavior</code> allows an element to respond to scroll events from a<br>designated scroll target.</p>
 * <p>Elements that consume this behavior can override the <code>_scrollHandler</code><br>method to add logic on the scroll event.</p>
 */
@JsType(isNative=true)
public interface IronScrollTargetBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronScrollTargetBehavior";
    @JsOverlay public static final String SRC = "iron-scroll-target-behavior/iron-scroll-target-behavior.html";


    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    @JsProperty Element getScrollTarget();
    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    @JsProperty void setScrollTarget(Element value);


    /**
     * <p>Enables or disables the scroll event listener.</p>
     *
     * JavaScript Info:
     * @method toggleScrollListener
     * @param {boolean} yes  
     * @behavior IronScrollThreshold
     * 
     */
    void toggleScrollListener(boolean yes);

    /**
     * <p>Scrolls the content to a particular place.</p>
     *
     * JavaScript Info:
     * @method scroll
     * @param {number} left  
     * @param {number} top  
     * @behavior IronScrollThreshold
     * 
     */
    void scroll(double left, double top);

}
