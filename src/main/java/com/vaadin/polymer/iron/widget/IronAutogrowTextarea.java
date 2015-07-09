/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-autogrow-textarea project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>iron-autogrow-textarea</code> is an element containing a textarea that grows in height as more<br>lines of input are entered. Unless an explicit height or the <code>maxRows</code> property is set, it will<br>never scroll.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-autogrow-textarea id=&quot;a1&quot;&gt;
 *   &lt;textarea id=&quot;t1&quot;&gt;&lt;/textarea&gt;
 * &lt;/iron-autogrow-textarea&gt;
 * 
 * 
 * </code></pre><p>Because the <code>textarea</code>‘s <code>value</code> property is not observable, you should use<br>this element’s <code>bind-value</code> instead for imperative updates.</p>
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
     * <p>Bound to the textarea’s <code>autocomplete</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    public String getAutocomplete(){
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
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type String
     * 
     */
    public String getAutofocus(){
        return getPolymerElement().getAutofocus();
    }
    /**
     * <p>Bound to the textarea’s <code>autofocus</code> attribute.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type String
     * 
     */
    public void setAutofocus(String value) {
        getPolymerElement().setAutofocus(value);
    }
   
  

  
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    public String getBindValue(){
        return getPolymerElement().getBindValue();
    }
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    public void setBindValue(String value) {
        getPolymerElement().setBindValue(value);
    }
   
  

  
    /**
     * <p>Bound to the textarea’s <code>inputmode</code> attribute.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    public String getInputmode(){
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
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    public double getMaxRows(){
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
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @attribute max-rows
     * 
     */
    public void setMaxRows(String value) {
        getPolymerElement().setAttribute("max-rows", value);
    }
   
  

  
    /**
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    public double getMaxlength(){
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
     * <p>The maximum length of the input value.</p>
     *
     * JavaScript Info:
     * @attribute maxlength
     * 
     */
    public void setMaxlength(String value) {
        getPolymerElement().setAttribute("maxlength", value);
    }
   
  

  
    /**
     * <p>Bound to the textarea’s <code>name</code> attribute.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public String getName(){
        return getPolymerElement().getName();
    }
    /**
     * <p>Bound to the textarea’s <code>name</code> attribute.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }
   
  

  
    /**
     * <p>Bound to the textarea’s <code>placeholder</code> attribute.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder(){
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
     * <p>Bound to the textarea’s <code>readonly</code> attribute.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type String
     * 
     */
    public String getReadonly(){
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
   
  

  
    /**
     * <p>Set to true to mark the textarea as required.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    public boolean getRequired(){
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
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    public double getRows(){
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
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @attribute rows
     * 
     */
    public void setRows(String value) {
        getPolymerElement().setAttribute("rows", value);
    }
   
  

  
    /**
     * <p>Returns the underlying textarea.</p>
     *
     * JavaScript Info:
     * @method textarea
     * 
     */
    public void textarea() {
        getPolymerElement().textarea();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
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
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior IronInput
     */
    public void hasValidator() {
        getPolymerElement().hasValidator();
    }
  

  
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior IronInput
     */
    public boolean getInvalid(){
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior IronInput
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} values  
     * @behavior IronInput
     */
    public void validate(JavaScriptObject values) {
        getPolymerElement().validate(values);
    }
  

  
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior IronInput
     */
    public String getValidator(){
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior IronInput
     */
    public void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }
   
  

  
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior IronInput
     */
    public String getValidatorType(){
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior IronInput
     */
    public void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior IronInput
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
     * @behavior IronInput
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
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
   
  


}
