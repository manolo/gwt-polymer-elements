/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-autogrow-textarea project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

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
 * <p><code>iron-autogrow-textarea</code> is an element containing a textarea that grows in height as more<br>lines of input are entered. Unless an explicit height or the <code>maxRows</code> property is set, it will<br>never scroll.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-autogrow-textarea&gt;&lt;/iron-autogrow-textarea&gt;
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
 * <td><code>--iron-autogrow-textarea</code></td>
 * <td>Mixin applied to the textarea</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-autogrow-textarea-placeholder</code></td>
 * <td>Mixin applied to the textarea placeholder</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class IronAutogrowTextarea extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronAutogrowTextarea() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronAutogrowTextarea(String html) {
        super(IronAutogrowTextareaElement.TAG, IronAutogrowTextareaElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronAutogrowTextareaElement getPolymerElement() {
        return (IronAutogrowTextareaElement) getElement();
    }


    /**
     * <p>Set to true to mark the textarea as required.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    public boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the textarea as required.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    public void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }

    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    public double getMaxRows() {
        return getPolymerElement().getMaxRows();
    }
    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    public void setMaxRows(double value) {
        getPolymerElement().setMaxRows(value);
    }

    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    public double getMaxlength() {
        return getPolymerElement().getMaxlength();
    }
    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    public void setMaxlength(double value) {
        getPolymerElement().setMaxlength(value);
    }

    /**
     * <p>The minimum length of the input value.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    public double getMinlength() {
        return getPolymerElement().getMinlength();
    }
    /**
     * <p>The minimum length of the input value.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    public void setMinlength(double value) {
        getPolymerElement().setMinlength(value);
    }

    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.<br>This property will be deprecated in the future. Use <code>value</code> instead.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type (string|number)
     * 
     */
    public Object getBindValue() {
        return getPolymerElement().getBindValue();
    }
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.<br>This property will be deprecated in the future. Use <code>value</code> instead.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type (string|number)
     * 
     */
    public void setBindValue(Object value) {
        getPolymerElement().setBindValue(value);
    }

    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    public double getRows() {
        return getPolymerElement().getRows();
    }
    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    public void setRows(double value) {
        getPolymerElement().setRows(value);
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
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
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
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
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
     * <p>Bound to the textarea’s <code>autocomplete</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    public String getAutocomplete() {
        return getPolymerElement().getAutocomplete();
    }
    /**
     * <p>Bound to the textarea’s <code>autocomplete</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    public void setAutocomplete(String value) {
        getPolymerElement().setAutocomplete(value);
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
     * <p>Bound to the textarea’s <code>inputmode</code> attribute.</p>
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
     * <p>Bound to the textarea’s <code>inputmode</code> attribute.</p>
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
     * <p>Bound to the textarea’s <code>placeholder</code> attribute.</p>
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
     * <p>Bound to the textarea’s <code>placeholder</code> attribute.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
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
     * <p>Bound to the textarea’s <code>readonly</code> attribute.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type String
     * 
     */
    public String getReadonly() {
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>Bound to the textarea’s <code>readonly</code> attribute.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type String
     * 
     */
    public void setReadonly(String value) {
        getPolymerElement().setReadonly(value);
    }


    // Needed in UIBinder
    /**
     * <p>The minimum length of the input value.</p>
     *
     * JavaScript Info:
     * @attribute minlength
     * 
     */
    public void setMinlength(String value) {
        Polymer.property(this.getPolymerElement(), "minlength", value);
    }

    // Needed in UIBinder
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.<br>This property will be deprecated in the future. Use <code>value</code> instead.</p>
     *
     * JavaScript Info:
     * @attribute bind-value
     * 
     */
    public void setBindValue(String value) {
        Polymer.property(this.getPolymerElement(), "bindValue", value);
    }

    // Needed in UIBinder
    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @attribute rows
     * 
     */
    public void setRows(String value) {
        Polymer.property(this.getPolymerElement(), "rows", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @attribute maxlength
     * 
     */
    public void setMaxlength(String value) {
        Polymer.property(this.getPolymerElement(), "maxlength", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @attribute max-rows
     * 
     */
    public void setMaxRows(String value) {
        Polymer.property(this.getPolymerElement(), "maxRows", value);
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
     * <p>Returns true if <code>value</code> is valid. The validator provided in <code>validator</code><br>will be used first, if it exists; otherwise, the <code>textarea</code>‘s validity<br>is used.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    public boolean validate() {
        return getPolymerElement().validate();
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
