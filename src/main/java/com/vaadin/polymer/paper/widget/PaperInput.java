/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;paper-input&gt;</code> is a single-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-input label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It may include an optional error message or character counter.</p>
 * <pre><code>&lt;paper-input error-message=&quot;Invalid input!&quot; label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * &lt;paper-input char-counter label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
public class PaperInput extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperInput() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperInput(String html) {
        super(PaperInputElement.TAG, PaperInputElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperInputElement getPolymerElement() {
        return (PaperInputElement) getElement();
    }


  
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    public String getAllowedPattern(){
        return getPolymerElement().getAllowedPattern();
    }
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    public void setAllowedPattern(String value) {
        getPolymerElement().setAllowedPattern(value);
    }
   
  

  
    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getAlwaysFloatLabel(){
        return getPolymerElement().getAlwaysFloatLabel();
    }
    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setAlwaysFloatLabel(boolean value) {
        getPolymerElement().setAlwaysFloatLabel(value);
    }
   
  

  
    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getAutoValidate(){
        return getPolymerElement().getAutoValidate();
    }
    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setAutoValidate(boolean value) {
        getPolymerElement().setAutoValidate(value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    public String getAutocomplete(){
        return getPolymerElement().getAutocomplete();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    public void setAutocomplete(String value) {
        getPolymerElement().setAutocomplete(value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getAutofocus(){
        return getPolymerElement().getAutofocus();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setAutofocus(boolean value) {
        getPolymerElement().setAutofocus(value);
    }
   
  

  
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getCharCounter(){
        return getPolymerElement().getCharCounter();
    }
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setCharCounter(boolean value) {
        getPolymerElement().setCharCounter(value);
    }
   
  

  
    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getDisabled(){
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }
   
  

  
    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    public String getErrorMessage(){
        return getPolymerElement().getErrorMessage();
    }
    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    public void setErrorMessage(String value) {
        getPolymerElement().setErrorMessage(value);
    }
   
  

  
    /**
     * <p>Returns a reference to the input element.</p>
     *
     * JavaScript Info:
     * @method inputElement
     * @behavior PaperTextarea
     */
    public void inputElement() {
        getPolymerElement().inputElement();
    }
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    public String getInputmode(){
        return getPolymerElement().getInputmode();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    public void setInputmode(String value) {
        getPolymerElement().setInputmode(value);
    }
   
  

  
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getInvalid(){
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }
   
  

  
    /**
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    public String getLabel(){
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    public void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }
   
  

  
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <datalist>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    public String getList(){
        return getPolymerElement().getList();
    }
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <datalist>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    public void setList(String value) {
        getPolymerElement().setList(value);
    }
   
  

  
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    public double getMaxlength(){
        return getPolymerElement().getMaxlength();
    }
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    public void setMaxlength(double value) {
        getPolymerElement().setMaxlength(value);
    }
   
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @attribute maxlength
     * @behavior PaperTextarea
     */
    public void setMaxlength(String value) {
        getPolymerElement().setAttribute("maxlength", value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * @behavior PaperTextarea
     */
    public double getMinlength(){
        return getPolymerElement().getMinlength();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * @behavior PaperTextarea
     */
    public void setMinlength(double value) {
        getPolymerElement().setMinlength(value);
    }
   
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @attribute minlength
     * @behavior PaperTextarea
     */
    public void setMinlength(String value) {
        getPolymerElement().setAttribute("minlength", value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
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
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getNoLabelFloat(){
        return getPolymerElement().getNoLabelFloat();
    }
    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setNoLabelFloat(boolean value) {
        getPolymerElement().setNoLabelFloat(value);
    }
   
  

  
    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    public String getPattern(){
        return getPolymerElement().getPattern();
    }
    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    public void setPattern(String value) {
        getPolymerElement().setPattern(value);
    }
   
  

  
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    public String getPlaceholder(){
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }
   
  

  
    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getPreventInvalidInput(){
        return getPolymerElement().getPreventInvalidInput();
    }
    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setPreventInvalidInput(boolean value) {
        getPolymerElement().setPreventInvalidInput(value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getReadonly(){
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setReadonly(boolean value) {
        getPolymerElement().setReadonly(value);
    }
   
  

  
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getRequired(){
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    public void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }
   
  

  
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    public double getSize(){
        return getPolymerElement().getSize();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    public void setSize(double value) {
        getPolymerElement().setSize(value);
    }
   
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @attribute size
     * @behavior PaperTextarea
     */
    public void setSize(String value) {
        getPolymerElement().setAttribute("size", value);
    }
   
  

  
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    public String getType(){
        return getPolymerElement().getType();
    }
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    public void setType(String value) {
        getPolymerElement().setType(value);
    }
   
  

  
    /**
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * @behavior PaperTextarea
     */
    public void updateValueAndPreserveCaret(String newValue) {
        getPolymerElement().updateValueAndPreserveCaret(newValue);
    }
  

  
    /**
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * @behavior PaperTextarea
     */
    public void validate() {
        getPolymerElement().validate();
    }
  

  
    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperTextarea
     */
    public String getValidator(){
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperTextarea
     */
    public void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }
   
  

  
    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
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
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
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
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTextarea
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperTextarea
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
     * @behavior PaperTextarea
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
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
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperInput
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
     * @behavior PaperInput
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  


}
