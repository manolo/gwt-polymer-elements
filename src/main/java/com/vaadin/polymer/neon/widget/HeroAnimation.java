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
public class HeroAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public HeroAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public HeroAnimation(String html) {
        super(HeroAnimationElement.TAG, HeroAnimationElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public HeroAnimationElement getPolymerElement() {
        return (HeroAnimationElement) getElement();
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

    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    public JavaScriptObject getSharedElements() {
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

    // Needed in UIBinder
    /**
     * <p>Cached copy of shared elements.</p>
     *
     * JavaScript Info:
     * @attribute shared-elements
     * 
     */
    public void setSharedElements(String value) {
        Polymer.property(this.getPolymerElement(), "sharedElements", value);
    }


    /**
     * <p>Finds shared elements based on <code>config</code>.</p>
     *
     * JavaScript Info:
     * @method findSharedElements
     * @param {} config  
     * @behavior ReverseRippleAnimation
     * 
     */
    public void findSharedElements(Object config) {
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
     * @behavior PaperMenuShrinkHeightAnimation
     * 
     */
    public void setPrefixedProperty(Object node, Object property, Object value) {
        getPolymerElement().setPrefixedProperty(node, property, value);
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
     * 
     *
     * JavaScript Info:
     * @method complete
     * @param {} config  
     * 
     * 
     */
    public void complete(Object config) {
        getPolymerElement().complete(config);
    }

    /**
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * @behavior ReverseRippleAnimation
     * 
     */
    public void complete() {
        getPolymerElement().complete();
    }


}
