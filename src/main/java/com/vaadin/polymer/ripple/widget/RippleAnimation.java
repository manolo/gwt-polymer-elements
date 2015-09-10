/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.ripple.widget;

import com.vaadin.polymer.ripple.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;ripple-animation&gt;</code> scales and transform an element such that it appears to ripple from either<br>a shared element, or from a screen position, to full screen.</p>
 * <p>If using as a shared element animation in <code>&lt;neon-animated-pages&gt;</code>, use this animation in an <code>exit</code><br>animation in the source page and in an <code>entry</code> animation in the destination page. Also, define the<br>hero elements in the <code>sharedElements</code> property (not a configuration property, see<br><code>Polymer.NeonSharedElementAnimatableBehavior</code>).</p>
 * <p>If using a screen position, define the <code>gesture</code> property.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;ripple-animation`.
 *   id: &lt;shared-element-id&gt;, /* set this or gesture * /
 *   gesture: {x: &lt;page-x&gt;, y: &lt;page-y&gt;}, /* set this or id * /
 *   timing: &lt;animation-timing&gt;,
 *   toPage: &lt;node&gt;, /* define for the destination page * /
 *   fromPage: &lt;node&gt;, /* define for the source page * /
 * }
 * </code></pre>
 */
public class RippleAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public RippleAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public RippleAnimation(String html) {
        super(RippleAnimationElement.TAG, RippleAnimationElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public RippleAnimationElement getPolymerElement() {
        try {
            return (RippleAnimationElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


  
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
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
     * 
     */
    public void setAnimationTiming(JavaScriptObject value) {
        getPolymerElement().setAnimationTiming(value);
    }
   
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @attribute animation-timing
     * 
     */
    public void setAnimationTiming(String value) {
        getPolymerElement().setAttribute("animation-timing", value);
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
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * 
     */
    public void findSharedElements(JavaScriptObject config) {
        getPolymerElement().findSharedElements(config);
    }
  

  
    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * 
     */
    public void setPrefixedProperty(JavaScriptObject node, JavaScriptObject property, JavaScriptObject value) {
        getPolymerElement().setPrefixedProperty(node, property, value);
    }
  

  
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
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
     * 
     */
    public void setSharedElements(JavaScriptObject value) {
        getPolymerElement().setSharedElements(value);
    }
   
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @attribute shared-elements
     * 
     */
    public void setSharedElements(String value) {
        getPolymerElement().setAttribute("shared-elements", value);
    }
   
  

  
    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     */
    public void timingFromConfig(JavaScriptObject config) {
        getPolymerElement().timingFromConfig(config);
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
     * 
     *
     * JavaScript Info:
     * @method registered
     * 
     */
    public void registered() {
        getPolymerElement().registered();
    }
  


}
