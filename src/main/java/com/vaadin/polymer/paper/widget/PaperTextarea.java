/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.ChangeEvent;
import com.vaadin.polymer.paper.widget.event.ChangeEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PaperTextarea extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperTextarea() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperTextarea(String html) {
        super(PaperTextareaElement.TAG, PaperTextareaElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperTextareaElement getPolymerElement() {
        try {
            return (PaperTextareaElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
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
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, , used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    public double getResults() {
        return getPolymerElement().getResults();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, , used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    public void setResults(double value) {
        getPolymerElement().setResults(value);
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
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
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
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
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
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
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
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    public boolean getReadonly() {
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
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
     * 
     */
    public boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
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
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public boolean getInvalid() {
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
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
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getAutofocus() {
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
    public boolean getCharCounter() {
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    public boolean getMultiple() {
        return getPolymerElement().getMultiple();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    public void setMultiple(boolean value) {
        getPolymerElement().setMultiple(value);
    }

    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    public boolean getNoLabelFloat() {
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
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    public String getAllowedPattern() {
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    public String getAutocorrect() {
        return getPolymerElement().getAutocorrect();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    public void setAutocorrect(String value) {
        getPolymerElement().setAutocorrect(value);
    }

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    public String getAutocapitalize() {
        return getPolymerElement().getAutocapitalize();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * @behavior PaperTextarea
     */
    public void setAutocapitalize(String value) {
        getPolymerElement().setAutocapitalize(value);
    }

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    public String getAutocomplete() {
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
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
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
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    public String getAutosave() {
        return getPolymerElement().getAutosave();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    public void setAutosave(String value) {
        getPolymerElement().setAutosave(value);
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

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
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
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    public String getErrorMessage() {
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    public String getAccept() {
        return getPolymerElement().getAccept();
    }
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, , used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    public void setAccept(String value) {
        getPolymerElement().setAccept(value);
    }

    /**
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
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
     * <p>The label for this input. Bind this to <code>&lt;paper-input-container&gt;</code>‘s <code>label</code> property.</p>
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
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    public String getList() {
        return getPolymerElement().getList();
    }
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
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
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    public String getMax() {
        return getPolymerElement().getMax();
    }
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    public void setMax(String value) {
        getPolymerElement().setMax(value);
    }

    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    public String getMin() {
        return getPolymerElement().getMin();
    }
    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    public void setMin(String value) {
        getPolymerElement().setMin(value);
    }

    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    public String getStep() {
        return getPolymerElement().getStep();
    }
    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    public void setStep(String value) {
        getPolymerElement().setStep(value);
    }

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    public String getType() {
        return getPolymerElement().getType();
    }
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    public void setType(String value) {
        getPolymerElement().setType(value);
    }

    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    public String getValidator() {
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
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
     * 
     */
    public String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
    }


    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, , used with type=search.</p>
     *
     * JavaScript Info:
     * @attribute results
     * 
     */
    public void setResults(String value) {
        getPolymerElement().setAttribute("results", value);
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @attribute minlength
     * 
     */
    public void setMinlength(String value) {
        getPolymerElement().setAttribute("minlength", value);
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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @attribute size
     * 
     */
    public void setSize(String value) {
        getPolymerElement().setAttribute("size", value);
    }


    /**
     * <p>Validates the input element and sets an error style if needed.</p>
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
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * @behavior PaperTextarea
     * 
     */
    public void updateValueAndPreserveCaret(String newValue) {
        getPolymerElement().updateValueAndPreserveCaret(newValue);
    }


    /**
     * <p>Fired when the input changes due to user interaction.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

}
