/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-demo-helpers project by The Polymer Authors
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
 * <p><code>demo-snippet</code> is a helper element that displays the source of a code snippet and<br>its rendered demo. It can be used for both native elements and<br>Polymer elements.</p>
 * <pre><code>Example of a native element demo
 * 
 *     &lt;demo-snippet&gt;
 *       &lt;template&gt;
 *         &lt;input type=&quot;date&quot;&gt;
 *       &lt;/template&gt;
 *     &lt;/demo-snippet&gt;
 * 
 * Example of a Polymer &lt;paper-checkbox&gt; demo
 * 
 *     &lt;demo-snippet&gt;
 *       &lt;template&gt;
 *         &lt;paper-checkbox&gt;Checkbox&lt;/paper-checkbox&gt;
 *         &lt;paper-checkbox checked&gt;Checkbox&lt;/paper-checkbox&gt;
 *       &lt;/template&gt;
 *     &lt;/demo-snippet&gt;
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
 * <td><code>--demo-snippet</code></td>
 * <td>Mixin applied to the entire element</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--demo-snippet-demo</code></td>
 * <td>Mixin applied to just the demo section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--demo-snippet-code</code></td>
 * <td>Mixin applied to just the code section</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface DemoSnippetElement extends HTMLElement {

    @JsOverlay public static final String TAG = "demo-snippet";
    @JsOverlay public static final String SRC = "iron-demo-helpers/demo-snippet.html";



}
