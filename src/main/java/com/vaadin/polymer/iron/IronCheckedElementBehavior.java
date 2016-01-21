/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-checked-element-behavior project by The Polymer Authors
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
 * <p>Use <code>Polymer.IronCheckedElementBehavior</code> to implement a custom element<br>that has a <code>checked</code> property, which can be used for validation if the<br>element is also <code>required</code>. Element instances implementing this behavior<br>will also be registered for use in an <code>iron-form</code> element.</p>
 */
@JsType(isNative=true)
public interface IronCheckedElementBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronCheckedElementBehavior";
    @JsOverlay public static final String SRC = "iron-checked-element-behavior/iron-checked-element-behavior.html";


    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getChecked();
    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setChecked(boolean value);

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setToggles(boolean value);

    /**
     * <p> Overriden from Polymer.IronFormElementBehavior </p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty String getValue();
    /**
     * <p> Overriden from Polymer.IronFormElementBehavior </p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty void setValue(String value);


}
