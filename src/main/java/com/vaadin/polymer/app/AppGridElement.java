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
 * <p>app-grid is a helper class useful for creating responsive, fluid grid layouts using custom properties.<br>Because custom properties can be defined inside a <code>@media</code> rule, you can customize the grid layout<br>for different responsive breakpoints.</p>
 * <p>Example:</p>
 * <p>Import <code>app-grid-style.html</code> and include <code>app-grid-style</code> in the style of an element’s definition.<br>Then, add the class <code>app-grid</code> to a container such as <code>ul</code> or <code>div</code>:</p>
 * <pre><code class="lang-html">&lt;template&gt;
 *   &lt;style include=&quot;app-grid-style&quot;&gt;
 *     :host {
 *       --app-grid-columns: 3;
 *       --app-grid-item-height: 100px;
 *     }
 * 
 *     ul {
 *       padding: 0;
 *       list-style: none;
 *     }
 * 
 *     .item {
 *       background-color: white;
 *     }
 *   &lt;/style&gt;
 *   &lt;ul class=&quot;app-grid&quot;&gt;
 *     &lt;li class=&quot;item&quot;&gt;1&lt;/li&gt;
 *     &lt;li class=&quot;item&quot;&gt;2&lt;/li&gt;
 *     &lt;li class=&quot;item&quot;&gt;3&lt;/li&gt;
 *   &lt;/ul&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <p>In the example above, the grid  will take 3 columns per row.</p>
 * <h3 id="expandible-items">Expandible items</h3>
 * <p>In many cases, it’s useful to expand an item more than 1 column. To achieve this type of layout,<br>you can specify the number of columns the item should expand to by setting the custom property<br><code>--app-grid-expandible-item-columns</code>. To indicate which item should expand, apply the mixin<br><code>--app-grid-expandible-item</code> to a rule with a selector to the item. For example:</p>
 * <pre><code>
 * &lt;template>
 *   &lt;style include="app-grid-style">
 *     :host {
 *       --app-grid-columns: 3;
 *       --app-grid-item-height: 100px;
 *       --app-grid-expandible-item-columns: 3;
 *     }
 * 
 *     /* Only the first item should expand * /
 *     .item:first-child {
 *       &#64;apply(--app-grid-expandible-item);
 *     }
 *   &lt;/style>
 * &lt;/template>
 * </code></pre>
 * 
 * <h3 id="preserving-the-aspect-ratio">Preserving the aspect ratio</h3>
 * <p>When the size of a grid item should preserve the aspect ratio, you can add the <code>has-aspect-ratio</code><br>attribute to the element with the class <code>.app-grid</code>. Now, every item element becomes a wrapper around<br>the item content. For example:</p>
 * <pre><code class="lang-html">&lt;template&gt;
 *   &lt;style include=&quot;app-grid-style&quot;&gt;
 *     :host {
 *       --app-grid-columns: 3;
 *       /* 50% the width of the item is equivalent to 2:1 aspect ratio* /
 *       --app-grid-item-height: 50%;
 *     }
 * 
 *     .item {
 *       background-color: white;
 *     }
 *   &lt;/style&gt;
 *   &lt;ul class=&quot;app-grid&quot; has-aspect-ratio&gt;
 *     &lt;li class=&quot;item&quot;&gt;
 *       &lt;div&gt;item 1&lt;/div&gt;
 *     &lt;/li&gt;
 *     &lt;li class=&quot;item&quot;&gt;
 *       &lt;div&gt;item 2&lt;/div&gt;
 *     &lt;/li&gt;
 *     &lt;li class=&quot;item&quot;&gt;
 *       &lt;div&gt;item 3&lt;/div&gt;
 *     &lt;/li&gt;
 *   &lt;/ul&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--app-grid-columns</code></td>
 * <td>The number of columns per row.</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td><code>--app-grid-gutter</code></td>
 * <td>The space between two items.</td>
 * <td>0px</td>
 * </tr>
 * <tr>
 * <td><code>--app-grid-item-height</code></td>
 * <td>The height of the items.</td>
 * <td>auto</td>
 * </tr>
 * <tr>
 * <td><code>--app-grid-expandible-item-columns</code></td>
 * <td>The number of columns an expandible item should expand to.</td>
 * <td>1</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface AppGridElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-grid";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";



}
