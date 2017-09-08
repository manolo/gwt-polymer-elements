/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dropdown-menu project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/buttons.html#buttons-dropdown-buttons">Dropdown menus</a></p>
 * <p><code>paper-dropdown-menu</code> is similar to a native browser select element.<br><code>paper-dropdown-menu</code> works with selectable content. The currently selected<br>item is displayed in the control. If no item is selected, the <code>label</code> is<br>displayed instead.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-dropdown-menu label=&quot;Your favourite pastry&quot;&gt;
 *   &lt;paper-listbox class=&quot;dropdown-content&quot;&gt;
 *     &lt;paper-item&gt;Croissant&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Donut&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Financier&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Madeleine&lt;/paper-item&gt;
 *   &lt;/paper-listbox&gt;
 * &lt;/paper-dropdown-menu&gt;
 * 
 * 
 * </code></pre><p>This example renders a dropdown menu with 4 options.</p>
 * <p>The child element with the class <code>dropdown-content</code> is used as the dropdown<br>menu. This can be a <a href="paper-listbox"><code>paper-listbox</code></a>, or any other or<br>element that acts like an <a href="iron-selector"><code>iron-selector</code></a>.</p>
 * <p>Specifically, the menu child must fire an<br><a href="iron-selector#event-iron-select"><code>iron-select</code></a> event when one of its<br>children is selected, and an <a href="iron-selector#event-iron-deselect"><code>iron-deselect</code></a><br>event when a child is deselected. The selected or deselected item must<br>be passed as the event’s <code>detail.item</code> property.</p>
 * <p>Applications can listen for the <code>iron-select</code> and <code>iron-deselect</code> events<br>to react when options are selected and deselected.</p>
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
@JsType(isNative=true)
public interface PaperDropdownMenuElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-dropdown-menu";
    @JsOverlay public static final String SRC = "paper-dropdown-menu/paper-dropdown-menu.html";


    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPressed(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The last selected item. An item is selected if the dropdown menu has<br>a child with class <code>dropdown-content</code>, and that child triggers an<br><code>iron-select</code> event with the selected <code>item</code> in the <code>detail</code>.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * 
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>The last selected item. An item is selected if the dropdown menu has<br>a child with class <code>dropdown-content</code>, and that child triggers an<br><code>iron-select</code> event with the selected <code>item</code> in the <code>detail</code>.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * 
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

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
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setActive(boolean value);

    /**
     * <p>True if the dropdown is open. Otherwise, false.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the dropdown is open. Otherwise, false.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    @JsProperty boolean getDynamicAlign();
    /**
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    @JsProperty void setDynamicAlign(boolean value);

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPointerDown(boolean value);

    /**
     * <p>Set to true to always float the label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setReceivedFocusFromKeyboard(boolean value);

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setToggles(boolean value);

    /**
     * <p>Whether focus should be restored to the dropdown when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    @JsProperty boolean getRestoreFocusOnClose();
    /**
     * <p>Whether focus should be restored to the dropdown when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    @JsProperty void setRestoreFocusOnClose(boolean value);

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoAnimations();
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty void setNoAnimations(boolean value);

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
     * <p>Set to true to disable the floating label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. Bind this to the<br><code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    @JsProperty boolean getAllowOutsideScroll();
    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    @JsProperty void setAllowOutsideScroll(boolean value);

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty String getAriaActiveAttribute();
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty void setAriaActiveAttribute(String value);

    /**
     * <p>The value for this element that will be used when submitting in<br>a form. It is read only, and will always have the same value<br>as <code>selectedItemLabel</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this element that will be used when submitting in<br>a form. It is read only, and will always have the same value<br>as <code>selectedItemLabel</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty String getName();
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty void setName(String value);

    /**
     * <p>The derived “label” of the currently selected item. This value<br>is the <code>label</code> property on the selected item if set, or else the<br>trimmed text content of the selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItemLabel
     * @type String
     * 
     */
    @JsProperty String getSelectedItemLabel();
    /**
     * <p>The derived “label” of the currently selected item. This value<br>is the <code>label</code> property on the selected item if set, or else the<br>trimmed text content of the selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItemLabel
     * @type String
     * 
     */
    @JsProperty void setSelectedItemLabel(String value);

    /**
     * <p>The placeholder for the dropdown.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>The placeholder for the dropdown.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty void setHorizontalAlign(String value);

    /**
     * <p>The error message to display when invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty String getValidatorType();
    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty void setValidatorType(String value);

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>The label for the dropdown.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for the dropdown.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty void setLabel(String value);


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
     * @method hasValidator
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    boolean hasValidator();

    /**
     * <p>Hide the dropdown content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

    /**
     * <p>Show the dropdown content.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

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
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    boolean validate(JavaScriptObject value);

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

}
