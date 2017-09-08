/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/tabs.html">Tabs</a></p>
 * <p><code>paper-tabs</code> makes it easy to explore and switch between different views or functional aspects of<br>an app, or to browse categorized data sets.</p>
 * <p>Use <code>selected</code> property to get or set the selected tab.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-tabs selected=&quot;0&quot;&gt;
 *   &lt;paper-tab&gt;TAB 1&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;TAB 2&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;TAB 3&lt;/paper-tab&gt;
 * &lt;/paper-tabs&gt;
 * 
 * 
 * </code></pre><p>See <a href="?active=paper-tab">paper-tab</a> for more information about<br><code>paper-tab</code>.</p>
 * <p>A common usage for <code>paper-tabs</code> is to use it along with <code>iron-pages</code> to switch<br>between different views.</p>
 * <pre><code>&lt;paper-tabs selected=&quot;{{selected}}&quot;&gt;
 *   &lt;paper-tab&gt;Tab 1&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;Tab 2&lt;/paper-tab&gt;
 *   &lt;paper-tab&gt;Tab 3&lt;/paper-tab&gt;
 * &lt;/paper-tabs&gt;
 * 
 * &lt;iron-pages selected=&quot;{{selected}}&quot;&gt;
 *   &lt;div&gt;Page 1&lt;/div&gt;
 *   &lt;div&gt;Page 2&lt;/div&gt;
 *   &lt;div&gt;Page 3&lt;/div&gt;
 * &lt;/iron-pages&gt;
 * 
 * 
 * 
 * </code></pre><p>To use links in tabs, add <code>link</code> attribute to <code>paper-tab</code> and put an <code>&lt;a&gt;</code><br>element in <code>paper-tab</code> with a <code>tabindex</code> of -1.</p>
 * <p>Example:</p>
 * <pre><code>
 * &lt;style is="custom-style">
 *   .link {
 *     &#64;apply(--layout-horizontal);
 *     &#64;apply(--layout-center-center);
 *   }
 * &lt;/style>
 * 
 * &lt;paper-tabs selected="0">
 *   &lt;paper-tab link>
 *     &lt;a href="#link1" class="link" tabindex="-1">TAB ONE&lt;/a>
 *   &lt;/paper-tab>
 *   &lt;paper-tab link>
 *     &lt;a href="#link2" class="link" tabindex="-1">TAB TWO&lt;/a>
 *   &lt;/paper-tab>
 *   &lt;paper-tab link>
 *     &lt;a href="#link3" class="link" tabindex="-1">TAB THREE&lt;/a>
 *   &lt;/paper-tab>
 * &lt;/paper-tabs>
 * </code></pre>
 * 
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--paper-tabs-selection-bar-color</code></td>
 * <td>Color for the selection bar</td>
 * <td><code>--paper-yellow-a100</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-selection-bar</code></td>
 * <td>Mixin applied to the selection bar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs</code></td>
 * <td>Mixin applied to the tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-content</code></td>
 * <td>Mixin applied to the content container of tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs-container</code></td>
 * <td>Mixin applied to the layout container of tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperTabsElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-tabs";
    @JsOverlay public static final String SRC = "paper-tabs/paper-tabs.html";


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
     * <p>The delay (in milliseconds) between when the user stops interacting<br>with the tabs through the keyboard and when the focused item is<br>automatically selected (if <code>autoselect</code> is true).</p>
     *
     * JavaScript Info:
     * @property autoselectDelay
     * @type Number
     * 
     */
    @JsProperty double getAutoselectDelay();
    /**
     * <p>The delay (in milliseconds) between when the user stops interacting<br>with the tabs through the keyboard and when the focused item is<br>automatically selected (if <code>autoselect</code> is true).</p>
     *
     * JavaScript Info:
     * @property autoselectDelay
     * @type Number
     * 
     */
    @JsProperty void setAutoselectDelay(double value);

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
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlignBottom();
    /**
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    @JsProperty void setAlignBottom(boolean value);

    /**
     * <p>If true, tabs are automatically selected when focused using the<br>keyboard.</p>
     *
     * JavaScript Info:
     * @property autoselect
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoselect();
    /**
     * <p>If true, tabs are automatically selected when focused using the<br>keyboard.</p>
     *
     * JavaScript Info:
     * @property autoselect
     * @type Boolean
     * 
     */
    @JsProperty void setAutoselect(boolean value);

    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoBar();
    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    @JsProperty void setNoBar(boolean value);

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
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoSlide();
    /**
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    @JsProperty void setNoSlide(boolean value);

    /**
     * <p>If true, ink ripple effect is disabled. When this property is changed,<br>all descendant <code>&lt;paper-tab&gt;</code> elements have their <code>noink</code> property<br>changed to the new value as well.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, ink ripple effect is disabled. When this property is changed,<br>all descendant <code>&lt;paper-tab&gt;</code> elements have their <code>noink</code> property<br>changed to the new value as well.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty void setNoink(boolean value);

    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    @JsProperty boolean getScrollable();
    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    @JsProperty void setScrollable(boolean value);

    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisableDrag();
    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    @JsProperty void setDisableDrag(boolean value);

    /**
     * <p>If true, tabs expand to fit their container. This currently only applies when<br>scrollable is true.</p>
     *
     * JavaScript Info:
     * @property fitContainer
     * @type Boolean
     * 
     */
    @JsProperty boolean getFitContainer();
    /**
     * <p>If true, tabs expand to fit their container. This currently only applies when<br>scrollable is true.</p>
     *
     * JavaScript Info:
     * @property fitContainer
     * @type Boolean
     * 
     */
    @JsProperty void setFitContainer(boolean value);

    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    @JsProperty boolean getHideScrollButtons();
    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    @JsProperty void setHideScrollButtons(boolean value);

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
     * @behavior PaperTabs
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
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    void notifyResize();

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
