/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
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
 * <p>Use <code>Polymer.PaperInputBehavior</code> to implement inputs with <code>&lt;paper-input-container&gt;</code>. This<br>behavior is implemented by <code>&lt;paper-input&gt;</code>. It exposes a number of properties from<br><code>&lt;paper-input-container&gt;</code> and <code>&lt;input is=&quot;iron-input&quot;&gt;</code> and they should be bound in your<br>template.</p>
 * <p>The input element can be accessed by the <code>inputElement</code> property if you need to access<br>properties or methods that are not exposed.</p>
 */
@JsType(isNative=true)
public interface PaperInputBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperInputBehavior";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";


    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    @JsProperty boolean getCharCounter();
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    @JsProperty void setCharCounter(boolean value);

    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutofocus();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty void setAutofocus(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty boolean getMultiple();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty void setMultiple(boolean value);

    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty void setPreventInvalidInput(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty void setAutoValidate(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty double getMaxlength();
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty void setMaxlength(double value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, , used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty double getResults();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, , used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty void setResults(double value);

    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty double getMinlength();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty void setMinlength(double value);

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty void setAllowedPattern(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty String getAutocapitalize();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty void setAutocapitalize(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty String getAutocomplete();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty void setAutocomplete(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);

    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty String getPattern();
    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty void setPattern(String value);

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty String getAutocorrect();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty void setAutocorrect(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty String getInputmode();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty void setInputmode(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty String getAccept();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty void setAccept(String value);

    /**
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty String getList();
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty void setList(String value);

    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty String getStep();
    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty void setStep(String value);

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty String getType();
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty void setType(String value);

    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty String getMax();
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty void setMax(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * 
     */
    @JsProperty String getAutosave();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * 
     */
    @JsProperty void setAutosave(String value);

    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty String getMin();
    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty void setMin(String value);


    /**
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    boolean validate();

    /**
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * 
     * 
     */
    void updateValueAndPreserveCaret(String newValue);

}
