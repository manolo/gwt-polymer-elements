/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;paper-icon-item&gt;</code> is a convenience element to make an item with icon. It is a non interactive list<br>item with a fixed-width icon area, according to Material Design. This is useful if the icons are of<br>varying widths, but you want the item bodies to line up. Use this like a <code>&lt;paper-item&gt;</code>. The child<br>node with the attribute <code>item-icon</code> is placed in the icon area.</p>
 * <pre><code>&lt;paper-icon-item&gt;
 *   &lt;iron-icon icon=&quot;favorite&quot; item-icon&gt;&lt;/iron-icon&gt;
 *   Favorite
 * &lt;/paper-icon-item&gt;
 * &lt;paper-icon-item&gt;
 *   &lt;div class=&quot;avatar&quot; item-icon&gt;&lt;/div&gt;
 *   Avatar
 * &lt;/paper-icon-item&gt;
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
 * <td><code>--paper-item-icon-width</code></td>
 * <td>Width of the icon area</td>
 * <td><code>56px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-icon-item</code></td>
 * <td>Mixin applied to the item</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperIconItemElement extends HTMLElement {

    public static final String TAG = "paper-icon-item";
    public static final String SRC = "paper-item/all-imports.html";


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
  
}
