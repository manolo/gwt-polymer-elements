/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-list project by The Polymer Authors
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
 * <p><code>iron-list</code> displays a virtual, ‘infinite’ list. The template inside<br>the iron-list element represents the DOM to create for each list item.<br>The <code>items</code> property specifies an array of list item data.</p>
 * <p>For performance reasons, not every item in the list is rendered at once;<br>instead a small subset of actual template elements <em>(enough to fill the viewport)</em><br>are rendered and reused as the user scrolls. As such, it is important that all<br>state of the list template be bound to the model driving it, since the view may<br>be reused with a new model at any time. Particularly, any state that may change<br>as the result of a user interaction with the list item must be bound to the model<br>to avoid view state inconsistency.</p>
 * <h3 id="sizing-iron-list">Sizing iron-list</h3>
 * <p><code>iron-list</code> must either be explicitly sized, or delegate scrolling to an<br>explicitly sized parent. By “explicitly sized”, we mean it either has an explicit<br>CSS <code>height</code> property set via a class or inline style, or else is sized by other<br>layout means (e.g. the <code>flex</code> or <code>fit</code> classes).</p>
 * <h4 id="flexbox-jsbin-http-jsbin-com-kokaki-edit-html-output-">Flexbox - <a href="http://jsbin.com/kokaki/edit?html,output">jsbin</a></h4>
 * <pre><code class="lang-html">&lt;template is=&quot;x-list&quot;&gt;
 *   &lt;style&gt;
 *     :host {
 *       display: block;
 *       height: 100vh;
 *       display: flex;
 *       flex-direction: column;
 *     }
 * 
 *     iron-list {
 *       flex: 1 1 auto;
 *     }
 *   &lt;/style&gt;
 *   &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *   &lt;iron-list items=&quot;[[items]]&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         ...
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4 id="explicit-size-jsbin-http-jsbin-com-pibefo-edit-html-output-">Explicit size - <a href="http://jsbin.com/pibefo/edit?html,output">jsbin</a></h4>
 * <pre><code class="lang-html">&lt;template is=&quot;x-list&quot;&gt;
 *   &lt;style&gt;
 *     :host {
 *       display: block;
 *     }
 * 
 *     iron-list {
 *       height: 100vh; /* don&#39;t use % values unless the parent element is sized. * /
 *     }
 *   &lt;/style&gt;
 *   &lt;iron-list items=&quot;[[items]]&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         ...
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4 id="main-document-scrolling-jsbin-http-jsbin-com-cojuli-edit-html-output-">Main document scrolling - <a href="http://jsbin.com/cojuli/edit?html,output">jsbin</a></h4>
 * <pre><code class="lang-html">&lt;head&gt;
 *   &lt;style&gt;
 *     body {
 *       height: 100vh;
 *       margin: 0;
 *       display: flex;
 *       flex-direction: column;
 *     }
 * 
 *     app-toolbar {
 *       position: fixed;
 *       top: 0;
 *       left: 0;
 *       right: 0;
 *     }
 * 
 *     iron-list {
 *       /* add padding since the app-toolbar is fixed at the top * /
 *       padding-top: 64px;
 *     }
 *   &lt;/style&gt;
 * &lt;/head&gt;
 * &lt;body&gt;
 *   &lt;template is=&quot;dom-bind&quot;&gt;
 *     &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *     &lt;iron-list scroll-target=&quot;document&quot; items=&quot;[[items]]&quot;&gt;
 *       &lt;template&gt;
 *         &lt;div&gt;
 *           ...
 *         &lt;/div&gt;
 *       &lt;/template&gt;
 *     &lt;/iron-list&gt;
 *   &lt;/template&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <p><code>iron-list</code> must be given a <code>&lt;template&gt;</code> which contains exactly one element. In the examples<br>above we used a <code>&lt;div&gt;</code>, but you can provide any element (including custom elements).</p>
 * <h3 id="template-model">Template model</h3>
 * <p>List item templates should bind to template models of the following structure:</p>
 * <pre><code class="lang-js">{
 *   index: 0,        // index in the item array
 *   selected: false, // true if the current item is selected
 *   tabIndex: -1,    // a dynamically generated tabIndex for focus management
 *   item: {}         // user data corresponding to items[index]
 * }
 * </code></pre>
 * <p>Alternatively, you can change the property name used as data index by changing the<br><code>indexAs</code> property. The <code>as</code> property defines the name of the variable to add to the binding<br>scope for the array.</p>
 * <p>For example, given the following <code>data</code> array:</p>
 * <h5 id="data-json">data.json</h5>
 * <pre><code class="lang-js">[
 *   {&quot;name&quot;: &quot;Bob&quot;},
 *   {&quot;name&quot;: &quot;Tim&quot;},
 *   {&quot;name&quot;: &quot;Mike&quot;}
 * ]
 * </code></pre>
 * <p>The following code would render the list (note the name and checked properties are<br>bound from the model object provided to the template scope):</p>
 * <pre><code class="lang-html">&lt;template is=&quot;dom-bind&quot;&gt;
 *   &lt;iron-ajax url=&quot;data.json&quot; last-response=&quot;{{data}}&quot; auto&gt;&lt;/iron-ajax&gt;
 *   &lt;iron-list items=&quot;[[data]]&quot; as=&quot;item&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         Name: [[item.name]]
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h3 id="grid-layout">Grid layout</h3>
 * <p><code>iron-list</code> supports a grid layout in addition to linear layout by setting<br>the <code>grid</code> attribute.  In this case, the list template item must have both fixed<br>width and height (e.g. via CSS). Based on this, the number of items<br>per row are determined automatically based on the size of the list viewport.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p><code>iron-list</code> automatically manages the focus state for the items. It also provides<br>a <code>tabIndex</code> property within the template scope that can be used for keyboard navigation.<br>For example, users can press the up and down keys to move to previous and next<br>items in the list:</p>
 * <pre><code class="lang-html">&lt;iron-list items=&quot;[[data]]&quot; as=&quot;item&quot;&gt;
 *   &lt;template&gt;
 *     &lt;div tabindex$=&quot;[[tabIndex]]&quot;&gt;
 *       Name: [[item.name]]
 *     &lt;/div&gt;
 *   &lt;/template&gt;
 * &lt;/iron-list&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>You can use the <code>--iron-list-items-container</code> mixin to style the container of items:</p>
 * <pre><code class="lang-css">iron-list {
 *  --iron-list-items-container: {
 *     margin: auto;
 *   };
 * }
 * </code></pre>
 * <h3 id="resizing">Resizing</h3>
 * <p><code>iron-list</code> lays out the items when it receives a notification via the <code>iron-resize</code> event.<br>This event is fired by any element that implements <code>IronResizableBehavior</code>.</p>
 * <p>By default, elements such as <code>iron-pages</code>, <code>paper-tabs</code> or <code>paper-dialog</code> will trigger<br>this event automatically. If you hide the list manually (e.g. you use <code>display: none</code>)<br>you might want to implement <code>IronResizableBehavior</code> or fire this event manually right<br>after the list became visible again. For example:</p>
 * <pre><code class="lang-js">document.querySelector(&#39;iron-list&#39;).fire(&#39;iron-resize&#39;);
 * </code></pre>
 * <h3 id="when-should-iron-list-be-used-">When should <code>&lt;iron-list&gt;</code> be used?</h3>
 * <p><code>iron-list</code> should be used when a page has significantly more DOM nodes than the ones<br>visible on the screen. e.g. the page has 500 nodes, but only 20 are visible at a time.<br>This is why we refer to it as a <code>virtual</code> list. In this case, a <code>dom-repeat</code> will still<br>create 500 nodes which could slow down the web app, but <code>iron-list</code> will only create 20.</p>
 * <p>However, having an <code>iron-list</code> does not mean that you can load all the data at once.<br>Say you have a million records in the database, you want to split the data into pages<br>so you can bring in a page at the time. The page could contain 500 items, and iron-list<br>will only render 20.</p>
 */
@JsType(isNative=true)
public interface IronListElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-list";
    @JsOverlay public static final String SRC = "iron-list/iron-list.html";


    /**
     * <p>An array containing items determining how many instances of the template<br>to stamp and that that each template instance should bind to.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty JsArray getItems();
    /**
     * <p>An array containing items determining how many instances of the template<br>to stamp and that that each template instance should bind to.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty void setItems(JsArray value);

    /**
     * <p>Gets the index of the last visible item in the viewport.</p>
     *
     * JavaScript Info:
     * @property lastVisibleIndex
     * @type number
     * 
     */
    @JsProperty double getLastVisibleIndex();
    /**
     * <p>Gets the index of the last visible item in the viewport.</p>
     *
     * JavaScript Info:
     * @property lastVisibleIndex
     * @type number
     * 
     */
    @JsProperty void setLastVisibleIndex(double value);

    /**
     * <p>The max count of physical items the pool can extend to.</p>
     *
     * JavaScript Info:
     * @property maxPhysicalCount
     * @type Number
     * 
     */
    @JsProperty double getMaxPhysicalCount();
    /**
     * <p>The max count of physical items the pool can extend to.</p>
     *
     * JavaScript Info:
     * @property maxPhysicalCount
     * @type Number
     * 
     */
    @JsProperty void setMaxPhysicalCount(double value);

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
     * <p>The offset top from the scrolling element to the iron-list element.<br>This value can be computed using the position returned by <code>getBoundingClientRect()</code><br>although it’s preferred to use a constant value when possible.</p>
     * <p>This property is useful when an external scrolling element is used and there’s<br>some offset between the scrolling element and the list.<br>For example: a header is placed above the list.</p>
     *
     * JavaScript Info:
     * @property scrollOffset
     * @type Number
     * 
     */
    @JsProperty double getScrollOffset();
    /**
     * <p>The offset top from the scrolling element to the iron-list element.<br>This value can be computed using the position returned by <code>getBoundingClientRect()</code><br>although it’s preferred to use a constant value when possible.</p>
     * <p>This property is useful when an external scrolling element is used and there’s<br>some offset between the scrolling element and the list.<br>For example: a header is placed above the list.</p>
     *
     * JavaScript Info:
     * @property scrollOffset
     * @type Number
     * 
     */
    @JsProperty void setScrollOffset(double value);

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>When <code>multiSelection</code> is false, this is the currently selected item, or <code>null</code><br>if no item is selected.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>When <code>multiSelection</code> is false, this is the currently selected item, or <code>null</code><br>if no item is selected.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

    /**
     * <p>When <code>multiSelection</code> is true, this is an array that contains the selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSelectedItems();
    /**
     * <p>When <code>multiSelection</code> is true, this is an array that contains the selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Object
     * 
     */
    @JsProperty void setSelectedItems(JavaScriptObject value);

    /**
     * <p>Gets the index of the first visible item in the viewport.</p>
     *
     * JavaScript Info:
     * @property firstVisibleIndex
     * @type number
     * 
     */
    @JsProperty double getFirstVisibleIndex();
    /**
     * <p>Gets the index of the first visible item in the viewport.</p>
     *
     * JavaScript Info:
     * @property firstVisibleIndex
     * @type number
     * 
     */
    @JsProperty void setFirstVisibleIndex(double value);

    /**
     * <p>When true, the list is rendered as a grid. Grid items must have<br>fixed width and height set via CSS. e.g.</p>
     * <pre><code class="lang-html">&lt;iron-list grid&gt;
     *   &lt;template&gt;
     *      &lt;div style=&quot;width: 100px; height: 100px;&quot;&gt; 100x100 &lt;/div&gt;
     *   &lt;/template&gt;
     * &lt;/iron-list&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property grid
     * @type Boolean
     * 
     */
    @JsProperty boolean getGrid();
    /**
     * <p>When true, the list is rendered as a grid. Grid items must have<br>fixed width and height set via CSS. e.g.</p>
     * <pre><code class="lang-html">&lt;iron-list grid&gt;
     *   &lt;template&gt;
     *      &lt;div style=&quot;width: 100px; height: 100px;&quot;&gt; 100x100 &lt;/div&gt;
     *   &lt;/template&gt;
     * &lt;/iron-list&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property grid
     * @type Boolean
     * 
     */
    @JsProperty void setGrid(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>When true, tapping a row will select the item, placing its data model<br>in the set of selected items retrievable via the selection property.</p>
     * <p>Note that tapping focusable elements within the list item will not<br>result in selection, since they are presumed to have their * own action.</p>
     *
     * JavaScript Info:
     * @property selectionEnabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getSelectionEnabled();
    /**
     * <p>When true, tapping a row will select the item, placing its data model<br>in the set of selected items retrievable via the selection property.</p>
     * <p>Note that tapping focusable elements within the list item will not<br>result in selection, since they are presumed to have their * own action.</p>
     *
     * JavaScript Info:
     * @property selectionEnabled
     * @type Boolean
     * 
     */
    @JsProperty void setSelectionEnabled(boolean value);

    /**
     * <p>When <code>true</code>, multiple items may be selected at once (in this case,<br><code>selected</code> is an array of currently selected items).  When <code>false</code>,<br>only one item may be selected at a time.</p>
     *
     * JavaScript Info:
     * @property multiSelection
     * @type Boolean
     * 
     */
    @JsProperty boolean getMultiSelection();
    /**
     * <p>When <code>true</code>, multiple items may be selected at once (in this case,<br><code>selected</code> is an array of currently selected items).  When <code>false</code>,<br>only one item may be selected at a time.</p>
     *
     * JavaScript Info:
     * @property multiSelection
     * @type Boolean
     * 
     */
    @JsProperty void setMultiSelection(boolean value);

    /**
     * <p>The name of the variable to add to the binding scope to indicate<br>if the row is selected.</p>
     *
     * JavaScript Info:
     * @property selectedAs
     * @type String
     * 
     */
    @JsProperty String getSelectedAs();
    /**
     * <p>The name of the variable to add to the binding scope to indicate<br>if the row is selected.</p>
     *
     * JavaScript Info:
     * @property selectedAs
     * @type String
     * 
     */
    @JsProperty void setSelectedAs(String value);

    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty String getIndexAs();
    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty void setIndexAs(String value);

    /**
     * <p>The name of the variable to add to the binding scope for the array<br>element associated with a given template instance.</p>
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty String getAs();
    /**
     * <p>The name of the variable to add to the binding scope for the array<br>element associated with a given template instance.</p>
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    @JsProperty void setAs(String value);


    /**
     * <p>Deselects the given item list if it is already selected.</p>
     *
     * JavaScript Info:
     * @method deselectItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    void deselectItem(Object item);

    /**
     * <p>Updates the size of an item.</p>
     *
     * JavaScript Info:
     * @method updateSizeForItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    void updateSizeForItem(Object item);

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
     * <p>Select or deselect a given item depending on whether the item<br>has already been selected.</p>
     *
     * JavaScript Info:
     * @method toggleSelectionForItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    void toggleSelectionForItem(Object item);

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
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>Select the list item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    void selectItem(Object item);

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
     * <p>Clears the current selection state of the list.</p>
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     * 
     */
    void clearSelection();

    /**
     * <p>Invoke this method if you dynamically update the viewport’s<br>size or CSS padding.</p>
     *
     * JavaScript Info:
     * @method updateViewportBoundaries
     * 
     * 
     */
    void updateViewportBoundaries();

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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    void removeOwnKeyBindings();

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
     * <p>Scroll to a specific index in the virtual list regardless<br>of the physical items in the DOM tree.</p>
     *
     * JavaScript Info:
     * @method scrollToIndex
     * @param {number} idx  
     * 
     * 
     */
    void scrollToIndex(double idx);

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
     * <p>Scroll to a specific item in the virtual list regardless<br>of the physical items in the DOM tree.</p>
     *
     * JavaScript Info:
     * @method scrollToItem
     * @param {(Object)} item  
     * 
     * 
     */
    void scrollToItem(JavaScriptObject item);

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

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString);

}
