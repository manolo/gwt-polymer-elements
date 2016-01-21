/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.ContentScrollEvent;
import com.vaadin.polymer.paper.widget.event.ContentScrollEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperHeaderTransformEvent;
import com.vaadin.polymer.paper.widget.event.PaperHeaderTransformEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/patterns/scrolling-techniques.html">Scrolling techniques</a></p>
 * <p><code>paper-scroll-header-panel</code> contains a header section and a content section.  The<br>header is initially on the top part of the view but it scrolls away with the<br>rest of the scrollable content.  Upon scrolling slightly up at any point, the<br>header scrolls back into view.  This saves screen space and allows users to<br>access important controls by easily moving them back to the view.</p>
 * <p><strong>Important:</strong> The <code>paper-scroll-header-panel</code> will not display if its parent does not have a height.</p>
 * <p>Using <a href="https://www.polymer-project.org/1.0/docs/migration.html#layout-attributes">layout classes</a> or custom properties, you can easily make the <code>paper-scroll-header-panel</code> fill the screen</p>
 * <pre><code class="lang-html">&lt;body class=&quot;fullbleed layout vertical&quot;&gt;
 *   &lt;paper-scroll-header-panel class=&quot;flex&quot;&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;div&gt;Hello World!&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *   &lt;/paper-scroll-header-panel&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <p>or, if you would prefer to do it in CSS, just give <code>html</code>, <code>body</code>, and <code>paper-scroll-header-panel</code> a height of 100%:</p>
 * <pre><code class="lang-css">html, body {
 *   height: 100%;
 *   margin: 0;
 * }
 * paper-scroll-header-panel {
 *   height: 100%;
 * }
 * </code></pre>
 * <p><code>paper-scroll-header-panel</code> works well with <code>paper-toolbar</code> but can use any element<br>that represents a header by adding a <code>paper-header</code> class to it.</p>
 * <pre><code class="lang-html">&lt;paper-scroll-header-panel&gt;
 *   &lt;paper-toolbar&gt;Header&lt;/paper-toolbar&gt;
 *   &lt;div&gt;Content goes here...&lt;/div&gt;
 * &lt;/paper-scroll-header-panel&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>=======</p>
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
 * <td>–paper-scroll-header-panel-full-header</td>
 * <td>To change background for toolbar when it is at its full size</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td>–paper-scroll-header-panel-condensed-header</td>
 * <td>To change the background for toolbar when it is condensed</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td>–paper-scroll-header-container</td>
 * <td>To override or add container styles</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperScrollHeaderPanel extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperScrollHeaderPanel() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperScrollHeaderPanel(String html) {
        super(PaperScrollHeaderPanelElement.TAG, PaperScrollHeaderPanelElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperScrollHeaderPanelElement getPolymerElement() {
        try {
            return (PaperScrollHeaderPanelElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>If true, the header is fixed to the top and never moves away.</p>
     *
     * JavaScript Info:
     * @property fixed
     * @type Boolean
     * 
     */
    public boolean getFixed() {
        return getPolymerElement().getFixed();
    }
    /**
     * <p>If true, the header is fixed to the top and never moves away.</p>
     *
     * JavaScript Info:
     * @property fixed
     * @type Boolean
     * 
     */
    public void setFixed(boolean value) {
        getPolymerElement().setFixed(value);
    }

    /**
     * <p>The height of the header when it is at its full size.</p>
     * <p>By default, the height will be measured when it is ready.  If the height<br>changes later the user needs to either set this value to reflect the<br>new height or invoke <code>measureHeaderHeight()</code>.</p>
     *
     * JavaScript Info:
     * @property headerHeight
     * @type Number
     * 
     */
    public double getHeaderHeight() {
        return getPolymerElement().getHeaderHeight();
    }
    /**
     * <p>The height of the header when it is at its full size.</p>
     * <p>By default, the height will be measured when it is ready.  If the height<br>changes later the user needs to either set this value to reflect the<br>new height or invoke <code>measureHeaderHeight()</code>.</p>
     *
     * JavaScript Info:
     * @property headerHeight
     * @type Number
     * 
     */
    public void setHeaderHeight(double value) {
        getPolymerElement().setHeaderHeight(value);
    }

    /**
     * <p>The state of the header. Depending on the configuration and the <code>scrollTop</code> value,<br>the header state could change to<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_EXPANDED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_HIDDEN<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_CONDENSED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_INTERPOLATED</p>
     *
     * JavaScript Info:
     * @property headerState
     * @type Number
     * 
     */
    public double getHeaderState() {
        return getPolymerElement().getHeaderState();
    }
    /**
     * <p>The state of the header. Depending on the configuration and the <code>scrollTop</code> value,<br>the header state could change to<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_EXPANDED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_HIDDEN<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_CONDENSED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_INTERPOLATED</p>
     *
     * JavaScript Info:
     * @property headerState
     * @type Number
     * 
     */
    public void setHeaderState(double value) {
        getPolymerElement().setHeaderState(value);
    }

    /**
     * <p>If true, the header’s height will condense to <code>condensedHeaderHeight</code><br>as the user scrolls down from the top of the content area.</p>
     *
     * JavaScript Info:
     * @property condenses
     * @type Boolean
     * 
     */
    public boolean getCondenses() {
        return getPolymerElement().getCondenses();
    }
    /**
     * <p>If true, the header’s height will condense to <code>condensedHeaderHeight</code><br>as the user scrolls down from the top of the content area.</p>
     *
     * JavaScript Info:
     * @property condenses
     * @type Boolean
     * 
     */
    public void setCondenses(boolean value) {
        getPolymerElement().setCondenses(value);
    }

    /**
     * <p>If true, no cross-fade transition from one background to another.</p>
     *
     * JavaScript Info:
     * @property noDissolve
     * @type Boolean
     * 
     */
    public boolean getNoDissolve() {
        return getPolymerElement().getNoDissolve();
    }
    /**
     * <p>If true, no cross-fade transition from one background to another.</p>
     *
     * JavaScript Info:
     * @property noDissolve
     * @type Boolean
     * 
     */
    public void setNoDissolve(boolean value) {
        getPolymerElement().setNoDissolve(value);
    }

    /**
     * <p>If true, the header doesn’t slide back in when scrolling back up.</p>
     *
     * JavaScript Info:
     * @property noReveal
     * @type Boolean
     * 
     */
    public boolean getNoReveal() {
        return getPolymerElement().getNoReveal();
    }
    /**
     * <p>If true, the header doesn’t slide back in when scrolling back up.</p>
     *
     * JavaScript Info:
     * @property noReveal
     * @type Boolean
     * 
     */
    public void setNoReveal(boolean value) {
        getPolymerElement().setNoReveal(value);
    }

    /**
     * <p>The height of the header when it is condensed.</p>
     * <p>By default, <code>condensedHeaderHeight</code> is 1/3 of <code>headerHeight</code> unless<br>this is specified.</p>
     *
     * JavaScript Info:
     * @property condensedHeaderHeight
     * @type Number
     * 
     */
    public double getCondensedHeaderHeight() {
        return getPolymerElement().getCondensedHeaderHeight();
    }
    /**
     * <p>The height of the header when it is condensed.</p>
     * <p>By default, <code>condensedHeaderHeight</code> is 1/3 of <code>headerHeight</code> unless<br>this is specified.</p>
     *
     * JavaScript Info:
     * @property condensedHeaderHeight
     * @type Number
     * 
     */
    public void setCondensedHeaderHeight(double value) {
        getPolymerElement().setCondensedHeaderHeight(value);
    }

    /**
     * <p>By default, the top part of the header stays when the header is being<br>condensed.  Set this to true if you want the top part of the header<br>to be scrolled away.</p>
     *
     * JavaScript Info:
     * @property scrollAwayTopbar
     * @type Boolean
     * 
     */
    public boolean getScrollAwayTopbar() {
        return getPolymerElement().getScrollAwayTopbar();
    }
    /**
     * <p>By default, the top part of the header stays when the header is being<br>condensed.  Set this to true if you want the top part of the header<br>to be scrolled away.</p>
     *
     * JavaScript Info:
     * @property scrollAwayTopbar
     * @type Boolean
     * 
     */
    public void setScrollAwayTopbar(boolean value) {
        getPolymerElement().setScrollAwayTopbar(value);
    }

    /**
     * <p>If true, the condensed header is always shown and does not move away.</p>
     *
     * JavaScript Info:
     * @property keepCondensedHeader
     * @type Boolean
     * 
     */
    public boolean getKeepCondensedHeader() {
        return getPolymerElement().getKeepCondensedHeader();
    }
    /**
     * <p>If true, the condensed header is always shown and does not move away.</p>
     *
     * JavaScript Info:
     * @property keepCondensedHeader
     * @type Boolean
     * 
     */
    public void setKeepCondensedHeader(boolean value) {
        getPolymerElement().setKeepCondensedHeader(value);
    }


    /**
     * <p>The state of the header. Depending on the configuration and the <code>scrollTop</code> value,<br>the header state could change to<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_EXPANDED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_HIDDEN<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_CONDENSED<br>     Polymer.PaperScrollHeaderPanel.HEADER_STATE_INTERPOLATED</p>
     *
     * JavaScript Info:
     * @attribute header-state
     * 
     */
    public void setHeaderState(String value) {
        getPolymerElement().setAttribute("header-state", value);
    }

    /**
     * <p>The height of the header when it is at its full size.</p>
     * <p>By default, the height will be measured when it is ready.  If the height<br>changes later the user needs to either set this value to reflect the<br>new height or invoke <code>measureHeaderHeight()</code>.</p>
     *
     * JavaScript Info:
     * @attribute header-height
     * 
     */
    public void setHeaderHeight(String value) {
        getPolymerElement().setAttribute("header-height", value);
    }

    /**
     * <p>The height of the header when it is condensed.</p>
     * <p>By default, <code>condensedHeaderHeight</code> is 1/3 of <code>headerHeight</code> unless<br>this is specified.</p>
     *
     * JavaScript Info:
     * @attribute condensed-header-height
     * 
     */
    public void setCondensedHeaderHeight(String value) {
        getPolymerElement().setAttribute("condensed-header-height", value);
    }


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
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
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Scroll to a specific y coordinate.</p>
     *
     * JavaScript Info:
     * @method scroll
     * @param {number} top  
     * @param {boolean} smooth  
     * 
     * 
     */
    public void scroll(double top, boolean smooth) {
        getPolymerElement().scroll(top, smooth);
    }

    /**
     * <p>Invoke this to tell <code>paper-scroll-header-panel</code> to re-measure the header’s<br>height.</p>
     *
     * JavaScript Info:
     * @method measureHeaderHeight
     * 
     * 
     */
    public void measureHeaderHeight() {
        getPolymerElement().measureHeaderHeight();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
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
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }

    /**
     * <p>Condense the header.</p>
     *
     * JavaScript Info:
     * @method condense
     * @param {boolean} smooth  
     * 
     * 
     */
    public void condense(boolean smooth) {
        getPolymerElement().condense(smooth);
    }

    /**
     * <p>Scroll to the top of the content.</p>
     *
     * JavaScript Info:
     * @method scrollToTop
     * @param {boolean} smooth  
     * 
     * 
     */
    public void scrollToTop(boolean smooth) {
        getPolymerElement().scrollToTop(smooth);
    }


    /**
     * <p>Fired when the content has been scrolled.</p>
     *
     * JavaScript Info:
     * @event content-scroll
     */
    public HandlerRegistration addContentScrollHandler(ContentScrollEventHandler handler) {
        return addDomHandler(handler, ContentScrollEvent.TYPE);
    }

    /**
     * <p>Fired when the header is transformed.</p>
     *
     * JavaScript Info:
     * @event paper-header-transform
     */
    public HandlerRegistration addPaperHeaderTransformHandler(PaperHeaderTransformEventHandler handler) {
        return addDomHandler(handler, PaperHeaderTransformEvent.TYPE);
    }

}
