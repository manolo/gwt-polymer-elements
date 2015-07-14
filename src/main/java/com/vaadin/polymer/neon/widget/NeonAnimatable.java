/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon.widget;

import com.vaadin.polymer.neon.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class NeonAnimatable extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public NeonAnimatable() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public NeonAnimatable(String html) {
        super(NeonAnimatableElement.TAG, NeonAnimatableElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public NeonAnimatableElement getPolymerElement() {
        return (NeonAnimatableElement) getElement();
    }


  
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    public JavaScriptObject getAnimationConfig(){
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }
   
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @attribute animation-config
     * @behavior NeonAnimatable
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
    }
   
  

  
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatable
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
     * @behavior NeonAnimatable
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
     * @behavior NeonAnimatable
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
     * @behavior NeonAnimatable
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
     * @behavior NeonAnimatable
     */
    public void getAnimationConfig(JavaScriptObject type) {
        getPolymerElement().getAnimationConfig(type);
    }
  


}
