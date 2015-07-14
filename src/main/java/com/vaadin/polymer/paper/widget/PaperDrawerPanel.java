/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperResponsiveChangeEvent;
import com.vaadin.polymer.paper.widget.event.PaperResponsiveChangeEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-drawer-panel</code> contains a drawer panel and a main panel.  The drawer<br>and the main panel are side-by-side with drawer on the left.  When the browser<br>window size is smaller than the <code>responsiveWidth</code>, <code>paper-drawer-panel</code><br>changes to narrow layout.  In narrow layout, the drawer will be stacked on top<br>of the main panel.  The drawer will slide in/out to hide/reveal the main<br>panel.</p>
 * <p>Use the attribute <code>drawer</code> to indicate that the element is the drawer panel and<br><code>main</code> to indicate that the element is the main panel.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;div drawer&gt; Drawer panel... &lt;/div&gt;
 *   &lt;div main&gt; Main panel... &lt;/div&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>The drawer and the main panels are not scrollable.  You can set CSS overflow<br>property on the elements to make them scrollable or use <code>paper-header-panel</code>.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;paper-header-panel drawer&gt;
 *     &lt;paper-toolbar&gt;&lt;/paper-toolbar&gt;
 *     &lt;div&gt; Drawer content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 *   &lt;paper-header-panel main&gt;
 *     &lt;paper-toolbar&gt;&lt;/paper-toolbar&gt;
 *     &lt;div&gt; Main content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>An element that should toggle the drawer will automatically do so if it’s<br>given the <code>paper-drawer-toggle</code> attribute.  Also this element will automatically<br>be hidden in wide layout.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;paper-header-panel drawer&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;div&gt;Application&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *     &lt;div&gt; Drawer content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 *   &lt;paper-header-panel main&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;paper-icon-button icon=&quot;menu&quot; paper-drawer-toggle&gt;&lt;/paper-icon-button&gt;
 *       &lt;div&gt;Title&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *     &lt;div&gt; Main content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>To position the drawer to the right, add <code>right-drawer</code> attribute.</p>
 * <pre><code>&lt;paper-drawer-panel right-drawer&gt;
 *   &lt;div drawer&gt; Drawer panel... &lt;/div&gt;
 *   &lt;div main&gt; Main panel... &lt;/div&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>Styling <code>paper-drawer-panel</code></p>
 * <p>To change the main container:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-main-container: {
 *     background-color: gray;
 *   };
 * }
 * 
 * 
 * </code></pre><p>To change the drawer container when it’s in the left side:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-left-drawer-container: {
 *     background-color: white;
 *   };
 * }
 * 
 * 
 * </code></pre><p>To change the drawer container when it’s in the right side:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-right-drawer-container: {
 *     background-color: white;
 *   };
 * }
 * 
 * 
 * </code></pre>
 */
