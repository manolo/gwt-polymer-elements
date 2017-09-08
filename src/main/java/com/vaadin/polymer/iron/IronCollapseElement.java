/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-collapse project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>iron-collapse</code> creates a collapsible block of content.  By default, the content<br>will be collapsed.  Use <code>opened</code> or <code>toggle()</code> to show/hide the content.</p>
 * <pre><code>&lt;button on-click=&quot;toggle&quot;&gt;toggle collapse&lt;/button&gt;
 * 
 * &lt;iron-collapse id=&quot;collapse&quot;&gt;
 *   &lt;div&gt;Content goes here...&lt;/div&gt;
 * &lt;/iron-collapse&gt;
 * 
 * ...
 * 
 * toggle: function() {
 *   this.$.collapse.toggle();
 * }
 * 
 * 
 * </code></pre><p><code>iron-collapse</code> adjusts the max-height/max-width of the collapsible element to show/hide<br>the content.  So avoid putting padding/margin/border on the collapsible directly,<br>and instead put a div inside and style that.</p>
 * <pre><code>&lt;style&gt;
 *   .collapse-content {
 *     padding: 15px;
 *     border: 1px solid #dedede;
 *   }
 * &lt;/style&gt;
 * 
 * &lt;iron-collapse&gt;
 *   &lt;div class=&quot;collapse-content&quot;&gt;
 *     &lt;div&gt;Content goes here...&lt;/div&gt;
 *   &lt;/div&gt;
 * &lt;/iron-collapse&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--iron-collapse-transition-duration</code></td>
 * <td>Animation transition duration</td>
 * <td><code>300ms</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface IronCollapseElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-collapse";
    @JsOverlay public static final String SRC = "iron-collapse/iron-collapse.html";


    /**
     * <p>If true, the orientation is horizontal; otherwise is vertical.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    @JsProperty boolean getHorizontal();
    /**
     * <p>If true, the orientation is horizontal; otherwise is vertical.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    @JsProperty void setHorizontal(boolean value);

    /**
     * <p>Set noAnimation to true to disable animations.</p>
     *
     * JavaScript Info:
     * @property noAnimation
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoAnimation();
    /**
     * <p>Set noAnimation to true to disable animations.</p>
     *
     * JavaScript Info:
     * @property noAnimation
     * @type Boolean
     * 
     */
    @JsProperty void setNoAnimation(boolean value);

    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>When true, the element is transitioning its opened state. When false,<br>the element has finished opening/closing.</p>
     *
     * JavaScript Info:
     * @property transitioning
     * @type Boolean
     * 
     */
    @JsProperty boolean getTransitioning();
    /**
     * <p>When true, the element is transitioning its opened state. When false,<br>the element has finished opening/closing.</p>
     *
     * JavaScript Info:
     * @property transitioning
     * @type Boolean
     * 
     */
    @JsProperty void setTransitioning(boolean value);


    /**
     * <p>enableTransition() is deprecated, but left over so it doesn’t break existing code.<br>Please use <code>noAnimation</code> property instead.</p>
     *
     * JavaScript Info:
     * @method enableTransition
     * @param {} enabled  
     * 
     * 
     */
    void enableTransition(Object enabled);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Toggle the opened state.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    void toggle();

    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    void hide();

    /**
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     * 
     */
    void show();

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    void notifyResize();

    /**
     * <p>Updates the size of the element.</p>
     *
     * JavaScript Info:
     * @method updateSize
     * @param {string} size  
     * @param {boolean=} animated  
     * 
     * 
     */
    void updateSize(String size, boolean animated);

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
