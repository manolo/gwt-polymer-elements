/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-badge project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;paper-badge&gt;</code> is a circular text badge that is displayed on the top right<br>corner of an element, representing a status or a notification. It will badge<br>the anchor element specified in the <code>for</code> attribute, or, if that doesn’t exist,<br>centered to the parent node containing it.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;display:inline-block&quot;&gt;
 *   &lt;span&gt;Inbox&lt;/span&gt;
 *   &lt;paper-badge label=&quot;3&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;paper-button id=&quot;btn&quot;&gt;Status&lt;/button&gt;
 *   &lt;paper-badge for=&quot;btn&quot; label=&quot;♥︎&quot;&gt;b/paper-badge&gt;
 * &lt;/div&gt;
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
 * <td><code>--paper-badge-background</code></td>
 * <td>The background color of the badge</td>
 * <td><code>--accent-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-opacity</code></td>
 * <td>The opacity of the badge</td>
 * <td><code>1.0</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-text-color</code></td>
 * <td>The color of the badge text</td>
 * <td><code>white</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-width</code></td>
 * <td>The width of the badge circle</td>
 * <td><code>22px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-height</code></td>
 * <td>The height of the badge circle</td>
 * <td><code>22px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-left</code></td>
 * <td>Optional spacing added to the left of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-bottom</code></td>
 * <td>TOptional spacing added to the bottom of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge</code></td>
 * <td>Mixin applied to the badge</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperBadgeElement extends HTMLElement {

    public static final String TAG = "paper-badge";
    public static final String SRC = "paper-badge/paper-badge.html";


    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty String getFor();
    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    @JsProperty void setFor(String value);
  
    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty void setLabel(String value);
  
    /**
     * <p>Returns the target element that this badge is anchored to. It is<br>either the element given by the <code>for</code> attribute, or the immediate parent<br>of the badge.</p>
     *
     * JavaScript Info:
     * @method target
     * 
     */
    void target();

    /**
     * <p>Repositions the badge relative to its anchor element. This is called<br>automatically when the badge is attached or an <code>iron-resize</code> event is<br>fired (for exmaple if the window has resized, or your target is a<br>custom element that implements IronResizableBehavior).</p>
     * <p>You should call this in all other cases when the achor’s position<br>might have changed (for example, if it’s visibility has changed, or<br>you’ve manually done a page re-layout).</p>
     *
     * JavaScript Info:
     * @method updatePosition
     * 
     */
    void updatePosition();

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     */
    void assignParentResizable(JavaScriptObject parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     */
    void resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     */
    void stopResizeNotificationsFor(JavaScriptObject target);

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    void detached();

}
