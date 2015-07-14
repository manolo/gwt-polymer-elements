/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.reverse.widget;

import com.vaadin.polymer.reverse.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;reverse-ripple-animation&gt;</code> scales and transform an element such that it appears to ripple down from this element, to either<br>a shared element, or a screen position.</p>
 * <p>If using as a shared element animation in <code>&lt;neon-animated-pages&gt;</code>, use this animation in an <code>exit</code><br>animation in the source page and in an <code>entry</code> animation in the destination page. Also, define the<br>reverse-ripple elements in the <code>sharedElements</code> property (not a configuration property, see<br><code>Polymer.NeonSharedElementAnimatableBehavior</code>).<br>If using a screen position, define the <code>gesture</code> property.<br>Configuration:</p>
 * <pre><code>{
 *   name: &#39;reverse-ripple-animation`.
 *   id: &lt;shared-element-id&gt;, /* set this or gesture * /
 *   gesture: {x: &lt;page-x&gt;, y: &lt;page-y&gt;}, /* set this or id * /
 *   timing: &lt;animation-timing&gt;,
 *   toPage: &lt;node&gt;, /* define for the destination page * /
 *   fromPage: &lt;node&gt;, /* define for the source page * /
 * }
 * </code></pre>
 */
public class ReverseRippleAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public ReverseRippleAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public ReverseRippleAnimation(String html) {
        super(ReverseRippleAnimationElement.TAG, ReverseRippleAnimationElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public ReverseRippleAnimationElement getPolymerElement() {
        return (ReverseRippleAnimationElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @method complete
     * 
     */
    public void complete() {
        getPolymerElement().complete();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {} config  
     * 
     */
    public void configure(JavaScriptObject config) {
        getPolymerElement().configure(config);
    }
  

  
    /**
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * @behavior ReverseRippleAnimation
     */
    public void findSharedElements(JavaScriptObject config) {
        getPolymerElement().findSharedElements(config);
    }
  

  
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * @behavior ReverseRippleAnimation
     */
    public JavaScriptObject getSharedElements(){
        return getPolymerElement().getSharedElements();
    }
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * @behavior ReverseRippleAnimation
     */
    public void setSharedElements(JavaScriptObject value) {
        getPolymerElement().setSharedElements(value);
    }
   
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @attribute shared-elements
     * @behavior ReverseRippleAnimation
     */
    public void setSharedElements(String value) {
        getPolymerElement().setAttribute("shared-elements", value);
    }
   
  

  
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * @behavior TransformAnimation
     */
    public JavaScriptObject getAnimationTiming(){
        return getPolymerElement().getAnimationTiming();
    }
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * @behavior TransformAnimation
     */
    public void setAnimationTiming(JavaScriptObject value) {
        getPolymerElement().setAnimationTiming(value);
    }
   
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @attribute animation-timing
     * @behavior TransformAnimation
     */
    public void setAnimationTiming(String value) {
        getPolymerElement().setAttribute("animation-timing", value);
    }
   
  

  
    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * @behavior TransformAnimation
     */
    public void setPrefixedProperty(JavaScriptObject node, JavaScriptObject property, JavaScriptObject value) {
        getPolymerElement().setPrefixedProperty(node, property, value);
    }
  

  
    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * @behavior TransformAnimation
     */
    public void timingFromConfig(JavaScriptObject config) {
        getPolymerElement().timingFromConfig(config);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior TransformAnimation
     */
    public void registered() {
        getPolymerElement().registered();
    }
  


}
