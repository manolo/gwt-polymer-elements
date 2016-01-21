/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-container project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronSwipeEvent;
import com.vaadin.polymer.iron.widget.event.IronSwipeEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;iron-swipeable-container&gt;</code> is a container that allows any of its nested<br>children (native or custom elements) to be swiped away. By default it supports<br>a curved or horizontal transition, but the transition duration and properties<br>can be customized.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-swipeable-container&gt;
 *   &lt;div&gt;I can be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;Me too!&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * 
 * </code></pre><p>To disable swiping on individual children, you must give them the <code>.disable-swipe</code><br>class. Alternatively, to disable swiping on the whole container, you can use its<br><code>disable-swipe</code> attribute:</p>
 * <pre><code>&lt;iron-swipeable-container&gt;
 *   &lt;div class=&quot;disable-swipe&quot;&gt;I cannot be swiped be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;But I can!&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * &lt;iron-swipeable-container disable-swipe&gt;
 *   &lt;div&gt;I cannot be swiped&lt;/div&gt;
 *   &lt;paper-card heading=&quot;Me neither :(&quot;&gt;&lt;/paper-card&gt;
 * &lt;/iron-swipeable-container&gt;
 * 
 * 
 * </code></pre><p>It is a good idea to disable text selection on any of the children that you<br>want to be swiped:</p>
 * <pre><code>.swipe {
 *   -moz-user-select: none;
 *   -ms-user-select: none;
 *   -webkit-user-select: none;
 *   user-select: none;
 *   cursor: default;
 * }
 * 
 * 
 * </code></pre>
 */
public class IronSwipeableContainer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronSwipeableContainer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronSwipeableContainer(String html) {
        super(IronSwipeableContainerElement.TAG, IronSwipeableContainerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronSwipeableContainerElement getPolymerElement() {
        try {
            return (IronSwipeableContainerElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>If true, then the container will not allow swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, then the container will not allow swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>The ratio of the total animation distance after which the opacity<br>transformation begins. For example, if the <code>widthRatio</code> is 1 and<br>the <code>opacityRate</code> is 0.5, then the element needs to travel half its<br>width before its opacity starts decreasing.</p>
     *
     * JavaScript Info:
     * @property opacityRate
     * @type Number
     * 
     */
    public double getOpacityRate() {
        return getPolymerElement().getOpacityRate();
    }
    /**
     * <p>The ratio of the total animation distance after which the opacity<br>transformation begins. For example, if the <code>widthRatio</code> is 1 and<br>the <code>opacityRate</code> is 0.5, then the element needs to travel half its<br>width before its opacity starts decreasing.</p>
     *
     * JavaScript Info:
     * @property opacityRate
     * @type Number
     * 
     */
    public void setOpacityRate(double value) {
        getPolymerElement().setOpacityRate(value);
    }

    /**
     * <p>The ratio of the width of the element that the translation animation<br>should happen over. For example, if the <code>widthRatio</code> is 3, the<br>animation will take place on a distance 3 times the width of the<br>element being swiped.</p>
     *
     * JavaScript Info:
     * @property widthRatio
     * @type Number
     * 
     */
    public double getWidthRatio() {
        return getPolymerElement().getWidthRatio();
    }
    /**
     * <p>The ratio of the width of the element that the translation animation<br>should happen over. For example, if the <code>widthRatio</code> is 3, the<br>animation will take place on a distance 3 times the width of the<br>element being swiped.</p>
     *
     * JavaScript Info:
     * @property widthRatio
     * @type Number
     * 
     */
    public void setWidthRatio(double value) {
        getPolymerElement().setWidthRatio(value);
    }

    /**
     * <p>The style in which to swipe the card. Currently supported<br>options are <code>curve | horizontal</code>. If left unspecified, the default<br>is assumed to be <code>horizontal</code>.</p>
     *
     * JavaScript Info:
     * @property swipeStyle
     * @type String
     * 
     */
    public String getSwipeStyle() {
        return getPolymerElement().getSwipeStyle();
    }
    /**
     * <p>The style in which to swipe the card. Currently supported<br>options are <code>curve | horizontal</code>. If left unspecified, the default<br>is assumed to be <code>horizontal</code>.</p>
     *
     * JavaScript Info:
     * @property swipeStyle
     * @type String
     * 
     */
    public void setSwipeStyle(String value) {
        getPolymerElement().setSwipeStyle(value);
    }

    /**
     * <p>The CSS transition applied while swiping.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type String
     * 
     */
    public String getTransition() {
        return getPolymerElement().getTransition();
    }
    /**
     * <p>The CSS transition applied while swiping.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type String
     * 
     */
    public void setTransition(String value) {
        getPolymerElement().setTransition(value);
    }


    /**
     * <p>The ratio of the total animation distance after which the opacity<br>transformation begins. For example, if the <code>widthRatio</code> is 1 and<br>the <code>opacityRate</code> is 0.5, then the element needs to travel half its<br>width before its opacity starts decreasing.</p>
     *
     * JavaScript Info:
     * @attribute opacity-rate
     * 
     */
    public void setOpacityRate(String value) {
        getPolymerElement().setAttribute("opacity-rate", value);
    }

    /**
     * <p>The ratio of the width of the element that the translation animation<br>should happen over. For example, if the <code>widthRatio</code> is 3, the<br>animation will take place on a distance 3 times the width of the<br>element being swiped.</p>
     *
     * JavaScript Info:
     * @attribute width-ratio
     * 
     */
    public void setWidthRatio(String value) {
        getPolymerElement().setAttribute("width-ratio", value);
    }



    /**
     * <p>Fired when a child element is swiped away.</p>
     *
     * JavaScript Info:
     * @event iron-swipe
     */
    public HandlerRegistration addIronSwipeHandler(IronSwipeEventHandler handler) {
        return addDomHandler(handler, IronSwipeEvent.TYPE);
    }

}
