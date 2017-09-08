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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/text-fields.html">Text fields</a></p>
 * <p><code>&lt;paper-input&gt;</code> is a single-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-input label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It may include an optional error message or character counter.</p>
 * <pre><code>&lt;paper-input error-message=&quot;Invalid input!&quot; label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * &lt;paper-input char-counter label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It can also include custom prefix or suffix elements, which are displayed<br>before or after the text input itself. In order for an element to be<br>considered as a prefix, it must have the <code>prefix</code> attribute (and similarly<br>for <code>suffix</code>).</p>
 * <pre><code>&lt;paper-input label=&quot;total&quot;&gt;
 *   &lt;div prefix&gt;$&lt;/div&gt;
 *   &lt;paper-icon-button suffix icon=&quot;clear&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>A <code>paper-input</code> can use the native <code>type=search</code> or <code>type=file</code> features.<br>However, since we can’t control the native styling of the input (search icon,<br>file button, date placeholder, etc.), in these cases the label will be<br>automatically floated. The <code>placeholder</code> attribute can still be used for<br>additional informational text.</p>
 * <pre><code>&lt;paper-input label=&quot;search!&quot; type=&quot;search&quot;
 *     placeholder=&quot;search for cats&quot; autosave=&quot;test&quot; results=&quot;5&quot;&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="focus">Focus</h3>
 * <p>To focus a paper-input, you can call the native <code>focus()</code> method as long as the<br>paper input has a tab index.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
@JsType(isNative=true)
public interface PaperInputElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-input";
    @JsOverlay public static final String SRC = "paper-input/paper-input.html";


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
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);

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
     * 
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
     * 
     * 
     */
    void updateValueAndPreserveCaret(String newValue);

}
