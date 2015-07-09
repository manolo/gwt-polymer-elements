/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>paper-ripple</code> provides a visual effect that other paper elements can<br>use to simulate a rippling effect emanating from the point of contact.  The<br>effect can be visualized as a concentric circle with motion.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-ripple&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p><code>paper-ripple</code> listens to “mousedown” and “mouseup” events so it would display ripple<br>effect when touches on it.  You can also defeat the default behavior and<br>manually route the down and up actions to the ripple element.  Note that it is<br>important if you call downAction() you will have to make sure to call<br>upAction() so that <code>paper-ripple</code> would end the animation loop.</p>
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
@JsType
public interface PaperRippleElement extends HTMLElement {

    public static final String TAG = "paper-ripple";
    public static final String SRC = "paper-ripple/paper-ripple.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method addRipple
     * 
     */
    void addRipple();

    /**
     * 
     *
     * JavaScript Info:
     * @method animate
     * 
     */
    void animate();

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
     * 
     *
     * JavaScript Info:
     * @method downAction
     * @param {Event=} event  
     * 
     */
    void downAction(JavaScriptObject event);

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
     * 
     *
     * JavaScript Info:
     * @method onAnimationComplete
     * 
     */
    void onAnimationComplete();

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
     * 
     *
     * JavaScript Info:
     * @method removeRipple
     * @param {} ripple  
     * 
     */
    void removeRipple(JavaScriptObject ripple);

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
     * 
     *
     * JavaScript Info:
     * @method shouldKeepAnimating
     * 
     */
    void shouldKeepAnimating();

    /**
     * 
     *
     * JavaScript Info:
     * @method simulatedRipple
     * 
     */
    void simulatedRipple();

    /**
     * 
     *
     * JavaScript Info:
     * @method target
     * 
     */
    void target();

    /**
     * 
     *
     * JavaScript Info:
     * @method upAction
     * @param {Event=} event  
     * 
     */
    void upAction(JavaScriptObject event);

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
