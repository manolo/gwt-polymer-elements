/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-listbox project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.iron.widget.event.IronActivateEvent;
import com.vaadin.polymer.iron.widget.event.IronActivateEventHandler;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronItemsChangedEvent;
import com.vaadin.polymer.iron.widget.event.IronItemsChangedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/menus.html">Menus</a></p>
 * <p><code>&lt;paper-listbox&gt;</code> implements an accessible listbox control with Material Design styling. The focused item<br>is highlighted, and the selected item has bolded text.</p>
 * <pre><code>&lt;paper-listbox&gt;
 *   &lt;paper-item&gt;Item 1&lt;/paper-item&gt;
 *   &lt;paper-item&gt;Item 2&lt;/paper-item&gt;
 * &lt;/paper-listbox&gt;
 * 
 * 
 * </code></pre><p>An initial selection can be specified with the <code>selected</code> attribute.</p>
 * <pre><code>&lt;paper-listbox selected=&quot;0&quot;&gt;
 *   &lt;paper-item&gt;Item 1&lt;/paper-item&gt;
 *   &lt;paper-item&gt;Item 2&lt;/paper-item&gt;
 * &lt;/paper-listbox&gt;
 * 
 * 
 * </code></pre><p>Make a multi-select listbox with the <code>multi</code> attribute. Items in a multi-select listbox can be deselected,<br>and multiple item can be selected.</p>
 * <pre><code>&lt;paper-listbox multi&gt;
 *   &lt;paper-item&gt;Item 1&lt;/paper-item&gt;
 *   &lt;paper-item&gt;Item 2&lt;/paper-item&gt;
 * &lt;/paper-listbox&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
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
 * <td><code>--paper-listbox-background-color</code></td>
 * <td>Menu background color</td>
 * <td><code>--primary-background-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-listbox-color</code></td>
 * <td>Menu foreground color</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-listbox</code></td>
 * <td>Mixin applied to the listbox</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p><code>&lt;paper-listbox&gt;</code> has <code>role=&quot;listbox&quot;</code> by default. A multi-select listbox will also have<br><code>aria-multiselectable</code> set. It implements key bindings to navigate through the listbox with the up and<br>down arrow keys, esc to exit the listbox, and enter to activate a listbox item. Typing the first letter<br>of a listbox item will also focus it.</p>
 */
public class PaperListbox extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperListbox() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperListbox(String html) {
        super(PaperListboxElement.TAG, PaperListboxElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperListboxElement getPolymerElement() {
        return (PaperListboxElement) getElement();
    }


    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
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
     * @behavior PaperTabs
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
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     */
    public void setSelectedItems(JsArray value) {
        getPolymerElement().setSelectedItems(value);
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
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getFocusedItem() {
        return getPolymerElement().getFocusedItem();
    }
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public void setFocusedItem(JavaScriptObject value) {
        getPolymerElement().setFocusedItem(value);
    }

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
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
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public Object getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public void setSelected(Object value) {
        getPolymerElement().setSelected(value);
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
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public String getFallbackSelection() {
        return getPolymerElement().getFallbackSelection();
    }
    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public void setFallbackSelection(String value) {
        getPolymerElement().setFallbackSelection(value);
    }

    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
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
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
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
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    public String getAttrForItemTitle() {
        return getPolymerElement().getAttrForItemTitle();
    }
    /**
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    public void setAttrForItemTitle(String value) {
        getPolymerElement().setAttrForItemTitle(value);
    }

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     */
    public void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }


    // Needed in UIBinder
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior PaperTabs
     */
    public void setSelectedItem(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItem", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @attribute selected-items
     * @behavior PaperTabs
     */
    public void setSelectedItems(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItems", value);
    }

    // Needed in UIBinder
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @attribute selected-values
     * @behavior PaperTabs
     */
    public void setSelectedValues(String value) {
        Polymer.property(this.getPolymerElement(), "selectedValues", value);
    }

    // Needed in UIBinder
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @attribute items
     * @behavior PaperTabs
     */
    public void setItems(String value) {
        Polymer.property(this.getPolymerElement(), "items", value);
    }

    // Needed in UIBinder
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @attribute selected
     * @behavior PaperTabs
     */
    public void setSelected(String value) {
        Polymer.property(this.getPolymerElement(), "selected", value);
    }

    // Needed in UIBinder
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @attribute focused-item
     * @behavior PaperTabs
     */
    public void setFocusedItem(String value) {
        Polymer.property(this.getPolymerElement(), "focusedItem", value);
    }

    // Needed in UIBinder
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(String value) {
        Polymer.property(this.getPolymerElement(), "keyEventTarget", value);
    }


    /**
     * <p>Selects the item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectIndex
     * @param {} index  
     * @behavior PaperTabs
     * 
     */
    public void selectIndex(Object index) {
        getPolymerElement().selectIndex(index);
    }

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
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * <p>Selects the given value. If the <code>multi</code> property is true, then the selected state of the<br><code>value</code> will be toggled; otherwise the <code>value</code> will be selected.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {(string|number)} value  
     * @behavior PaperTabs
     * 
     */
    public void select(Object value) {
        getPolymerElement().select(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     * 
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

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
    public void forceSynchronousItemUpdate() {
        getPolymerElement().forceSynchronousItemUpdate();
    }

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
    public boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString) {
        return getPolymerElement().keyboardEventMatchesKeys(event, eventString);
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
     * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a mutation record that<br>describes what changed.</p>
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
