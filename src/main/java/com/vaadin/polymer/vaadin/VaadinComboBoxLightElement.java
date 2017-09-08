/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>&lt;vaadin-combo-box-light&gt;</code> is a customizable version of the <code>&lt;vaadin-combo-box&gt;</code> providing<br>only the dropdown functionality and leaving the input field definition to the user.</p>
 * <p>This element is using the same <a href="#vaadin.elements.combobox.ComboBoxBehavior"><code>ComboBoxBehavior</code></a> as<br><a href="#vaadin-combo-box"><code>&lt;vaadin-combo-box&gt;</code></a>, so the API remains the same.</p>
 * <p>To create a custom input field, you need to add a child element which has a two-way<br>data-bindable property representing the input value. The property name is expected<br>to be <code>bindValue</code> by default. See the example below for a simplest possible example<br>using an <code>&lt;input&gt;</code> element extended with <code>iron-input</code>.</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box-light&gt;
 *   &lt;input is=&quot;iron-input&quot;&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * <p>If you are using other custom input fields like <code>&lt;paper-input&gt;</code>, you<br>need to define the name of value property with <code>attrForValue</code> property.<br>See the example below on how to create a custom input field based<br>on a <code>&lt;paper-input&gt;</code> decorated with a custom <code>&lt;iron-icon&gt;</code> and<br>two <code>&lt;paper-button&gt;</code>s to act as the clear and toggle controls.</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box-light attr-for-value=&quot;value&quot;&gt;
 *   &lt;paper-input label=&quot;Elements&quot; class=&quot;input&quot;&gt;
 *     &lt;iron-icon icon=&quot;toll&quot; prefix&gt;&lt;/iron-icon&gt;
 *     &lt;paper-button suffix class=&quot;clear-button&quot;&gt;Clear&lt;/paper-button&gt;
 *     &lt;paper-button suffix class=&quot;toggle-button&quot;&gt;Toggle&lt;/paper-button&gt;
 *   &lt;/paper-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface VaadinComboBoxLightElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-combo-box-light";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box-light.html";


    /**
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    @JsProperty boolean getAllowCustomValue();
    /**
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    @JsProperty void setAllowCustomValue(boolean value);

    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty JsArray getItems();
    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    @JsProperty void setItems(JsArray value);

    /**
     * <p>Number of pixels used as the vertical offset in positioning of<br>the dropdown.</p>
     *
     * JavaScript Info:
     * @property overlayVerticalOffset
     * @type Number
     * 
     */
    @JsProperty double getOverlayVerticalOffset();
    /**
     * <p>Number of pixels used as the vertical offset in positioning of<br>the dropdown.</p>
     *
     * JavaScript Info:
     * @property overlayVerticalOffset
     * @type Number
     * 
     */
    @JsProperty void setOverlayVerticalOffset(double value);

    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * 
     */
    @JsProperty JsArray getFilteredItems();
    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * 
     */
    @JsProperty void setFilteredItems(JsArray value);

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
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    @JsProperty JavaScriptObject getInputElement();
    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    @JsProperty void setInputElement(JavaScriptObject value);

    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setOpened(boolean value);

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
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoading();
    /**
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty void setLoading(boolean value);

    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getHasValue();
    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setHasValue(boolean value);

    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinDatePicker
     */
    @JsProperty void setValue(String value);

    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty String getItemValuePath();
    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty void setItemValuePath(String value);

    /**
     * <p>Path for label of the item. If <code>items</code> is an array of objects, the<br><code>itemLabelPath</code> is used to fetch the displayed string label for each<br>item.</p>
     * <p>The item label is also used for matching items when processing user<br>input, i.e., for filtering and selecting items.</p>
     * <p>When using item templates, the property is still needed because it is used<br>for filtering, and for displaying the selected item value in the input box.</p>
     *
     * JavaScript Info:
     * @property itemLabelPath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty String getItemLabelPath();
    /**
     * <p>Path for label of the item. If <code>items</code> is an array of objects, the<br><code>itemLabelPath</code> is used to fetch the displayed string label for each<br>item.</p>
     * <p>The item label is also used for matching items when processing user<br>input, i.e., for filtering and selecting items.</p>
     * <p>When using item templates, the property is still needed because it is used<br>for filtering, and for displaying the selected item value in the input box.</p>
     *
     * JavaScript Info:
     * @property itemLabelPath
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty void setItemLabelPath(String value);

    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty String getFilter();
    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty void setFilter(String value);

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
     * <p>Name of the two-way data-bindable property representing the<br>value of the custom input field.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    @JsProperty String getAttrForValue();
    /**
     * <p>Name of the two-way data-bindable property representing the<br>value of the custom input field.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    @JsProperty void setAttrForValue(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void templatize(Object template);

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
     * @method stamp
     * @param {} model  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
     * 
     */
    void modelForElement(Object el);

    /**
     * <p>Closes the dropdown list.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior VaadinComboBox
     * 
     */
    void close();

    /**
     * <p>Opens the dropdown list.</p>
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
     * <p>Reverts back to original value.</p>
     *
     * JavaScript Info:
     * @method cancel
     * 
     * 
     */
    void cancel();

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
