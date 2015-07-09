/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.transform.widget;

import com.vaadin.polymer.transform.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;transform-animation&gt;</code> animates a custom transform on an element. Use this to animate multiple<br>transform properties, or to apply a custom transform value.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;transform-animation&#39;,
 *   node: &lt;node&gt;,
 *   transformOrigin: &lt;transform-origin&gt;,
 *   transformFrom: &lt;transform-from-string&gt;,
 *   transformTo: &lt;transform-to-string&gt;,
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
public class TransformAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public TransformAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public TransformAnimation(String html) {
        super(TransformAnimationElement.TAG, TransformAnimationElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public TransformAnimationElement getPolymerElement() {
        return (TransformAnimationElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {{node: !Element, transformOrigin: (string|undefined), transformFrom: (string|undefined), transformTo: (string|undefined), timing: (Object|undefined)}} config  
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
