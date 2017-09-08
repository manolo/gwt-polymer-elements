/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-group project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/selection-controls.html#selection-controls-radio-button">Radio button</a></p>
 * <p><code>paper-radio-group</code> allows user to select at most one radio button from a set.<br>Checking one radio button that belongs to a radio group unchecks any<br>previously checked radio button within the same group. Use<br><code>selected</code> to get or set the selected radio button.</p>
 * <p>The <paper-radio-buttons> inside the group must have the <code>name</code> attribute<br>set.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-radio-group selected=&quot;small&quot;&gt;
 *   &lt;paper-radio-button name=&quot;small&quot;&gt;Small&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;medium&quot;&gt;Medium&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;large&quot;&gt;Large&lt;/paper-radio-button&gt;
 * &lt;/paper-radio-group&gt;
 * 
 * 
 * </code></pre><p>Radio-button-groups can be made optional, and allow zero buttons to be selected:</p>
 * <pre><code>&lt;paper-radio-group selected=&quot;small&quot; allow-empty-selection&gt;
 *   &lt;paper-radio-button name=&quot;small&quot;&gt;Small&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;medium&quot;&gt;Medium&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;large&quot;&gt;Large&lt;/paper-radio-button&gt;
 * &lt;/paper-radio-group&gt;
 * 
 * 
 * </code></pre><p>See <a href="paper-radio-button">paper-radio-button</a> for more<br>information about <code>paper-radio-button</code>.</p>
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
 * <td><code>--paper-radio-group-item-padding</code></td>
 * <td>The padding of the item</td>
 * <td><code>12px</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperRadioGroupElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-radio-group";
    @JsOverlay public static final String SRC = "paper-radio-group/paper-radio-group.html";


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
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getFocusedItem();
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    @JsProperty void setFocusedItem(JavaScriptObject value);

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
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    @JsProperty boolean getDisabled();
    /**
     * 
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTabs
     */
    @JsProperty void setDisabled(boolean value);

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
     * <p>If true, radio-buttons can be deselected</p>
     *
     * JavaScript Info:
     * @property allowEmptySelection
     * @type Boolean
     * 
     */
    @JsProperty boolean getAllowEmptySelection();
    /**
     * <p>If true, radio-buttons can be deselected</p>
     *
     * JavaScript Info:
     * @property allowEmptySelection
     * @type Boolean
     * 
     */
    @JsProperty void setAllowEmptySelection(boolean value);

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    @JsProperty Object getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    @JsProperty void setSelected(Object value);

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
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * 
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * 
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
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty String getAttrForItemTitle();
    /**
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    @JsProperty void setAttrForItemTitle(String value);


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
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * @behavior PaperTabs
     * 
     */
    void multiChanged(Object multi);

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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    void removeOwnKeyBindings();

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
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     * 
     */
    void selectNext();

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

    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     * 
     */
    void indexOf(JavaScriptObject item);

}
