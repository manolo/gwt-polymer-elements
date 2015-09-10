/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dropdown-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.paper.widget.event.PaperDropdownCloseEvent;
import com.vaadin.polymer.paper.widget.event.PaperDropdownCloseEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperDropdownOpenEvent;
import com.vaadin.polymer.paper.widget.event.PaperDropdownOpenEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-dropdown-menu</code> is similar to a native browser select element.<br><code>paper-dropdown-menu</code> works with selectable content. The currently selected<br>item is displayed in the control. If no item is selected, the <code>label</code> is<br>displayed instead.</p>
 * <p>The child element with the class <code>dropdown-content</code> will be used as the dropdown<br>menu. It could be a <code>paper-menu</code> or element that triggers <code>iron-select</code> when<br>selecting its children.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-dropdown-menu label=&quot;Your favourite pastry&quot;&gt;
 *   &lt;paper-menu class=&quot;dropdown-content&quot;&gt;
 *     &lt;paper-item&gt;Croissant&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Donut&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Financier&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Madeleine&lt;/paper-item&gt;
 *   &lt;/paper-menu&gt;
 * &lt;/paper-dropdown-menu&gt;
 * 
 * 
 * </code></pre><p>This example renders a dropdown menu with 4 options.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are also available for styling:</p>
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
 * <td><code>--paper-dropdown-menu</code></td>
 * <td>A mixin that is applied to the element host</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dropdown-menu-disabled</code></td>
 * <td>A mixin that is applied to the element host when disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dropdown-menu-ripple</code></td>
 * <td>A mixin that is applied to the internal ripple</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dropdown-menu-button</code></td>
 * <td>A mixin that is applied to the internal menu button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dropdown-menu-input</code></td>
 * <td>A mixin that is applied to the internal paper input</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dropdown-menu-icon</code></td>
 * <td>A mixin that is applied to the internal icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>You can also use any of the <code>paper-input-container</code> and <code>paper-menu-button</code><br>style mixins and custom properties to style the internal input and menu button<br>respectively.</p>
 */
