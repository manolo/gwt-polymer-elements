/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.ChangeEvent;
import com.vaadin.polymer.paper.widget.event.ChangeEventHandler;

import com.vaadin.polymer.iron.widget.event.IronChangeEvent;
import com.vaadin.polymer.iron.widget.event.IronChangeEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/selection-controls.html#selection-controls-radio-button">Radio button</a></p>
 * <p><code>paper-radio-button</code> is a button that can be either checked or unchecked.<br>User can tap the radio button to check or uncheck it.</p>
 * <p>Use a <code>&lt;paper-radio-group&gt;</code> to group a set of radio buttons.  When radio buttons<br>are inside a radio group, exactly one radio button in the group can be checked<br>at any time.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-radio-button&gt;&lt;/paper-radio-button&gt;
 * &lt;paper-radio-button&gt;Item label&lt;/paper-radio-button&gt;
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
 * <td><code>--paper-radio-button-unchecked-background-color</code></td>
 * <td>Radio button background color when the input is not checked</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-unchecked-color</code></td>
 * <td>Radio button color when the input is not checked</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-unchecked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is not checked</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-checked-color</code></td>
 * <td>Radio button color when the input is checked</td>
 * <td><code>--primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-checked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is checked</td>
 * <td><code>--primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-size</code></td>
 * <td>Size of the radio button</td>
 * <td><code>16px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-ink-size</code></td>
 * <td>Size of the ripple</td>
 * <td><code>48px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-label-color</code></td>
 * <td>Label color</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-label-spacing</code></td>
 * <td>Spacing between the label and the button</td>
 * <td><code>10px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-radio-container</code></td>
 * <td>A mixin applied to the internal radio container</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-label</code></td>
 * <td>A mixin applied to the internal label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-radio-button-label-checked</code></td>
 * <td>A mixin applied to the internal label when the radio button is checked</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>This element applies the mixin <code>--paper-font-common-base</code> but does not import <code>paper-styles/typography.html</code>.<br>In order to apply the <code>Roboto</code> font to this element, make sure you’ve imported <code>paper-styles/typography.html</code>.</p>
 */
public class PaperRadioButton extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperRadioButton() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperRadioButton(String html) {
        super(PaperRadioButtonElement.TAG, PaperRadioButtonElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperRadioButtonElement getPolymerElement() {
        return (PaperRadioButtonElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
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
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPointerDown() {
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
    public boolean getPressed() {
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
    public boolean getReceivedFocusFromKeyboard() {
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
    public boolean getToggles() {
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
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getNoink() {
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getActive() {
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
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
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
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getChecked() {
        return getPolymerElement().getChecked();
    }
    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setChecked(boolean value) {
        getPolymerElement().setChecked(value);
    }

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public boolean getInvalid() {
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public String getAriaActiveAttribute() {
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
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getValidator() {
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }

    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getValidatorType() {
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }


    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior PaperTab
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
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
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperToggleButton
     * 
     */
    public void getRipple() {
        getPolymerElement().getRipple();
    }

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperTab
     * @return {boolean}
     */
    public boolean hasRipple() {
        return getPolymerElement().hasRipple();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean hasValidator() {
        return getPolymerElement().hasValidator();
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
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean validate(JavaScriptObject value) {
        return getPolymerElement().validate(value);
    }

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperTab
     * 
     */
    public void ensureRipple(JavaScriptObject optTriggeringEvent) {
        getPolymerElement().ensureRipple(optTriggeringEvent);
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
     * <p>Fired when the checked state changes due to user interaction.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the checked state changes.</p>
     *
     * JavaScript Info:
     * @event iron-change
     */
    public HandlerRegistration addIronChangeHandler(IronChangeEventHandler handler) {
        return addDomHandler(handler, IronChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the element is added to an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-register
     */
    public HandlerRegistration addIronFormElementRegisterHandler(IronFormElementRegisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementRegisterEvent.TYPE);
    }

    /**
     * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-unregister
     */
    public HandlerRegistration addIronFormElementUnregisterHandler(IronFormElementUnregisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementUnregisterEvent.TYPE);
    }

}
