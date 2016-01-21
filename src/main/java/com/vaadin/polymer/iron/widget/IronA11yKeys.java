/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.KeysPressedEvent;
import com.vaadin.polymer.iron.widget.event.KeysPressedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>iron-a11y-keys</code> provides a cross-browser interface for processing<br>keyboard commands. The interface adheres to <a href="http://www.w3.org/TR/wai-aria-practices/#kbd_general_binding">WAI-ARIA best<br>practices</a>.<br>It uses an expressive syntax to filter key presses.</p>
 * <h2 id="basic-usage">Basic usage</h2>
 * <p>The sample code below is a portion of a custom element. The goal is to call<br>the <code>onEnter</code> method whenever the <code>paper-input</code> element is in focus and<br>the <code>Enter</code> key is pressed.</p>
 * <pre><code>&lt;iron-a11y-keys id=&quot;a11y&quot; target=&quot;[[target]]&quot; keys=&quot;enter&quot;
 *                     on-keys-pressed=&quot;onEnter&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;paper-input id=&quot;input&quot;
 *              placeholder=&quot;Type something. Press enter. Check console.&quot;
 *              value=&quot;{{userInput::input}}&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>The custom element declares an <code>iron-a11y-keys</code> element that is bound to a<br>property called <code>target</code>. The <code>target</code> property<br>needs to evaluate to the <code>paper-input</code> node. <code>iron-a11y-keys</code> registers<br>an event handler for the target node using Polymer’s <a href="https://www.polymer-project.org/1.0/docs/devguide/events.html#annotated-listeners">annotated event handler<br>syntax</a>. <code>{{userInput::input}}</code> sets the <code>userInput</code> property to the<br>user’s input on each keystroke. </p>
 * <p>The last step is to link the two elements within the custom element’s<br>registration.</p>
 * <pre><code>...
 * properties: {
 *   userInput: {
 *     type: String,
 *     notify: true,
 *   },
 *   target: {
 *     type: Object,
 *     value: function() {
 *       return this.$.input;
 *     }
 *   },
 * },
 * onEnter: function() {
 *   console.log(this.userInput);
 * }
 * ...
 * 
 * 
 * </code></pre><h2 id="the-keys-attribute">The <code>keys</code> attribute</h2>
 * <p>The <code>keys</code> attribute expresses what combination of keys triggers the event.</p>
 * <p>The attribute accepts a space-separated, plus-sign-concatenated<br>set of modifier keys and some common keyboard keys.</p>
 * <p>The common keys are: <code>a-z</code>, <code>0-9</code> (top row and number pad), <code>*</code> (shift 8 and<br>number pad), <code>F1-F12</code>, <code>Page Up</code>, <code>Page Down</code>, <code>Left Arrow</code>, <code>Right Arrow</code>,<br><code>Down Arrow</code>, <code>Up Arrow</code>, <code>Home</code>, <code>End</code>, <code>Escape</code>, <code>Space</code>, <code>Tab</code>, <code>Enter</code>.</p>
 * <p>The modifier keys are: <code>Shift</code>, <code>Control</code>, <code>Alt</code>.</p>
 * <p>All keys are expected to be lowercase and shortened. E.g.<br><code>Left Arrow</code> is <code>left</code>, <code>Page Down</code> is <code>pagedown</code>, <code>Control</code> is <code>ctrl</code>,<br><code>F1</code> is <code>f1</code>, <code>Escape</code> is <code>esc</code>, etc.</p>
 * <h3 id="grammar">Grammar</h3>
 * <p>Below is the <a href="http://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_Form">EBNF</a><br>Grammar of the <code>keys</code> attribute.</p>
 * <pre><code>modifier = &quot;shift&quot; | &quot;ctrl&quot; | &quot;alt&quot;;
 * ascii = ? /[a-z0-9]/ ? ;
 * fnkey = ? f1 through f12 ? ;
 * arrow = &quot;up&quot; | &quot;down&quot; | &quot;left&quot; | &quot;right&quot; ;
 * key = &quot;tab&quot; | &quot;esc&quot; | &quot;space&quot; | &quot;*&quot; | &quot;pageup&quot; | &quot;pagedown&quot; | 
 *       &quot;home&quot; | &quot;end&quot; | arrow | ascii | fnkey;
 * keycombo = { modifier, &quot;+&quot; }, key ;
 * keys = keycombo, { &quot; &quot;, keycombo } ;
 * 
 * 
 * </code></pre><h3 id="example">Example</h3>
 * <p>Given the following value for <code>keys</code>: </p>
 * <p><code>ctrl+shift+f7 up pagedown esc space alt+m</code></p>
 * <p>The event is fired if any of the following key combinations are fired:<br><code>Control</code> and <code>Shift</code> and <code>F7</code> keys, <code>Up Arrow</code> key, <code>Page Down</code> key,<br><code>Escape</code> key, <code>Space</code> key, <code>Alt</code> and <code>M</code> keys.</p>
 * <h3 id="wai-aria-slider-example">WAI-ARIA Slider Example</h3>
 * <p>The following is an example of the set of keys that fulfills WAI-ARIA’s<br>“slider” role <a href="http://www.w3.org/TR/wai-aria-practices/#slider">best<br>practices</a>:</p>
 * <pre><code>&lt;iron-a11y-keys target=&quot;[[target]]&quot; keys=&quot;left pagedown down&quot; 
 *                 on-keys-pressed=&quot;decrement&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;&quot;[[target]] keys=&quot;right pageup up&quot; 
 *                 on-keys-pressed=&quot;increment&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;[[target]]&quot; keys=&quot;home&quot; 
 *                 on-keys-pressed=&quot;setMin&quot;&gt;&lt;/iron-a11y-keys&gt;
 * &lt;iron-a11y-keys target=&quot;&quot;[[target]] keys=&quot;end&quot; 
 *                 on-keys-pressed=&quot;setMax&quot;&gt;&lt;/iron-a11y-keys&gt;
 * 
 * 
 * </code></pre><p>The <code>target</code> properties must evaluate to a node. See the basic usage<br>example above.</p>
 * <p>Each of the values for the <code>on-keys-pressed</code> attributes must evalute<br>to methods. The <code>increment</code> method should move the slider a set amount<br>toward the maximum value. <code>decrement</code> should move the slider a set amount<br>toward the minimum value. <code>setMin</code> should move the slider to the minimum<br>value. <code>setMax</code> should move the slider to the maximum value.</p>
 */
