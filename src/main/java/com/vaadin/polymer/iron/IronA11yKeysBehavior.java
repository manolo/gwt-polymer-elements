/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys-behavior project by The Polymer Authors
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
 * <p><code>Polymer.IronA11yKeysBehavior</code> provides a normalized interface for processing<br>keyboard commands that pertain to <a href="http://www.w3.org/TR/wai-aria-practices/#kbd_general_binding">WAI-ARIA best practices</a>.<br>The element takes care of browser differences with respect to Keyboard events<br>and uses an expressive syntax to filter key presses.</p>
 * <p>Use the <code>keyBindings</code> prototype property to express what combination of keys<br>will trigger the callback. A key binding has the format<br><code>&quot;KEY+MODIFIER:EVENT&quot;: &quot;callback&quot;</code> (<code>&quot;KEY&quot;: &quot;callback&quot;</code> or<br><code>&quot;KEY:EVENT&quot;: &quot;callback&quot;</code> are valid as well). Some examples:</p>
 * <pre><code> keyBindings: {
 *    &#39;space&#39;: &#39;_onKeydown&#39;, // same as &#39;space:keydown&#39;
 *    &#39;shift+tab&#39;: &#39;_onKeydown&#39;,
 *    &#39;enter:keypress&#39;: &#39;_onKeypress&#39;,
 *    &#39;esc:keyup&#39;: &#39;_onKeyup&#39;
 *  }
 * 
 * 
 * </code></pre><p>The callback will receive with an event containing the following information in <code>event.detail</code>:</p>
 * <pre><code> _onKeydown: function(event) {
 *    console.log(event.detail.combo); // KEY+MODIFIER, e.g. &quot;shift+tab&quot;
 *    console.log(event.detail.key); // KEY only, e.g. &quot;tab&quot;
 *    console.log(event.detail.event); // EVENT, e.g. &quot;keydown&quot;
 *    console.log(event.detail.keyboardEvent); // the original KeyboardEvent
 *  }
 * 
 * 
 * </code></pre><p>Use the <code>keyEventTarget</code> attribute to set up event handlers on a specific<br>node.</p>
 * <p>See the <a href="https://github.com/PolymerElements/iron-a11y-keys-behavior/blob/master/demo/x-key-aware.html">demo source code</a><br>for an example.</p>
 */
@JsType(isNative=true)
public interface IronA11yKeysBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronA11yKeysBehavior";
    @JsOverlay public static final String SRC = "iron-a11y-keys-behavior/iron-a11y-keys-behavior.html";


    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    void removeOwnKeyBindings();

}
