/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-pages project by The Polymer Authors
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
 * <p><code>iron-pages</code> is used to select one of its children to show. One use is to cycle through a list of<br>children “pages”.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-pages selected=&quot;0&quot;&gt;
 *   &lt;div&gt;One&lt;/div&gt;
 *   &lt;div&gt;Two&lt;/div&gt;
 *   &lt;div&gt;Three&lt;/div&gt;
 * &lt;/iron-pages&gt;
 * 
 * &lt;script&gt;
 *   document.addEventListener(&#39;click&#39;, function(e) {
 *     var pages = document.querySelector(&#39;iron-pages&#39;);
 *     pages.selectNext();
 *   });
 * &lt;/script&gt;
 * 
 * 
 * </code></pre>
 */
public class IronPages extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronPages() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronPages(String html) {
        super(IronPagesElement.TAG, IronPagesElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronPagesElement getPolymerElement() {
        return (IronPagesElement) getElement();
    }


  
    /**
     * <p> handler immediately changes it back</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type Object
     * 
     */
    public JavaScriptObject getActivateEvent(){
        return getPolymerElement().getActivateEvent();
    }
    /**
     * <p> handler immediately changes it back</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type Object
     * 
     */
    public void setActivateEvent(JavaScriptObject value) {
        getPolymerElement().setActivateEvent(value);
    }
   
    /**
     * <p> handler immediately changes it back</p>
     *
     * JavaScript Info:
     * @attribute activate-event
     * 
     */
    public void setActivateEvent(String value) {
        getPolymerElement().setAttribute("activate-event", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  

  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    public void assignParentResizable(JavaScriptObject parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }
  

  
    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }
  

  
    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    public void resizerShouldNotify(JavaScriptObject element) {
        getPolymerElement().resizerShouldNotify(element);
    }
  

  
    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    public void stopResizeNotificationsFor(JavaScriptObject target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    public String getAttrForSelected(){
        return getPolymerElement().getAttrForSelected();
    }
    /**
     * <p>If you want to use the attribute value of an element for <code>selected</code> instead of the index,<br>set this to the name of the attribute.</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type string
     * @behavior PaperTabs
     */
    public void setAttrForSelected(String value) {
        getPolymerElement().setAttrForSelected(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getExcludedLocalNames(){
        return getPolymerElement().getExcludedLocalNames();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    public void setExcludedLocalNames(JavaScriptObject value) {
        getPolymerElement().setExcludedLocalNames(value);
    }
   
  

  
    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     */
    public void indexOf(JavaScriptObject item) {
        getPolymerElement().indexOf(item);
    }
  

  
    /**
     * <p>Returns an array of selectable items.</p>
     *
     * JavaScript Info:
     * @method items
     * @behavior PaperTabs
     */
    public void items() {
        getPolymerElement().items();
    }
  

  
    /**
     * <p>Selects the given value.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {string} value  
     * @behavior PaperTabs
     */
    public void select(String value) {
        getPolymerElement().select(value);
    }
  

  
    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     */
    public void selectNext() {
        getPolymerElement().selectNext();
    }
  

  
    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }
  

  
    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectable(){
        return getPolymerElement().getSelectable();
    }
    /**
     * <p>This is a CSS selector sting.  If this is set, only items that matches the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectable(String value) {
        getPolymerElement().setSelectable(value);
    }
   
  

  
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    public String getSelected(){
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    public void setSelected(String value) {
        getPolymerElement().setSelected(value);
    }
   
  

  
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectedAttribute(){
        return getPolymerElement().getSelectedAttribute();
    }
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectedAttribute(String value) {
        getPolymerElement().setSelectedAttribute(value);
    }
   
  

  
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectedClass(){
        return getPolymerElement().getSelectedClass();
    }
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }
   
  

  
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getSelectedItem(){
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }
   
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior PaperTabs
     */
    public void setSelectedItem(String value) {
        getPolymerElement().setAttribute("selected-item", value);
    }
   
  


}
