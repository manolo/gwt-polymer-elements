/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>&lt;vaadin-context-menu&gt;</code> is a Polymer element that opens an overlay with the provided menu template on each context menu event.</p>
 * <h3 id="menu-template">Menu Template</h3>
 * <p>The <code>&lt;vaadin-context-menu&gt;</code> element expects a child template with the overlay contents.</p>
 * <p>You can use any elements in the template to build the actual menu. It is recommended to use <code>&lt;paper-menu&gt;</code> and <code>&lt;paper-item&gt;</code> for the basic single-level menu use case:</p>
 * <pre><code class="lang-html">&lt;vaadin-context-menu&gt;
 *   &lt;template&gt;
 *     &lt;paper-menu&gt;
 *       &lt;paper-item&gt;First menu item&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Second menu item&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3 id="-vaadin-contextmenu-gesture-event">“vaadin-contextmenu” Gesture Event</h3>
 * <p><code>vaadin-contextmenu</code> is a gesture event (a custom event fired by Polymer), which is dispatched after either <code>contextmenu</code> and long touch events. This enables support for both mouse and touch environments in a uniform way.</p>
 * <p><code>&lt;vaadin-context-menu&gt;</code> opens the menu overlay on the <code>vaadin-contextmenu</code> event by default.</p>
 * <h3 id="menu-listener">Menu Listener</h3>
 * <p>By default, the <code>&lt;vaadin-context-menu&gt;</code> element listens for the menu opening event on itself. In order to have a context menu on your content, wrap your content with the <code>&lt;vaadin-context-menu&gt;</code> element, and add a template element with a menu. Example:</p>
 * <pre><code class="lang-html">&lt;vaadin-context-menu&gt;
 *   &lt;template&gt;
 *     &lt;paper-menu&gt;
 *       &lt;paper-item&gt;First menu item&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Second menu item&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/template&gt;
 * 
 *   &lt;p&gt;This paragraph has the context menu provided in the above template.&lt;/p&gt;
 *   &lt;p&gt;Another paragraph with the context menu.&lt;/p&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <p>In case if you do not want to wrap the page content, you can listen for events on an element outside the <code>&lt;vaadin-context-menu&gt;</code> by setting the <code>listenOn</code> property:</p>
 * <pre><code class="lang-html">&lt;vaadin-context-menu id=&quot;customListener&quot;&gt;
 *   &lt;template&gt;
 *     &lt;paper-menu&gt;
 *       ...
 *     &lt;/paper-menu&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-context-menu&gt;
 * 
 * &lt;div id=&quot;menuListener&quot;&gt;The element that listens for the context menu.&lt;/div&gt;
 * 
 * &lt;script&gt;
 *   var contextMenu = document.querySelector(&#39;vaadin-context-menu#customListener&#39;);
 *   contextMenu.listenOn = document.querySelector(&#39;#menuListener&#39;);
 * &lt;/script&gt;
 * </code></pre>
 * <h3 id="filtering-menu-targets">Filtering Menu Targets</h3>
 * <p>By default, the listener element and all its descendants open the context menu. You can filter the menu targets to a smaller set of elements inside the listener element by setting the <code>selector</code> property.</p>
 * <p>In the following example, only the elements matching <code>.has-menu</code> will open the context menu:</p>
 * <pre><code class="lang-html">&lt;vaadin-context-menu selector=&quot;.has-menu&quot;&gt;
 *   &lt;template&gt;
 *     &lt;paper-menu&gt;
 *       ...
 *     &lt;/paper-menu&gt;
 *   &lt;/template&gt;
 * 
 *   &lt;p class=&quot;has-menu&quot;&gt;This paragraph opens the context menu&lt;/p&gt;
 *   &lt;p&gt;This paragraph does not open the context menu&lt;/p&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3 id="menu-context">Menu Context</h3>
 * <p>You can bind to the following properties in the menu template:</p>
 * <ul>
 * <li><code>target</code> is the menu opening event target, which is the element that the user has called the context menu for</li>
 * <li><code>detail</code> is the menu opening event detail</li>
 * </ul>
 * <p>In the following example, the menu item text is composed with the contents of the element that opened the menu:</p>
 * <pre><code class="lang-html">&lt;vaadin-context-menu selector=&quot;li&quot;&gt;
 *   &lt;template&gt;
 *     &lt;paper-menu&gt;
 *       &lt;paper-item&gt;The menu target: [[target.textContent]]&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/template&gt;
 * 
 *   &lt;ul&gt;
 *     &lt;li&gt;Foo&lt;/li&gt;
 *     &lt;li&gt;Bar&lt;/li&gt;
 *     &lt;li&gt;Baz&lt;/li&gt;
 *   &lt;/ul&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom CSS mixins are available for styling the overlay:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--vaadin-context-menu-overlay</code></td>
 * <td>Mixin applied to the overlay</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface VaadinContextMenuElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-context-menu";
    @JsOverlay public static final String SRC = "vaadin-context-menu/vaadin-context-menu.html";


    /**
     * <p>The target element that’s listened to for context menu opening events.<br>By default the vaadin-context-menu listens to the target’s <code>vaadin-contextmenu</code><br>events.</p>
     *
     * JavaScript Info:
     * @property listenOn
     * @type HTMLElement
     * 
     */
    @JsProperty JavaScriptObject getListenOn();
    /**
     * <p>The target element that’s listened to for context menu opening events.<br>By default the vaadin-context-menu listens to the target’s <code>vaadin-contextmenu</code><br>events.</p>
     *
     * JavaScript Info:
     * @property listenOn
     * @type HTMLElement
     * 
     */
    @JsProperty void setListenOn(JavaScriptObject value);

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>Event name to listen for closing the context menu.</p>
     *
     * JavaScript Info:
     * @property closeOn
     * @type String
     * 
     */
    @JsProperty String getCloseOn();
    /**
     * <p>Event name to listen for closing the context menu.</p>
     *
     * JavaScript Info:
     * @property closeOn
     * @type String
     * 
     */
    @JsProperty void setCloseOn(String value);

    /**
     * <p>Event name to listen for opening the context menu.</p>
     *
     * JavaScript Info:
     * @property openOn
     * @type String
     * 
     */
    @JsProperty String getOpenOn();
    /**
     * <p>Event name to listen for opening the context menu.</p>
     *
     * JavaScript Info:
     * @property openOn
     * @type String
     * 
     */
    @JsProperty void setOpenOn(String value);

    /**
     * <p>CSS selector that can be used to target any child element<br>of the context menu to listen for <code>openOn</code> events.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    @JsProperty String getSelector();
    /**
     * <p>CSS selector that can be used to target any child element<br>of the context menu to listen for <code>openOn</code> events.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    @JsProperty void setSelector(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void modelForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void templatize(Object template);

    /**
     * <p>Opens the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @param {Event} e  
     * 
     * 
     */
    void open(JavaScriptObject e);

    /**
     * <p>Closes the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

}
