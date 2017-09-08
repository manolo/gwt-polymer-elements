/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-context-menu project by unknown author
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface VaadinContextMenuOverlayElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-context-menu-overlay";
    @JsOverlay public static final String SRC = "vaadin-context-menu/vaadin-context-menu.html";


    /**
     * <p>When <code>true</code> overlay is optimized for a small touch screen.<br>When <code>false</code>, overlay position and size is optimized for a desktop/tablet screen.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty boolean getPhone();
    /**
     * <p>When <code>true</code> overlay is optimized for a small touch screen.<br>When <code>false</code>, overlay position and size is optimized for a desktop/tablet screen.</p>
     *
     * JavaScript Info:
     * @property phone
     * @type Boolean
     * 
     */
    @JsProperty void setPhone(boolean value);

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
    @JsProperty double getHorizontalOffset();
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
    @JsProperty void setHorizontalOffset(double value);

    /**
     * <p>Position of the overlay on vertical axis.</p>
     *
     * JavaScript Info:
     * @property y
     * @type Number
     * 
     */
    @JsProperty double getY();
    /**
     * <p>Position of the overlay on vertical axis.</p>
     *
     * JavaScript Info:
     * @property y
     * @type Number
     * 
     */
    @JsProperty void setY(double value);

    /**
     * <p>Position of the overlay on horizontal axis.</p>
     *
     * JavaScript Info:
     * @property x
     * @type Number
     * 
     */
    @JsProperty double getX();
    /**
     * <p>Position of the overlay on horizontal axis.</p>
     *
     * JavaScript Info:
     * @property x
     * @type Number
     * 
     */
    @JsProperty void setX(double value);

    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty Element getBackdropElement();
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setBackdropElement(Element value);

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
    @JsProperty double getVerticalOffset();
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
    @JsProperty void setVerticalOffset(double value);

    /**
     * <p>If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as preferred alignment<br>and if there’s not enough space, it will pick the values which minimize the cropping.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getDynamicAlign();
    /**
     * <p>If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as preferred alignment<br>and if there’s not enough space, it will pick the values which minimize the cropping.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setDynamicAlign(boolean value);

    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getCanceled();
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setCanceled(boolean value);

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getRestoreFocusOnClose();
    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setRestoreFocusOnClose(boolean value);

    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getNoOverlap();
    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setNoOverlap(boolean value);

    /**
     * <p>Set to true to display a backdrop behind the overlay. It traps the focus<br>within the light DOM of the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getWithBackdrop();
    /**
     * <p>Set to true to display a backdrop behind the overlay. It traps the focus<br>within the light DOM of the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setWithBackdrop(boolean value);

    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getAlwaysOnTop();
    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setAlwaysOnTop(boolean value);

    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getNoAutoFocus();
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setNoAutoFocus(boolean value);

    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getAutoFitOnAttach();
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setAutoFitOnAttach(boolean value);

    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getNoCancelOnEscKey();
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setNoCancelOnEscKey(boolean value);

    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty boolean getNoCancelOnOutsideClick();
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setNoCancelOnOutsideClick(boolean value);

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty JavaScriptObject getFitInto();
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setFitInto(JavaScriptObject value);

    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty JavaScriptObject getClosingReason();
    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setClosingReason(JavaScriptObject value);

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty JavaScriptObject getSizingTarget();
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setSizingTarget(JavaScriptObject value);

    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty JavaScriptObject getPositionTarget();
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setPositionTarget(JavaScriptObject value);

    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior VaadinContextMenuOverlay
     */
    @JsProperty void setHorizontalAlign(String value);


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
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void open();

    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void center();

    /**
     * <p>Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void constrain();

    /**
     * <p>Positions and fits the element into the <code>fitInto</code> element.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void fit();

    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void toggle();

    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void close();

    /**
     * <p>Invalidates the cached tabbable nodes. To be called when any of the focusable<br>content changes (e.g. a button is disabled).</p>
     *
     * JavaScript Info:
     * @method invalidateTabbables
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void invalidateTabbables();

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void resetFit();

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
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after<br>the element or the <code>fitInto</code> element has been resized, or if any of the<br>positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.<br>It preserves the scroll position of the sizingTarget.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void refit();

    /**
     * <p>Positions the element according to <code>horizontalAlign, verticalAlign</code>.</p>
     *
     * JavaScript Info:
     * @method position
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void position();

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

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @param {Event=} event  
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void cancel(JavaScriptObject event);

}