public class PaperDropdownMenu extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDropdownMenu() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDropdownMenu(String html) {
        super(PaperDropdownMenuElement.TAG, PaperDropdownMenuElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent.NAME,
                new com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.paper.element.event.PaperDropdownCloseEvent event) {
                fireEvent(new PaperDropdownCloseEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent.NAME,
                new com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.paper.element.event.PaperDropdownOpenEvent event) {
                fireEvent(new PaperDropdownOpenEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDropdownMenuElement getPolymerElement() {
        try {
            return (PaperDropdownMenuElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


  
    /**
     * <p>Set to true to always float the label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    public boolean getAlwaysFloatLabel(){
        return getPolymerElement().getAlwaysFloatLabel();
    }
    /**
     * <p>Set to true to always float the label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    public void setAlwaysFloatLabel(boolean value) {
        getPolymerElement().setAlwaysFloatLabel(value);
    }
   
  

  
    /**
     * <p>Hide the dropdown content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     */
    public void close() {
        getPolymerElement().close();
    }
  

  
    /**
     * <p>The content element that is contained by the dropdown menu, if any.</p>
     *
     * JavaScript Info:
     * @method contentElement
     * 
     */
    public void contentElement() {
        getPolymerElement().contentElement();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
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
     * 
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }
   
  

  
    /**
     * <p>The label for the dropdown.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    public String getLabel(){
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for the dropdown.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    public void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }
   
  

  
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    public boolean getNoAnimations(){
        return getPolymerElement().getNoAnimations();
    }
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    public void setNoAnimations(boolean value) {
        getPolymerElement().setNoAnimations(value);
    }
   
  

  
    /**
     * <p>Set to true to disable the floating label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    public boolean getNoLabelFloat(){
        return getPolymerElement().getNoLabelFloat();
    }
    /**
     * <p>Set to true to disable the floating label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    public void setNoLabelFloat(boolean value) {
        getPolymerElement().setNoLabelFloat(value);
    }
   
  

  
    /**
     * <p>Show the dropdown content.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     */
    public void open() {
        getPolymerElement().open();
    }
  

  
    /**
     * <p>True if the dropdown is open. Otherwise, false.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened(){
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the dropdown is open. Otherwise, false.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }
   
  

  
    /**
     * <p>The placeholder for the dropdown.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder(){
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>The placeholder for the dropdown.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }
   
  

  
    /**
     * <p>The last selected item. An item is selected if the dropdown menu has<br>a child with class <code>dropdown-content</code>, and that child triggers an<br><code>iron-select</code> event with the selected <code>item</code> in the <code>detail</code>.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public JavaScriptObject getSelectedItem(){
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>The last selected item. An item is selected if the dropdown menu has<br>a child with class <code>dropdown-content</code>, and that child triggers an<br><code>iron-select</code> event with the selected <code>item</code> in the <code>detail</code>.</p>
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
     * <p>The last selected item. An item is selected if the dropdown menu has<br>a child with class <code>dropdown-content</code>, and that child triggers an<br><code>iron-select</code> event with the selected <code>item</code> in the <code>detail</code>.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * 
     */
    public void setSelectedItem(String value) {
        getPolymerElement().setAttribute("selected-item", value);
    }
   
  

  
    /**
     * <p>The derived “label” of the currently selected item. This value<br>is the <code>label</code> property on the selected item if set, or else the<br>trimmed text content of the selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItemLabel
     * @type String
     * 
     */
    public String getSelectedItemLabel(){
        return getPolymerElement().getSelectedItemLabel();
    }
    /**
     * <p>The derived “label” of the currently selected item. This value<br>is the <code>label</code> property on the selected item if set, or else the<br>trimmed text content of the selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItemLabel
     * @type String
     * 
     */
    public void setSelectedItemLabel(String value) {
        getPolymerElement().setSelectedItemLabel(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    public void attached() {
        getPolymerElement().attached();
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
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled(){
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }
   
  

  
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused(){
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  

  
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getActive(){
        return getPolymerElement().getActive();
    }
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }
   
  

  
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public String getAriaActiveAttribute(){
        return getPolymerElement().getAriaActiveAttribute();
    }
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public void setAriaActiveAttribute(String value) {
        getPolymerElement().setAriaActiveAttribute(value);
    }
   
  

  
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPointerDown(){
        return getPolymerElement().getPointerDown();
    }
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPointerDown(boolean value) {
        getPolymerElement().setPointerDown(value);
    }
   
  

  
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPressed(){
        return getPolymerElement().getPressed();
    }
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPressed(boolean value) {
        getPolymerElement().setPressed(value);
    }
   
  

  
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getReceivedFocusFromKeyboard(){
        return getPolymerElement().getReceivedFocusFromKeyboard();
    }
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public void setReceivedFocusFromKeyboard(boolean value) {
        getPolymerElement().setReceivedFocusFromKeyboard(value);
    }
   
  

  
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getToggles(){
        return getPolymerElement().getToggles();
    }
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }
   
  

  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
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
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }
   
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }
  

  
    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTab
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTab
     */
    public void registered() {
        getPolymerElement().registered();
    }
  


    /**
     * <p>Fired when the dropdown closes.</p>
     *
     * JavaScript Info:
     * @event paper-dropdown-close
     */
    public HandlerRegistration addPaperDropdownCloseHandler(PaperDropdownCloseEventHandler handler) {
        return addHandler(handler, PaperDropdownCloseEvent.TYPE);
    }

    /**
     * <p>Fired when the dropdown opens.</p>
     *
     * JavaScript Info:
     * @event paper-dropdown-open
     */
    public HandlerRegistration addPaperDropdownOpenHandler(PaperDropdownOpenEventHandler handler) {
        return addHandler(handler, PaperDropdownOpenEvent.TYPE);
    }

}
