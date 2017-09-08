/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
@JsType(isNative=true)
public interface AppDrawerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-drawer";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";


    /**
     * <p>The transition duration of the drawer in milliseconds.</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    @JsProperty double getTransitionDuration();
    /**
     * <p>The transition duration of the drawer in milliseconds.</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    @JsProperty void setTransitionDuration(double value);

    /**
     * <p>Trap keyboard focus when the drawer is opened and not persistent.</p>
     *
     * JavaScript Info:
     * @property noFocusTrap
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoFocusTrap();
    /**
     * <p>Trap keyboard focus when the drawer is opened and not persistent.</p>
     *
     * JavaScript Info:
     * @property noFocusTrap
     * @type Boolean
     * 
     */
    @JsProperty void setNoFocusTrap(boolean value);

    /**
     * <p>Disables swiping on the drawer.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisableSwipe();
    /**
     * <p>Disables swiping on the drawer.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    @JsProperty void setDisableSwipe(boolean value);

    /**
     * <p>Create an area at the edge of the screen to swipe open the drawer.</p>
     *
     * JavaScript Info:
     * @property swipeOpen
     * @type Boolean
     * 
     */
    @JsProperty boolean getSwipeOpen();
    /**
     * <p>Create an area at the edge of the screen to swipe open the drawer.</p>
     *
     * JavaScript Info:
     * @property swipeOpen
     * @type Boolean
     * 
     */
    @JsProperty void setSwipeOpen(boolean value);

    /**
     * <p>The opened state of the drawer.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>The opened state of the drawer.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>The drawer does not have a scrim and cannot be swiped close.</p>
     *
     * JavaScript Info:
     * @property persistent
     * @type Boolean
     * 
     */
    @JsProperty boolean getPersistent();
    /**
     * <p>The drawer does not have a scrim and cannot be swiped close.</p>
     *
     * JavaScript Info:
     * @property persistent
     * @type Boolean
     * 
     */
    @JsProperty void setPersistent(boolean value);

    /**
     * <p>The computed, read-only position of the drawer on the screen (‘left’ or ‘right’).</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty String getPosition();
    /**
     * <p>The computed, read-only position of the drawer on the screen (‘left’ or ‘right’).</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty void setPosition(String value);

    /**
     * <p>The alignment of the drawer on the screen (‘left’, ‘right’, ‘start’ or ‘end’).<br>‘start’ computes to left and ‘end’ to right in LTR layout and vice versa in RTL<br>layout.</p>
     *
     * JavaScript Info:
     * @property align
     * @type String
     * 
     */
    @JsProperty String getAlign();
    /**
     * <p>The alignment of the drawer on the screen (‘left’, ‘right’, ‘start’ or ‘end’).<br>‘start’ computes to left and ‘end’ to right in LTR layout and vice versa in RTL<br>layout.</p>
     *
     * JavaScript Info:
     * @property align
     * @type String
     * 
     */
    @JsProperty void setAlign(String value);


    /**
     * <p>Opens the drawer.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

    /**
     * <p>Closes the drawer.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

    /**
     * <p>Resets the layout. The event fired is used by app-drawer-layout to position the<br>content.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    void resetLayout();

    /**
     * <p>Toggles the drawer open and close.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    void toggle();

    /**
     * <p>Gets the width of the drawer.</p>
     *
     * JavaScript Info:
     * @method getWidth
     * 
     * @return {double}
     */
    double getWidth();

}
