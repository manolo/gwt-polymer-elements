/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-list project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronList extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronList() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronList(String html) {
        super(IronListElement.TAG, IronListElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronListElement getPolymerElement() {
        try {
            return (IronListElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>An array containing items determining how many instances of the template<br>to stamp and that that each template instance should bind to.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public JsArray getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * <p>An array containing items determining how many instances of the template<br>to stamp and that that each template instance should bind to.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>When <code>true</code>, multiple items may be selected at once (in this case,<br><code>selected</code> is an array of currently selected items).  When <code>false</code>,<br>only one item may be selected at a time.</p>
     *
     * JavaScript Info:
     * @property multiSelection
     * @type Boolean
     * 
     */
    public boolean getMultiSelection() {
        return getPolymerElement().getMultiSelection();
    }
    /**
     * <p>When <code>true</code>, multiple items may be selected at once (in this case,<br><code>selected</code> is an array of currently selected items).  When <code>false</code>,<br>only one item may be selected at a time.</p>
     *
     * JavaScript Info:
     * @property multiSelection
     * @type Boolean
     * 
     */
    public void setMultiSelection(boolean value) {
        getPolymerElement().setMultiSelection(value);
    }

    /**
     * <p>When <code>multiSelection</code> is false, this is the currently selected item, or <code>null</code><br>if no item is selected.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>When <code>multiSelection</code> is false, this is the currently selected item, or <code>null</code><br>if no item is selected.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }

    /**
     * <p>When <code>multiSelection</code> is true, this is an array that contains the selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Object
     * 
     */
    public JavaScriptObject getSelectedItems() {
        return getPolymerElement().getSelectedItems();
    }
    /**
     * <p>When <code>multiSelection</code> is true, this is an array that contains the selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Object
     * 
     */
    public void setSelectedItems(JavaScriptObject value) {
        getPolymerElement().setSelectedItems(value);
    }

    /**
     * <p>When true, tapping a row will select the item, placing its data model<br>in the set of selected items retrievable via the selection property.</p>
     * <p>Note that tapping focusable elements within the list item will not<br>result in selection, since they are presumed to have their * own action.</p>
     *
     * JavaScript Info:
     * @property selectionEnabled
     * @type Boolean
     * 
     */
    public boolean getSelectionEnabled() {
        return getPolymerElement().getSelectionEnabled();
    }
    /**
     * <p>When true, tapping a row will select the item, placing its data model<br>in the set of selected items retrievable via the selection property.</p>
     * <p>Note that tapping focusable elements within the list item will not<br>result in selection, since they are presumed to have their * own action.</p>
     *
     * JavaScript Info:
     * @property selectionEnabled
     * @type Boolean
     * 
     */
    public void setSelectionEnabled(boolean value) {
        getPolymerElement().setSelectionEnabled(value);
    }

    /**
     * <p>The name of the variable to add to the binding scope to indicate<br>if the row is selected.</p>
     *
     * JavaScript Info:
     * @property selectedAs
     * @type String
     * 
     */
    public String getSelectedAs() {
        return getPolymerElement().getSelectedAs();
    }
    /**
     * <p>The name of the variable to add to the binding scope to indicate<br>if the row is selected.</p>
     *
     * JavaScript Info:
     * @property selectedAs
     * @type String
     * 
     */
    public void setSelectedAs(String value) {
        getPolymerElement().setSelectedAs(value);
    }

    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.  If <code>sort</code> is provided, the index will reflect the<br>sorted order (rather than the original array order).</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public String getIndexAs() {
        return getPolymerElement().getIndexAs();
    }
    /**
     * <p>The name of the variable to add to the binding scope with the index<br>for the row.  If <code>sort</code> is provided, the index will reflect the<br>sorted order (rather than the original array order).</p>
     *
     * JavaScript Info:
     * @property indexAs
     * @type String
     * 
     */
    public void setIndexAs(String value) {
        getPolymerElement().setIndexAs(value);
    }

    /**
     * <p>The name of the variable to add to the binding scope for the array<br>element associated with a given template instance.</p>
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public String getAs() {
        return getPolymerElement().getAs();
    }
    /**
     * <p>The name of the variable to add to the binding scope for the array<br>element associated with a given template instance.</p>
     *
     * JavaScript Info:
     * @property as
     * @type String
     * 
     */
    public void setAs(String value) {
        getPolymerElement().setAs(value);
    }


    /**
     * <p>When <code>multiSelection</code> is false, this is the currently selected item, or <code>null</code><br>if no item is selected.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * 
     */
    public void setSelectedItem(String value) {
        getPolymerElement().setAttribute("selected-item", value);
    }

    /**
     * <p>When <code>multiSelection</code> is true, this is an array that contains the selected items.</p>
     *
     * JavaScript Info:
     * @attribute selected-items
     * 
     */
    public void setSelectedItems(String value) {
        getPolymerElement().setAttribute("selected-items", value);
    }

    /**
     * <p>An array containing items determining how many instances of the template<br>to stamp and that that each template instance should bind to.</p>
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        getPolymerElement().setAttribute("items", value);
    }


    /**
     * <p>Select the list item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    public void selectItem(Object item) {
        getPolymerElement().selectItem(item);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Select or deselect a given item depending on whether the item<br>has already been selected.</p>
     *
     * JavaScript Info:
     * @method toggleSelectionForItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    public void toggleSelectionForItem(Object item) {
        getPolymerElement().toggleSelectionForItem(item);
    }

    /**
     * <p>Deselects the given item list if it is already selected.</p>
     *
     * JavaScript Info:
     * @method deselectItem
     * @param {(Object|number)} item  
     * 
     * 
     */
    public void deselectItem(Object item) {
        getPolymerElement().deselectItem(item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior DomIf
     * 
     */
    public void modelForElement(Object el) {
        getPolymerElement().modelForElement(el);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * @behavior DomIf
     * 
     */
    public void stamp(Object model) {
        getPolymerElement().stamp(model);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior DomIf
     * 
     */
    public void templatize(Object template) {
        getPolymerElement().templatize(template);
    }

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Clears the current selection state of the list.</p>
     *
     * JavaScript Info:
     * @method clearSelection
     * 
     * 
     */
    public void clearSelection() {
        getPolymerElement().clearSelection();
    }

    /**
     * <p>Invoke this method if you dynamically update the viewport’s<br>size or CSS padding.</p>
     *
     * JavaScript Info:
     * @method updateViewportBoundaries
     * 
     * 
     */
    public void updateViewportBoundaries() {
        getPolymerElement().updateViewportBoundaries();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Scroll to a specific item in the virtual list regardless<br>of the physical items in the DOM tree.</p>
     *
     * JavaScript Info:
     * @method scrollToIndex
     * @param {number} idx  
     * 
     * 
     */
    public void scrollToIndex(double idx) {
        getPolymerElement().scrollToIndex(idx);
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
