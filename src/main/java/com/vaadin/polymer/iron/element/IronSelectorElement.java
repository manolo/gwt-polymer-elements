/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-selector project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
 * </code></pre><p>  <code>iron-selector</code> is not styled. Use the <code>iron-selected</code> CSS class to style the selected element.</p>
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
@JsType
public interface IronSelectorElement extends HTMLElement {

    public static final String TAG = "iron-selector";
    public static final String SRC = "iron-selector/iron-selector.html";


    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
     */
    @JsProperty boolean getMulti();
    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
     */
    @JsProperty void setMulti(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * @behavior PaperTabs
     */
    void multiChanged(JavaScriptObject multi);

    /**
     * <p>Selects the given value. If the <code>multi</code> property is true, then the selected state of the<br><code>value</code> will be toggled; otherwise the <code>value</code> will be selected.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {string} value  
     * @behavior PaperTabs
     */
    void select(String value);

    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty JsArray getSelectedItems();
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedItems(JsArray value);
  
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
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getActivateEvent();
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setActivateEvent(String value);
  
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setAttrForSelected(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getExcludedLocalNames();
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setExcludedLocalNames(JavaScriptObject value);
  
    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     */
    void indexOf(JavaScriptObject item);

    /**
     * <p>Returns an array of selectable items.</p>
     *
     * JavaScript Info:
     * @method items
     * @behavior PaperTabs
     */
    void items();

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     */
    void selectNext();

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     */
    void selectPrevious();

    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectable();
    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectable(String value);
  
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelected(String value);
  
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedAttribute();
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedAttribute(String value);
  
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedClass();
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedClass(String value);
  
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    void detached();

}
