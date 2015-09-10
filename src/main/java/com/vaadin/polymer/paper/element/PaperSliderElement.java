/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
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
 * <td><code>--google-grey-500</code></td>
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
 * <td><code>--paper-slider-disabled-active-color</code></td>
 * <td>The disabled progress bar color</td>
 * <td><code>--google-grey-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-disabled-secondary-color</code></td>
 * <td>The disabled secondary progress bar color</td>
 * <td><code>--google-grey-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-color</code></td>
 * <td>The fill color of the knob at the far left</td>
 * <td><code>transparent</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-knob-start-border-color</code></td>
 * <td>The border color of the knob at the far left</td>
 * <td><code>#c8c8c8</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-pin-start-color</code></td>
 * <td>The color of the pin at the far left</td>
 * <td><code>#c8c8c8</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-slider-height</code></td>
 * <td>Height of the progress bar</td>
 * <td><code>2px</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperSliderElement extends HTMLElement {

    public static final String TAG = "paper-slider";
    public static final String SRC = "paper-slider/paper-slider.html";


    /**
     * <p>Decreases value by <code>step</code> but not below <code>min</code>.</p>
     *
     * JavaScript Info:
     * @method decrement
     * 
     */
    void decrement();

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
     * <p>Increases value by <code>step</code> but not above <code>max</code>.</p>
     *
     * JavaScript Info:
     * @method increment
     * 
     */
    void increment();

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
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperInput
     */
    @JsProperty String getName();
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperInput
     */
    @JsProperty void setName(String value);
  
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recomended to provide a visual style for the element<br>when it’s value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recomended to provide a visual style for the element<br>when it’s value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty void setRequired(boolean value);
  
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperInput
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperInput
     */
    @JsProperty void setValue(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperInput
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperInput
     */
    void detached();

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
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
     */
    void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTab
     */
    void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTab
     */
    void registered();

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
  
}
