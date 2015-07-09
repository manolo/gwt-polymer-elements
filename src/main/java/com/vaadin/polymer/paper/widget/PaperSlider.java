/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.change.widget.event.ChangeEvent;
import com.vaadin.polymer.change.widget.event.ChangeEventHandler;

import com.vaadin.polymer.immediate.widget.event.ImmediateValueChangeEvent;
import com.vaadin.polymer.immediate.widget.event.ImmediateValueChangeEventHandler;

import com.vaadin.polymer.value.widget.event.ValueChangeEvent;
import com.vaadin.polymer.value.widget.event.ValueChangeEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
 * </tbody>
 * </table>
 */
public class PaperSlider extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperSlider() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperSlider(String html) {
        super(PaperSliderElement.TAG, PaperSliderElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.change.element.event.ChangeEvent.NAME,
                new com.vaadin.polymer.change.element.event.ChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.change.element.event.ChangeEvent event) {
                fireEvent(new ChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent.NAME,
                new com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.immediate.element.event.ImmediateValueChangeEvent event) {
                fireEvent(new ImmediateValueChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.value.element.event.ValueChangeEvent.NAME,
                new com.vaadin.polymer.value.element.event.ValueChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.value.element.event.ValueChangeEvent event) {
                fireEvent(new ValueChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormElementRegisterEvent event) {
                fireEvent(new IronFormElementRegisterEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormElementUnregisterEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormElementUnregisterEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormElementUnregisterEvent event) {
                fireEvent(new IronFormElementUnregisterEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperSliderElement getPolymerElement() {
        return (PaperSliderElement) getElement();
    }


  
    /**
     * <p>Decreases value by <code>step</code> but not below <code>min</code>.</p>
     *
     * JavaScript Info:
     * @method decrement
     * 
     */
    public void decrement() {
        getPolymerElement().decrement();
    }
  

  
    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public boolean getDragging(){
        return getPolymerElement().getDragging();
    }
    /**
     * <p>True when the user is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public void setDragging(boolean value) {
        getPolymerElement().setDragging(value);
    }
   
  

  
    /**
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    public boolean getEditable(){
        return getPolymerElement().getEditable();
    }
    /**
     * <p>If true, an input is shown and user can use it to set the slider value.</p>
     *
     * JavaScript Info:
     * @property editable
     * @type Boolean
     * 
     */
    public void setEditable(boolean value) {
        getPolymerElement().setEditable(value);
    }
   
  

  
    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    public boolean getExpand(){
        return getPolymerElement().getExpand();
    }
    /**
     * <p>If true, the knob is expanded</p>
     *
     * JavaScript Info:
     * @property expand
     * @type Boolean
     * 
     */
    public void setExpand(boolean value) {
        getPolymerElement().setExpand(value);
    }
   
  

  
    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    public double getImmediateValue(){
        return getPolymerElement().getImmediateValue();
    }
    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @property immediateValue
     * @type Number
     * 
     */
    public void setImmediateValue(double value) {
        getPolymerElement().setImmediateValue(value);
    }
   
    /**
     * <p>The immediate value of the slider.  This value is updated while the user<br>is dragging the slider.</p>
     *
     * JavaScript Info:
     * @attribute immediate-value
     * 
     */
    public void setImmediateValue(String value) {
        getPolymerElement().setAttribute("immediate-value", value);
    }
   
  

  
    /**
     * <p>Increases value by <code>step</code> but not above <code>max</code>.</p>
     *
     * JavaScript Info:
     * @method increment
     * 
     */
    public void increment() {
        getPolymerElement().increment();
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
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    public JsArray getMarkers(){
        return getPolymerElement().getMarkers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property markers
     * @type Array
     * 
     */
    public void setMarkers(JsArray value) {
        getPolymerElement().setMarkers(value);
    }
   
    /**
     * 
     *
     * JavaScript Info:
     * @attribute markers
     * 
     */
    public void setMarkers(String value) {
        getPolymerElement().setAttribute("markers", value);
    }
   
  

  
    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    public double getMaxMarkers(){
        return getPolymerElement().getMaxMarkers();
    }
    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @property maxMarkers
     * @type Number
     * 
     */
    public void setMaxMarkers(double value) {
        getPolymerElement().setMaxMarkers(value);
    }
   
    /**
     * <p>The maximum number of markers</p>
     *
     * JavaScript Info:
     * @attribute max-markers
     * 
     */
    public void setMaxMarkers(String value) {
        getPolymerElement().setAttribute("max-markers", value);
    }
   
  

  
    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    public boolean getPin(){
        return getPolymerElement().getPin();
    }
    /**
     * <p>If true, a pin with numeric value label is shown when the slider thumb<br>is pressed. Use for settings for which users need to know the exact<br>value of the setting.</p>
     *
     * JavaScript Info:
     * @property pin
     * @type Boolean
     * 
     */
    public void setPin(boolean value) {
        getPolymerElement().setPin(value);
    }
   
  

  
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public double getSecondaryProgress(){
        return getPolymerElement().getSecondaryProgress();
    }
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public void setSecondaryProgress(double value) {
        getPolymerElement().setSecondaryProgress(value);
    }
   
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @attribute secondary-progress
     * 
     */
    public void setSecondaryProgress(String value) {
        getPolymerElement().setAttribute("secondary-progress", value);
    }
   
  

  
    /**
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    public boolean getSnaps(){
        return getPolymerElement().getSnaps();
    }
    /**
     * <p>If true, the slider thumb snaps to tick marks evenly spaced based<br>on the <code>step</code> property value.</p>
     *
     * JavaScript Info:
     * @property snaps
     * @type Boolean
     * 
     */
    public void setSnaps(boolean value) {
        getPolymerElement().setSnaps(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    public boolean getTransiting(){
        return getPolymerElement().getTransiting();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property transiting
     * @type Boolean
     * 
     */
    public void setTransiting(boolean value) {
        getPolymerElement().setTransiting(value);
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
     * @method registered
     * @behavior PaperTabs
     */
    public void registered() {
        getPolymerElement().registered();
    }
  

  
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperSlider
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
     * @behavior PaperSlider
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }
   
  

  
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperSlider
     */
    public void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperSlider
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
     * @behavior PaperSlider
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
     * @behavior PaperInput
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
     * @behavior PaperInput
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
     * @behavior PaperInput
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
     * @behavior PaperInput
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }
   
  

  
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    public String getName(){
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }
   
  

  
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperTextarea
     */
    public String getValue(){
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperTextarea
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
    }
   
  

  
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public double getMax(){
        return getPolymerElement().getMax();
    }
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public void setMax(double value) {
        getPolymerElement().setMax(value);
    }
   
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute max
     * @behavior PaperSlider
     */
    public void setMax(String value) {
        getPolymerElement().setAttribute("max", value);
    }
   
  

  
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public double getMin(){
        return getPolymerElement().getMin();
    }
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public void setMin(double value) {
        getPolymerElement().setMin(value);
    }
   
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute min
     * @behavior PaperSlider
     */
    public void setMin(String value) {
        getPolymerElement().setAttribute("min", value);
    }
   
  

  
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public double getRatio(){
        return getPolymerElement().getRatio();
    }
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public void setRatio(double value) {
        getPolymerElement().setRatio(value);
    }
   
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @attribute ratio
     * @behavior PaperSlider
     */
    public void setRatio(String value) {
        getPolymerElement().setAttribute("ratio", value);
    }
   
  

  
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public double getStep(){
        return getPolymerElement().getStep();
    }
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public void setStep(double value) {
        getPolymerElement().setStep(value);
    }
   
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @attribute step
     * @behavior PaperSlider
     */
    public void setStep(String value) {
        getPolymerElement().setAttribute("step", value);
    }
   
  


    /**
     * <p>Fired when the slider’s value changes due to user interaction.</p>
     * <p>Changes to the slider’s value due to changes in an underlying<br>bound variable will not trigger this event.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the slider’s immediateValue changes.</p>
     *
     * JavaScript Info:
     * @event immediate-value-change
     */
    public HandlerRegistration addImmediateValueChangeHandler(ImmediateValueChangeEventHandler handler) {
        return addHandler(handler, ImmediateValueChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the slider’s value changes.</p>
     *
     * JavaScript Info:
     * @event value-change
     */
    public HandlerRegistration addValueChangeHandler(ValueChangeEventHandler handler) {
        return addHandler(handler, ValueChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the element is added to an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-register
     */
    public HandlerRegistration addIronFormElementRegisterHandler(IronFormElementRegisterEventHandler handler) {
        return addHandler(handler, IronFormElementRegisterEvent.TYPE);
    }

    /**
     * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-unregister
     */
    public HandlerRegistration addIronFormElementUnregisterHandler(IronFormElementUnregisterEventHandler handler) {
        return addHandler(handler, IronFormElementUnregisterEvent.TYPE);
    }

}
