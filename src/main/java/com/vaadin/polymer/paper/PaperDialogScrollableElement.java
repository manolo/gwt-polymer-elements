/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog-scrollable project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/dialogs.html">Dialogs</a></p>
 * <p><code>paper-dialog-scrollable</code> implements a scrolling area used in a Material Design dialog. It shows<br>a divider at the top and/or bottom indicating more content, depending on scroll position. Use this<br>together with elements implementing <code>Polymer.PaperDialogBehavior</code>.</p>
 * <pre><code>&lt;paper-dialog-impl&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;paper-dialog-scrollable&gt;
 *     Lorem ipsum...
 *   &lt;/paper-dialog-scrollable&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button&gt;OK&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog-impl&gt;
 * 
 * 
 * </code></pre><p>It shows a top divider after scrolling if it is not the first child in its parent container,<br>indicating there is more content above. It shows a bottom divider if it is scrollable and it is not<br>the last child in its parent container, indicating there is more content below. The bottom divider<br>is hidden if it is scrolled to the bottom.</p>
 */
@JsType(isNative=true)
public interface PaperDialogScrollableElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-dialog-scrollable";
    @JsOverlay public static final String SRC = "paper-dialog-scrollable/paper-dialog-scrollable.html";


    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    @JsProperty JavaScriptObject getDialogElement();
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    @JsProperty void setDialogElement(JavaScriptObject value);


}
