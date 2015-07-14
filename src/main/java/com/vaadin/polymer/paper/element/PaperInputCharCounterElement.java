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
 * <p><code>&lt;paper-input-char-counter&gt;</code> is a character counter for use with <code>&lt;paper-input-container&gt;</code>. It<br>shows the number of characters entered in the input and the max length if it is specified.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;input is=&quot;iron-input&quot; maxlength=&quot;20&quot;&gt;
 *   &lt;paper-input-char-counter&gt;&lt;/paper-input-char-counter&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following mixin is available for styling:</p>
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
 * <td><code>--paper-input-char-counter</code></td>
 * <td>Mixin applied to the element</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperInputCharCounterElement extends HTMLElement {

    public static final String TAG = "paper-input-char-counter";
    public static final String SRC = "paper-input/all-imports.html";


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
     * @method attached
     * @behavior PaperInputCharCounter
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperInputCharCounter
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperInputCharCounter
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
}
