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
 * 
 */
@JsType(isNative=true)
public interface VaadinElementsComboboxComboBoxBehavior {

    @JsOverlay public static final String NAME = "vaadin.elements.combobox.ComboBoxBehavior";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";


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
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>When present, it specifies that the element field is read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

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
     * 
     */
    @JsProperty boolean getHasValue();
    /**
     * <p>A read-only property indicating whether this combo box has a value<br>selected or not. It can be used for example in styling of the component.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    @JsProperty void setHasValue(boolean value);

    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the dropdown is open, false otherwise.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

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
     * <p>Path for label of the item. If <code>items</code> is an array of objects, the<br><code>itemLabelPath</code> is used to fetch the displayed string label for each<br>item.</p>
     * <p>The item label is also used for matching items when processing user<br>input, i.e., for filtering and selecting items.</p>
     * <p>When using item templates, the property is still needed because it is used<br>for filtering, and for displaying the selected item value in the input box.</p>
     *
     * JavaScript Info:
     * @property itemLabelPath
     * @type String
     * 
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
     * 
     */
    @JsProperty void setItemLabelPath(String value);

    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The <code>String</code> value for the selected item of the combo box. Provides<br>the value for <code>iron-form</code>.</p>
     * <p>When there’s no item selected, the value is an empty string.</p>
     * <p>Use <code>selectedItem</code> property to get the raw selected item from<br>the <code>items</code> array.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * 
     */
    @JsProperty String getFilter();
    /**
     * <p>Filtering string the user has typed into the input field.</p>
     *
     * JavaScript Info:
     * @property filter
     * @type String
     * 
     */
    @JsProperty void setFilter(String value);

    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * 
     */
    @JsProperty String getItemValuePath();
    /**
     * <p>Path for the value of the item. If <code>items</code> is an array of objects, the<br><code>itemValuePath:</code> is used to fetch the string value for the selected<br>item.</p>
     * <p>The item value is used in the <code>value</code> property of the combo box,<br>to provide the form value.</p>
     *
     * JavaScript Info:
     * @property itemValuePath
     * @type String
     * 
     */
    @JsProperty void setItemValuePath(String value);


    /**
     * <p>Closes the dropdown list.</p>
     *
     * JavaScript Info:
     * @method close
     * 
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
     * <p>Reverts back to original value.</p>
     *
     * JavaScript Info:
     * @method cancel
     * 
     * 
     */
    void cancel();

}
