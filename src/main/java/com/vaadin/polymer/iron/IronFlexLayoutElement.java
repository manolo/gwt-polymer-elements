/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-flex-layout project by The Polymer Authors
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
 * <p>The <code>&lt;iron-flex-layout&gt;</code> component provides simple ways to use<br><a href="https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Flexible_boxes">CSS flexible box layout</a>,<br>also known as flexbox. This component provides two different ways to use flexbox:</p>
 * <ol>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">Layout classes</a>.<br>The layout class stylesheet provides a simple set of class-based flexbox rules, that<br>let you specify layout properties directly in markup. You must include this file<br>in every element that needs to use them.</p>
 * <p>Sample use:</p>
 * <pre><code>&lt;custom-element-demo&gt;
 *   &lt;template&gt;
 *     &lt;script src=&quot;../webcomponentsjs/webcomponents-lite.js&quot;&gt;&lt;/script&gt;
 *     &lt;next-code-block&gt;&lt;/next-code-block&gt;
 *   &lt;/template&gt;
 * &lt;/custom-element-demo&gt;
 * </code></pre><pre><code class="lang-html">&lt;link rel=&quot;import&quot; href=&quot;iron-flex-layout-classes.html&quot;&gt;
 * &lt;style is=&quot;custom-style&quot; include=&quot;iron-flex iron-flex-alignment&quot;&gt;&lt;/style&gt;
 * &lt;style&gt;
 *   .test { width: 100px; }
 * &lt;/style&gt;
 * &lt;div class=&quot;layout horizontal center-center&quot;&gt;
 *   &lt;div class=&quot;test&quot;&gt;horizontal layout center alignment&lt;/div&gt;
 * &lt;/div&gt;
 * </code></pre>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/blob/master/iron-flex-layout.html">Custom CSS mixins</a>.<br>The mixin stylesheet includes custom CSS mixins that can be applied inside a CSS rule using the <code>@apply</code> function.</p>
 * </li>
 * </ol>
 * <p>Please note that the old <a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/classes">/deep/ layout classes</a><br>are deprecated, and should not be used. To continue using layout properties<br>directly in markup, please switch to using the new <code>dom-module</code>-based<br><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">layout classes</a>.<br>Please note that the new version does not use <code>/deep/</code>, and therefore requires you<br>to import the <code>dom-modules</code> in every element that needs to use them.</p>
 * <p>A complete <a href="https://elements.polymer-project.org/guides/flex-layout">guide</a> to <code>&lt;iron-flex-layout&gt;</code> is available.</p>
 */
@JsType(isNative=true)
public interface IronFlexLayoutElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-flex-layout";
    @JsOverlay public static final String SRC = "iron-flex-layout/iron-flex-layout.html";



}
