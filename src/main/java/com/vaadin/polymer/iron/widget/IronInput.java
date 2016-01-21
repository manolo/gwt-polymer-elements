/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronInputValidateEvent;
import com.vaadin.polymer.iron.widget.event.IronInputValidateEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;iron-input&gt;</code> adds two-way binding and custom validators using <code>Polymer.IronValidatorBehavior</code><br>to <code>&lt;input&gt;</code>.</p>
 * <h3 id="two-way-binding">Two-way binding</h3>
 * <p>By default you can only get notified of changes to an <code>input</code>‘s <code>value</code> due to user input:</p>
 * <pre><code>&lt;input value=&quot;{{myValue::input}}&quot;&gt;
 * 
 * 
 * </code></pre><p><code>iron-input</code> adds the <code>bind-value</code> property that mirrors the <code>value</code> property, and can be used<br>for two-way data binding. <code>bind-value</code> will notify if it is changed either by user input or by script.</p>
 * <pre><code>&lt;input is=&quot;iron-input&quot; bind-value=&quot;{{myValue}}&quot;&gt;
 * 
 * 
 * </code></pre><h3 id="custom-validators">Custom validators</h3>
 * <p>You can use custom validators that implement <code>Polymer.IronValidatorBehavior</code> with <code>&lt;iron-input&gt;</code>.</p>
 * <pre><code>&lt;input is=&quot;iron-input&quot; validator=&quot;my-custom-validator&quot;&gt;
 * 
 * 
 * </code></pre><h3 id="stopping-invalid-input">Stopping invalid input</h3>
 * <p>It may be desirable to only allow users to enter certain characters. You can use the<br><code>prevent-invalid-input</code> and <code>allowed-pattern</code> attributes together to accomplish this. This feature<br>is separate from validation, and <code>allowed-pattern</code> does not affect how the input is validated.</p>
 * <pre><code>&lt;!-- only allow characters that match [0-9] --&gt;
 * &lt;input is=&quot;iron-input&quot; prevent-invalid-input allowed-pattern=&quot;[0-9]&quot;&gt;
 * 
 * 
 * </code></pre>
 */
public class IronInput extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronInput() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronInput(String html) {
        super(IronInputElement.TAG, IronInputElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronInputElement getPolymerElement() {
        try {
            return (IronInputElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Set to true to prevent the user from entering invalid input. The new input characters are<br>matched with <code>allowedPattern</code> if it is set, otherwise it will use the <code>type</code> attribute (only<br>supported for <code>type=number</code>).</p>
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
     * <p>Set to true to prevent the user from entering invalid input. The new input characters are<br>matched with <code>allowedPattern</code> if it is set, otherwise it will use the <code>type</code> attribute (only<br>supported for <code>type=number</code>).</p>
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
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinComboBox
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
     * @behavior VaadinComboBox
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>Regular expression expressing a set of characters to enforce the validity of input characters.<br>The recommended value should follow this format: <code>[a-ZA-Z0-9.+-!;:]</code> that list the characters<br>allowed as input.</p>
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
     * <p>Regular expression expressing a set of characters to enforce the validity of input characters.<br>The recommended value should follow this format: <code>[a-ZA-Z0-9.+-!;:]</code> that list the characters<br>allowed as input.</p>
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
     * <p>Use this property instead of <code>value</code> for two-way data binding.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    public String getBindValue() {
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
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinComboBox
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
     * @behavior VaadinComboBox
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
     * @behavior VaadinComboBox
     */
    public String getValidatorType() {
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinComboBox
     */
    public void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }



    /**
     * <p>Returns true if <code>value</code> is valid. The validator provided in <code>validator</code> will be used first,<br>then any constraints.</p>
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
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinComboBox
     * @return {boolean}
     */
    public boolean hasValidator() {
        return getPolymerElement().hasValidator();
    }

    /**
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinComboBox
     * @return {boolean}
     */
    public boolean validate(JavaScriptObject value) {
        return getPolymerElement().validate(value);
    }


    /**
     * <p>  The <code>iron-input-validate</code> event is fired whenever <code>validate()</code> is called.</p>
     *
     * JavaScript Info:
     * @event iron-input-validate
     */
    public HandlerRegistration addIronInputValidateHandler(IronInputValidateEventHandler handler) {
        return addDomHandler(handler, IronInputValidateEvent.TYPE);
    }

}
