/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-split-layout project by Vaadin Ltd
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
 * <p><code>&lt;vaadin-split-layout&gt;</code> is a Polymer element implementing a split layout for two<br>content elements with a draggable splitter between them.</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;div&gt;Second content element&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3 id="horizontal-and-vertical-layouts">Horizontal and Vertical Layouts</h3>
 * <p>By default, the split is horizontal, meaning that the content elements are<br>positioned side by side in a flex container with a horizontal layout.</p>
 * <p>You can change the split mode to vertical by adding the <code>vertical</code> attribute:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout vertical&gt;
 *   &lt;div&gt;Content on the top&lt;/div&gt;
 *   &lt;div&gt;Content on the bottom&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3 id="layouts-combination">Layouts Combination</h3>
 * <p>For the layout contents, we usually use <code>&lt;div&gt;</code> elements in the examples,<br>although you can use any other elements as well.</p>
 * <p>For instance, in order to have a nested vertical split layout inside a<br>horizontal one, you can include <code>&lt;vaadin-split-layout&gt;</code> as a content element<br>inside another split layout:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;vaadin-split-layout vertical&gt;
 *     &lt;div&gt;Second content element&lt;/div&gt;
 *     &lt;div&gt;Third content element&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <p>You can also trigger the vertical mode by setting the property:<br><code>splitLayout.vertical = true;</code>.</p>
 * <h3 id="split-layout-element-height">Split Layout Element Height</h3>
 * <p><code>&lt;vaadin-split-layout&gt;</code> element itself is a flex container. It does not inherit<br>the parent height by default, but rather sets its height depending on the<br>content.</p>
 * <p>You can use CSS to set the fixed height for the split layout, as usual with any<br>block element:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout style=&quot;height: 200px;&quot;&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;div&gt;Second content element&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <p>It is possible to define percentage height as well. Note that you have to set<br>the parent height in order to make percentages work correctly. In the following<br>example, the <code>&lt;body&gt;</code> is resized to fill the entire viewport, and the<br><code>&lt;vaadin-split-layout&gt;</code> element is set to take 100% height of the <code>&lt;body&gt;</code>:</p>
 * <pre><code class="lang-html">&lt;body style=&quot;height: 100vh; margin: 0;&quot;&gt;
 *   &lt;vaadin-split-layout style=&quot;height: 100%;&quot;&gt;
 *     &lt;div&gt;First&lt;/div&gt;
 *     &lt;div&gt;Second&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <p>Alternatively, you can use a flexbox layout to make <code>&lt;vaadin-split-layout&gt;</code><br>fill up the parent:</p>
 * <pre><code class="lang-html">&lt;body style=&quot;height: 100vh; margin: 0; display: flex;&quot;&gt;
 *   &lt;vaadin-split-layout style=&quot;flex: 1;&quot;&gt;
 *     &lt;div&gt;First&lt;/div&gt;
 *     &lt;div&gt;Second&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <h3 id="initial-splitter-position">Initial Splitter Position</h3>
 * <p>The initial splitter position is determined from the sizes of the content elements<br>inside the split layout. Therefore, changing <code>width</code> on the content elements<br>affects the initial splitter position for the horizontal layouts, while <code>height</code><br>affects the vertical ones.</p>
 * <p>Note that when the total size of the content elements does not fit the layout,<br>the content elements are scaled proportionally.</p>
 * <p>When setting initial sizes with relative units, such as percentages, it is<br>recommended to assing the size for both content elements:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout&gt;
 *   &lt;div style=&quot;width: 75%;&quot;&gt;Three fourths&lt;/div&gt;
 *   &lt;div style=&quot;width: 25%;&quot;&gt;One fourth&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3 id="size-limits">Size Limits</h3>
 * <p>The <code>min-width</code>/<code>min-height</code>, and <code>max-width</code>/<code>max-height</code> CSS size values<br>for the content elements are respected and used to limit the splitter position<br>when it is dragged.</p>
 * <p>It is preferred to set the limits only for a single content element, in order<br>to avoid size conflicts:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout&gt;
 *   &lt;div style=&quot;min-width: 50px; max-width: 150px;&quot;&gt;First&lt;/div&gt;
 *   &lt;div&gt;Second&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3 id="resize-notification">Resize Notification</h3>
 * <p>This element implements <code>IronResizableBehavior</code> to notify the nested resizables<br>when the splitter is dragged. In order to define a resizable and receive that<br>notification in a nested element, include <code>IronResizableBehavior</code> and listen<br>for the <code>iron-resize</code> event.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th style="text-align:left">Custom property</th>
 * <th style="text-align:left">Description</th>
 * <th style="text-align:right">Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-split-layout-splitter</code></td>
 * <td style="text-align:left">A mixin that is applied to the splitter</td>
 * <td style="text-align:right"><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>The splitter handle is an SVG element inside the splitter. You can change the<br>color of the handle by using the <code>fill</code> property in the splitter styles mixin.<br>For example, set <code>fill: none;</code> to hide the handle:</p>
 * <pre><code class="lang-html">&lt;custom-style&gt;
 *   &lt;style is=&quot;custom-style&quot;&gt;
 *     vaadin-split-layout {
 *       --vaadin-split-layout-splitter: {
 *         fill: none;
 *       };
 *     }
 *   &lt;/style&gt;
 * &lt;/custom-style&gt;
 * </code></pre>
 * <p>You can also replace the default splitter handle with a custom handle element<br>by using the <code>splitter-handle</code> class on the children of the <code>&lt;vaadin-split-layout&gt;</code><br>element:</p>
 * <pre><code class="lang-html">&lt;vaadin-split-layout&gt;
 *   &lt;div class=&quot;splitter-handle&quot;&gt;&amp;middot;&lt;/div&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;div&gt;Second content element&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface VaadinSplitLayoutElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-split-layout";
    @JsOverlay public static final String SRC = "vaadin-split-layout/vaadin-split-layout.html";


    /**
     * <p>Change the split layout to vertical</p>
     *
     * JavaScript Info:
     * @property vertical
     * @type Boolean
     * 
     */
    @JsProperty boolean getVertical();
    /**
     * <p>Change the split layout to vertical</p>
     *
     * JavaScript Info:
     * @property vertical
     * @type Boolean
     * 
     */
    @JsProperty void setVertical(boolean value);


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
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    void notifyResize();

}
