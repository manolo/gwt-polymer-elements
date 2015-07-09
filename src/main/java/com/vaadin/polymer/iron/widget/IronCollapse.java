/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-collapse project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronCollapse extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronCollapse() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronCollapse(String html) {
        super(IronCollapseElement.TAG, IronCollapseElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronCollapseElement getPolymerElement() {
        return (IronCollapseElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @method enableTransition
     * @param {} enabled  
     * 
     */
    public void enableTransition(JavaScriptObject enabled) {
        getPolymerElement().enableTransition(enabled);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method hide
     * 
     */
    public void hide() {
        getPolymerElement().hide();
    }
  

  
    /**
     * <p>If true, the orientation is horizontal; otherwise is vertical.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    public boolean getHorizontal(){
        return getPolymerElement().getHorizontal();
    }
    /**
     * <p>If true, the orientation is horizontal; otherwise is vertical.</p>
     *
     * JavaScript Info:
     * @property horizontal
     * @type Boolean
     * 
     */
    public void setHorizontal(boolean value) {
        getPolymerElement().setHorizontal(value);
    }
   
  

  
    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened(){
        return getPolymerElement().getOpened();
    }
    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method show
     * 
     */
    public void show() {
        getPolymerElement().show();
    }
  

  
    /**
     * <p>Toggle the opened state.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method updateSize
     * @param {} size  
     * @param {} animated  
     * 
     */
    public void updateSize(JavaScriptObject size, JavaScriptObject animated) {
        getPolymerElement().updateSize(size, animated);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  


}
