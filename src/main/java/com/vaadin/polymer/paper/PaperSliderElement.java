/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/sliders.html">Sliders</a></p>
 * <p><code>paper-slider</code> allows user to select a value from a range of values by<br>moving the slider thumb.  The interactive nature of the slider makes it a<br>great choice for settings that reflect intensity levels, such as volume,<br>brightness, or color saturation.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-slider&gt;&lt;/paper-slider&gt;
 * 
 * 
 * </code></pre><p>Use <code>min</code> and <code>max</code> to specify the slider range.  Default is 0 to 100.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-slider min=&quot;10&quot; max=&quot;200&quot; value=&quot;110&quot;&gt;&lt;/paper-slider&gt;
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
 * <td><code>--paper-slider-container-color</code></td>
 * <td>The background color of the bar</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-bar-color</code></td>
 * <td>The background color of the slider</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-active-color</code></td>
 * <td>The progress bar color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-secondary-color</code></td>
 * <td>The secondary progress bar color</td>
 * <td><code>--google-blue-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-color</code></td>
 * <td>The knob color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-knob-color</code></td>
 * <td>The disabled knob color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-pin-color</code></td>
 * <td>The pin color</td>
 * <td><code>--google-blue-700</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-font-color</code></td>
 * <td>The pin’s text color</td>
 * <td><code>#fff</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-markers-color</code></td>
 * <td>The snaps markers color</td>
 * <td><code>#000</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-active-color</code></td>
 * <td>The disabled progress bar color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-secondary-color</code></td>
 * <td>The disabled secondary progress bar color</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-color</code></td>
 * <td>The fill color of the knob at the far left</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-border-color</code></td>
 * <td>The border color of the knob at the far left</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-pin-start-color</code></td>
 * <td>The color of the pin at the far left</td>
 * <td><code>--paper-grey-400</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-height</code></td>
 * <td>Height of the progress bar</td>
 * <td><code>2px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-input</code></td>
 * <td>Mixin applied to the input in editable mode</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperSliderElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-slider";
    @JsOverlay public static final String SRC = "paper-slider/paper-slider.html";


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
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    @JsProperty JsArray getMarkers();
    /**
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    @JsProperty void setMarkers(JsArray value);

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
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setNoink(boolean value);

    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    @JsProperty boolean getPin();
    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    @JsProperty void setPin(boolean value);

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
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    @JsProperty boolean getSnaps();
    /**
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    @JsProperty void setSnaps(boolean value);

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
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    @JsProperty boolean getEditable();
    /**
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    @JsProperty void setEditable(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    @JsProperty boolean getTransiting();
    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    @JsProperty void setTransiting(boolean value);

    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    @JsProperty boolean getExpand();
    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    @JsProperty void setExpand(boolean value);

    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    @JsProperty boolean getDragging();
    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    @JsProperty void setDragging(boolean value);

    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getStep();
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setStep(double value);

    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getValue();
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setValue(double value);

    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    @JsProperty double getMaxMarkers();
    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    @JsProperty void setMaxMarkers(double value);

    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    @JsProperty double getImmediateValue();
    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    @JsProperty void setImmediateValue(double value);

    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    @JsProperty double getSecondaryProgress();
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    @JsProperty void setSecondaryProgress(double value);

    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getRatio();
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setRatio(double value);

    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getMax();
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setMax(double value);

    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getMin();
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setMin(double value);

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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    void removeOwnKeyBindings();

    /**
     * <p>Increases value by <code>step</code> but not above <code>max</code>.</p>
     *
     * JavaScript Info:
     * @method increment
     * 
     * 
     */
    void increment();

    /**
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperToggleButton
     * 
     */
    void getRipple();

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    boolean hasRipple();

    /**
     * <p>Decreases value by <code>step</code> but not below <code>min</code>.</p>
     *
     * JavaScript Info:
     * @method decrement
     * 
     * 
     */
    void decrement();

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
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperTab
     * 
     */
    void ensureRipple(JavaScriptObject optTriggeringEvent);

}
