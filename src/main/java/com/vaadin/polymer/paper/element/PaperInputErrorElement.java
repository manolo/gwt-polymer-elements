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
 * <p><code>&lt;paper-input-error&gt;</code> is an error message for use with <code>&lt;paper-input-container&gt;</code>. The error is<br>displayed when the <code>&lt;paper-input-container&gt;</code> is <code>invalid</code>.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;input is=&quot;iron-input&quot; pattern=&quot;[0-9]*&quot;&gt;
 *   &lt;paper-input-error&gt;Only numbers are allowed!&lt;/paper-input-error&gt;
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
 * <td><code>--paper-input-container-invalid-color</code></td>
 * <td>The foreground color of the error</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-error</code></td>
 * <td>Mixin applied to the error</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperInputErrorElement extends HTMLElement {

    public static final String TAG = "paper-input-error";
    public static final String SRC = "paper-input/all-imports.html";


    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method update
     * @param {} state  
     * 
     */
    void update(JavaScriptObject state);

    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperInputCharCounter
     */
    void attached();

}
