/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;paper-dialog&gt;</code> is a dialog with Material Design styling and optional animations when it is<br>opened or closed. It provides styles for a header, content area, and an action area for buttons.<br>You can use the <code>&lt;paper-dialog-scrollable</code> element (in its own repository) if you need a scrolling<br>content area. See <code>Polymer.PaperDialogBehavior</code> for specifics.</p>
 * <p>For example, the following code implements a dialog with a header, scrolling content area and<br>buttons.</p>
 * <pre><code>&lt;paper-dialog&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;paper-dialog-scrollable&gt;
 *     Lorem ipsum...
 *   &lt;/paper-dialog-scrollable&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button dialog-dismiss&gt;Cancel&lt;/paper-button&gt;
 *     &lt;paper-button dialog-confirm&gt;Accept&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>See the docs for <code>Polymer.PaperDialogBehavior</code> for the custom properties available for styling<br>this element.</p>
 * <h3 id="animations">Animations</h3>
 * <p>Set the <code>entry-animation</code> and/or <code>exit-animation</code> attributes to add an animation when the dialog<br>is opened or closed. See the documentation in<br><a href="https://github.com/PolymerElements/neon-animation">PolymerElements/neon-animation</a> for more info.</p>
 * <p>For example:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;components/neon-animation/animations/scale-up-animation.html&quot;&gt;
 * &lt;link rel=&quot;import&quot; href=&quot;components/neon-animation/animations/fade-out-animation.html&quot;&gt;
 * 
 * &lt;paper-dialog entry-animation=&quot;scale-up-animation&quot;
 *               exit-animation=&quot;fade-out-animation&quot;&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;div&gt;Dialog body&lt;/div&gt;
 * &lt;/paper-dialog&gt;
 * 
 * 
 * </code></pre><h3 id="accessibility">Accessibility</h3>
 * <p>See the docs for <code>Polymer.PaperDialogBehavior</code> for accessibility features implemented by this<br>element.</p>
 */
