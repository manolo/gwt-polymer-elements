/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-resizable-behavior project by The Polymer Authors
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
 * <p><code>IronResizableBehavior</code> is a behavior that can be used in Polymer elements to<br>coordinate the flow of resize events between “resizers” (elements that control the<br>size or hidden state of their children) and “resizables” (elements that need to be<br>notified when they are resized or un-hidden by their parents in order to take<br>action on their new measurements).<br>Elements that perform measurement should add the <code>IronResizableBehavior</code> behavior to<br>their element definition and listen for the <code>iron-resize</code> event on themselves.<br>This event will be fired when they become showing after having been hidden,<br>when they are resized explicitly by another resizable, or when the window has been<br>resized.<br>Note, the <code>iron-resize</code> event is non-bubbling.</p>
 */
@JsType(isNative=true)
public interface IronResizableBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronResizableBehavior";
    @JsOverlay public static final String SRC = "iron-resizable-behavior/iron-resizable-behavior.html";



    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void notifyResize();

}
