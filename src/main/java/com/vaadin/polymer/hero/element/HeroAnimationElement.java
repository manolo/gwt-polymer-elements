/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.hero.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;hero-animation&gt;</code> is a shared element animation that scales and transform an element such that it<br>appears to be shared between two pages. Use this in <code>&lt;neon-animated-pages&gt;</code>. The source page<br>should use this animation in an ‘exit’ animation and set the <code>fromPage</code> configuration property to<br>itself, and the destination page should use this animation in an <code>entry</code> animation and set the<br><code>toPage</code> configuration property to itself. They should also define the hero elements in the<br><code>sharedElements</code> property (not a configuration property, see<br><code>Polymer.NeonSharedElementAnimatableBehavior</code>).</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;hero-animation&#39;,
 *   id: &lt;shared-element-id&gt;,
 *   timing: &lt;animation-timing&gt;,
 *   toPage: &lt;node&gt;, /* define for the destination page * /
 *   fromPage: &lt;node&gt;, /* define for the source page * /
 * }
 * </code></pre>
 */
@JsType
public interface HeroAnimationElement extends HTMLElement {

    public static final String TAG = "hero-animation";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method complete
     * @param {} config  
     * 
     */
    void complete(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {} config  
     * 
     */
    void configure(JavaScriptObject config);

    /**
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * @behavior ReverseRippleAnimation
     */
    void findSharedElements(JavaScriptObject config);

    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * @behavior ReverseRippleAnimation
     */
    @JsProperty JavaScriptObject getSharedElements();
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * @behavior ReverseRippleAnimation
     */
    @JsProperty void setSharedElements(JavaScriptObject value);
  
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