public class PaperDrawerPanel extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDrawerPanel() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDrawerPanel(String html) {
        super(PaperDrawerPanelElement.TAG, PaperDrawerPanelElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronDeselectEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronDeselectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronDeselectEvent event) {
                fireEvent(new IronDeselectEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronSelectEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronSelectEvent event) {
                fireEvent(new IronSelectEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.paper.element.event.PaperResponsiveChangeEvent.NAME,
                new com.vaadin.polymer.paper.element.event.PaperResponsiveChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.paper.element.event.PaperResponsiveChangeEvent event) {
                fireEvent(new PaperResponsiveChangeEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDrawerPanelElement getPolymerElement() {
        return (PaperDrawerPanelElement) getElement();
    }


  
    /**
     * <p>Closes the drawer.</p>
     *
     * JavaScript Info:
     * @method closeDrawer
     * 
     */
    public void closeDrawer() {
        getPolymerElement().closeDrawer();
    }
  

  
    /**
     * <p>The panel to be selected when <code>paper-drawer-panel</code> changes to narrow<br>layout.</p>
     *
     * JavaScript Info:
     * @property defaultSelected
     * @type String
     * 
     */
    public String getDefaultSelected(){
        return getPolymerElement().getDefaultSelected();
    }
    /**
     * <p>The panel to be selected when <code>paper-drawer-panel</code> changes to narrow<br>layout.</p>
     *
     * JavaScript Info:
     * @property defaultSelected
     * @type String
     * 
     */
    public void setDefaultSelected(String value) {
        getPolymerElement().setDefaultSelected(value);
    }
   
  

  
    /**
     * <p>If true, swipe from the edge is disable.</p>
     *
     * JavaScript Info:
     * @property disableEdgeSwipe
     * @type Boolean
     * 
     */
    public boolean getDisableEdgeSwipe(){
        return getPolymerElement().getDisableEdgeSwipe();
    }
    /**
     * <p>If true, swipe from the edge is disable.</p>
     *
     * JavaScript Info:
     * @property disableEdgeSwipe
     * @type Boolean
     * 
     */
    public void setDisableEdgeSwipe(boolean value) {
        getPolymerElement().setDisableEdgeSwipe(value);
    }
   
  

  
    /**
     * <p>If true, swipe to open/close the drawer is disabled.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    public boolean getDisableSwipe(){
        return getPolymerElement().getDisableSwipe();
    }
    /**
     * <p>If true, swipe to open/close the drawer is disabled.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    public void setDisableSwipe(boolean value) {
        getPolymerElement().setDisableSwipe(value);
    }
   
  

  
    /**
     * <p>Whether the user is dragging the drawer interactively.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public boolean getDragging(){
        return getPolymerElement().getDragging();
    }
    /**
     * <p>Whether the user is dragging the drawer interactively.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public void setDragging(boolean value) {
        getPolymerElement().setDragging(value);
    }
   
  

  
    /**
     * <p>The attribute on elements that should toggle the drawer on tap, also elements will<br>automatically be hidden in wide layout.</p>
     *
     * JavaScript Info:
     * @property drawerToggleAttribute
     * @type String
     * 
     */
    public String getDrawerToggleAttribute(){
        return getPolymerElement().getDrawerToggleAttribute();
    }
    /**
     * <p>The attribute on elements that should toggle the drawer on tap, also elements will<br>automatically be hidden in wide layout.</p>
     *
     * JavaScript Info:
     * @property drawerToggleAttribute
     * @type String
     * 
     */
    public void setDrawerToggleAttribute(String value) {
        getPolymerElement().setDrawerToggleAttribute(value);
    }
   
  

  
    /**
     * <p>Width of the drawer panel.</p>
     *
     * JavaScript Info:
     * @property drawerWidth
     * @type String
     * 
     */
    public String getDrawerWidth(){
        return getPolymerElement().getDrawerWidth();
    }
    /**
     * <p>Width of the drawer panel.</p>
     *
     * JavaScript Info:
     * @property drawerWidth
     * @type String
     * 
     */
    public void setDrawerWidth(String value) {
        getPolymerElement().setDrawerWidth(value);
    }
   
  

  
    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    public double getEdgeSwipeSensitivity(){
        return getPolymerElement().getEdgeSwipeSensitivity();
    }
    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    public void setEdgeSwipeSensitivity(double value) {
        getPolymerElement().setEdgeSwipeSensitivity(value);
    }
   
    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @attribute edge-swipe-sensitivity
     * 
     */
    public void setEdgeSwipeSensitivity(String value) {
        getPolymerElement().setAttribute("edge-swipe-sensitivity", value);
    }
   
  

  
    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public boolean getForceNarrow(){
        return getPolymerElement().getForceNarrow();
    }
    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public void setForceNarrow(boolean value) {
        getPolymerElement().setForceNarrow(value);
    }
   
  

  
    /**
     * <p>Whether the browser has support for the transform CSS property.</p>
     *
     * JavaScript Info:
     * @property hasTransform
     * @type Boolean
     * 
     */
    public boolean getHasTransform(){
        return getPolymerElement().getHasTransform();
    }
    /**
     * <p>Whether the browser has support for the transform CSS property.</p>
     *
     * JavaScript Info:
     * @property hasTransform
     * @type Boolean
     * 
     */
    public void setHasTransform(boolean value) {
        getPolymerElement().setHasTransform(value);
    }
   
  

  
    /**
     * <p>Whether the browser has support for the will-change CSS property.</p>
     *
     * JavaScript Info:
     * @property hasWillChange
     * @type Boolean
     * 
     */
    public boolean getHasWillChange(){
        return getPolymerElement().getHasWillChange();
    }
    /**
     * <p>Whether the browser has support for the will-change CSS property.</p>
     *
     * JavaScript Info:
     * @property hasWillChange
     * @type Boolean
     * 
     */
    public void setHasWillChange(boolean value) {
        getPolymerElement().setHasWillChange(value);
    }
   
  

  
    /**
     * <p>Returns true if the panel is in narrow layout.  This is useful if you<br>need to show/hide elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public boolean getNarrow(){
        return getPolymerElement().getNarrow();
    }
    /**
     * <p>Returns true if the panel is in narrow layout.  This is useful if you<br>need to show/hide elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public void setNarrow(boolean value) {
        getPolymerElement().setNarrow(value);
    }
   
  

  
    /**
     * <p>Opens the drawer.</p>
     *
     * JavaScript Info:
     * @method openDrawer
     * 
     */
    public void openDrawer() {
        getPolymerElement().openDrawer();
    }
  

  
    /**
     * <p>Whether the drawer is peeking out from the edge.</p>
     *
     * JavaScript Info:
     * @property peeking
     * @type Boolean
     * 
     */
    public boolean getPeeking(){
        return getPolymerElement().getPeeking();
    }
    /**
     * <p>Whether the drawer is peeking out from the edge.</p>
     *
     * JavaScript Info:
     * @property peeking
     * @type Boolean
     * 
     */
    public void setPeeking(boolean value) {
        getPolymerElement().setPeeking(value);
    }
   
  

  
    /**
     * <p>Max-width when the panel changes to narrow layout.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public String getResponsiveWidth(){
        return getPolymerElement().getResponsiveWidth();
    }
    /**
     * <p>Max-width when the panel changes to narrow layout.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public void setResponsiveWidth(String value) {
        getPolymerElement().setResponsiveWidth(value);
    }
   
  

  
    /**
     * <p>If true, position the drawer to the right.</p>
     *
     * JavaScript Info:
     * @property rightDrawer
     * @type Boolean
     * 
     */
    public boolean getRightDrawer(){
        return getPolymerElement().getRightDrawer();
    }
    /**
     * <p>If true, position the drawer to the right.</p>
     *
     * JavaScript Info:
     * @property rightDrawer
     * @type Boolean
     * 
     */
    public void setRightDrawer(boolean value) {
        getPolymerElement().setRightDrawer(value);
    }
   
  

  
    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public String getSelected(){
        return getPolymerElement().getSelected();
    }
    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type String
     * 
     */
    public void setSelected(String value) {
        getPolymerElement().setSelected(value);
    }
   
  

  
    /**
     * <p>Toggles the panel open and closed.</p>
     *
     * JavaScript Info:
     * @method togglePanel
     * 
     */
    public void togglePanel() {
        getPolymerElement().togglePanel();
    }
  

  
    /**
     * <p>Whether the transition is enabled.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type Boolean
     * 
     */
    public boolean getTransition(){
        return getPolymerElement().getTransition();
    }
    /**
     * <p>Whether the transition is enabled.</p>
     *
     * JavaScript Info:
     * @property transition
     * @type Boolean
     * 
     */
    public void setTransition(boolean value) {
        getPolymerElement().setTransition(value);
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
     * <p>Fired when a panel is deselected.</p>
     * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is deselected.</p>
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * <p>Fired when the a panel is selected.</p>
     * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is selected.</p>
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addHandler(handler, IronSelectEvent.TYPE);
    }

    /**
     * <p>Fired when the narrow layout changes.</p>
     *
     * JavaScript Info:
     * @event paper-responsive-change
     */
    public HandlerRegistration addPaperResponsiveChangeHandler(PaperResponsiveChangeEventHandler handler) {
        return addHandler(handler, PaperResponsiveChangeEvent.TYPE);
    }

}
