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
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty void setAutoValidate(boolean value);

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
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty boolean getMultiple();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty void setMultiple(boolean value);

    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutofocus();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty void setAutofocus(boolean value);

    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty void setPreventInvalidInput(boolean value);

    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>Set to true to disable this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>both the <code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>both the <code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty double getMaxlength();
    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty void setMaxlength(double value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty double getResults();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty void setResults(double value);

    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty double getMinlength();
    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty void setMinlength(double value);

    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty String getStep();
    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty void setStep(String value);

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty void setAllowedPattern(String value);

    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty String getMin();
    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty void setMin(String value);

    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * 
     */
    @JsProperty String getPattern();
    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
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
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty String getMax();
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty void setMax(String value);

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty String getList();
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty void setList(String value);

    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty String getInputmode();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * 
     */
    @JsProperty void setInputmode(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty String getAutocapitalize();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty void setAutocapitalize(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty String getType();
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty void setType(String value);

    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * 
     */
    @JsProperty String getAutosave();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * 
     */
    @JsProperty void setAutosave(String value);

    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>The value for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty String getAutocorrect();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty void setAutocorrect(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty String getAutocomplete();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty void setAutocomplete(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty String getAccept();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty void setAccept(String value);


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
