/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
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
 * <p><code>paper-menu-button</code> allows one to compose a designated “trigger” element with<br>another element that represents “content”, to create a dropdown menu that<br>displays the “content” when the “trigger” is clicked.</p>
 * <p>The child element with the class <code>dropdown-trigger</code> will be used as the<br>“trigger” element. The child element with the class <code>dropdown-content</code> will be<br>used as the “content” element.</p>
 * <p>The <code>paper-menu-button</code> is sensitive to its content’s <code>iron-select</code> events. If<br>the “content” element triggers an <code>iron-select</code> event, the <code>paper-menu-button</code><br>will close automatically.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-menu-button&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot; class=&quot;dropdown-trigger&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;paper-menu class=&quot;dropdown-content&quot;&gt;
 *     &lt;paper-item&gt;Share&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Settings&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Help&lt;/paper-item&gt;
 *   &lt;/paper-menu&gt;
 * &lt;/paper-menu-button&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
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
 * <td><code>--paper-menu-button-dropdown-background</code></td>
 * <td>Background color of the paper-menu-button dropdown</td>
 * <td><code>#fff</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button</code></td>
 * <td>Mixin applied to the paper-menu-button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-disabled</code></td>
 * <td>Mixin applied to the paper-menu-button when disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-dropdown</code></td>
 * <td>Mixin applied to the paper-menu-button dropdown</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperMenuButton extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperMenuButton() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperMenuButton(String html) {
        super(PaperMenuButtonElement.TAG, PaperMenuButtonElement.SRC, html);

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
    public PaperMenuButtonElement getPolymerElement() {
        try {
            return (PaperMenuButtonElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
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
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getCloseAnimationConfig(){
        return getPolymerElement().getCloseAnimationConfig();
    }
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    public void setCloseAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setCloseAnimationConfig(value);
    }
   
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @attribute close-animation-config
     * 
     */
    public void setCloseAnimationConfig(String value) {
        getPolymerElement().setAttribute("close-animation-config", value);
    }
   
  

  
    /**
     * <p>The content element that is contained by the menu button, if any.</p>
     *
     * JavaScript Info:
     * @method contentElement
     * 
     */
    public void contentElement() {
        getPolymerElement().contentElement();
    }
  

  
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public String getHorizontalAlign(){
        return getPolymerElement().getHorizontalAlign();
    }
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public void setHorizontalAlign(String value) {
        getPolymerElement().setHorizontalAlign(value);
    }
   
  

  
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    public double getHorizontalOffset(){
        return getPolymerElement().getHorizontalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    public void setHorizontalOffset(double value) {
        getPolymerElement().setHorizontalOffset(value);
    }
   
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @attribute horizontal-offset
     * 
     */
    public void setHorizontalOffset(String value) {
        getPolymerElement().setAttribute("horizontal-offset", value);
    }
   
  

  
    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    public boolean getIgnoreSelect(){
        return getPolymerElement().getIgnoreSelect();
    }
    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    public void setIgnoreSelect(boolean value) {
        getPolymerElement().setIgnoreSelect(value);
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
     * <p>Make the dropdown content appear as an overlay positioned relative<br>to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     */
    public void open() {
        getPolymerElement().open();
    }
  

  
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getOpenAnimationConfig(){
        return getPolymerElement().getOpenAnimationConfig();
    }
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    public void setOpenAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setOpenAnimationConfig(value);
    }
   
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @attribute open-animation-config
     * 
     */
    public void setOpenAnimationConfig(String value) {
        getPolymerElement().setAttribute("open-animation-config", value);
    }
   
  

  
    /**
     * <p>True if the content is currently displayed.</p>
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
     * <p>True if the content is currently displayed.</p>
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
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    public String getVerticalAlign(){
        return getPolymerElement().getVerticalAlign();
    }
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    public void setVerticalAlign(String value) {
        getPolymerElement().setVerticalAlign(value);
    }
   
  

  
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public double getVerticalOffset(){
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public void setVerticalOffset(double value) {
        getPolymerElement().setVerticalOffset(value);
    }
   
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * 
     */
    public void setVerticalOffset(String value) {
        getPolymerElement().setAttribute("vertical-offset", value);
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
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
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
     * @method attached
     * @behavior PaperTab
     */
    public void attached() {
        getPolymerElement().attached();
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
