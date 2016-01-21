/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-fab project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/buttons-floating-action-button.html">Floating Action Button</a></p>
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
 * <tr>
 * <td><code>--paper-fab-iron-icon</code></td>
 * <td>Mixin applied to the iron-icon within the button</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperFab extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperFab() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperFab(String html) {
        super(PaperFabElement.TAG, PaperFabElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperFabElement getPolymerElement() {
        try {
            return (PaperFabElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getToggles() {
        return getPolymerElement().getToggles();
    }
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperTab
     */
    public void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }

    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * @behavior PaperFab
     */
    public double getElevation() {
        return getPolymerElement().getElevation();
    }
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * @behavior PaperFab
     */
    public void setElevation(double value) {
        getPolymerElement().setElevation(value);
    }

    /**
     * <p>Set this to true to style this is a “mini” FAB.</p>
     *
     * JavaScript Info:
     * @property mini
     * @type Boolean
     * 
     */
    public boolean getMini() {
        return getPolymerElement().getMini();
    }
    /**
     * <p>Set this to true to style this is a “mini” FAB.</p>
     *
     * JavaScript Info:
     * @property mini
     * @type Boolean
     * 
     */
    public void setMini(boolean value) {
        getPolymerElement().setMini(value);
    }

    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }

    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getNoink() {
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperTab
     */
    public void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPointerDown() {
        return getPolymerElement().getPointerDown();
    }
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPointerDown(boolean value) {
        getPolymerElement().setPointerDown(value);
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
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getPressed() {
        return getPolymerElement().getPressed();
    }
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    public void setPressed(boolean value) {
        getPolymerElement().setPressed(value);
    }

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getReceivedFocusFromKeyboard() {
        return getPolymerElement().getReceivedFocusFromKeyboard();
    }
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    public void setReceivedFocusFromKeyboard(boolean value) {
        getPolymerElement().setReceivedFocusFromKeyboard(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
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
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
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
     * @behavior PaperTab
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public String getAriaActiveAttribute() {
        return getPolymerElement().getAriaActiveAttribute();
    }
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    public void setAriaActiveAttribute(String value) {
        getPolymerElement().setAriaActiveAttribute(value);
    }

    /**
     * <p>The URL of an image for the icon. If the src property is specified,<br>the icon property should not be.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The URL of an image for the icon. If the src property is specified,<br>the icon property should not be.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }

    /**
     * <p>Specifies the icon name or index in the set of icons available in<br>the icon’s icon set. If the icon property is specified,<br>the src property should not be.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public String getIcon() {
        return getPolymerElement().getIcon();
    }
    /**
     * <p>Specifies the icon name or index in the set of icons available in<br>the icon’s icon set. If the icon property is specified,<br>the src property should not be.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public void setIcon(String value) {
        getPolymerElement().setIcon(value);
    }


    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @attribute elevation
     * @behavior PaperFab
     */
    public void setElevation(String value) {
        getPolymerElement().setAttribute("elevation", value);
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
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperTab
     * 
     */
    public void getRipple() {
        getPolymerElement().getRipple();
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
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperTab
     * @return {boolean}
     */
    public boolean hasRipple() {
        return getPolymerElement().hasRipple();
    }

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperTab
     * 
     */
    public void ensureRipple(JavaScriptObject optTriggeringEvent) {
        getPolymerElement().ensureRipple(optTriggeringEvent);
    }


}
