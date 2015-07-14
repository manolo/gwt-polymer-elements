/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-collapse project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>iron-collapse</code> creates a collapsible block of content.  By default, the content<br>will be collapsed.  Use <code>opened</code> or <code>toggle()</code> to show/hide the content.</p>
 * <pre><code>&lt;button on-click=&quot;{{toggle}}&quot;&gt;toggle collapse&lt;/button&gt;
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
 * </code></pre><p><code>iron-collapse</code> adjusts the height/width of the collapsible element to show/hide<br>the content.  So avoid putting padding/margin/border on the collapsible directly,<br>and instead put a div inside and style that.</p>
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
 * </code></pre>
 */
@JsType
public interface IronCollapseElement extends HTMLElement {

    public static final String TAG = "iron-collapse";
    public static final String SRC = "iron-collapse/iron-collapse.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method enableTransition
     * @param {} enabled  
     * 
     */
    void enableTransition(JavaScriptObject enabled);

    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     */
    void hide();

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
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     */
    void show();

    /**
     * <p>Toggle the opened state.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     */
    void toggle();

    /**
     * 
     *
     * JavaScript Info:
     * @method updateSize
     * @param {} size  
     * @param {} animated  
     * 
     */
    void updateSize(JavaScriptObject size, JavaScriptObject animated);

    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
}
