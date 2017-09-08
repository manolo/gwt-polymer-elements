/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

import com.vaadin.polymer.app.widget.event.AppDrawerAttachedEvent;
import com.vaadin.polymer.app.widget.event.AppDrawerAttachedEventHandler;

import com.vaadin.polymer.app.widget.event.AppDrawerResetLayoutEvent;
import com.vaadin.polymer.app.widget.event.AppDrawerResetLayoutEventHandler;

import com.vaadin.polymer.app.widget.event.AppDrawerTransitionedEvent;
import com.vaadin.polymer.app.widget.event.AppDrawerTransitionedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>app-drawer is a navigation drawer that can slide in from the left or right.</p>
 * <p>Example:</p>
 * <p>Align the drawer at the start, which is left in LTR layouts (default):</p>
 * <pre><code class="lang-html">&lt;app-drawer opened&gt;&lt;/app-drawer&gt;
 * </code></pre>
 * <p>Align the drawer at the end:</p>
 * <pre><code class="lang-html">&lt;app-drawer align=&quot;end&quot; opened&gt;&lt;/app-drawer&gt;
 * </code></pre>
 * <p>To make the contents of the drawer scrollable, create a wrapper for the scroll<br>content, and apply height and overflow styles to it.</p>
 * <pre><code class="lang-html">&lt;app-drawer&gt;
 *   &lt;div style=&quot;height: 100%; overflow: auto;&quot;&gt;&lt;/div&gt;
 * &lt;/app-drawer&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--app-drawer-width</code></td>
 * <td>Width of the drawer</td>
 * <td>256px</td>
 * </tr>
 * <tr>
 * <td><code>--app-drawer-content-container</code></td>
 * <td>Mixin for the drawer content container</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--app-drawer-scrim-background</code></td>
 * <td>Background for the scrim</td>
 * <td>rgba(0, 0, 0, 0.5)</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class AppDrawer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppDrawer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppDrawer(String html) {
        super(AppDrawerElement.TAG, AppDrawerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppDrawerElement getPolymerElement() {
        return (AppDrawerElement) getElement();
    }


    /**
     * <p>The transition duration of the drawer in milliseconds.</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    public double getTransitionDuration() {
        return getPolymerElement().getTransitionDuration();
    }
    /**
     * <p>The transition duration of the drawer in milliseconds.</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    public void setTransitionDuration(double value) {
        getPolymerElement().setTransitionDuration(value);
    }

    /**
     * <p>Trap keyboard focus when the drawer is opened and not persistent.</p>
     *
     * JavaScript Info:
     * @property noFocusTrap
     * @type Boolean
     * 
     */
    public boolean getNoFocusTrap() {
        return getPolymerElement().getNoFocusTrap();
    }
    /**
     * <p>Trap keyboard focus when the drawer is opened and not persistent.</p>
     *
     * JavaScript Info:
     * @property noFocusTrap
     * @type Boolean
     * 
     */
    public void setNoFocusTrap(boolean value) {
        getPolymerElement().setNoFocusTrap(value);
    }

    /**
     * <p>Disables swiping on the drawer.</p>
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
     * <p>Disables swiping on the drawer.</p>
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
     * <p>Create an area at the edge of the screen to swipe open the drawer.</p>
     *
     * JavaScript Info:
     * @property swipeOpen
     * @type Boolean
     * 
     */
    public boolean getSwipeOpen() {
        return getPolymerElement().getSwipeOpen();
    }
    /**
     * <p>Create an area at the edge of the screen to swipe open the drawer.</p>
     *
     * JavaScript Info:
     * @property swipeOpen
     * @type Boolean
     * 
     */
    public void setSwipeOpen(boolean value) {
        getPolymerElement().setSwipeOpen(value);
    }

    /**
     * <p>The opened state of the drawer.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>The opened state of the drawer.</p>
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
     * <p>The drawer does not have a scrim and cannot be swiped close.</p>
     *
     * JavaScript Info:
     * @property persistent
     * @type Boolean
     * 
     */
    public boolean getPersistent() {
        return getPolymerElement().getPersistent();
    }
    /**
     * <p>The drawer does not have a scrim and cannot be swiped close.</p>
     *
     * JavaScript Info:
     * @property persistent
     * @type Boolean
     * 
     */
    public void setPersistent(boolean value) {
        getPolymerElement().setPersistent(value);
    }

    /**
     * <p>The computed, read-only position of the drawer on the screen (‘left’ or ‘right’).</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public String getPosition() {
        return getPolymerElement().getPosition();
    }
    /**
     * <p>The computed, read-only position of the drawer on the screen (‘left’ or ‘right’).</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    public void setPosition(String value) {
        getPolymerElement().setPosition(value);
    }

    /**
     * <p>The alignment of the drawer on the screen (‘left’, ‘right’, ‘start’ or ‘end’).<br>‘start’ computes to left and ‘end’ to right in LTR layout and vice versa in RTL<br>layout.</p>
     *
     * JavaScript Info:
     * @property align
     * @type String
     * 
     */
    public String getAlign() {
        return getPolymerElement().getAlign();
    }
    /**
     * <p>The alignment of the drawer on the screen (‘left’, ‘right’, ‘start’ or ‘end’).<br>‘start’ computes to left and ‘end’ to right in LTR layout and vice versa in RTL<br>layout.</p>
     *
     * JavaScript Info:
     * @property align
     * @type String
     * 
     */
    public void setAlign(String value) {
        getPolymerElement().setAlign(value);
    }


    // Needed in UIBinder
    /**
     * <p>The transition duration of the drawer in milliseconds.</p>
     *
     * JavaScript Info:
     * @attribute transition-duration
     * 
     */
    public void setTransitionDuration(String value) {
        Polymer.property(this.getPolymerElement(), "transitionDuration", value);
    }


    /**
     * <p>Gets the width of the drawer.</p>
     *
     * JavaScript Info:
     * @method getWidth
     * 
     * @return {double}
     */
    public double getWidth() {
        return getPolymerElement().getWidth();
    }

    /**
     * <p>Toggles the drawer open and close.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }

    /**
     * <p>Opens the drawer.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Closes the drawer.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>Resets the layout. The event fired is used by app-drawer-layout to position the<br>content.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    public void resetLayout() {
        getPolymerElement().resetLayout();
    }


    /**
     * <p>Fired when the layout of app-drawer is attached.</p>
     *
     * JavaScript Info:
     * @event app-drawer-attached
     */
    public HandlerRegistration addAppDrawerAttachedHandler(AppDrawerAttachedEventHandler handler) {
        return addDomHandler(handler, AppDrawerAttachedEvent.TYPE);
    }

    /**
     * <p>Fired when the layout of app-drawer has changed.</p>
     *
     * JavaScript Info:
     * @event app-drawer-reset-layout
     */
    public HandlerRegistration addAppDrawerResetLayoutHandler(AppDrawerResetLayoutEventHandler handler) {
        return addDomHandler(handler, AppDrawerResetLayoutEvent.TYPE);
    }

    /**
     * <p>Fired when app-drawer has finished transitioning.</p>
     *
     * JavaScript Info:
     * @event app-drawer-transitioned
     */
    public HandlerRegistration addAppDrawerTransitionedHandler(AppDrawerTransitionedEventHandler handler) {
        return addDomHandler(handler, AppDrawerTransitionedEvent.TYPE);
    }

}
