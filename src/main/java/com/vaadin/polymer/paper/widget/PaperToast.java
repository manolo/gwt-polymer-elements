/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.IronAnnounceEvent;
import com.vaadin.polymer.paper.widget.event.IronAnnounceEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/snackbars-toasts.html">Snackbars &amp; toasts</a></p>
 * <p><code>paper-toast</code> provides a subtle notification toast. Only one <code>paper-toast</code> will<br>be visible on screen.</p>
 * <p>Use <code>opened</code> to show the toast:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toast text=&quot;Hello world!&quot; opened&gt;&lt;/paper-toast&gt;
 * 
 * 
 * </code></pre><p>Also <code>open()</code> or <code>show()</code> can be used to show the toast:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-button on-click=&quot;openToast&quot;&gt;Open Toast&lt;/paper-button&gt;
 * &lt;paper-toast id=&quot;toast&quot; text=&quot;Hello world!&quot;&gt;&lt;/paper-toast&gt;
 * 
 * ...
 * 
 * openToast: function() {
 *   this.$.toast.open();
 * }
 * 
 * 
 * </code></pre><p>Set <code>duration</code> to 0, a negative number or Infinity to persist the toast on screen:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toast text=&quot;Terms and conditions&quot; opened duration=&quot;0&quot;&gt;
 *   &lt;a href=&quot;#&quot;&gt;Show more&lt;/a&gt;
 * &lt;/paper-toast&gt;
 * 
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
 * <td><code>--paper-toast-background-color</code></td>
 * <td>The paper-toast background-color</td>
 * <td><code>#323232</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toast-color</code></td>
 * <td>The paper-toast color</td>
 * <td><code>#f1f1f1</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>This element applies the mixin <code>--paper-font-common-base</code> but does not import <code>paper-styles/typography.html</code>.<br>In order to apply the <code>Roboto</code> font to this element, make sure you’ve imported <code>paper-styles/typography.html</code>.</p>
 */
