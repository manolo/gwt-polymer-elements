/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-dropdown project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEventHandler;

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
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getOpened() {
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
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    public double getHorizontalOffset() {
        return getPolymerElement().getHorizontalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
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
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public double getVerticalOffset() {
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
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
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior PaperTooltip
     */
    public JavaScriptObject getAnimationConfig() {
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior PaperTooltip
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getFitInto() {
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
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getClosingReason() {
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
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    public JavaScriptObject getSizingTarget() {
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
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getCloseAnimationConfig() {
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
     * <p>If provided, this will be the element that will be focused when<br>the dropdown opens.</p>
     *
     * JavaScript Info:
     * @property focusTarget
     * @type Object
     * 
     */
    public JavaScriptObject getFocusTarget() {
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
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getOpenAnimationConfig() {
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
     * <p>The element that should be used to position the dropdown when<br>it is opened.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * 
     */
    public JavaScriptObject getPositionTarget() {
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
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getWithBackdrop() {
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
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getCanceled() {
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
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    public boolean getNoAnimations() {
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
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
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
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoAutoFocus() {
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
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getAutoFitOnAttach() {
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
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoCancelOnEscKey() {
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
    public boolean getNoCancelOnOutsideClick() {
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
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
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
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    public boolean getAllowOutsideScroll() {
        return getPolymerElement().getAllowOutsideScroll();
    }
    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    public void setAllowOutsideScroll(boolean value) {
        getPolymerElement().setAllowOutsideScroll(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
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
     * @behavior VaadinComboBox
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public String getEntryAnimation() {
        return getPolymerElement().getEntryAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
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
     * @behavior PaperTooltip
     */
    public String getExitAnimation() {
        return getPolymerElement().getExitAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public void setExitAnimation(String value) {
        getPolymerElement().setExitAnimation(value);
    }

    /**
     * <p>The orientation against which to align the dropdown content<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    public String getVerticalAlign() {
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
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public String getHorizontalAlign() {
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
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
     *
     * JavaScript Info:
     * @attribute horizontal-offset
     * 
     */
    public void setHorizontalOffset(String value) {
        getPolymerElement().setAttribute("horizontal-offset", value);
    }

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * 
     */
    public void setVerticalOffset(String value) {
        getPolymerElement().setAttribute("vertical-offset", value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }

    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @attribute animation-config
     * @behavior PaperTooltip
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
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
     * @attribute position-target
     * 
     */
    public void setPositionTarget(String value) {
        getPolymerElement().setAttribute("position-target", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinComboBox
     */
    public void setKeyBindings(String value) {
        getPolymerElement().setAttribute("key-bindings", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinComboBox
     * 
     */
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior VaadinComboBox
     * 
     */
    public void keyboardEventMatchesKeys(Object event, Object eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }

    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperDialog
     * 
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
     * 
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
     * 
     */
    public void fit() {
        getPolymerElement().fit();
    }

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperDialog
     * 
     */
    public void refit() {
        getPolymerElement().refit();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperDialog
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }

    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperDialog
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior PaperTooltip
     * 
     */
    public void cancelAnimation() {
        getPolymerElement().cancelAnimation();
    }

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @behavior PaperDialog
     * 
     */
    public void cancel() {
        getPolymerElement().cancel();
    }

    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperDialog
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperDialog
     * 
     */
    public void resetFit() {
        getPolymerElement().resetFit();
    }

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior PaperTooltip
     * 
     */
    public void playAnimation(String type, JavaScriptObject cookie) {
        getPolymerElement().playAnimation(type, cookie);
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


    /**
     * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-canceled
     */
    public HandlerRegistration addIronOverlayCanceledHandler(IronOverlayCanceledEventHandler handler) {
        return addDomHandler(handler, IronOverlayCanceledEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addDomHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addDomHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}
