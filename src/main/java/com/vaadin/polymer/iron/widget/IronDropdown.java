/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-dropdown project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;iron-dropdown&gt;</code> is a generalized element that is useful when you have<br>hidden content (<code>.dropdown-content</code>) that is revealed due to some change in<br>state that should cause it to do so.</p>
 * <p>Note that this is a low-level element intended to be used as part of other<br>composite elements that cause dropdowns to be revealed.</p>
 * <p>Examples of elements that might be implemented using an <code>iron-dropdown</code><br>include comboboxes, menubuttons, selects. The list goes on.</p>
 * <p>The <code>&lt;iron-dropdown&gt;</code> element exposes attributes that allow the position<br>of the <code>.dropdown-content</code> relative to the <code>.dropdown-trigger</code> to be<br>configured.</p>
 * <pre><code>&lt;iron-dropdown horizontal-align=&quot;right&quot; vertical-align=&quot;top&quot;&gt;
 *   &lt;div class=&quot;dropdown-content&quot;&gt;Hello!&lt;/div&gt;
 * &lt;/iron-dropdown&gt;
 * 
 * 
 * </code></pre><p>In the above example, the <code>&lt;div&gt;</code> with class <code>.dropdown-content</code> will be<br>hidden until the dropdown element has <code>opened</code> set to true, or when the <code>open</code><br>method is called on the element.</p>
 */
