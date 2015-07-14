/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Use <code>&lt;paper-item-body&gt;</code> in a <code>&lt;paper-item&gt;</code> or <code>&lt;paper-icon-item&gt;</code> to make two- or<br>three- line items. It is a flex item that is a vertical flexbox.</p>
 * <pre><code>&lt;paper-item&gt;
 *   &lt;paper-item-body two-line&gt;
 *     &lt;div&gt;Show your status&lt;/div&gt;
 *     &lt;div secondary&gt;Your status is visible to everyone&lt;/div&gt;
 *   &lt;/paper-item-body&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre><p>The child elements with the <code>secondary</code> attribute is given secondary text styling.</p>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--paper-item-body-two-line-min-height</code></td>
 * <td>Minimum height of a two-line item</td>
 * <td><code>72px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-body-three-line-min-height</code></td>
 * <td>Minimum height of a three-line item</td>
 * <td><code>88px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-body-secondary-color</code></td>
 * <td>Foreground color for the <code>secondary</code> area</td>
 * <td><code>--secondary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-body-secondary</code></td>
 * <td>Mixin applied to the <code>secondary</code> area</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperItemBody extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperItemBody() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperItemBody(String html) {
        super(PaperItemBodyElement.TAG, PaperItemBodyElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperItemBodyElement getPolymerElement() {
        return (PaperItemBodyElement) getElement();
    }



}
