/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-scroll-threshold project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.LowerThresholdEvent;
import com.vaadin.polymer.iron.widget.event.LowerThresholdEventHandler;

import com.vaadin.polymer.iron.widget.event.UpperThresholdEvent;
import com.vaadin.polymer.iron.widget.event.UpperThresholdEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronScrollThreshold extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronScrollThreshold() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronScrollThreshold(String html) {
        super(IronScrollThresholdElement.TAG, IronScrollThresholdElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronScrollThresholdElement getPolymerElement() {
        return (IronScrollThresholdElement) getElement();
    }


    /**
     * <p>True if the orientation of the scroller is horizontal.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    public boolean getHorizontal() {
        return getPolymerElement().getHorizontal();
    }
    /**
     * <p>True if the orientation of the scroller is horizontal.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    public void setHorizontal(boolean value) {
        getPolymerElement().setHorizontal(value);
    }

    /**
     * <p>Distance from the bottom (or right, for horizontal) bound of the scroller<br>where the “lower trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property lowerThreshold
     * @type Number
     * 
     */
    public double getLowerThreshold() {
        return getPolymerElement().getLowerThreshold();
    }
    /**
     * <p>Distance from the bottom (or right, for horizontal) bound of the scroller<br>where the “lower trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property lowerThreshold
     * @type Number
     * 
     */
    public void setLowerThreshold(double value) {
        getPolymerElement().setLowerThreshold(value);
    }

    /**
     * <p>Distance from the top (or left, for horizontal) bound of the scroller<br>where the “upper trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property upperThreshold
     * @type Number
     * 
     */
    public double getUpperThreshold() {
        return getPolymerElement().getUpperThreshold();
    }
    /**
     * <p>Distance from the top (or left, for horizontal) bound of the scroller<br>where the “upper trigger” will fire.</p>
     *
     * JavaScript Info:
     * @property upperThreshold
     * @type Number
     * 
     */
    public void setUpperThreshold(double value) {
        getPolymerElement().setUpperThreshold(value);
    }

    /**
     * <p>Read-only value that tracks the triggered state of the upper threshold.</p>
     *
     * JavaScript Info:
     * @property upperTriggered
     * @type Boolean
     * 
     */
    public boolean getUpperTriggered() {
        return getPolymerElement().getUpperTriggered();
    }
    /**
     * <p>Read-only value that tracks the triggered state of the upper threshold.</p>
     *
     * JavaScript Info:
     * @property upperTriggered
     * @type Boolean
     * 
     */
    public void setUpperTriggered(boolean value) {
        getPolymerElement().setUpperTriggered(value);
    }

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
    public Element getScrollTarget() {
        return getPolymerElement().getScrollTarget();
    }
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
    public void setScrollTarget(Element value) {
        getPolymerElement().setScrollTarget(value);
    }

    /**
     * <p>Read-only value that tracks the triggered state of the lower threshold.</p>
     *
     * JavaScript Info:
     * @property lowerTriggered
     * @type Boolean
     * 
     */
    public boolean getLowerTriggered() {
        return getPolymerElement().getLowerTriggered();
    }
    /**
     * <p>Read-only value that tracks the triggered state of the lower threshold.</p>
     *
     * JavaScript Info:
     * @property lowerTriggered
     * @type Boolean
     * 
     */
    public void setLowerTriggered(boolean value) {
        getPolymerElement().setLowerTriggered(value);
    }


    // Needed in UIBinder
    /**
     * <p>Distance from the bottom (or right, for horizontal) bound of the scroller<br>where the “lower trigger” will fire.</p>
     *
     * JavaScript Info:
     * @attribute lower-threshold
     * 
     */
    public void setLowerThreshold(String value) {
        Polymer.property(this.getPolymerElement(), "lowerThreshold", value);
    }

    // Needed in UIBinder
    /**
     * <p>Distance from the top (or left, for horizontal) bound of the scroller<br>where the “upper trigger” will fire.</p>
     *
     * JavaScript Info:
     * @attribute upper-threshold
     * 
     */
    public void setUpperThreshold(String value) {
        Polymer.property(this.getPolymerElement(), "upperThreshold", value);
    }

    // Needed in UIBinder
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
     * @attribute scroll-target
     * @behavior IronScrollThreshold
     */
    public void setScrollTarget(String value) {
        Polymer.property(this.getPolymerElement(), "scrollTarget", value);
    }


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
    public void scroll(double left, double top) {
        getPolymerElement().scroll(left, top);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method checkScrollThesholds
     * 
     * 
     */
    public void checkScrollThesholds() {
        getPolymerElement().checkScrollThesholds();
    }

    /**
     * <p>Clear the upper and lower threshold states.</p>
     *
     * JavaScript Info:
     * @method clearTriggers
     * 
     * 
     */
    public void clearTriggers() {
        getPolymerElement().clearTriggers();
    }

    /**
     * <p>Checks the scroll thresholds.<br>This method is automatically called by iron-scroll-threshold.</p>
     *
     * JavaScript Info:
     * @method checkScrollThresholds
     * 
     * 
     */
    public void checkScrollThresholds() {
        getPolymerElement().checkScrollThresholds();
    }

    /**
     * <p>Enables or disables the scroll event listener.</p>
     *
     * JavaScript Info:
     * @method toggleScrollListener
     * @param {boolean} yes  
     * @behavior IronScrollThreshold
     * 
     */
    public void toggleScrollListener(boolean yes) {
        getPolymerElement().toggleScrollListener(yes);
    }


    /**
     * <p>Fires when the lower threshold has been reached.</p>
     *
     * JavaScript Info:
     * @event lower-threshold
     */
    public HandlerRegistration addLowerThresholdHandler(LowerThresholdEventHandler handler) {
        return addDomHandler(handler, LowerThresholdEvent.TYPE);
    }

    /**
     * <p>Fires when the upper threshold has been reached.</p>
     *
     * JavaScript Info:
     * @event upper-threshold
     */
    public HandlerRegistration addUpperThresholdHandler(UpperThresholdEventHandler handler) {
        return addDomHandler(handler, UpperThresholdEvent.TYPE);
    }

}
