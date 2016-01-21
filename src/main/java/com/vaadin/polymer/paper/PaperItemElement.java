/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/lists.html">Lists</a></p>
 * <p><code>&lt;paper-item&gt;</code> is an interactive list item. By default, it is a horizontal flexbox.</p>
 * <pre><code>&lt;paper-item&gt;Item&lt;/paper-item&gt;
 * 
 * 
 * </code></pre><p>Use this element with <code>&lt;paper-item-body&gt;</code> to make Material Design styled two-line and three-line<br>items.</p>
 * <pre><code>&lt;paper-item&gt;
 *   &lt;paper-item-body two-line&gt;
 *     &lt;div&gt;Show your status&lt;/div&gt;
 *     &lt;div secondary&gt;Your status is visible to everyone&lt;/div&gt;
 *   &lt;/paper-item-body&gt;
 *   &lt;iron-icon icon=&quot;warning&quot;&gt;&lt;/iron-icon&gt;
 * &lt;/paper-item&gt;
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
 * <td><code>--paper-item-min-height</code></td>
 * <td>Minimum height of the item</td>
 * <td><code>48px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item</code></td>
 * <td>Mixin applied to the item</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected-weight</code></td>
 * <td>The font weight of a selected item</td>
 * <td><code>bold</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-selected</code></td>
 * <td>Mixin applied to selected paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled-color</code></td>
 * <td>The color for disabled paper-items</td>
 * <td><code>--disabled-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-disabled</code></td>
 * <td>Mixin applied to disabled paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused</code></td>
 * <td>Mixin applied to focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item-focused-before</code></td>
 * <td>Mixin applied to :before focused paper-items</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>This element has <code>role=&quot;listitem&quot;</code> by default. Depending on usage, it may be more appropriate to set<br><code>role=&quot;menuitem&quot;</code>, <code>role=&quot;menuitemcheckbox&quot;</code> or <code>role=&quot;menuitemradio&quot;</code>.</p>
 * <pre><code>&lt;paper-item role=&quot;menuitemcheckbox&quot;&gt;
 *   &lt;paper-item-body&gt;
 *     Show your status
 *   &lt;/paper-item-body&gt;
 *   &lt;paper-checkbox&gt;&lt;/paper-checkbox&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface PaperItemElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-item";
    @JsOverlay public static final String SRC = "paper-item/paper-item.html";


    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPointerDown(boolean value);

    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPressed(boolean value);

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setReceivedFocusFromKeyboard(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setToggles(boolean value);

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setActive(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty String getAriaActiveAttribute();
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty void setAriaActiveAttribute(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior VaadinComboBox
     * 
     */
    void keyboardEventMatchesKeys(Object event, Object eventString);

    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinComboBox
     * 
     */
    void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    void removeOwnKeyBindings();

}