public class IronA11yKeys extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronA11yKeys() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronA11yKeys(String html) {
        super(IronA11yKeysElement.TAG, IronA11yKeysElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronA11yKeysElement getPolymerElement() {
        try {
            return (IronA11yKeysElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property target
     * @type ?Node
     * 
     */
    public JavaScriptObject getTarget() {
        return getPolymerElement().getTarget();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property target
     * @type ?Node
     * 
     */
    public void setTarget(JavaScriptObject value) {
        getPolymerElement().setTarget(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property keys
     * @type String
     * 
     */
    public String getKeys() {
        return getPolymerElement().getKeys();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keys
     * @type String
     * 
     */
    public void setKeys(String value) {
        getPolymerElement().setKeys(value);
    }


    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinComboBox
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute target
     * 
     */
    public void setTarget(String value) {
        getPolymerElement().setAttribute("target", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinComboBox
     */
    public void setKeyBindings(String value) {
        getPolymerElement().setAttribute("key-bindings", value);
    }


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
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

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
    public void keyboardEventMatchesKeys(Object event, Object eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @event keys-pressed
     */
    public HandlerRegistration addKeysPressedHandler(KeysPressedEventHandler handler) {
        return addDomHandler(handler, KeysPressedEvent.TYPE);
    }

}
