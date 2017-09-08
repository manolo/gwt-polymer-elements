/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperResponsiveChangeEvent;
import com.vaadin.polymer.paper.widget.event.PaperResponsiveChangeEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/patterns/navigation-drawer.html">Navigation drawer</a></p>
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
 * </code></pre><h3 id="styling">Styling</h3>
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
 * </code></pre><p>To customize the scrim:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-scrim: {
 *     background-color: red;
 *   };
 * }
 * 
 * 
 * </code></pre><p>The following custom properties and mixins are available for styling:</p>
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
 * <td><code>--paper-drawer-panel-scrim-opacity</code></td>
 * <td>Scrim opacity</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-drawer-container</code></td>
 * <td>Mixin applied to drawer container</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-left-drawer-container</code></td>
 * <td>Mixin applied to container when it’s in the left side</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-main-container</code></td>
 * <td>Mixin applied to main container</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-right-drawer-container</code></td>
 * <td>Mixin applied to container when it’s in the right side</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-scrim</code></td>
 * <td>Mixin applied to scrim</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
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
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDrawerPanelElement getPolymerElement() {
        return (PaperDrawerPanelElement) getElement();
    }


    /**
     * <p>Whether the user is dragging the drawer interactively.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    public boolean getDragging() {
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
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    public double getEdgeSwipeSensitivity() {
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
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public boolean getForceNarrow() {
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
     * <p>If true, swipe to open/close the drawer is disabled.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    public boolean getDisableSwipe() {
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
     * <p>Whether the browser has support for the will-change CSS property.</p>
     *
     * JavaScript Info:
     * @property hasWillChange
     * @type Boolean
     * 
     */
    public boolean getHasWillChange() {
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
    public boolean getNarrow() {
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
     * <p>Whether the drawer is peeking out from the edge.</p>
     *
     * JavaScript Info:
     * @property peeking
     * @type Boolean
     * 
     */
    public boolean getPeeking() {
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
     * <p>If true, position the drawer to the right.</p>
     *
     * JavaScript Info:
     * @property rightDrawer
     * @type Boolean
     * 
     */
    public boolean getRightDrawer() {
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
     * @type (string|null)
     * 
     */
    public Object getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|null)
     * 
     */
    public void setSelected(Object value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * <p>If true, swipe from the edge is disabled.</p>
     *
     * JavaScript Info:
     * @property disableEdgeSwipe
     * @type Boolean
     * 
     */
    public boolean getDisableEdgeSwipe() {
        return getPolymerElement().getDisableEdgeSwipe();
    }
    /**
     * <p>If true, swipe from the edge is disabled.</p>
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
     * <p>Whether the browser has support for the transform CSS property.</p>
     *
     * JavaScript Info:
     * @property hasTransform
     * @type Boolean
     * 
     */
    public boolean getHasTransform() {
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
     * <p>Max-width when the panel changes to narrow layout.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public String getResponsiveWidth() {
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
     * <p>The panel to be selected when <code>paper-drawer-panel</code> changes to narrow<br>layout.</p>
     *
     * JavaScript Info:
     * @property defaultSelected
     * @type String
     * 
     */
    public String getDefaultSelected() {
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
     * <p>Width of the drawer panel.</p>
     *
     * JavaScript Info:
     * @property drawerWidth
     * @type String
     * 
     */
    public String getDrawerWidth() {
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
     * <p>The attribute on elements that should toggle the drawer on tap, also elements will<br>automatically be hidden in wide layout.</p>
     *
     * JavaScript Info:
     * @property drawerToggleAttribute
     * @type String
     * 
     */
    public String getDrawerToggleAttribute() {
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
     * <p>The CSS selector for the element that should receive focus when the drawer is open.<br>By default, when the drawer opens, it focuses the first tabbable element. That is,<br>the first element that can receive focus.</p>
     * <p>To disable this behavior, you can set <code>drawerFocusSelector</code> to <code>null</code> or an empty string.</p>
     *
     * JavaScript Info:
     * @property drawerFocusSelector
     * @type String
     * 
     */
    public String getDrawerFocusSelector() {
        return getPolymerElement().getDrawerFocusSelector();
    }
    /**
     * <p>The CSS selector for the element that should receive focus when the drawer is open.<br>By default, when the drawer opens, it focuses the first tabbable element. That is,<br>the first element that can receive focus.</p>
     * <p>To disable this behavior, you can set <code>drawerFocusSelector</code> to <code>null</code> or an empty string.</p>
     *
     * JavaScript Info:
     * @property drawerFocusSelector
     * @type String
     * 
     */
    public void setDrawerFocusSelector(String value) {
        getPolymerElement().setDrawerFocusSelector(value);
    }


    // Needed in UIBinder
    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @attribute edge-swipe-sensitivity
     * 
     */
    public void setEdgeSwipeSensitivity(String value) {
        Polymer.property(this.getPolymerElement(), "edgeSwipeSensitivity", value);
    }

    // Needed in UIBinder
    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @attribute selected
     * 
     */
    public void setSelected(String value) {
        Polymer.property(this.getPolymerElement(), "selected", value);
    }


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Toggles the panel open and closed.</p>
     *
     * JavaScript Info:
     * @method togglePanel
     * 
     * 
     */
    public void togglePanel() {
        getPolymerElement().togglePanel();
    }

    /**
     * <p>Closes the drawer.</p>
     *
     * JavaScript Info:
     * @method closeDrawer
     * 
     * 
     */
    public void closeDrawer() {
        getPolymerElement().closeDrawer();
    }

    /**
     * <p>Opens the drawer.</p>
     *
     * JavaScript Info:
     * @method openDrawer
     * 
     * 
     */
    public void openDrawer() {
        getPolymerElement().openDrawer();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


    /**
     * <p>Fired when a panel is deselected.</p>
     * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is deselected.</p>
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addDomHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * <p>Fired when the a panel is selected.</p>
     * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is selected.</p>
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addDomHandler(handler, IronSelectEvent.TYPE);
    }

    /**
     * <p>Fired when the narrow layout changes.</p>
     *
     * JavaScript Info:
     * @event paper-responsive-change
     */
    public HandlerRegistration addPaperResponsiveChangeHandler(PaperResponsiveChangeEventHandler handler) {
        return addDomHandler(handler, PaperResponsiveChangeEvent.TYPE);
    }

}
