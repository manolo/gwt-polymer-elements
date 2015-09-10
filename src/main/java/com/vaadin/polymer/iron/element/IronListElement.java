/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-list project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>iron-list</code> displays a virtual, ‘infinite’ list. The template inside<br>the iron-list element represents the DOM to create for each list item.<br>The <code>items</code> property specifies an array of list item data.</p>
 * <p>For performance reasons, not every item in the list is rendered at once;<br>instead a small subset of actual template elements <em>(enough to fill the viewport)</em><br>are rendered and reused as the user scrolls. As such, it is important that all<br>state of the list template be bound to the model driving it, since the view may<br>be reused with a new model at any time. Particularly, any state that may change<br>as the result of a user interaction with the list item must be bound to the model<br>to avoid view state inconsistency.</p>
 * <p><strong>Important:</strong> <code>iron-list</code> must ether be explicitly sized, or delegate scrolling to an<br>explicitly sized parent. By “explicitly sized”, we mean it either has an explicit<br>CSS <code>height</code> property set via a class or inline style, or else is sized by other<br>layout means (e.g. the <code>flex</code> or <code>fit</code> classes).</p>
 * <h3 id="template-model">Template model</h3>
 * <p>List item templates should bind to template models of the following structure:</p>
 * <pre><code>{
 *   index: 0,     // data index for this item
 *   item: {       // user data corresponding to items[index]
 *     /* user item data  * /
 *   }
 * }
 * 
 * 
 * </code></pre><p>Alternatively, you can change the property name used as data index by changing the<br><code>indexAs</code> property. The <code>as</code> property defines the name of the variable to add to the binding<br>scope for the array.</p>
 * <p>For example, given the following <code>data</code> array:</p>
 * <h5 id="data-json">data.json</h5>
 * <pre><code>[
 *   {&quot;name&quot;: &quot;Bob&quot;},
 *   {&quot;name&quot;: &quot;Tim&quot;},
 *   {&quot;name&quot;: &quot;Mike&quot;}
 * ]
 * 
 * 
 * </code></pre><p>The following code would render the list (note the name and checked properties are<br>bound from the model object provided to the template scope):</p>
 * <pre><code>&lt;template is=&quot;dom-bind&quot;&gt;
 *   &lt;iron-ajax url=&quot;data.json&quot; last-response=&quot;{{data}}&quot; auto&gt;&lt;/iron-ajax&gt;
 *   &lt;iron-list items=&quot;[[data]]&quot; as=&quot;item&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         Name: &lt;span&gt;[[item.name]]&lt;/span&gt;
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * 
 * 
 * </code></pre><h3 id="resizing">Resizing</h3>
 * <p><code>iron-list</code> lays out the items when it recives a notification via the <code>resize</code> event.<br>This event is fired by any element that implements <code>IronResizableBehavior</code>.</p>
 * <p>By default, elements such as <code>iron-pages</code>, <code>paper-tabs</code> or <code>paper-dialog</code> will trigger<br>this event automatically. If you hide the list manually (e.g. you use <code>display: none</code>)<br>you might want to implement <code>IronResizableBehavior</code> or fire this event manually right<br>after the list became visible again. e.g.</p>
 * <pre><code>document.querySelector(&#39;iron-list&#39;).fire(&#39;resize&#39;);
 * 
 * 
 * 
 * </code></pre>
 */
@JsType
public interface IronListElement extends HTMLElement {

    public static final String TAG = "iron-list";
    public static final String SRC = "iron-list/iron-list.html";


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
     * <p>Clears the current selection state of the list.</p>
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     */
    void clearSelection();

    /**
     * <p>Deselects the given item list if it is already selected.</p>
     *
     * JavaScript Info:
     * @method deselectItem
     * @param {(Object|number)} item  
     * 
     */
    void deselectItem(JavaScriptObject item);

    /**
     * <p>Gets the first visible item in the viewport.</p>
     *
     * JavaScript Info:
     * @method firstVisibleIndex
     * 
     */
    void firstVisibleIndex();

    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.  If <code>sort</code> is provided, the index will reflect the<br>sorted order (rather than the original array order).</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty String getIndexAs();
    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.  If <code>sort</code> is provided, the index will reflect the<br>sorted order (rather than the original array order).</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    @JsProperty void setIndexAs(String value);
  
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
     * <p>Scroll to a specific item in the virtual list regardless<br>of the physical items in the DOM tree.</p>
     *
     * JavaScript Info:
     * @method scrollToIndex
     * @param {number} idx  
     * 
     */
    void scrollToIndex(double idx);

    /**
     * <p>Select the list item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectItem
     * @param {(Object|number)} item  
     * 
     */
    void selectItem(JavaScriptObject item);

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
     * <p>Select or deselect a given item depending on whether the item<br>has already been selected.</p>
     *
     * JavaScript Info:
     * @method toggleSelectionForItem
     * @param {(Object|number)} item  
     * 
     */
    void toggleSelectionForItem(JavaScriptObject item);

    /**
     * <p>Invoke this method if you dynamically update the viewport’s<br>size or CSS padding.</p>
     *
     * JavaScript Info:
     * @method updateViewportBoundaries
     * 
     */
    void updateViewportBoundaries();

    /**
     * <p>When the element has been attached to the DOM tree.</p>
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * <p>When the element has been removed from the DOM tree.</p>
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    void assignParentResizable(JavaScriptObject parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    void resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    void stopResizeNotificationsFor(JavaScriptObject target);

}
