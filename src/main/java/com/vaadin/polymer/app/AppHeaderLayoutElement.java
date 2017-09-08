/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>app-header-layout is a wrapper element that positions an app-header and other content. This<br>element uses the document scroll by default, but it can also define its own scrolling region.</p>
 * <p>Using the document scroll:</p>
 * <pre><code class="lang-html">&lt;app-header-layout&gt;
 *   &lt;app-header fixed condenses effects=&quot;waterfall&quot;&gt;
 *     &lt;app-toolbar&gt;
 *       &lt;div main-title&gt;App name&lt;/div&gt;
 *     &lt;/app-toolbar&gt;
 *   &lt;/app-header&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-header-layout&gt;
 * </code></pre>
 * <p>Using an own scrolling region:</p>
 * <pre><code class="lang-html">&lt;app-header-layout has-scrolling-region style=&quot;width: 300px; height: 400px;&quot;&gt;
 *   &lt;app-header fixed condenses effects=&quot;waterfall&quot;&gt;
 *     &lt;app-toolbar&gt;
 *       &lt;div main-title&gt;App name&lt;/div&gt;
 *     &lt;/app-toolbar&gt;
 *   &lt;/app-header&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-header-layout&gt;
 * </code></pre>
 * <p>Add the <code>fullbleed</code> attribute to app-header-layout to make it fit the size of its container:</p>
 * <pre><code class="lang-html">&lt;app-header-layout fullbleed&gt;
 *  ...
 * &lt;/app-header-layout&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface AppHeaderLayoutElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-header-layout";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";


    /**
     * <p>If true, the current element will have its own scrolling region.<br>Otherwise, it will use the document scroll to control the header.</p>
     *
     * JavaScript Info:
     * @property hasScrollingRegion
     * @type Boolean
     * 
     */
    @JsProperty boolean getHasScrollingRegion();
    /**
     * <p>If true, the current element will have its own scrolling region.<br>Otherwise, it will use the document scroll to control the header.</p>
     *
     * JavaScript Info:
     * @property hasScrollingRegion
     * @type Boolean
     * 
     */
    @JsProperty void setHasScrollingRegion(boolean value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    void notifyResize();

    /**
     * <p>Resets the layout. This method is automatically called when the element is attached<br>to the DOM.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    void resetLayout();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
