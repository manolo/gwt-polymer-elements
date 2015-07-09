/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-fab project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Material Design: <a href="http://www.google.com/design/spec/components/buttons.html">Button</a></p>
 * <p><code>paper-fab</code> is a floating action button. It contains an image placed in the center and<br>comes in two sizes: regular size and a smaller size by applying the attribute <code>mini</code>. When<br>the user touches the button, a ripple effect emanates from the center of the button.</p>
 * <p>You may import <code>iron-icons</code> to use with this element, or provide a URL to a custom icon.<br>See <code>iron-iconset</code> for more information about how to use a custom icon set.</p>
 * <p>Example:</p>
 * <pre><code>&lt;link href=&quot;path/to/iron-icons/iron-icons.html&quot; rel=&quot;import&quot;&gt;
 * 
 * &lt;paper-fab icon=&quot;add&quot;&gt;&lt;/paper-fab&gt;
 * &lt;paper-fab mini icon=&quot;favorite&quot;&gt;&lt;/paper-fab&gt;
 * &lt;paper-fab src=&quot;star.png&quot;&gt;&lt;/paper-fab&gt;
 * 
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
 * <td><code>--paper-fab-background</code></td>
 * <td>The background color of the button</td>
 * <td><code>--accent-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab-keyboard-focus-background</code></td>
 * <td>The background color of the button when focused</td>
 * <td><code>--paper-pink-900</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab-disabled-background</code></td>
 * <td>The background color of the button when it’s disabled</td>
 * <td><code>--paper-grey-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab-disabled-text</code></td>
 * <td>The text color of the button when it’s disabled</td>
 * <td><code>--paper-grey-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab</code></td>
 * <td>Mixin applied to the button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab-mini</code></td>
 * <td>Mixin applied to a mini button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-fab-disabled</code></td>
 * <td>Mixin applied to a disabled button</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperFabElement extends HTMLElement {

    public static final String TAG = "paper-fab";
    public static final String SRC = "paper-fab/paper-fab.html";


    /**
     * <p>Specifies the icon name or index in the set of icons available in<br>the icon’s icon set. If the icon property is specified,<br>the src property should not be.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty String getIcon();
    /**
     * <p>Specifies the icon name or index in the set of icons available in<br>the icon’s icon set. If the icon property is specified,<br>the src property should not be.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty void setIcon(String value);
  
    /**
     * <p>Set this to true to style this is a “mini” FAB.</p>
     *
     * JavaScript Info:
     * @property mini
     * @type Boolean
     * 
     */
    @JsProperty boolean getMini();
    /**
     * <p>Set this to true to style this is a “mini” FAB.</p>
     *
     * JavaScript Info:
     * @property mini
     * @type Boolean
     * 
     */
    @JsProperty void setMini(boolean value);
  
    /**
     * <p>The URL of an image for the icon. If the src property is specified,<br>the icon property should not be.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The URL of an image for the icon. If the src property is specified,<br>the icon property should not be.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperFab
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperFab
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperFab
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperFab
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty void setActive(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperSlider
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperSlider
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);
  
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty void setPointerDown(boolean value);
  
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty void setPressed(boolean value);
  
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty void setReceivedFocusFromKeyboard(boolean value);
  
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperSlider
     */
    @JsProperty void setToggles(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperSlider
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperSlider
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTabs
     */
    void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTabs
     */
    void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTabs
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTabs
     */
    void registered();

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty void setDisabled(boolean value);
  
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperInput
     */
    @JsProperty void setFocused(boolean value);
  
}
