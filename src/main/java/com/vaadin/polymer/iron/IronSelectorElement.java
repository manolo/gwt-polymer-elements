/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-selector project by The Polymer Authors
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
 * <p>  <code>iron-selector</code> is an element which can be used to manage a list of elements<br>  that can be selected.  Tapping on the item will make the item selected.  The <code>selected</code> indicates<br>  which item is being selected.  The default is to use the index of the item.</p>
 * <p>  Example:</p>
 * <pre><code>  &lt;iron-selector selected=&quot;0&quot;&gt;
 *     &lt;div&gt;Item 1&lt;/div&gt;
 *     &lt;div&gt;Item 2&lt;/div&gt;
 *     &lt;div&gt;Item 3&lt;/div&gt;
 *   &lt;/iron-selector&gt;
 * 
 * 
 * </code></pre><p>  If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>  set <code>attrForSelected</code> to the name of the attribute.  For example, if you want to select item by<br>  <code>name</code>, set <code>attrForSelected</code> to <code>name</code>.</p>
 * <p>  Example:</p>
 * <pre><code>  &lt;iron-selector attr-for-selected=&quot;name&quot; selected=&quot;foo&quot;&gt;
 *     &lt;div name=&quot;foo&quot;&gt;Foo&lt;/div&gt;
 *     &lt;div name=&quot;bar&quot;&gt;Bar&lt;/div&gt;
 *     &lt;div name=&quot;zot&quot;&gt;Zot&lt;/div&gt;
 *   &lt;/iron-selector&gt;
 * 
 * 
 * </code></pre><p>  You can specify a default fallback with <code>fallbackSelection</code> in case the <code>selected</code> attribute does<br>  not match the <code>attrForSelected</code> attribute of any elements.</p>
 * <p>  Example:</p>
 * <pre><code>    &lt;iron-selector attr-for-selected=&quot;name&quot; selected=&quot;non-existing&quot;
 *                    fallback-selection=&quot;default&quot;&gt;
 *       &lt;div name=&quot;foo&quot;&gt;Foo&lt;/div&gt;
 *       &lt;div name=&quot;bar&quot;&gt;Bar&lt;/div&gt;
 *       &lt;div name=&quot;default&quot;&gt;Default&lt;/div&gt;
 *     &lt;/iron-selector&gt;
 * 
 * 
 * </code></pre><p>  Note: When the selector is multi, the selection will set to <code>fallbackSelection</code> iff<br>  the number of matching elements is zero.</p>
 * <p>  <code>iron-selector</code> is not styled. Use the <code>iron-selected</code> CSS class to style the selected element.</p>
 * <p>  Example:</p>
 * <pre><code>  &lt;style&gt;
 *     .iron-selected {
 *       background: #eee;
 *     }
 *   &lt;/style&gt;
 * 
 *   ...
 * 
 *   &lt;iron-selector selected=&quot;0&quot;&gt;
 *     &lt;div&gt;Item 1&lt;/div&gt;
 *     &lt;div&gt;Item 2&lt;/div&gt;
 *     &lt;div&gt;Item 3&lt;/div&gt;
 *   &lt;/iron-selector&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronSelectorElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-selector";
    @JsOverlay public static final String SRC = "iron-selector/iron-selector.html";


    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    @JsProperty boolean getMulti();
    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    @JsProperty void setMulti(boolean value);

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * 
     */
    @JsProperty Object getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * 
     */
    @JsProperty void setSelected(Object value);

    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty JsArray getItems();
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty void setItems(JsArray value);

    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty JsArray getSelectedValues();
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedValues(JsArray value);

    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * 
     */
    @JsProperty JsArray getSelectedItems();
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * 
     */
    @JsProperty void setSelectedItems(JsArray value);

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getActivateEvent();
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setActivateEvent(String value);

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedClass();
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedClass(String value);

    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setAttrForSelected(String value);

    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getFallbackSelection();
    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setFallbackSelection(String value);

    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedAttribute();
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedAttribute(String value);

    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectable();
    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectable(String value);


    /**
     * <p>Selects the given value. If the <code>multi</code> property is true, then the selected state of the<br><code>value</code> will be toggled; otherwise the <code>value</code> will be selected.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {(string|number)} value  
     * @behavior PaperTabs
     * 
     */
    void select(Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * 
     * 
     */
    void multiChanged(Object multi);

    /**
     * <p>Selects the item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectIndex
     * @param {} index  
     * @behavior PaperTabs
     * 
     */
    void selectIndex(Object index);

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     * 
     */
    void selectNext();

    /**
     * <p>Force a synchronous update of the <code>items</code> property.</p>
     * <p>NOTE: Consider listening for the <code>iron-items-changed</code> event to respond to<br>updates to the set of selectable items after updates to the DOM list and<br>selection state have been made.</p>
     * <p>WARNING: If you are using this method, you should probably consider an<br>alternate approach. Synchronously querying for items is potentially<br>slow for many use cases. The <code>items</code> property will update asynchronously<br>on its own to reflect selectable items in the DOM.</p>
     *
     * JavaScript Info:
     * @method forceSynchronousItemUpdate
     * @behavior PaperTabs
     * 
     */
    void forceSynchronousItemUpdate();

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     * 
     */
    void selectPrevious();

    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * 
     * 
     */
    void indexOf(JavaScriptObject item);

}
