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
 * <p><code>&lt;paper-textarea&gt;</code> is a multi-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-textarea label=&quot;Textarea label&quot;&gt;&lt;/paper-textarea&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="validation">Validation</h3>
 * <p>Currently only <code>required</code> and <code>maxlength</code> validation is supported.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
@JsType(isNative=true)
public interface PaperTextareaElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-textarea";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";


    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty double getMaxRows();
    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty void setMaxRows(double value);

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
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getCharCounter();
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setCharCounter(boolean value);

    /**
     * <p>Set to true to disable this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>both the <code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>both the <code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>Returns true if the value is invalid. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to both the<br><code>&lt;paper-input-container&gt;</code>‘s and the input’s <code>invalid</code> property.</p>
     * <p>If <code>autoValidate</code> is true, the <code>invalid</code> attribute is managed automatically,<br>which can clobber attempts to manage it manually.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setAutoValidate(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getMultiple();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the<code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setMultiple(boolean value);

    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;paper-input-container&gt;</code>‘s <code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getAutofocus();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setAutofocus(boolean value);

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
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. If you’re<br>using PaperInputBehavior to  implement your own paper-input-like element,<br>bind this to <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setPreventInvalidInput(boolean value);

    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getMaxlength();
    /**
     * <p>The maximum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setMaxlength(double value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getSize();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty double getRows();
    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty void setRows(double value);

    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getMinlength();
    /**
     * <p>The minimum length of the input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setMinlength(double value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getResults();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setResults(double value);

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
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getType();
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setType(String value);

    /**
     * <p>The value for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setValue(String value);

    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getStep();
    /**
     * <p>Limits the numeric or date-time increments.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setStep(String value);

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getPattern();
    /**
     * <p>A pattern to validate the <code>input</code> with. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setPattern(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getName();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setName(String value);

    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getMin();
    /**
     * <p>The minimum (numeric or date-time) input value.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setMin(String value);

    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getMax();
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-01-01&quot;</code>) or a Number (e.g. <code>2</code>).<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setMax(String value);

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getList();
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>.<br>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setList(String value);

    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this input. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br><code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use. If you’re using PaperInputBehavior to<br>implement your own paper-input-like element, bind this to<br>the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code> property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAccept();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property,<br>used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAccept(String value);

    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid. If you’re using<br>PaperInputBehavior to implement your own paper-input-like element,<br>bind this to the <code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutosave();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property,<br>used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutosave(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutocorrect();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutocorrect(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutocomplete();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutocomplete(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutocapitalize();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutocapitalize(String value);

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. If<br>you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code><br>property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAllowedPattern(String value);

    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getInputmode();
    /**
     * <p>If you’re using PaperInputBehavior to implement your own paper-input-like<br>element, bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setInputmode(String value);


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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    void removeOwnKeyBindings();

    /**
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * @behavior PaperTextarea
     * @return {boolean}
     */
    boolean validate();

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

    /**
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * @behavior PaperTextarea
     * 
     */
    void updateValueAndPreserveCaret(String newValue);

}
