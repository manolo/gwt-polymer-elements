/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-scroll-threshold project by The Polymer Authors
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
 * <p><code>iron-scroll-threshold</code> is a utility element that listens for <code>scroll</code> events from a<br>scrollable region and fires events to indicate when the scroller has reached a pre-defined<br>limit, specified in pixels from the upper and lower bounds of the scrollable region.<br>This element may wrap a scrollable region and will listen for <code>scroll</code> events bubbling<br>through it from its children.  In this case, care should be taken that only one scrollable<br>region with the same orientation as this element is contained within. Alternatively,<br>the <code>scrollTarget</code> property can be set/bound to a non-child scrollable region, from which<br>it will listen for events.</p>
 * <p>Once a threshold has been reached, a <code>lower-threshold</code> or <code>upper-threshold</code> event will<br>be fired, at which point the user may perform actions such as lazily-loading more data<br>to be displayed. After any work is done, the user must then clear the threshold by<br>calling the <code>clearTriggers</code> method on this element, after which it will<br>begin listening again for the scroll position to reach the threshold again assuming<br>the content in the scrollable region has grown. If the user no longer wishes to receive<br>events (e.g. all data has been exhausted), the threshold property in question (e.g.<br><code>lowerThreshold</code>) may be set to a falsy value to disable events and clear the associated<br>triggered property.</p>
 * <h3 id="example">Example</h3>
 * <pre><code class="lang-html">&lt;iron-scroll-threshold on-lower-threshold=&quot;loadMoreData&quot;&gt;
 *   &lt;div&gt;content&lt;/div&gt;
 * &lt;/iron-scroll-threshold&gt;
 * </code></pre>
 * <pre><code class="lang-js">  loadMoreData: function() {
 *     // load async stuff. e.g. XHR
 *     asyncStuff(function done() {
 *       ironScrollTheshold.clearTriggers();
 *     });
 *   }
 * </code></pre>
 * <h3 id="using-dom-repeat">Using dom-repeat</h3>
 * <pre><code class="lang-html">&lt;iron-scroll-threshold on-lower-threshold=&quot;loadMoreData&quot;&gt;
 *   &lt;template is=&quot;dom-repeat&quot; items=&quot;[[items]]&quot;&gt;
 *     &lt;div&gt;[[index]]&lt;/div&gt;
 *   &lt;/template&gt;
 * &lt;/iron-scroll-threshold&gt;
 * </code></pre>
 * <h3 id="using-iron-list">Using iron-list</h3>
 * <pre><code class="lang-html">&lt;iron-scroll-threshold on-lower-threshold=&quot;loadMoreData&quot; id=&quot;threshold&quot;&gt;
 *   &lt;iron-list scroll-target=&quot;threshold&quot; items=&quot;[[items]]&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;[[index]]&lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/iron-scroll-threshold&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronScrollThresholdElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-scroll-threshold";
    @JsOverlay public static final String SRC = "iron-scroll-threshold/iron-scroll-threshold.html";


    /**
     * <p>True if the orientation of the scroller is horizontal.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    @JsProperty boolean getHorizontal();
    /**
     * <p>True if the orientation of the scroller is horizontal.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    @JsProperty void setHorizontal(boolean value);

    /**
     * <p>Distance from the bottom (or right, for horizontal) bound of the scroller<br>where the “lower trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property lowerThreshold
     * @type Number
     * 
     */
    @JsProperty double getLowerThreshold();
    /**
     * <p>Distance from the bottom (or right, for horizontal) bound of the scroller<br>where the “lower trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property lowerThreshold
     * @type Number
     * 
     */
    @JsProperty void setLowerThreshold(double value);

    /**
     * <p>Distance from the top (or left, for horizontal) bound of the scroller<br>where the “upper trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property upperThreshold
     * @type Number
     * 
     */
    @JsProperty double getUpperThreshold();
    /**
     * <p>Distance from the top (or left, for horizontal) bound of the scroller<br>where the “upper trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property upperThreshold
     * @type Number
     * 
     */
    @JsProperty void setUpperThreshold(double value);

    /**
     * <p>Read-only value that tracks the triggered state of the upper threshold.</p>
     *
     * JavaScript Info:
     * @property upperTriggered
     * @type Boolean
     * 
     */
    @JsProperty boolean getUpperTriggered();
    /**
     * <p>Read-only value that tracks the triggered state of the upper threshold.</p>
     *
     * JavaScript Info:
     * @property upperTriggered
     * @type Boolean
     * 
     */
    @JsProperty void setUpperTriggered(boolean value);

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
     * <p>Read-only value that tracks the triggered state of the lower threshold.</p>
     *
     * JavaScript Info:
     * @property lowerTriggered
     * @type Boolean
     * 
     */
    @JsProperty boolean getLowerTriggered();
    /**
     * <p>Read-only value that tracks the triggered state of the lower threshold.</p>
     *
     * JavaScript Info:
     * @property lowerTriggered
     * @type Boolean
     * 
     */
    @JsProperty void setLowerTriggered(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method checkScrollThesholds
     * 
     * 
     */
    void checkScrollThesholds();

    /**
     * <p>Checks the scroll thresholds.<br>This method is automatically called by iron-scroll-threshold.</p>
     *
     * JavaScript Info:
     * @method checkScrollThresholds
     * 
     * 
     */
    void checkScrollThresholds();

    /**
     * <p>Clear the upper and lower threshold states.</p>
     *
     * JavaScript Info:
     * @method clearTriggers
     * 
     * 
     */
    void clearTriggers();

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