public class PaperToast extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperToast() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperToast(String html) {
        super(PaperToastElement.TAG, PaperToastElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperToastElement getPolymerElement() {
        return (PaperToastElement) getElement();
    }


    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior VaadinContextMenuOverlay
     */
    public double getHorizontalOffset() {
        return getPolymerElement().getHorizontalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior VaadinContextMenuOverlay
     */
    public void setHorizontalOffset(double value) {
        getPolymerElement().setHorizontalOffset(value);
    }

    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior VaadinContextMenuOverlay
     */
    public Element getBackdropElement() {
        return getPolymerElement().getBackdropElement();
    }
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior VaadinContextMenuOverlay
     */
    public void setBackdropElement(Element value) {
        getPolymerElement().setBackdropElement(value);
    }

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior VaadinContextMenuOverlay
     */
    public double getVerticalOffset() {
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior VaadinContextMenuOverlay
     */
    public void setVerticalOffset(double value) {
        getPolymerElement().setVerticalOffset(value);
    }

    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public double getDuration() {
        return getPolymerElement().getDuration();
    }
    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public void setDuration(double value) {
        getPolymerElement().setDuration(value);
    }

    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getAlwaysOnTop() {
        return getPolymerElement().getAlwaysOnTop();
    }
    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setAlwaysOnTop(boolean value) {
        getPolymerElement().setAlwaysOnTop(value);
    }

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getRestoreFocusOnClose() {
        return getPolymerElement().getRestoreFocusOnClose();
    }
    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setRestoreFocusOnClose(boolean value) {
        getPolymerElement().setRestoreFocusOnClose(value);
    }

    /**
     * <p>Set to true to display a backdrop behind the overlay. It traps the focus<br>within the light DOM of the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getWithBackdrop() {
        return getPolymerElement().getWithBackdrop();
    }
    /**
     * <p>Set to true to display a backdrop behind the overlay. It traps the focus<br>within the light DOM of the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setWithBackdrop(boolean value) {
        getPolymerElement().setWithBackdrop(value);
    }

    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to true to disable auto-focusing the toast or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * 
     */
    public boolean getNoAutoFocus() {
        return getPolymerElement().getNoAutoFocus();
    }
    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to true to disable auto-focusing the toast or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * 
     */
    public void setNoAutoFocus(boolean value) {
        getPolymerElement().setNoAutoFocus(value);
    }

    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getCanceled() {
        return getPolymerElement().getCanceled();
    }
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setCanceled(boolean value) {
        getPolymerElement().setCanceled(value);
    }

    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getAutoFitOnAttach() {
        return getPolymerElement().getAutoFitOnAttach();
    }
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setAutoFitOnAttach(boolean value) {
        getPolymerElement().setAutoFitOnAttach(value);
    }

    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to false to enable closing of the toast by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * 
     */
    public boolean getNoCancelOnOutsideClick() {
        return getPolymerElement().getNoCancelOnOutsideClick();
    }
    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to false to enable closing of the toast by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * 
     */
    public void setNoCancelOnOutsideClick(boolean value) {
        getPolymerElement().setNoCancelOnOutsideClick(value);
    }

    /**
     * <p>If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as preferred alignment<br>and if there’s not enough space, it will pick the values which minimize the cropping.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getDynamicAlign() {
        return getPolymerElement().getDynamicAlign();
    }
    /**
     * <p>If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as preferred alignment<br>and if there’s not enough space, it will pick the values which minimize the cropping.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setDynamicAlign(boolean value) {
        getPolymerElement().setDynamicAlign(value);
    }

    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getNoCancelOnEscKey() {
        return getPolymerElement().getNoCancelOnEscKey();
    }
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setNoCancelOnEscKey(boolean value) {
        getPolymerElement().setNoCancelOnEscKey(value);
    }

    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public boolean getNoOverlap() {
        return getPolymerElement().getNoOverlap();
    }
    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    public void setNoOverlap(boolean value) {
        getPolymerElement().setNoOverlap(value);
    }

    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    public JavaScriptObject getPositionTarget() {
        return getPolymerElement().getPositionTarget();
    }
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    public void setPositionTarget(JavaScriptObject value) {
        getPolymerElement().setPositionTarget(value);
    }

    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    public JavaScriptObject getClosingReason() {
        return getPolymerElement().getClosingReason();
    }
    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    public void setClosingReason(JavaScriptObject value) {
        getPolymerElement().setClosingReason(value);
    }

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    public JavaScriptObject getFitInto() {
        return getPolymerElement().getFitInto();
    }
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    public void setFitInto(JavaScriptObject value) {
        getPolymerElement().setFitInto(value);
    }

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    public JavaScriptObject getSizingTarget() {
        return getPolymerElement().getSizingTarget();
    }
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    public void setSizingTarget(JavaScriptObject value) {
        getPolymerElement().setSizingTarget(value);
    }

    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    public String getVerticalAlign() {
        return getPolymerElement().getVerticalAlign();
    }
    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    public void setVerticalAlign(String value) {
        getPolymerElement().setVerticalAlign(value);
    }

    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public String getText() {
        return getPolymerElement().getText();
    }
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public void setText(String value) {
        getPolymerElement().setText(value);
    }

    /**
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to <code>positionTarget</code>.<br>Overridden from <code>Polymer.IronFitBehavior</code>.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public String getHorizontalAlign() {
        return getPolymerElement().getHorizontalAlign();
    }
    /**
     * <p>The orientation against which to align the dropdown content<br>horizontally relative to <code>positionTarget</code>.<br>Overridden from <code>Polymer.IronFitBehavior</code>.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public void setHorizontalAlign(String value) {
        getPolymerElement().setHorizontalAlign(value);
    }


    // Needed in UIBinder
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>horizontalAlign</code>.</p>
     * <p>If <code>horizontalAlign</code> is “left”, this offset will increase or decrease<br>the distance to the left side of the screen: a negative offset will<br>move the dropdown to the left; a positive one, to the right.</p>
     * <p>Conversely if <code>horizontalAlign</code> is “right”, this offset will increase<br>or decrease the distance to the right side of the screen: a negative<br>offset will move the dropdown to the right; a positive one, to the left.</p>
     *
     * JavaScript Info:
     * @attribute horizontal-offset
     * @behavior VaadinContextMenuOverlay
     */
    public void setHorizontalOffset(String value) {
        Polymer.property(this.getPolymerElement(), "horizontalOffset", value);
    }

    // Needed in UIBinder
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @attribute backdrop-element
     * @behavior VaadinContextMenuOverlay
     */
    public void setBackdropElement(String value) {
        Polymer.property(this.getPolymerElement(), "backdropElement", value);
    }

    // Needed in UIBinder
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>, in the direction of alignment. You can think<br>of it as increasing or decreasing the distance to the side of the<br>screen given by <code>verticalAlign</code>.</p>
     * <p>If <code>verticalAlign</code> is “top”, this offset will increase or decrease<br>the distance to the top side of the screen: a negative offset will<br>move the dropdown upwards; a positive one, downwards.</p>
     * <p>Conversely if <code>verticalAlign</code> is “bottom”, this offset will increase<br>or decrease the distance to the bottom side of the screen: a negative<br>offset will move the dropdown downwards; a positive one, upwards.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * @behavior VaadinContextMenuOverlay
     */
    public void setVerticalOffset(String value) {
        Polymer.property(this.getPolymerElement(), "verticalOffset", value);
    }

    // Needed in UIBinder
    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @attribute duration
     * 
     */
    public void setDuration(String value) {
        Polymer.property(this.getPolymerElement(), "duration", value);
    }

    // Needed in UIBinder
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @attribute position-target
     * @behavior VaadinContextMenuOverlay
     */
    public void setPositionTarget(String value) {
        Polymer.property(this.getPolymerElement(), "positionTarget", value);
    }

    // Needed in UIBinder
    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @attribute closing-reason
     * @behavior VaadinContextMenuOverlay
     */
    public void setClosingReason(String value) {
        Polymer.property(this.getPolymerElement(), "closingReason", value);
    }

    // Needed in UIBinder
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @attribute fit-into
     * @behavior VaadinContextMenuOverlay
     */
    public void setFitInto(String value) {
        Polymer.property(this.getPolymerElement(), "fitInto", value);
    }

    // Needed in UIBinder
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @attribute sizing-target
     * @behavior VaadinContextMenuOverlay
     */
    public void setSizingTarget(String value) {
        Polymer.property(this.getPolymerElement(), "sizingTarget", value);
    }


    /**
     * <p>Show the toast. Without arguments, this is the same as <code>open()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method show
     * @param {(Object|string)=} properties  
     * 
     * 
     */
    public void show(Object properties) {
        getPolymerElement().show(properties);
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
     * <p>Invalidates the cached tabbable nodes. To be called when any of the focusable<br>content changes (e.g. a button is disabled).</p>
     *
     * JavaScript Info:
     * @method invalidateTabbables
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void invalidateTabbables() {
        getPolymerElement().invalidateTabbables();
    }

    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }

    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void center() {
        getPolymerElement().center();
    }

    /**
     * <p>Hide the toast. Same as <code>close()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    public void hide() {
        getPolymerElement().hide();
    }

    /**
     * <p>Positions and fits the element into the <code>fitInto</code> element.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void fit() {
        getPolymerElement().fit();
    }

    /**
     * <p>Positions the element according to <code>horizontalAlign, verticalAlign</code>.</p>
     *
     * JavaScript Info:
     * @method position
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void position() {
        getPolymerElement().position();
    }

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after<br>the element or the <code>fitInto</code> element has been resized, or if any of the<br>positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.<br>It preserves the scroll position of the sizingTarget.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void refit() {
        getPolymerElement().refit();
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
     * <p>Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void constrain() {
        getPolymerElement().constrain();
    }

    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void resetFit() {
        getPolymerElement().resetFit();
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
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @param {Event=} event  
     * @behavior VaadinContextMenuOverlay
     * 
     */
    public void cancel(JavaScriptObject event) {
        getPolymerElement().cancel(event);
    }


    /**
     * <p>Fired when <code>paper-toast</code> is opened.</p>
     *
     * JavaScript Info:
     * @event 'iron-announce'
     */
    public HandlerRegistration addIronAnnounceHandler(IronAnnounceEventHandler handler) {
        return addDomHandler(handler, IronAnnounceEvent.TYPE);
    }

    /**
     * <p>Fired when the overlay is canceled, but before it is closed.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-canceled
     */
    public HandlerRegistration addIronOverlayCanceledHandler(IronOverlayCanceledEventHandler handler) {
        return addDomHandler(handler, IronOverlayCanceledEvent.TYPE);
    }

    /**
     * <p>Fired after the overlay closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addDomHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the overlay opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addDomHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}
