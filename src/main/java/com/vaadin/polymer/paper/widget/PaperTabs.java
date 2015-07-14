/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PaperTabs extends PaperTabsBase {
    /**
     * Default Constructor.
     */
    public PaperTabs() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperTabs(String html) {
        super(PaperTabsElement.TAG, PaperTabsElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronDeselectEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronDeselectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronDeselectEvent event) {
                fireEvent(new IronDeselectEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronSelectEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronSelectEvent event) {
                fireEvent(new IronSelectEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperTabsElement getPolymerElement() {
        return (PaperTabsElement) getElement();
    }


  
    /**
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    public boolean getAlignBottom(){
        return getPolymerElement().getAlignBottom();
    }
    /**
     * <p>If true, the tabs are aligned to bottom (the selection bar appears at the top).</p>
     *
     * JavaScript Info:
     * @property alignBottom
     * @type Boolean
     * 
     */
    public void setAlignBottom(boolean value) {
        getPolymerElement().setAlignBottom(value);
    }
   
  

  
    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    public boolean getDisableDrag(){
        return getPolymerElement().getDisableDrag();
    }
    /**
     * <p>If true, dragging on the tabs to scroll is disabled.</p>
     *
     * JavaScript Info:
     * @property disableDrag
     * @type Boolean
     * 
     */
    public void setDisableDrag(boolean value) {
        getPolymerElement().setDisableDrag(value);
    }
   
  

  
    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    public boolean getHideScrollButtons(){
        return getPolymerElement().getHideScrollButtons();
    }
    /**
     * <p>If true, scroll buttons (left/right arrow) will be hidden for scrollable tabs.</p>
     *
     * JavaScript Info:
     * @property hideScrollButtons
     * @type Boolean
     * 
     */
    public void setHideScrollButtons(boolean value) {
        getPolymerElement().setHideScrollButtons(value);
    }
   
  

  
    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    public boolean getNoBar(){
        return getPolymerElement().getNoBar();
    }
    /**
     * <p>If true, the bottom bar to indicate the selected tab will not be shown.</p>
     *
     * JavaScript Info:
     * @property noBar
     * @type Boolean
     * 
     */
    public void setNoBar(boolean value) {
        getPolymerElement().setNoBar(value);
    }
   
  

  
    /**
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    public boolean getNoSlide(){
        return getPolymerElement().getNoSlide();
    }
    /**
     * <p>If true, the slide effect for the bottom bar is disabled.</p>
     *
     * JavaScript Info:
     * @property noSlide
     * @type Boolean
     * 
     */
    public void setNoSlide(boolean value) {
        getPolymerElement().setNoSlide(value);
    }
   
  

  
    /**
     * <p>If true, ink ripple effect is disabled.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public boolean getNoink(){
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, ink ripple effect is disabled.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }
   
  

  
    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    public boolean getScrollable(){
        return getPolymerElement().getScrollable();
    }
    /**
     * <p>If true, tabs are scrollable and the tab width is based on the label width.</p>
     *
     * JavaScript Info:
     * @property scrollable
     * @type Boolean
     * 
     */
    public void setScrollable(boolean value) {
        getPolymerElement().setScrollable(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    public String getSelectable(){
        return getPolymerElement().getSelectable();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    public void setSelectable(String value) {
        getPolymerElement().setSelectable(value);
    }
   
  

  
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public String getSelected(){
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public void setSelected(String value) {
        getPolymerElement().setSelected(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    public void assignParentResizable(JavaScriptObject parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }
  

  
    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }
  

  
    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    public void resizerShouldNotify(JavaScriptObject element) {
        getPolymerElement().resizerShouldNotify(element);
    }
  

  
    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    public void stopResizeNotificationsFor(JavaScriptObject target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getKeyBindings(){
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }
   
  

  
    /**
     * <p>The attribute to use on menu items to look up the item title. Typing the first<br>letter of an item when the menu is open focuses that item. If unset, <code>textContent</code><br>will be used.</p>
     *
     * JavaScript Info:
     * @property attrForItemTitle
     * @type String
     * @behavior PaperTabs
     */
    public String getAttrForItemTitle(){
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
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getFocusedItem(){
        return getPolymerElement().getFocusedItem();
    }
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @property focusedItem
     * @type Object
     * @behavior PaperTabs
     */
    public void setFocusedItem(JavaScriptObject value) {
        getPolymerElement().setFocusedItem(value);
    }
   
    /**
     * <p>Returns the currently focused item.</p>
     *
     * JavaScript Info:
     * @attribute focused-item
     * @behavior PaperTabs
     */
    public void setFocusedItem(String value) {
        getPolymerElement().setAttribute("focused-item", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method select
     * @param {} value  
     * @behavior PaperTabs
     */
    public void select(JavaScriptObject value) {
        getPolymerElement().select(value);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  

  
    /**
     * <p>If true, multiple selections are allowed.</p>
     *
     * JavaScript Info:
     * @property multi
     * @type Boolean
     * @behavior PaperTabs
     */
    public boolean getMulti(){
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
     * 
     *
     * JavaScript Info:
     * @method multiChanged
     * @param {} multi  
     * @behavior PaperTabs
     */
    public void multiChanged(JavaScriptObject multi) {
        getPolymerElement().multiChanged(multi);
    }
  

  
    /**
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @property selectedItems
     * @type Array
     * @behavior PaperTabs
     */
    public JsArray getSelectedItems(){
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
     * <p>Returns an array of currently selected items.</p>
     *
     * JavaScript Info:
     * @attribute selected-items
     * @behavior PaperTabs
     */
    public void setSelectedItems(String value) {
        getPolymerElement().setAttribute("selected-items", value);
    }
   
  

  
    /**
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @property selectedValues
     * @type Array
     * @behavior PaperTabs
     */
    public JsArray getSelectedValues(){
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
     * <p>Gets or sets the selected elements. This is used instead of <code>selected</code> when <code>multi</code><br>is true.</p>
     *
     * JavaScript Info:
     * @attribute selected-values
     * @behavior PaperTabs
     */
    public void setSelectedValues(String value) {
        getPolymerElement().setAttribute("selected-values", value);
    }
   
  

  
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
     * @behavior PaperTabs
     */
    public String getActivateEvent(){
        return getPolymerElement().getActivateEvent();
    }
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
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
     * @type string
     * @behavior PaperTabs
     */
    public String getAttrForSelected(){
        return getPolymerElement().getAttrForSelected();
    }
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    public void setAttrForSelected(String value) {
        getPolymerElement().setAttrForSelected(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getExcludedLocalNames(){
        return getPolymerElement().getExcludedLocalNames();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    public void setExcludedLocalNames(JavaScriptObject value) {
        getPolymerElement().setExcludedLocalNames(value);
    }
   
  

  
    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     */
    public void indexOf(JavaScriptObject item) {
        getPolymerElement().indexOf(item);
    }
  

  
    /**
     * <p>Returns an array of selectable items.</p>
     *
     * JavaScript Info:
     * @method items
     * @behavior PaperTabs
     */
    public void items() {
        getPolymerElement().items();
    }
  

  
    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
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
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }
  

  
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectedAttribute(){
        return getPolymerElement().getSelectedAttribute();
    }
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectedAttribute(String value) {
        getPolymerElement().setSelectedAttribute(value);
    }
   
  

  
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectedClass(){
        return getPolymerElement().getSelectedClass();
    }
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }
   
  

  
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getSelectedItem(){
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
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
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTabs
     */
    public void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }
  

  
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getKeyEventTarget(){
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }
   
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior PaperTabs
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTabs
     */
    public void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }
  

  
    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTabs
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTabs
     */
    public void registered() {
        getPolymerElement().registered();
    }
  


    /**
     * 
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addHandler(handler, IronSelectEvent.TYPE);
    }

}
