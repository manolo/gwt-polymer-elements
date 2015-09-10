/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tooltip project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PaperTooltip extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperTooltip() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperTooltip(String html) {
        super(PaperTooltipElement.TAG, PaperTooltipElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperTooltipElement getPolymerElement() {
        try {
            return (PaperTooltipElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getAnimationConfig(){
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }
   
    /**
     * 
     *
     * JavaScript Info:
     * @attribute animation-config
     * 
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
    }
   
  

  
    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    public boolean getFitToVisibleBounds(){
        return getPolymerElement().getFitToVisibleBounds();
    }
    /**
     * <p>If true, no parts of the tooltip will ever be shown offscreen.</p>
     *
     * JavaScript Info:
     * @property fitToVisibleBounds
     * @type Boolean
     * 
     */
    public void setFitToVisibleBounds(boolean value) {
        getPolymerElement().setFitToVisibleBounds(value);
    }
   
  

  
    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    public String getFor(){
        return getPolymerElement().getFor();
    }
    /**
     * <p>The id of the element that the tooltip is anchored to. This element<br>must be a sibling of the tooltip.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    public void setFor(String value) {
        getPolymerElement().setFor(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     */
    public void hide() {
        getPolymerElement().hide();
    }
  

  
    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    public double getMarginTop(){
        return getPolymerElement().getMarginTop();
    }
    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @property marginTop
     * @type Number
     * 
     */
    public void setMarginTop(double value) {
        getPolymerElement().setMarginTop(value);
    }
   
    /**
     * <p>This property is deprecated, but left over so that it doesn’t<br>break exiting code. Please use <code>offset</code> instead. If both <code>offset</code> and<br><code>marginTop</code> are provided, <code>marginTop</code> will be ignored.</p>
     *
     * JavaScript Info:
     * @attribute margin-top
     * 
     */
    public void setMarginTop(String value) {
        getPolymerElement().setAttribute("margin-top", value);
    }
   
  

  
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    public double getOffset(){
        return getPolymerElement().getOffset();
    }
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @property offset
     * @type Number
     * 
     */
    public void setOffset(double value) {
        getPolymerElement().setOffset(value);
    }
   
    /**
     * <p>The spacing between the top of the tooltip and the element it is<br>anchored to.</p>
     *
     * JavaScript Info:
     * @attribute offset
     * 
     */
    public void setOffset(String value) {
        getPolymerElement().setAttribute("offset", value);
    }
   
  

  
    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public String getPosition(){
        return getPolymerElement().getPosition();
    }
    /**
     * <p>Positions the tooltip to the top, right, bottom, left of its content.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public void setPosition(String value) {
        getPolymerElement().setPosition(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     */
    public void show() {
        getPolymerElement().show();
    }
  

  
    /**
     * <p>Returns the target element that this tooltip is anchored to. It is<br>either the element given by the <code>for</code> attribute, or the immediate parent<br>of the tooltip.</p>
     *
     * JavaScript Info:
     * @method target
     * 
     */
    public void target() {
        getPolymerElement().target();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method updatePosition
     * 
     */
    public void updatePosition() {
        getPolymerElement().updatePosition();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    public void cancelAnimation() {
        getPolymerElement().cancelAnimation();
    }
  

  
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public String getEntryAnimation(){
        return getPolymerElement().getEntryAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public void setEntryAnimation(String value) {
        getPolymerElement().setEntryAnimation(value);
    }
   
  

  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public String getExitAnimation(){
        return getPolymerElement().getExitAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatedPages
     */
    public void setExitAnimation(String value) {
        getPolymerElement().setExitAnimation(value);
    }
   
  

  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatedPages
     */
    public void getAnimationConfig(JavaScriptObject type) {
        getPolymerElement().getAnimationConfig(type);
    }
  

  
    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    public void playAnimation(JavaScriptObject type, JavaScriptObject cookie) {
        getPolymerElement().playAnimation(type, cookie);
    }
  


}
