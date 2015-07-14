/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.cascaded.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;cascaded-animation&gt;</code> applies an animation on an array of elements with a delay between each.<br>the delay defaults to 50ms.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;cascaded-animation&#39;,
 *   animation: &lt;animation-name&gt;,
 *   nodes: &lt;array-of-nodes&gt;,
 *   nodedelay: &lt;node-delay-in-ms&gt;,
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
@JsType
public interface CascadedAnimationElement extends HTMLElement {

    public static final String TAG = "cascaded-animation";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method complete
     * 
     */
    void complete();

    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {{animation: string, nodes: !Array.<!Element>, nodeDelay: (number|undefined), timing: (Object|undefined)}} config  
     * 
     */
    void configure(JavaScriptObject config);

    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * @behavior TransformAnimation
     */
    @JsProperty JavaScriptObject getAnimationTiming();
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * @behavior TransformAnimation
     */
    @JsProperty void setAnimationTiming(JavaScriptObject value);
  
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
    void setPrefixedProperty(JavaScriptObject node, JavaScriptObject property, JavaScriptObject value);

    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * @behavior TransformAnimation
     */
    void timingFromConfig(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior TransformAnimation
     */
    void registered();

}
