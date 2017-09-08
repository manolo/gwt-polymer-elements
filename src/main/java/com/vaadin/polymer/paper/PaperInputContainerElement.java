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
 * <p><code>&lt;paper-input-container&gt;</code> is a container for a <code>&lt;label&gt;</code>, an <code>&lt;input is=&quot;iron-input&quot;&gt;</code> or<br><code>&lt;textarea&gt;</code> and optional add-on elements such as an error message or character<br>counter, used to implement Material Design text fields.</p>
 * <p>For example:</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;label&gt;Your name&lt;/label&gt;
 *   &lt;input is=&quot;iron-input&quot;&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><p>Do not wrap <code>&lt;paper-input-container&gt;</code> around elements that already include it, such as <code>&lt;paper-input&gt;</code>.<br>Doing so may cause events to bounce infintely between the container and its contained element.</p>
 * <h3 id="listening-for-input-changes">Listening for input changes</h3>
 * <p>By default, it listens for changes on the <code>bind-value</code> attribute on its children nodes and perform<br>tasks such as auto-validating and label styling when the <code>bind-value</code> changes. You can configure<br>the attribute it listens to with the <code>attr-for-value</code> attribute.</p>
 * <h3 id="using-a-custom-input-element">Using a custom input element</h3>
 * <p>You can use a custom input element in a <code>&lt;paper-input-container&gt;</code>, for example to implement a<br>compound input field like a social security number input. The custom input element should have the<br><code>paper-input-input</code> class, have a <code>notify:true</code> value property and optionally implements<br><code>Polymer.IronValidatableBehavior</code> if it is validatable.</p>
 * <pre><code>&lt;paper-input-container attr-for-value=&quot;ssn-value&quot;&gt;
 *   &lt;label&gt;Social security number&lt;/label&gt;
 *   &lt;ssn-input class=&quot;paper-input-input&quot;&gt;&lt;/ssn-input&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * 
 * </code></pre><p>If you’re using a <code>&lt;paper-input-container&gt;</code> imperatively, it’s important to make sure<br>that you attach its children (the <code>iron-input</code> and the optional <code>label</code>) before you<br>attach the <code>&lt;paper-input-container&gt;</code> itself, so that it can be set up correctly.</p>
 * <h3 id="validation">Validation</h3>
 * <p>If the <code>auto-validate</code> attribute is set, the input container will validate the input and update<br>the container styling when the input value changes.</p>
 * <h3 id="add-ons">Add-ons</h3>
 * <p>Add-ons are child elements of a <code>&lt;paper-input-container&gt;</code> with the <code>add-on</code> attribute and<br>implements the <code>Polymer.PaperInputAddonBehavior</code> behavior. They are notified when the input value<br>or validity changes, and may implement functionality such as error messages or character counters.<br>They appear at the bottom of the input.</p>
 * <h3 id="prefixes-and-suffixes">Prefixes and suffixes</h3>
 * <p>These are child elements of a <code>&lt;paper-input-container&gt;</code> with the <code>prefix</code><br>or <code>suffix</code> attribute, and are displayed inline with the input, before or after.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;div prefix&gt;$&lt;/div&gt;
 *   &lt;label&gt;Total&lt;/label&gt;
 *   &lt;input is=&quot;iron-input&quot;&gt;
 *   &lt;paper-icon-button suffix icon=&quot;clear&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
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
 * <td><code>--primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-invalid-color</code></td>
 * <td>Label and underline color when the input is is invalid</td>
 * <td><code>--error-color</code></td>
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
 * <td><code>--paper-input-container-disabled</code></td>
 * <td>Mixin applied to the container when it’s disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-label</code></td>
 * <td>Mixin applied to the label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-label-focus</code></td>
 * <td>Mixin applied to the label when the input is focused</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-label-floating</code></td>
 * <td>Mixin applied to the label when floating</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input</code></td>
 * <td>Mixin applied to the input</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input-focus</code></td>
 * <td>Mixin applied to the input when focused</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input-invalid</code></td>
 * <td>Mixin applied to the input when invalid</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input-webkit-spinner</code></td>
 * <td>Mixin applied to the webkit spinner</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-input-webkit-clear</code></td>
 * <td>Mixin applied to the webkit clear button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-ms-clear</code></td>
 * <td>Mixin applied to the Internet Explorer clear button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-underline</code></td>
 * <td>Mixin applied to the underline</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-underline-focus</code></td>
 * <td>Mixin applied to the underline when the input is focused</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-container-underline-disabled</code></td>
 * <td>Mixin applied to the underline when the input is disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-prefix</code></td>
 * <td>Mixin applied to the input prefix</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-suffix</code></td>
 * <td>Mixin applied to the input suffix</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>This element is <code>display:block</code> by default, but you can set the <code>inline</code> attribute to make it<br><code>display:inline-block</code>.</p>
 */
@JsType(isNative=true)
public interface PaperInputContainerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-input-container";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";


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
     * <p>True if the input is invalid. This property is set automatically when the input value<br>changes if auto-validating, or when the <code>iron-input-validate</code> event is heard from a child.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the input is invalid. This property is set automatically when the input value<br>changes if auto-validating, or when the <code>iron-input-validate</code> event is heard from a child.</p>
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
     * <p>Call this to update the state of add-ons.</p>
     *
     * JavaScript Info:
     * @method updateAddons
     * @param {Object} state  
     * 
     * 
     */
    void updateAddons(JavaScriptObject state);

}
