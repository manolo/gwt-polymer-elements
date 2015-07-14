/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
 * &lt;input is=&quot;iron-input&quot; prevent-invaild-input allowed-pattern=&quot;[0-9]&quot;&gt;
 * 
 * 
 * </code></pre>
 */
@JsType
public interface IronInputElement extends HTMLElement {

    public static final String TAG = "iron-input";
    public static final String SRC = "iron-input/iron-input.html";


    /**
     * <p>Regular expression to match valid input characters.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Regular expression to match valid input characters.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty void setAllowedPattern(String value);
  
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    @JsProperty String getBindValue();
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    @JsProperty void setBindValue(String value);
  
    /**
     * <p>Set to true to prevent the user from entering invalid input. The new input characters are<br>matched with <code>allowedPattern</code> if it is set, otherwise it will use the <code>pattern</code> attribute if<br>set, or the <code>type</code> attribute (only supported for <code>type=number</code>).</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. The new input characters are<br>matched with <code>allowedPattern</code> if it is set, otherwise it will use the <code>pattern</code> attribute if<br>set, or the <code>type</code> attribute (only supported for <code>type=number</code>).</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty void setPreventInvalidInput(boolean value);
  
    /**
     * <p>Returns true if <code>value</code> is valid. The validator provided in <code>validator</code> will be used first,<br>then any constraints.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     */
    void validate();

    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty String getExtends();
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty void setExtends(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior IronInput
     */
    void hasValidator();

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior IronInput
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior IronInput
     */
    @JsProperty void setInvalid(boolean value);
  
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior IronInput
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior IronInput
     */
    @JsProperty void setValidator(String value);
  
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior IronInput
     */
    @JsProperty String getValidatorType();
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior IronInput
     */
    @JsProperty void setValidatorType(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior IronInput
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior IronInput
     */
    @JsProperty void setObservers(JsArray value);
  
}
