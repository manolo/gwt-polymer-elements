/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class PaperMenuShrinkWidthAnimation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperMenuShrinkWidthAnimation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperMenuShrinkWidthAnimation(String html) {
        super(PaperMenuShrinkWidthAnimationElement.TAG, PaperMenuShrinkWidthAnimationElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperMenuShrinkWidthAnimationElement getPolymerElement() {
        return (PaperMenuShrinkWidthAnimationElement) getElement();
    }


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * @behavior PaperMenuShrinkHeightAnimation
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
     * @behavior PaperMenuShrinkHeightAnimation
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
     * @behavior PaperMenuShrinkHeightAnimation
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
     * @behavior PaperMenuShrinkHeightAnimation
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
     * @behavior PaperMenuShrinkHeightAnimation
     */
    public void setAnimationTiming(String value) {
        Polymer.property(this.getPolymerElement(), "animationTiming", value);
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
     * @behavior PaperMenuShrinkHeightAnimation
     * 
     */
    public void timingFromConfig(Object config) {
        getPolymerElement().timingFromConfig(config);
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