public class PaperDialog extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDialog() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDialog(String html) {
        super(PaperDialogElement.TAG, PaperDialogElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronOverlayClosedEvent event) {
                fireEvent(new IronOverlayClosedEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronOverlayOpenedEvent event) {
                fireEvent(new IronOverlayOpenedEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDialogElement getPolymerElement() {
        return (PaperDialogElement) getElement();
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
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getModal(){
        return getPolymerElement().getModal();
    }
    /**
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setModal(boolean value) {
        getPolymerElement().setModal(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperDialog
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperDialog
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperDialog
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  

  
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @method backdropElement
     * @behavior PaperDialog
     */
    public void backdropElement() {
        getPolymerElement().backdropElement();
    }
  

  
    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @behavior PaperDialog
     */
    public void cancel() {
        getPolymerElement().cancel();
    }
  

  
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getCanceled(){
        return getPolymerElement().getCanceled();
    }
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setCanceled(boolean value) {
        getPolymerElement().setCanceled(value);
    }
   
  

  
    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperDialog
     */
    public void close() {
        getPolymerElement().close();
    }
  

  
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getClosingReason(){
        return getPolymerElement().getClosingReason();
    }
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperDialog
     */
    public void setClosingReason(JavaScriptObject value) {
        getPolymerElement().setClosingReason(value);
    }
   
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @attribute closing-reason
     * @behavior PaperDialog
     */
    public void setClosingReason(String value) {
        getPolymerElement().setAttribute("closing-reason", value);
    }
   
  

  
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoAutoFocus(){
        return getPolymerElement().getNoAutoFocus();
    }
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoAutoFocus(boolean value) {
        getPolymerElement().setNoAutoFocus(value);
    }
   
  

  
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoCancelOnEscKey(){
        return getPolymerElement().getNoCancelOnEscKey();
    }
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoCancelOnEscKey(boolean value) {
        getPolymerElement().setNoCancelOnEscKey(value);
    }
   
  

  
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getNoCancelOnOutsideClick(){
        return getPolymerElement().getNoCancelOnOutsideClick();
    }
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setNoCancelOnOutsideClick(boolean value) {
        getPolymerElement().setNoCancelOnOutsideClick(value);
    }
   
  

  
    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperDialog
     */
    public void open() {
        getPolymerElement().open();
    }
  

  
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getOpened(){
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }
   
  

  
    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperDialog
     */
    public void toggle() {
        getPolymerElement().toggle();
    }
  

  
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getWithBackdrop(){
        return getPolymerElement().getWithBackdrop();
    }
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setWithBackdrop(boolean value) {
        getPolymerElement().setWithBackdrop(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperDialog
     */
    public void registered() {
        getPolymerElement().registered();
    }
  

  
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getAutoFitOnAttach(){
        return getPolymerElement().getAutoFitOnAttach();
    }
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setAutoFitOnAttach(boolean value) {
        getPolymerElement().setAutoFitOnAttach(value);
    }
   
  

  
    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperDialog
     */
    public void center() {
        getPolymerElement().center();
    }
  

  
    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperDialog
     */
    public void constrain() {
        getPolymerElement().constrain();
    }
  

  
    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperDialog
     */
    public void fit() {
        getPolymerElement().fit();
    }
  

  
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    public JavaScriptObject getFitInto(){
        return getPolymerElement().getFitInto();
    }
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    public void setFitInto(JavaScriptObject value) {
        getPolymerElement().setFitInto(value);
    }
   
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @attribute fit-into
     * @behavior PaperDialog
     */
    public void setFitInto(String value) {
        getPolymerElement().setAttribute("fit-into", value);
    }
   
  

  
    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperDialog
     */
    public void refit() {
        getPolymerElement().refit();
    }
  

  
    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperDialog
     */
    public void resetFit() {
        getPolymerElement().resetFit();
    }
  

  
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    public JavaScriptObject getSizingTarget(){
        return getPolymerElement().getSizingTarget();
    }
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    public void setSizingTarget(JavaScriptObject value) {
        getPolymerElement().setSizingTarget(value);
    }
   
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @attribute sizing-target
     * @behavior PaperDialog
     */
    public void setSizingTarget(String value) {
        getPolymerElement().setAttribute("sizing-target", value);
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
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior NeonAnimatedPages
     */
    public void cancelAnimation() {
        getPolymerElement().cancelAnimation();
    }
  

  
    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior NeonAnimatedPages
     */
    public void playAnimation(JavaScriptObject type, JavaScriptObject cookie) {
        getPolymerElement().playAnimation(type, cookie);
    }
  

  
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    public JavaScriptObject getAnimationConfig(){
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior NeonAnimatable
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }
   
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @attribute animation-config
     * @behavior NeonAnimatable
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
    }
   
  

  
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    public String getEntryAnimation(){
        return getPolymerElement().getEntryAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    public void setEntryAnimation(String value) {
        getPolymerElement().setEntryAnimation(value);
    }
   
  

  
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    public String getExitAnimation(){
        return getPolymerElement().getExitAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior NeonAnimatable
     */
    public void setExitAnimation(String value) {
        getPolymerElement().setExitAnimation(value);
    }
   
  

  
    /**
     * <p>An element implementing <code>Polymer.NeonAnimationRunnerBehavior</code> calls this method to configure<br>an animation with an optional type. Elements implementing <code>Polymer.NeonAnimatableBehavior</code><br>should define the property <code>animationConfig</code>, which is either a configuration object<br>or a map of animation type to array of configuration objects.</p>
     *
     * JavaScript Info:
     * @method getAnimationConfig
     * @param {} type  
     * @behavior NeonAnimatable
     */
    public void getAnimationConfig(JavaScriptObject type) {
        getPolymerElement().getAnimationConfig(type);
    }
  


    /**
     * <p>Fired after the <code>iron-overlay</code> closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}
