/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>app-toolbar is a horizontal toolbar containing items that can be used for<br>label, navigation, search and actions.</p>
 * <h3 id="example">Example</h3>
 * <p>Add a title to the toolbar.</p>
 * <pre><code class="lang-html">&lt;app-toolbar&gt;
 *   &lt;div main-title&gt;App name&lt;/div&gt;
 * &lt;/app-toolbar&gt;
 * </code></pre>
 * <p>Add a button to the left and right side of the toolbar.</p>
 * <pre><code class="lang-html">&lt;app-toolbar&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;div main-title&gt;App name&lt;/div&gt;
 *   &lt;paper-icon-button icon=&quot;search&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/app-toolbar&gt;
 * </code></pre>
 * <p>You can use the attributes <code>top-item</code> or <code>bottom-item</code> to completely fit an element<br>to the top or bottom of the toolbar respectively.</p>
 * <h3 id="content-attributes">Content attributes</h3>
 * <table>
 * <thead>
 * <tr>
 * <th>Attribute</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>main-title</code></td>
 * <td>The main title element.</td>
 * </tr>
 * <tr>
 * <td><code>condensed-title</code></td>
 * <td>The title element if used inside a condensed app-header.</td>
 * </tr>
 * <tr>
 * <td><code>spacer</code></td>
 * <td>Adds a left margin of <code>64px</code>.</td>
 * </tr>
 * <tr>
 * <td><code>bottom-item</code></td>
 * <td>Sticks the element to the bottom of the toolbar.</td>
 * </tr>
 * <tr>
 * <td><code>top-item</code></td>
 * <td>Sticks the element to the top of the toolbar.</td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--app-toolbar-font-size</code></td>
 * <td>Toolbar font size</td>
 * <td>20px</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface AppToolbarElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-toolbar";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";



}
