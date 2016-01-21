/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog-behavior project by The Polymer Authors
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
 * <p>Use <code>Polymer.PaperDialogBehavior</code> and <code>paper-dialog-shared-styles.html</code> to implement a Material Design<br>dialog.</p>
 * <p>For example, if <code>&lt;paper-dialog-impl&gt;</code> implements this behavior:</p>
 * <pre><code>&lt;paper-dialog-impl&gt;
 *     &lt;h2&gt;Header&lt;/h2&gt;
 *     &lt;div&gt;Dialog body&lt;/div&gt;
 *     &lt;div class=&quot;buttons&quot;&gt;
 *         &lt;paper-button dialog-dismiss&gt;Cancel&lt;/paper-button&gt;
 *         &lt;paper-button dialog-confirm&gt;Accept&lt;/paper-button&gt;
 *     &lt;/div&gt;
 * &lt;/paper-dialog-impl&gt;
 * 
 * 
 * </code></pre><p><code>paper-dialog-shared-styles.html</code> provide styles for a header, content area, and an action area for buttons.<br>Use the <code>&lt;h2&gt;</code> tag for the header and the <code>buttons</code> class for the action area. You can use the<br><code>paper-dialog-scrollable</code> element (in its own repository) if you need a scrolling content area.</p>
 * <p>Use the <code>dialog-dismiss</code> and <code>dialog-confirm</code> attributes on interactive controls to close the<br>dialog. If the user dismisses the dialog with <code>dialog-confirm</code>, the <code>closingReason</code> will update<br>to include <code>confirmed: true</code>.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling.</p>
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
 * <td><code>--paper-dialog-background-color</code></td>
 * <td>Dialog background color</td>
 * <td><code>--primary-background-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dialog-color</code></td>
 * <td>Dialog foreground color</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dialog</code></td>
 * <td>Mixin applied to the dialog</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dialog-title</code></td>
 * <td>Mixin applied to the title (<code>&lt;h2&gt;</code>) element</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-dialog-button-color</code></td>
 * <td>Button area foreground color</td>
 * <td><code>--default-primary-color</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>This element has <code>role=&quot;dialog&quot;</code> by default. Depending on the context, it may be more appropriate<br>to override this attribute with <code>role=&quot;alertdialog&quot;</code>.</p>
 * <p>If <code>modal</code> is set, the element will set <code>aria-modal</code> and prevent the focus from exiting the element.<br>It will also ensure that focus remains in the dialog.</p>
 * <p>The <code>aria-labelledby</code> attribute will be set to the header element, if one exists.</p>
 */
@JsType(isNative=true)
public interface PaperDialogBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperDialogBehavior";
    @JsOverlay public static final String SRC = "paper-dialog-behavior/paper-dialog-behavior.html";


    /**
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getModal();
    /**
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setModal(boolean value);


}
