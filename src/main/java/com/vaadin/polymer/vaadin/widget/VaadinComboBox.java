/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.ChangeEvent;
import com.vaadin.polymer.vaadin.widget.event.ChangeEventHandler;

import com.vaadin.polymer.vaadin.widget.event.CustomValueSetEvent;
import com.vaadin.polymer.vaadin.widget.event.CustomValueSetEventHandler;

import com.vaadin.polymer.vaadin.widget.event.SelectedItemChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.SelectedItemChangedEventHandler;

import com.vaadin.polymer.vaadin.widget.event.VaadinDropdownClosedEvent;
import com.vaadin.polymer.vaadin.widget.event.VaadinDropdownClosedEventHandler;

import com.vaadin.polymer.vaadin.widget.event.VaadinDropdownOpenedEvent;
import com.vaadin.polymer.vaadin.widget.event.VaadinDropdownOpenedEventHandler;

import com.vaadin.polymer.vaadin.widget.event.ValueChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.ValueChangedEventHandler;

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
 * <p><code>&lt;vaadin-combo-box&gt;</code> is a combo box element combining a dropdown list with an<br>input field for filtering the list of items. If you want to replace the default<br>input field with a custom implementation, you should use the<br><a href="#vaadin-combo-box-light"><code>&lt;vaadin-combo-box-light&gt;</code></a> element.</p>
 * <p>Items in the dropdown list must be provided as a list of <code>String</code> values.<br>Defining the items is done using the <code>items</code> property, which can be assigned<br>with data-binding, using an attribute or directly with the JavaScript property.</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box
 *     label=&quot;Fruit&quot;
 *     items=&quot;[[data]]&quot;&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="lang-js">combobox.items = [&#39;apple&#39;, &#39;orange&#39;, &#39;banana&#39;];
 * </code></pre>
 * <p>When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.</p>
 * <p>This element is also extended with the <code>IronFormElementBehavior</code> to<br>enable usage within an <code>iron-form</code>.</p>
 * <h3 id="item-template">Item Template</h3>
 * <p><code>&lt;vaadin-combo-box&gt;</code> supports using custom item template provided in the light<br>DOM:</p>
 * <pre><code class="lang-html">&lt;vaadin-combo-box items=&#39;[{&quot;label&quot;: &quot;Hydrogen&quot;, &quot;value&quot;: &quot;H&quot;}]&#39;&gt;
 *   &lt;template&gt;
 *     [[index]]: [[item.label]] &lt;b&gt;[[item.value]&lt;/b&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <p>The following properties are available for item template bindings:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Property name</th>
 * <th>Type</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>index</code></td>
 * <td>Number</td>
 * <td>Index of the item in the <code>items</code> array</td>
 * </tr>
 * <tr>
 * <td><code>item</code></td>
 * <td>String or Object</td>
 * <td>The item reference</td>
 * </tr>
 * <tr>
 * <td><code>selected</code></td>
 * <td>Boolean</td>
 * <td>True when item is selected</td>
 * </tr>
 * <tr>
 * <td><code>focused</code></td>
 * <td>Boolean</td>
 * <td>True when item is focused</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>See the <a href="demo/item-template.html">Item Template Live Demos</a> for more examples.</p>
 * <h3 id="styling">Styling</h3>
 * <p>There are custom properties and mixins you can use to style the component:</p>
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
 * <td><code>--vaadin-combo-box-overlay-max-height</code></td>
 * <td>Property that determines the max height of overlay</td>
 * <td><code>65vh</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class VaadinComboBox extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinComboBox() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinComboBox(String html) {
        super(VaadinComboBoxElement.TAG, VaadinComboBoxElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinComboBoxElement getPolymerElement() {
        return (VaadinComboBoxElement) getElement();
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
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    public JavaScriptObject getInputElement() {
        return getPolymerElement().getInputElement();
    }
    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @property inputElement
     * @type HTMLElement
     * 
     */
    public void setInputElement(JavaScriptObject value) {
        getPolymerElement().setInputElement(value);
    }

    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * 
     */
    public JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>The selected item from the <code>items</code> array.</p>
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
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public JsArray getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * 
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * @behavior VaadinComboBox
     */
    public JsArray getFilteredItems() {
        return getPolymerElement().getFilteredItems();
    }
    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @property filteredItems
     * @type Array
     * @behavior VaadinComboBox
     */
    public void setFilteredItems(JsArray value) {
        getPolymerElement().setFilteredItems(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public double getSize() {
        return getPolymerElement().getSize();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public void setSize(double value) {
        getPolymerElement().setSize(value);
    }

    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getReadonly() {
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setReadonly(boolean value) {
        getPolymerElement().setReadonly(value);
    }

    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p>When set to <code>true</code>, a loading spinner is displayed on top of the list of options.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
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
     * 
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    public boolean getAutofocus() {
        return getPolymerElement().getAutofocus();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    public void setAutofocus(boolean value) {
        getPolymerElement().setAutofocus(value);
    }

    /**
     * <p>Set to true to disable the floating label.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    public boolean getNoLabelFloat() {
        return getPolymerElement().getNoLabelFloat();
    }
    /**
     * <p>Set to true to disable the floating label.</p>
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
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    public boolean getAllowCustomValue() {
        return getPolymerElement().getAllowCustomValue();
    }
    /**
     * <p>If <code>true</code>, the user can input a value that is not present in the items list.<br><code>value</code> property will be set to the input value in this case.<br>Also, when <code>value</code> is set programmatically, the input value will be set<br>to reflect that value.</p>
     *
     * JavaScript Info:
     * @property allowCustomValue
     * @type Boolean
     * 
     */
    public void setAllowCustomValue(boolean value) {
        getPolymerElement().setAllowCustomValue(value);
    }

    /**
     * <p>True when the input field has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>True when the input field has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    public boolean getHasValue() {
        return getPolymerElement().getHasValue();
    }
    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    public void setHasValue(boolean value) {
        getPolymerElement().setHasValue(value);
    }

    /**
     * <p>Set to true to prevent the user from entering invalid input.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    public boolean getPreventInvalidInput() {
        return getPolymerElement().getPreventInvalidInput();
    }
    /**
     * <p>Set to true to prevent the user from entering invalid input.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    public void setPreventInvalidInput(boolean value) {
        getPolymerElement().setPreventInvalidInput(value);
    }

    /**
     * <p>Set to true to always float the label.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    public boolean getAlwaysFloatLabel() {
        return getPolymerElement().getAlwaysFloatLabel();
    }
    /**
     * <p>Set to true to always float the label.</p>
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
     * <p>Set to true to auto-validate the input value.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    public boolean getAutoValidate() {
        return getPolymerElement().getAutoValidate();
    }
    /**
     * <p>Set to true to auto-validate the input value.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    public void setAutoValidate(boolean value) {
        getPolymerElement().setAutoValidate(value);
    }

    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    public String getItemValuePath() {
        return getPolymerElement().getItemValuePath();
    }
    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * @behavior VaadinComboBox
     */
    public void setItemValuePath(String value) {
        getPolymerElement().setItemValuePath(value);
    }

    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    public String getFilter() {
        return getPolymerElement().getFilter();
    }
    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * @behavior VaadinComboBox
     */
    public void setFilter(String value) {
        getPolymerElement().setFilter(value);
    }

    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinComboBox
     */
    public String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior VaadinComboBox
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
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
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public String getAllowedPattern() {
        return getPolymerElement().getAllowedPattern();
    }
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public void setAllowedPattern(String value) {
        getPolymerElement().setAllowedPattern(value);
    }

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
    public String getItemLabelPath() {
        return getPolymerElement().getItemLabelPath();
    }
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
    public void setItemLabelPath(String value) {
        getPolymerElement().setItemLabelPath(value);
    }

    /**
     * <p>A pattern to validate the <code>input</code> with.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    public String getPattern() {
        return getPolymerElement().getPattern();
    }
    /**
     * <p>A pattern to validate the <code>input</code> with.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    public void setPattern(String value) {
        getPolymerElement().setPattern(value);
    }

    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    public String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for this element.</p>
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
     * 
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    public String getInputmode() {
        return getPolymerElement().getInputmode();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    public void setInputmode(String value) {
        getPolymerElement().setInputmode(value);
    }

    /**
     * <p>The error message to display when the input is invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    public String getErrorMessage() {
        return getPolymerElement().getErrorMessage();
    }
    /**
     * <p>The error message to display when the input is invalid.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    public void setErrorMessage(String value) {
        getPolymerElement().setErrorMessage(value);
    }

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }


    // Needed in UIBinder
    /**
     * <p>A full set of items to filter the visible options from.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @attribute items
     * 
     */
    public void setItems(String value) {
        Polymer.property(this.getPolymerElement(), "items", value);
    }

    // Needed in UIBinder
    /**
     * <p>A subset of items, filtered based on the user input. Filtered items<br>can be assigned directly to omit the internal filtering functionality.<br>The items can be of either <code>String</code> or <code>Object</code> type.</p>
     *
     * JavaScript Info:
     * @attribute filtered-items
     * 
     */
    public void setFilteredItems(String value) {
        Polymer.property(this.getPolymerElement(), "filteredItems", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute size
     * 
     */
    public void setSize(String value) {
        Polymer.property(this.getPolymerElement(), "size", value);
    }

    // Needed in UIBinder
    /**
     * <p>The selected item from the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior VaadinComboBox
     */
    public void setSelectedItem(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItem", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @attribute input-element
     * @behavior VaadinComboBox
     */
    public void setInputElement(String value) {
        Polymer.property(this.getPolymerElement(), "inputElement", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public void modelForElement(Object el) {
        getPolymerElement().modelForElement(el);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public void templatize(Object template) {
        getPolymerElement().templatize(template);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * @behavior VaadinInfiniteScroller
     * 
     */
    public void stamp(Object model) {
        getPolymerElement().stamp(model);
    }

    /**
     * <p>Opens the dropdown list.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior VaadinComboBox
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Removes focus from the input field.</p>
     *
     * JavaScript Info:
     * @method blur
     * 
     * 
     */
    public void blur() {
        getPolymerElement().blur();
    }

    /**
     * <p>Sets focus on the input field.</p>
     *
     * JavaScript Info:
     * @method focus
     * 
     * 
     */
    public void focus() {
        getPolymerElement().focus();
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
     * <p>Reverts back to original value.</p>
     *
     * JavaScript Info:
     * @method cancel
     * 
     * 
     */
    public void cancel() {
        getPolymerElement().cancel();
    }

    /**
     * <p>Closes the dropdown list.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior VaadinComboBox
     * 
     */
    public void close() {
        getPolymerElement().close();
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
     * <p>Fired when value changes.<br>To comply with <a href="https://developer.mozilla.org/en-US/docs/Web/Events/change">https://developer.mozilla.org/en-US/docs/Web/Events/change</a></p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the user sets a custom value.</p>
     *
     * JavaScript Info:
     * @event custom-value-set
     */
    public HandlerRegistration addCustomValueSetHandler(CustomValueSetEventHandler handler) {
        return addDomHandler(handler, CustomValueSetEvent.TYPE);
    }

    /**
     * <p>Fired when selected item changes.</p>
     *
     * JavaScript Info:
     * @event selected-item-changed
     */
    public HandlerRegistration addSelectedItemChangedHandler(SelectedItemChangedEventHandler handler) {
        return addDomHandler(handler, SelectedItemChangedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>vaadin-dropdown</code> closes.</p>
     *
     * JavaScript Info:
     * @event vaadin-dropdown-closed
     */
    public HandlerRegistration addVaadinDropdownClosedHandler(VaadinDropdownClosedEventHandler handler) {
        return addDomHandler(handler, VaadinDropdownClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>vaadin-dropdown</code> opens.</p>
     *
     * JavaScript Info:
     * @event vaadin-dropdown-opened
     */
    public HandlerRegistration addVaadinDropdownOpenedHandler(VaadinDropdownOpenedEventHandler handler) {
        return addDomHandler(handler, VaadinDropdownOpenedEvent.TYPE);
    }

    /**
     * <p>Fired when the value changes.</p>
     *
     * JavaScript Info:
     * @event value-changed
     */
    public HandlerRegistration addValueChangedHandler(ValueChangedEventHandler handler) {
        return addDomHandler(handler, ValueChangedEvent.TYPE);
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
