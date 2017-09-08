/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>&lt;slide-left-animation&gt;</code> animates the transform of an element from <code>none</code> to <code>translateX(-100%)</code>.<br>The <code>transformOrigin</code> defaults to <code>0 50%</code>.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;slide-left-animation&#39;,
 *   node: &lt;node&gt;,
 *   transformOrigin: &lt;transform-origin&gt;,
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
@JsType(isNative=true)
public interface SlideLeftAnimationElement extends HTMLElement {

    @JsOverlay public static final String TAG = "slide-left-animation";
    @JsOverlay public static final String SRC = "neon-animation/neon-animations.html";


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnimationTiming();
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty void setAnimationTiming(JavaScriptObject value);

    /**
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    @JsProperty boolean getIsNeonAnimation();
    /**
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    @JsProperty void setIsNeonAnimation(boolean value);


    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     * 
     */
    void timingFromConfig(Object config);

    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * 
     * 
     */
    void setPrefixedProperty(Object node, Object property, Object value);

    /**
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior PaperMenuShrinkHeightAnimation
     * 
     */
    void complete();

}
