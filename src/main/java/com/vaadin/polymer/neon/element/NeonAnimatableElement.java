/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;neon-animatable&gt;</code> is a simple container element implementing <code>Polymer.NeonAnimatableBehavior</code>. This is a convenience element for use with <code>&lt;neon-animated-pages&gt;</code>.</p>
 * <pre><code>&lt;neon-animated-pages selected=&quot;0&quot;
 *                      entry-animation=&quot;slide-from-right-animation&quot;
 *                      exit-animation=&quot;slide-left-animation&quot;&gt;
 *   &lt;neon-animatable&gt;1&lt;/neon-animatable&gt;
 *   &lt;neon-animatable&gt;2&lt;/neon-animatable&gt;
 * &lt;/neon-animated-pages&gt;
 * </code></pre>
 */
@JsType
public interface NeonAnimatableElement extends HTMLElement {

    public static final String TAG = "neon-animatable";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    @JsProperty JavaScriptObject getAnimationConfig();
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    @JsProperty void setAnimationConfig(JavaScriptObject value);
  
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    @JsProperty String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    @JsProperty void setEntryAnimation(String value);
  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    @JsProperty String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    @JsProperty void setExitAnimation(String value);
  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatable
     */
    void getAnimationConfig(JavaScriptObject type);

}
