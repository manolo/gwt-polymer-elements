/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/animation/responsive-interaction.html#responsive-interaction-surface-reaction">Surface reaction</a></p>
 * <p><code>paper-ripple</code> provides a visual effect that other paper elements can<br>use to simulate a rippling effect emanating from the point of contact.  The<br>effect can be visualized as a concentric circle with motion.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;position:relative&quot;&gt;
 *   &lt;paper-ripple&gt;&lt;/paper-ripple&gt;
 * &lt;/div&gt;
 * 
 * 
 * </code></pre><p>Note, it’s important that the parent container of the ripple be relative position, otherwise<br>the ripple will emanate outside of the desired container.</p>
 * <p><code>paper-ripple</code> listens to “mousedown” and “mouseup” events so it would display ripple<br>effect when touches on it.  You can also defeat the default behavior and<br>manually route the down and up actions to the ripple element.  Note that it is<br>important if you call <code>downAction()</code> you will have to make sure to call<br><code>upAction()</code> so that <code>paper-ripple</code> would end the animation loop.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-ripple id=&quot;ripple&quot; style=&quot;pointer-events: none;&quot;&gt;&lt;/paper-ripple&gt;
 * ...
 * downAction: function(e) {
 *   this.$.ripple.downAction({x: e.x, y: e.y});
 * },
 * upAction: function(e) {
 *   this.$.ripple.upAction();
 * }
 * 
 * 
 * </code></pre><p>Styling ripple effect:</p>
 * <p>  Use CSS color property to style the ripple:</p>
 * <pre><code>paper-ripple {
 *   color: #4285f4;
 * }
 * 
 * 
 * </code></pre><p>  Note that CSS color property is inherited so it is not required to set it on<br>  the <code>paper-ripple</code> element directly.</p>
 * <p>By default, the ripple is centered on the point of contact.  Apply the <code>recenters</code><br>attribute to have the ripple grow toward the center of its container.</p>
 * <pre><code>&lt;paper-ripple recenters&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>You can also  center the ripple inside its container from the start.</p>
 * <pre><code>&lt;paper-ripple center&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>Apply <code>circle</code> class to make the rippling effect within a circle.</p>
 * <pre><code>&lt;paper-ripple class=&quot;circle&quot;&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface PaperRippleElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-ripple";
    @JsOverlay public static final String SRC = "paper-ripple/paper-ripple.html";


    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    @JsProperty double getInitialOpacity();
    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    @JsProperty void setInitialOpacity(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    @JsProperty double getOpacityDecayVelocity();
    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    @JsProperty void setOpacityDecayVelocity(double value);

    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    @JsProperty JsArray getRipples();
    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    @JsProperty void setRipples(JsArray value);

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
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    @JsProperty boolean getHoldDown();
    /**
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    @JsProperty void setHoldDown(boolean value);

    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    @JsProperty boolean getRecenters();
    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    @JsProperty void setRecenters(boolean value);

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
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    @JsProperty boolean getCenter();
    /**
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    @JsProperty void setCenter(boolean value);

    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimating();
    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    @JsProperty void setAnimating(boolean value);

    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty void setNoink(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method removeRipple
     * @param {} ripple  
     * 
     * 
     */
    void removeRipple(Object ripple);

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
     * 
     *
     * JavaScript Info:
     * @method animate
     * 
     * 
     */
    void animate();

    /**
     * 
     *
     * JavaScript Info:
     * @method onAnimationComplete
     * 
     * 
     */
    void onAnimationComplete();

    /**
     * 
     *
     * JavaScript Info:
     * @method simulatedRipple
     * 
     * 
     */
    void simulatedRipple();

    /**
     * 
     *
     * JavaScript Info:
     * @method addRipple
     * 
     * 
     */
    void addRipple();

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    void removeOwnKeyBindings();

    /**
     * <p>Provokes a ripple down effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method downAction
     * @param {Event=} event  
     * 
     * 
     */
    void downAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple up effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method upAction
     * @param {Event=} event  
     * 
     * 
     */
    void upAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple up effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiUpAction
     * @param {Event=} event  
     * 
     * 
     */
    void uiUpAction(JavaScriptObject event);

    /**
     * <p>Provokes a ripple down effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiDownAction
     * @param {Event=} event  
     * 
     * 
     */
    void uiDownAction(JavaScriptObject event);

}
