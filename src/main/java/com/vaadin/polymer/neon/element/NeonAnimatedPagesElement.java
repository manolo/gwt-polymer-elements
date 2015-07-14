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
 * <p><code>neon-animated-pages</code> manages a set of pages and runs an animation when switching between them. Its<br>children pages should implement <code>Polymer.NeonAnimatableBehavior</code> and define <code>entry</code> and <code>exit</code><br>animations to be run when switching to or switching out of the page.</p>
 */
@JsType
public interface NeonAnimatedPagesElement extends HTMLElement {

    public static final String TAG = "neon-animated-pages";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * 
     */
    @JsProperty String getActivateEvent();
    /**
     * 
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * 
     */
    @JsProperty void setActivateEvent(String value);
  
    /**
     * <p> if true, the initial page selection will also be animated according to its animation config.</p>
     *
     * JavaScript Info:
     * @property animateInitialSelection
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimateInitialSelection();
    /**
     * <p> if true, the initial page selection will also be animated according to its animation config.</p>
     *
     * JavaScript Info:
     * @property animateInitialSelection
     * @type Boolean
     * 
     */
    @JsProperty void setAnimateInitialSelection(boolean value);
  
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
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    void assignParentResizable(JavaScriptObject parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    void resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    void stopResizeNotificationsFor(JavaScriptObject target);

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    void detached();

    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setAttrForSelected(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getExcludedLocalNames();
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setExcludedLocalNames(JavaScriptObject value);
  
    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     */
    void indexOf(JavaScriptObject item);

    /**
     * <p>Returns an array of selectable items.</p>
     *
     * JavaScript Info:
     * @method items
     * @behavior PaperTabs
     */
    void items();

    /**
     * <p>Selects the given value.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {string} value  
     * @behavior PaperTabs
     */
    void select(String value);

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     */
    void selectNext();

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     */
    void selectPrevious();

    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectable();
    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectable(String value);
  
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelected(String value);
  
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedAttribute();
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedAttribute(String value);
  
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedClass();
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedClass(String value);
  
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);
  
    /**
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    void cancelAnimation();

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    void playAnimation(JavaScriptObject type, JavaScriptObject cookie);

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
