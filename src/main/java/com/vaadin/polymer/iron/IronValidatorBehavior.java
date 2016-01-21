/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-validator-behavior project by The Polymer Authors
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
 * <p>Use <code>Polymer.IronValidatorBehavior</code> to implement a custom input/form validator. Element<br>instances implementing this behavior will be registered for use in elements that implement<br><code>Polymer.IronValidatableBehavior</code>.</p>
 */
@JsType(isNative=true)
public interface IronValidatorBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronValidatorBehavior";
    @JsOverlay public static final String SRC = "iron-validator-behavior/iron-validator-behavior.html";


    /**
     * <p>Name for this validator, used by <code>Polymer.IronValidatableBehavior</code> to lookup this element.</p>
     *
     * JavaScript Info:
     * @property validatorName
     * @type String
     * 
     */
    @JsProperty String getValidatorName();
    /**
     * <p>Name for this validator, used by <code>Polymer.IronValidatableBehavior</code> to lookup this element.</p>
     *
     * JavaScript Info:
     * @property validatorName
     * @type String
     * 
     */
    @JsProperty void setValidatorName(String value);

    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * 
     */
    @JsProperty String getValidatorType();
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * 
     */
    @JsProperty void setValidatorType(String value);


    /**
     * <p>Implement custom validation logic in this function.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} values  
     * 
     * @return {boolean}
     */
    boolean validate(JavaScriptObject values);

}
