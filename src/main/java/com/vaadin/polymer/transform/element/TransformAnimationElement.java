/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.transform.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
@JsType
public interface TransformAnimationElement extends HTMLElement {

    public static final String TAG = "transform-animation";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {{node: !Element, transformOrigin: (string|undefined), transformFrom: (string|undefined), transformTo: (string|undefined), timing: (Object|undefined)}} config  
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
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior TransformAnimation
     */
    void complete();

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
