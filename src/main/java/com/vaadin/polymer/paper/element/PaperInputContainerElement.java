/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;paper-input-container&gt;</code> is a container for a <code>&lt;label&gt;</code>, an <code>&lt;input is=&quot;iron-input&quot;&gt;</code> or<br><code>&lt;iron-autogrow-textarea&gt;</code> and optional add-on elements such as an error message or character<br>counter, used to implement Material Design text fields.</p>
 * <p>For example:</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;label&gt;Your name&lt;/label&gt;
 *   &lt;input is=&quot;iron-input&quot;&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="listening-for-input-changes">Listening for input changes</h3>
 * <p>By default, it listens for changes on the <code>bind-value</code> attribute on its children nodes and perform<br>tasks such as auto-validating and label styling when the <code>bind-value</code> changes. You can configure<br>the attribute it listens to with the <code>attr-for-value</code> attribute.</p>
 * <h3 id="using-a-custom-input-element">Using a custom input element</h3>
 * <p>You can use a custom input element in a <code>&lt;paper-input-container&gt;</code>, for example to implement a<br>compound input field like a social security number input. The custom input element should have the<br><code>paper-input-input</code> class, have a <code>notify:true</code> value property and optionally implements<br><code>Polymer.IronValidatableBehavior</code> if it is validatble.</p>
 * <pre><code>&lt;paper-input-container attr-for-value=&quot;ssn-value&quot;&gt;
 *   &lt;label&gt;Social security number&lt;/label&gt;
 *   &lt;ssn-input class=&quot;paper-input-input&quot;&gt;&lt;/ssn-input&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="validation">Validation</h3>
 * <p>If the <code>auto-validate</code> attribute is set, the input container will validate the input and update<br>the container styling when the input value changes.</p>
 * <h3 id="add-ons">Add-ons</h3>
 * <p>Add-ons are child elements of a <code>&lt;paper-input-container&gt;</code> with the <code>add-on</code> attribute and<br>implements the <code>Polymer.PaperInputAddonBehavior</code> behavior. They are notified when the input value<br>or validity changes, and may implement functionality such as error messages or character counters.<br>They appear at the bottom of the input.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-input-container-color</code></td>
 * <td>Label and underline color when the input is not focused</td>
 * <td><code>--secondary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-focus-color</code></td>
 * <td>Label and underline color when the input is focused</td>
 * <td><code>--default-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-invalid-color</code></td>
 * <td>Label and underline color when the input is focused</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input-color</code></td>
 * <td>Input foreground color</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container</code></td>
 * <td>Mixin applied to the container</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-label</code></td>
 * <td>Mixin applied to the label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input</code></td>
 * <td>Mixin applied to the input</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>This element is <code>display:block</code> by default, but you can set the <code>inline</code> attribute to make it<br><code>display:inline-block</code>.</p>
 */
@JsType
public interface PaperInputContainerElement extends HTMLElement {

    public static final String TAG = "paper-input-container";
    public static final String SRC = "paper-input/all-imports.html";


    /**
     * <p>Set to true to always float the floating label.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the floating label.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);
  
    /**
     * <p>The attribute to listen for value changes on.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    @JsProperty String getAttrForValue();
    /**
     * <p>The attribute to listen for value changes on.</p>
     *
     * JavaScript Info:
     * @property attrForValue
     * @type String
     * 
     */
    @JsProperty void setAttrForValue(String value);
  
    /**
     * <p>Set to true to auto-validate the input value when it changes.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value when it changes.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty void setAutoValidate(boolean value);
  
    /**
     * <p>True if the input has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty boolean getFocused();
    /**
     * <p>True if the input has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * 
     */
    @JsProperty void setFocused(boolean value);
  
    /**
     * <p>True if the input is invalid. This property is set automatically when the input value<br>changes if auto-validating, or when the <code>iron-input-valid</code> event is heard from a child.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the input is invalid. This property is set automatically when the input value<br>changes if auto-validating, or when the <code>iron-input-valid</code> event is heard from a child.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);
  
    /**
     * <p>Set to true to disable the floating label. The label disappears when the input value is<br>not null.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. The label disappears when the input value is<br>not null.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty void setNoLabelFloat(boolean value);
  
    /**
     * <p>Call this to update the state of add-ons.</p>
     *
     * JavaScript Info:
     * @method updateAddons
     * @param {Object} state  
     * 
     */
    void updateAddons(JavaScriptObject state);

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

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
  
}
