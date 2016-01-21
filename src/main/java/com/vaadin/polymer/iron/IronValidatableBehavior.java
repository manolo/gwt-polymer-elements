/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-validatable-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p><code>Use Polymer.IronValidatableBehavior</code> to implement an element that validates user input.<br>Use the related <code>Polymer.IronValidatorBehavior</code> to add custom validation logic to an iron-input.</p>
 * <p>By default, an <code>&lt;iron-form&gt;</code> element validates its fields when the user presses the submit button.<br>To validate a form imperatively, call the form’s <code>validate()</code> method, which in turn will<br>call <code>validate()</code> on all its children. By using <code>Polymer.IronValidatableBehavior</code>, your<br>custom element will get a public <code>validate()</code>, which<br>will return the validity of the element, and a corresponding <code>invalid</code> attribute,<br>which can be used for styling.</p>
 * <p>To implement the custom validation logic of your element, you must override<br>the protected <code>_getValidity()</code> method of this behaviour, rather than <code>validate()</code>.<br>See <a href="https://github.com/PolymerElements/iron-form/blob/master/demo/simple-element.html">this</a><br>for an example.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>Changing the <code>invalid</code> property, either manually or by calling <code>validate()</code> will update the<br><code>aria-invalid</code> attribute.</p>
 */
@JsType(isNative=true)
public interface IronValidatableBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronValidatableBehavior";
    @JsOverlay public static final String SRC = "iron-validatable-behavior/iron-validatable-behavior.html";


    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty String getValidatorType();
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinComboBox
     */
    @JsProperty void setValidatorType(String value);


    /**
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior VaadinComboBox
     * @return {boolean}
     */
    boolean validate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinComboBox
     * @return {boolean}
     */
    boolean hasValidator();

}
