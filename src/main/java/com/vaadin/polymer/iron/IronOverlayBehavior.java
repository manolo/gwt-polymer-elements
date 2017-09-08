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
 * <p>  Use <code>Polymer.IronOverlayBehavior</code> to implement an element that can be hidden or shown, and displays<br>  on top of other content. It includes an optional backdrop, and can be used to implement a variety<br>  of UI controls including dialogs and drop downs. Multiple overlays may be displayed at once.</p>
 * <p>  See the <a href="https://github.com/PolymerElements/iron-overlay-behavior/blob/master/demo/simple-overlay.html">demo source code</a><br>  for an example.</p>
 * <h3 id="closing-and-canceling">Closing and canceling</h3>
 * <p>  An overlay may be hidden by closing or canceling. The difference between close and cancel is user<br>  intent. Closing generally implies that the user acknowledged the content on the overlay. By default,<br>  it will cancel whenever the user taps outside it or presses the escape key. This behavior is<br>  configurable with the <code>no-cancel-on-esc-key</code> and the <code>no-cancel-on-outside-click</code> properties.<br>  <code>close()</code> should be called explicitly by the implementer when the user interacts with a control<br>  in the overlay element. When the dialog is canceled, the overlay fires an ‘iron-overlay-canceled’<br>  event. Call <code>preventDefault</code> on this event to prevent the overlay from closing.</p>
 * <h3 id="positioning">Positioning</h3>
 * <p>  By default the element is sized and positioned to fit and centered inside the window. You can<br>  position and size it manually using CSS. See <code>Polymer.IronFitBehavior</code>.</p>
 * <h3 id="backdrop">Backdrop</h3>
 * <p>  Set the <code>with-backdrop</code> attribute to display a backdrop behind the overlay. The backdrop is<br>  appended to <code>&lt;body&gt;</code> and is of type <code>&lt;iron-overlay-backdrop&gt;</code>. See its doc page for styling<br>  options.</p>
 * <p>  In addition, <code>with-backdrop</code> will wrap the focus within the content in the light DOM.<br>  Override the <a href="#Polymer.IronOverlayBehavior:property-_focusableNodes"><code>_focusableNodes</code> getter</a><br>  to achieve a different behavior.</p>
 * <h3 id="limitations">Limitations</h3>
 * <p>  The element is styled to appear on top of other content by setting its <code>z-index</code> property. You<br>  must ensure no element has a stacking context with a higher <code>z-index</code> than its parent stacking<br>  context. You should place this element as a child of <code>&lt;body&gt;</code> whenever possible.</p>
 */
@JsType(isNative=true)
public interface IronOverlayBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronOverlayBehavior";
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
