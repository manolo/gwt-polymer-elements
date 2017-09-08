/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-label project by The Polymer Authors
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
 * <p><code>&lt;iron-label&gt;</code> provides a version of the <code>&lt;label&gt;</code> element that works with Custom Elements as well as native elements.</p>
 * <p>All text in the <code>iron-label</code> will be applied to the target element as a screen-reader accessible description.</p>
 * <p>There are three ways to use <code>iron-label</code> to target an element:</p>
 * <ol>
 * <li><p>place an element inside iron-label and some text:</p>
 * <pre><code>&lt;iron-label&gt;
 *   Label for the Button
 *   &lt;paper-button&gt;button&lt;/paper-button&gt;
 * &lt;/iron-label&gt;
 * 
 * </code></pre></li>
 * <li><p>place some elements inside iron-label and target one with the <code>iron-label-target</code> attribute.<br>The other elements will provide the label for that element<br>Note: This is not necessary if the element you want to label is the first<br>element child of iron-label:</p>
 * <pre><code>&lt;iron-label&gt;
 *   &lt;span&gt;Label for the Button&lt;/span&gt;
 *   &lt;paper-button iron-label-target&gt;button&lt;/paper-button&gt;
 * &lt;/iron-label&gt;
 * 
 * &lt;iron-label&gt;
 *   &lt;paper-button&gt;button&lt;/paper-button&gt;
 *   &lt;span&gt;Label for the Button&lt;/span&gt;
 * &lt;/iron-label&gt;
 * 
 * </code></pre></li>
 * <li><p>Set the <code>for</code> attribute on the <code>iron-label</code> element with the id of the target<br>element in the same document or ShadowRoot:</p>
 * <pre><code>&lt;iron-label for=&quot;foo&quot;&gt;
 *   Context for the button with the &quot;foo&quot; class&quot;
 * &lt;/iron-label&gt;
 * &lt;paper-button id=&quot;foo&quot;&gt;Far away button&lt;/paper-button&gt;
 * 
 * 
 * </code></pre></li>
 * </ol>
 * <p>All taps on the <code>iron-label</code> will be forwarded to the “target” element.</p>
 */
@JsType(isNative=true)
public interface IronLabelElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-label";
    @JsOverlay public static final String SRC = "iron-label/iron-label.html";


    /**
     * <p>An ID reference to another element that needs to be<br>labelled by this <code>iron-label</code> element.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty String getFor();
    /**
     * <p>An ID reference to another element that needs to be<br>labelled by this <code>iron-label</code> element.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty void setFor(String value);


}
