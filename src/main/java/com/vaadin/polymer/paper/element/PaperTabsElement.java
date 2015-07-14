/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
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
 * </code></pre><p>See <a href="#paper-tab">paper-tab</a> for more information about<br><code>paper-tab</code>.</p>
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
 * </code></pre><p>To use links in tabs, add <code>link</code> attribute to <code>paper-tab</code> and put an <code>&lt;a&gt;</code><br>element in <code>paper-tab</code>.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-tabs selected=&quot;0&quot;&gt;
 *   &lt;paper-tab link&gt;
 *     &lt;a href=&quot;#link1&quot; class=&quot;horizontal center-center layout&quot;&gt;TAB ONE&lt;/a&gt;
 *   &lt;/paper-tab&gt;
 *   &lt;paper-tab link&gt;
 *     &lt;a href=&quot;#link2&quot; class=&quot;horizontal center-center layout&quot;&gt;TAB TWO&lt;/a&gt;
 *   &lt;/paper-tab&gt;
 *   &lt;paper-tab link&gt;
 *     &lt;a href=&quot;#link3&quot; class=&quot;horizontal center-center layout&quot;&gt;TAB THREE&lt;/a&gt;
 *   &lt;/paper-tab&gt;
 * &lt;/paper-tabs&gt;
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
 * <td><code>--paper-tabs-selection-bar-color</code></td>
 * <td>Color for the selection bar</td>
 * <td><code>--paper-yellow-a100</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tabs</code></td>
 * <td>Mixin applied to the tabs</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperTabsElement extends HTMLElement {

    public static final String TAG = "paper-tabs";
    public static final String SRC = "paper-tabs/paper-tabs.html";


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
     * <p>If true, ink ripple effect is disabled.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, ink ripple effect is disabled.</p>
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
     * 
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    @JsProperty String getSelectable();
    /**
     * 
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    @JsProperty void setSelectable(String value);
  
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    @JsProperty String getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    @JsProperty void setSelected(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
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
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getFocusedItem();
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setFocusedItem(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} value  
     * @behavior PaperTabs
     */
    void select(JavaScriptObject value);

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
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTabs
     */
    void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTabs
     */
    void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTabs
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTabs
     */
    void registered();

}
