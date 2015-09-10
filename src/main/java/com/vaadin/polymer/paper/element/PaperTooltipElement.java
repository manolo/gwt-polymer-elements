/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tooltip project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;paper-tooltip&gt;</code> is a label that appears on hover and focus when the user<br>hovers over an element with the cursor or with the keyboard. It will be centered<br>to an anchor element specified in the <code>for</code> attribute, or, if that doesn’t exist,<br>centered to the parent node containing it.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;display:inline-block&quot;&gt;
 *   &lt;button&gt;Click me!&lt;/button&gt;
 *   &lt;paper-tooltip&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;button id=&quot;btn&quot;&gt;Click me!&lt;/button&gt;
 *   &lt;paper-tooltip for=&quot;btn&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;/div&gt;
 * 
 * 
 * </code></pre><p>The tooltip can be positioned on the top|bottom|left|right of the anchor using<br>the <code>position</code> attribute. The default position is bottom.</p>
 * <pre><code>&lt;paper-tooltip for=&quot;btn&quot; position=&quot;left&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
 * &lt;paper-tooltip for=&quot;btn&quot; position=&quot;top&quot;&gt;Tooltip text&lt;/paper-tooltip&gt;
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
 * <td><code>--paper-tooltip-background</code></td>
 * <td>The background color of the tooltip</td>
 * <td><code>#616161</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip-opacity</code></td>
 * <td>The opacity of the tooltip</td>
 * <td><code>0.9</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip-text-color</code></td>
 * <td>The text color of the tooltip</td>
 * <td><code>white</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-tooltip</code></td>
 * <td>Mixin applied to the tooltip</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperTooltipElement extends HTMLElement {

    public static final String TAG = "paper-tooltip";
    public static final String SRC = "paper-tooltip/paper-tooltip.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnimationConfig();
    /**
     * 
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty void setAnimationConfig(JavaScriptObject value);
  
    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    @JsProperty boolean getFitToVisibleBounds();
    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    @JsProperty void setFitToVisibleBounds(boolean value);
  
    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty String getFor();
    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty void setFor(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     */
    void hide();

    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    @JsProperty double getMarginTop();
    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    @JsProperty void setMarginTop(double value);
  
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty double getOffset();
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    @JsProperty void setOffset(double value);
  
    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty String getPosition();
    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty void setPosition(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     */
    void show();

    /**
     * <p>Returns the target element that this tooltip is anchored to. It is<br>either the element given by the <code>for</code> attribute, or the immediate parent<br>of the tooltip.</p>
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
     * @method updatePosition
     * 
     */
    void updatePosition();

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    void cancelAnimation();

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty void setEntryAnimation(String value);
  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    @JsProperty void setExitAnimation(String value);
  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatedPages
     */
    void getAnimationConfig(JavaScriptObject type);

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    void playAnimation(JavaScriptObject type, JavaScriptObject cookie);

}
