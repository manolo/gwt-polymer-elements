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
@JsType(isNative=true)
public interface PaperInputCharCounterElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-input-char-counter";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";



    /**
     * 
     *
     * JavaScript Info:
     * @method update
     * @param {} state  
     * 
     * 
     */
    void update(Object state);

}
