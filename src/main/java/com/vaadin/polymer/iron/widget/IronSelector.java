/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-selector project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronActivateEvent;
import com.vaadin.polymer.iron.widget.event.IronActivateEventHandler;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronItemsChangedEvent;
import com.vaadin.polymer.iron.widget.event.IronItemsChangedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronSelector extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronSelector() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronSelector(String html) {
        super(IronSelectorElement.TAG, IronSelectorElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronSelectorElement getPolymerElement() {
        try {
            return (IronSelectorElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    public boolean getMulti() {
        return getPolymerElement().getMulti();
    }
    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * 
     */
    public void setMulti(boolean value) {
        getPolymerElement().setMulti(value);
    }

    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * 
     */
    public JsArray getSelectedItems() {
        return getPolymerElement().getSelectedItems();
    }
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * 
     */
    public void setSelectedItems(JsArray value) {
        getPolymerElement().setSelectedItems(value);
    }

    /**
     * <p>The list of items from which a selection can be made.</p>
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
     * <p>The list of items from which a selection can be made.</p>
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
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    public JsArray getSelectedValues() {
        return getPolymerElement().getSelectedValues();
    }
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    public void setSelectedValues(JsArray value) {
        getPolymerElement().setSelectedValues(value);
    }

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * 
     */
    public String getSelectedClass() {
        return getPolymerElement().getSelectedClass();
    }
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * 
     */
    public void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * @behavior PaperTabs
     */
    public String getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * @behavior PaperTabs
     */
    public void setSelected(String value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectable() {
        return getPolymerElement().getSelectable();
    }
    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectable(String value) {
        getPolymerElement().setSelectable(value);
    }

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public String getActivateEvent() {
        return getPolymerElement().getActivateEvent();
    }
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public void setActivateEvent(String value) {
        getPolymerElement().setActivateEvent(value);
    }

    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public String getAttrForSelected() {
        return getPolymerElement().getAttrForSelected();
    }
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public void setAttrForSelected(String value) {
        getPolymerElement().setAttrForSelected(value);
    }

    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public String getSelectedAttribute() {
        return getPolymerElement().getSelectedAttribute();
    }
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public void setSelectedAttribute(String value) {
        getPolymerElement().setSelectedAttribute(value);
    }


    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        getPolymerElement().setAttribute("items", value);
    }

    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @attribute selected-items
     * 
     */
    public void setSelectedItems(String value) {
        getPolymerElement().setAttribute("selected-items", value);
    }

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior PaperTabs
     */
    public void setSelectedItem(String value) {
        getPolymerElement().setAttribute("selected-item", value);
    }

    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @attribute selected-values
     * 
     */
    public void setSelectedValues(String value) {
        getPolymerElement().setAttribute("selected-values", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * 
     * 
     */
    public void multiChanged(Object multi) {
        getPolymerElement().multiChanged(multi);
    }

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     * 
     */
    public void selectNext() {
        getPolymerElement().selectNext();
    }

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * 
     * 
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }

    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     * 
     */
    public void indexOf(JavaScriptObject item) {
        getPolymerElement().indexOf(item);
    }

    /**
     * <p>Selects the given value. If the <code>multi</code> property is true, then the selected state of the<br><code>value</code> will be toggled; otherwise the <code>value</code> will be selected.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {string} value  
     * @behavior PaperTabs
     * 
     */
    public void select(String value) {
        getPolymerElement().select(value);
    }


    /**
     * <p>Fired when iron-selector is activated (selected or deselected).<br>It is fired before the selected items are changed.<br>Cancel the event to abort selection.</p>
     *
     * JavaScript Info:
     * @event iron-activate
     */
    public HandlerRegistration addIronActivateHandler(IronActivateEventHandler handler) {
        return addDomHandler(handler, IronActivateEvent.TYPE);
    }

    /**
     * <p>Fired when an item is deselected</p>
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addDomHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a list of mutation<br>records that describe what changed.</p>
     *
     * JavaScript Info:
     * @event iron-items-changed
     */
    public HandlerRegistration addIronItemsChangedHandler(IronItemsChangedEventHandler handler) {
        return addDomHandler(handler, IronItemsChangedEvent.TYPE);
    }

    /**
     * <p>Fired when an item is selected</p>
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addDomHandler(handler, IronSelectEvent.TYPE);
    }

}