public class IronDropdown extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronDropdown() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronDropdown(String html) {
        super(IronDropdownElement.TAG, IronDropdownElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent event) {
                fireEvent(new IronOverlayClosedEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent event) {
                fireEvent(new IronOverlayOpenedEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronDropdownElement getPolymerElement() {
        try {
            return (IronDropdownElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
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
     * <p>The element that is contained by the dropdown, if any.</p>
     *
     * JavaScript Info:
     * @method containedElement
     * 
     */
    public void containedElement() {
        getPolymerElement().containedElement();
    }
  

  
    /**
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @property focusTarget
     * @type Object
     * 
     */
    public JavaScriptObject getFocusTarget(){
        return getPolymerElement().getFocusTarget();
    }
    /**
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @property focusTarget
     * @type Object
     * 
     */
    public void setFocusTarget(JavaScriptObject value) {
        getPolymerElement().setFocusTarget(value);
    }
   
    /**
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @attribute focus-target
     * 
     */
    public void setFocusTarget(String value) {
        getPolymerElement().setAttribute("focus-target", value);
    }
   
  

  
    /**
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to the dropdown trigger.</p>
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
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to the dropdown trigger.</p>
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
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    public JavaScriptObject getPositionTarget(){
        return getPolymerElement().getPositionTarget();
    }
    /**
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    public void setPositionTarget(JavaScriptObject value) {
        getPolymerElement().setPositionTarget(value);
    }
   
    /**
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @attribute position-target
     * 
     */
    public void setPositionTarget(String value) {
        getPolymerElement().setAttribute("position-target", value);
    }
   
  

  
    /**
     * <p>The orientation against which to align the dropdown content<br>vertically relative to the dropdown trigger.</p>
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
     * <p>The orientation against which to align the dropdown content<br>vertically relative to the dropdown trigger.</p>
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
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
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
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
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
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @method backdropElement
     * @behavior PaperDialog
     */
    public void backdropElement() {
        getPolymerElement().backdropElement();
    }
  

  
    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @behavior PaperDialog
     */
    public void cancel() {
        getPolymerElement().cancel();
    }
  

  
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getCanceled(){
        return getPolymerElement().getCanceled();
    }
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setCanceled(boolean value) {
        getPolymerElement().setCanceled(value);
    }
   
  

  
    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperDialog
     */
    public void close() {
        getPolymerElement().close();
    }
  

  
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getClosingReason(){
        return getPolymerElement().getClosingReason();
    }
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    public void setClosingReason(JavaScriptObject value) {
        getPolymerElement().setClosingReason(value);
    }
   
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @attribute closing-reason
     * @behavior PaperDialog
     */
    public void setClosingReason(String value) {
        getPolymerElement().setAttribute("closing-reason", value);
    }
   
  

  
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoAutoFocus(){
        return getPolymerElement().getNoAutoFocus();
    }
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoAutoFocus(boolean value) {
        getPolymerElement().setNoAutoFocus(value);
    }
   
  

  
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoCancelOnEscKey(){
        return getPolymerElement().getNoCancelOnEscKey();
    }
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoCancelOnEscKey(boolean value) {
        getPolymerElement().setNoCancelOnEscKey(value);
    }
   
  

  
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoCancelOnOutsideClick(){
        return getPolymerElement().getNoCancelOnOutsideClick();
    }
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoCancelOnOutsideClick(boolean value) {
        getPolymerElement().setNoCancelOnOutsideClick(value);
    }
   
  

  
    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperDialog
     */
    public void open() {
        getPolymerElement().open();
    }
  

  
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getOpened(){
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }
   
  

  
    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperDialog
     */
    public void toggle() {
        getPolymerElement().toggle();
    }
  

  
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getWithBackdrop(){
        return getPolymerElement().getWithBackdrop();
    }
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setWithBackdrop(boolean value) {
        getPolymerElement().setWithBackdrop(value);
    }
   
  

  
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getAutoFitOnAttach(){
        return getPolymerElement().getAutoFitOnAttach();
    }
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setAutoFitOnAttach(boolean value) {
        getPolymerElement().setAutoFitOnAttach(value);
    }
   
  

  
    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperDialog
     */
    public void center() {
        getPolymerElement().center();
    }
  

  
    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperDialog
     */
    public void constrain() {
        getPolymerElement().constrain();
    }
  

  
    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperDialog
     */
    public void fit() {
        getPolymerElement().fit();
    }
  

  
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getFitInto(){
        return getPolymerElement().getFitInto();
    }
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    public void setFitInto(JavaScriptObject value) {
        getPolymerElement().setFitInto(value);
    }
   
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @attribute fit-into
     * @behavior PaperDialog
     */
    public void setFitInto(String value) {
        getPolymerElement().setAttribute("fit-into", value);
    }
   
  

  
    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperDialog
     */
    public void refit() {
        getPolymerElement().refit();
    }
  

  
    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperDialog
     */
    public void resetFit() {
        getPolymerElement().resetFit();
    }
  

  
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    public JavaScriptObject getSizingTarget(){
        return getPolymerElement().getSizingTarget();
    }
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    public void setSizingTarget(JavaScriptObject value) {
        getPolymerElement().setSizingTarget(value);
    }
   
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @attribute sizing-target
     * @behavior PaperDialog
     */
    public void setSizingTarget(String value) {
        getPolymerElement().setAttribute("sizing-target", value);
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
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatedPages
     */
    public JavaScriptObject getAnimationConfig(){
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatedPages
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }
   
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @attribute animation-config
     * @behavior NeonAnimatedPages
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
    }
   
  

  
    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    public void cancelAnimation() {
        getPolymerElement().cancelAnimation();
    }
  

  
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public String getEntryAnimation(){
        return getPolymerElement().getEntryAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public void setEntryAnimation(String value) {
        getPolymerElement().setEntryAnimation(value);
    }
   
  

  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public String getExitAnimation(){
        return getPolymerElement().getExitAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public void setExitAnimation(String value) {
        getPolymerElement().setExitAnimation(value);
    }
   
  

  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatedPages
     */
    public void getAnimationConfig(JavaScriptObject type) {
        getPolymerElement().getAnimationConfig(type);
    }
  

  
    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    public void playAnimation(JavaScriptObject type, JavaScriptObject cookie) {
        getPolymerElement().playAnimation(type, cookie);
    }
  


    /**
     * <p>Fired after the <code>iron-overlay</code> closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}
