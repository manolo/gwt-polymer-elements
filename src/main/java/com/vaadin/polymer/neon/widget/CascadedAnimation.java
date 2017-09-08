/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon.widget;

import com.vaadin.polymer.neon.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;cascaded-animation&gt;</code> applies an animation on an array of elements with a delay between each.<br>the delay defaults to 50ms.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;cascaded-animation&#39;,
 *   animation: &lt;animation-name&gt;,
 *   nodes: &lt;array-of-nodes&gt;,
 *   nodeDelay: &lt;node-delay-in-ms&gt;,
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
public class CascadedAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public CascadedAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public CascadedAnimation(String html) {
        super(CascadedAnimationElement.TAG, CascadedAnimationElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public CascadedAnimationElement getPolymerElement() {
        return (CascadedAnimationElement) getElement();
    }


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    public JavaScriptObject getAnimationTiming() {
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
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    public boolean getIsNeonAnimation() {
        return getPolymerElement().getIsNeonAnimation();
    }
    /**
     * <p>Can be used to determine that elements implement this behavior.</p>
     *
     * JavaScript Info:
     * @property isNeonAnimation
     * @type boolean
     * 
     */
    public void setIsNeonAnimation(boolean value) {
        getPolymerElement().setIsNeonAnimation(value);
    }


    // Needed in UIBinder
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @attribute animation-timing
     * 
     */
    public void setAnimationTiming(String value) {
        Polymer.property(this.getPolymerElement(), "animationTiming", value);
    }


    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     * 
     */
    public void timingFromConfig(Object config) {
        getPolymerElement().timingFromConfig(config);
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
     * 
     */
    public void setPrefixedProperty(Object node, Object property, Object value) {
        getPolymerElement().setPrefixedProperty(node, property, value);
    }

    /**
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior PaperMenuShrinkHeightAnimation
     * 
     */
    public void complete() {
        getPolymerElement().complete();
    }


}
