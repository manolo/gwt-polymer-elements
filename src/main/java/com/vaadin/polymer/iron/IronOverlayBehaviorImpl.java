/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-overlay-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

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
public interface IronOverlayBehaviorImpl {

    @JsOverlay public static final String NAME = "Polymer.IronOverlayBehaviorImpl";
    @JsOverlay public static final String SRC = "iron-overlay-behavior/iron-overlay-behavior.html";


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
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior VaadinContextMenuOverlay
     * 
     */
    void open();

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
