/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.fade.widget;

import com.vaadin.polymer.fade.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;fade-out-animation&gt;</code> animates the opacity of an element from 1 to 0.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;fade-out-animation&#39;,
 *   node: &lt;node&gt;
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
public class FadeOutAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public FadeOutAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public FadeOutAnimation(String html) {
        super(FadeOutAnimationElement.TAG, FadeOutAnimationElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public FadeOutAnimationElement getPolymerElement() {
        return (FadeOutAnimationElement) getElement();
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
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior TransformAnimation
     */
    public void complete() {
        getPolymerElement().complete();
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
