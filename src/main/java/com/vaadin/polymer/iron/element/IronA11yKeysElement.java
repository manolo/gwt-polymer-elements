/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>iron-a11y-keys</code> provides a normalized interface for processing keyboard commands that pertain to <a href="http://www.w3.org/TR/wai-aria-practices/#kbd_general_binding">WAI-ARIA best<br>practices</a>. The element takes care of browser differences<br>with respect to Keyboard events and uses an expressive syntax to filter key presses.</p>
 * <p>Use the <code>keys</code> attribute to express what combination of keys will trigger the event to fire.</p>
 * <p>Use the <code>target</code> attribute to set up event handlers on a specific node.<br>The <code>keys-pressed</code> event will fire when one of the key combinations set with the <code>keys</code> attribute is pressed.</p>
 * <p>Example:</p>
 * <p>This element will call <code>arrowHandler</code> on all arrow keys:</p>
 * <pre><code>&lt;iron-a11y-keys target=&quot;{{}}&quot; keys=&quot;up down left right&quot; on-keys-pressed=&quot;{{arrowHandler}}&quot;&gt;&lt;/iron-a11y-keys&gt;
 * 
 * 
 * </code></pre><p>Keys Syntax:</p>
 * <p>The <code>keys</code> attribute can accepts a space seprated, <code>+</code> concatenated set of modifier keys and some common keyboard keys.</p>
 * <p>The common keys are <code>a-z</code>, <code>0-9</code> (top row and number pad), <code>*</code> (shift 8 and number pad), <code>F1-F12</code>, <code>Page Up</code>, <code>Page
 * Down</code>, <code>Left Arrow</code>, <code>Right Arrow</code>, <code>Down Arrow</code>, <code>Up Arrow</code>, <code>Home</code>, <code>End</code>, <code>Escape</code>, <code>Space</code>, <code>Tab</code>, and <code>Enter</code> keys.</p>
 * <p>The modifier keys are <code>Shift</code>, <code>Control</code>, and <code>Alt</code>.</p>
 * <p>All keys are expected to be lowercase and shortened:<br><code>Left Arrow</code> is <code>left</code>, <code>Page Down</code> is <code>pagedown</code>, <code>Control</code> is <code>ctrl</code>, <code>F1</code> is <code>f1</code>, <code>Escape</code> is <code>esc</code> etc.</p>
 * <p>Keys Syntax Example:</p>
 * <p>Given the <code>keys</code> attribute value “ctrl+shift+f7 up pagedown esc space alt+m”, the <code>&lt;iron-a11y-keys&gt;</code> element will send<br>the <code>keys-pressed</code> event if any of the follow key combos are pressed: Control and Shift and F7 keys, Up Arrow key, Page<br>Down key, Escape key, Space key, Alt and M key.</p>
 * <p>Slider Example:</p>
 * <p>The following is an example of the set of keys that fulfil the WAI-ARIA “slider” role <a href="http://www.w3.org/TR/wai-aria-practices/#slider">best<br>practices</a>:</p>
 * <pre><code>&lt;iron-a11y-keys target=&quot;{{}}&quot; keys=&quot;left pagedown down&quot; on-keys-pressed=&quot;{{decrement}}&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;{{}}&quot; keys=&quot;right pageup up&quot; on-keys-pressed=&quot;{{increment}}&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;{{}}&quot; keys=&quot;home&quot; on-keys-pressed=&quot;{{setMin}}&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;{{}}&quot; keys=&quot;end&quot; on-keys-pressed=&quot;{{setMax}}&quot;&gt;&lt;/iron-a11y-keys&gt;
 * 
 * 
 * </code></pre><p>The <code>increment</code> function will move the slider a set amount toward the maximum value.<br>The <code>decrement</code> function will move the slider a set amount toward the minimum value.<br>The <code>setMin</code> function will move the slider to the minimum value.<br>The <code>setMax</code> function will move the slider to the maximum value.</p>
 * <p>Keys Syntax Grammar:</p>
 * <p><a href="http://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_Form">EBNF</a> Grammar of the <code>keys</code> attribute.</p>
 * <pre><code>modifier = &quot;shift&quot; | &quot;ctrl&quot; | &quot;alt&quot;;
 * ascii = ? /[a-z0-9]/ ? ;
 * fnkey = ? f1 through f12 ? ;
 * arrow = &quot;up&quot; | &quot;down&quot; | &quot;left&quot; | &quot;right&quot; ;
 * key = &quot;tab&quot; | &quot;esc&quot; | &quot;space&quot; | &quot;*&quot; | &quot;pageup&quot; | &quot;pagedown&quot; | &quot;home&quot; | &quot;end&quot; | arrow | ascii | fnkey ;
 * keycombo = { modifier, &quot;+&quot; }, key ;
 * keys = keycombo, { &quot; &quot;, keycombo } ;
 * 
 * 
 * </code></pre>
 */
@JsType
public interface IronA11yKeysElement extends HTMLElement {

    public static final String TAG = "iron-a11y-keys";
    public static final String SRC = "iron-a11y-keys/iron-a11y-keys.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property keys
     * @type String
     * 
     */
    @JsProperty String getKeys();
    /**
     * 
     *
     * JavaScript Info:
     * @property keys
     * @type String
     * 
     */
    @JsProperty void setKeys(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property target
     * @type ?Node
     * 
     */
    @JsProperty JavaScriptObject getTarget();
    /**
     * 
     *
     * JavaScript Info:
     * @property target
     * @type ?Node
     * 
     */
    @JsProperty void setTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

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
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);
  
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
     * @method detached
     * @behavior PaperTabs
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTabs
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTabs
     */
    void registered();

}
