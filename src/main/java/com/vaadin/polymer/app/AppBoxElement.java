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
 * <p>app-box is a container element that can have scroll effects - visual effects based on<br>scroll position. For example, the parallax effect can be used to move an image at a slower<br>rate than the foreground.</p>
 * <pre><code class="lang-html">&lt;app-box style=&quot;height: 100px;&quot; effects=&quot;parallax-background&quot;&gt;
 *   &lt;img background src=&quot;picture.png&quot; style=&quot;width: 100%; height: 600px;&quot;&gt;
 * &lt;/app-box&gt;
 * </code></pre>
 * <p>Notice the <code>background</code> attribute in the <code>img</code> element; this attribute specifies that that<br>image is used as the background. By adding the background to the light dom, you can compose<br>backgrounds that can change dynamically. Alternatively, the mixin <code>--app-box-background-front-layer</code><br>allows to style the background. For example:</p>
 * <pre><code class="lang-css">  .parallaxAppBox {
 *     --app-box-background-front-layer: {
 *       background-image: url(picture.png);
 *     };
 *   }
 * </code></pre>
 * <p>Finally, app-box can have content inside. For example:</p>
 * <pre><code class="lang-html">&lt;app-box effects=&quot;parallax-background&quot;&gt;
 *   &lt;h2&gt;Sub title&lt;/h2&gt;
 * &lt;/app-box&gt;
 * </code></pre>
 * <h4 id="importing-the-effects">Importing the effects</h4>
 * <p>To use the scroll effects, you must explicitly import them in addition to <code>app-box</code>:</p>
 * <pre><code class="lang-html">&lt;link rel=&quot;import&quot; href=&quot;/bower_components/app-layout/app-scroll-effects/app-scroll-effects.html&quot;&gt;
 * </code></pre>
 * <h4 id="list-of-effects">List of effects</h4>
 * <p><strong>parallax-background</strong><br>A simple parallax effect that vertically translates the backgrounds based on a fraction<br>of the scroll position. For example:</p>
 * <pre><code class="lang-css">app-header {
 *   --app-header-background-front-layer: {
 *     background-image: url(...);
 *   };
 * }
 * </code></pre>
 * <pre><code class="lang-html">&lt;app-header style=&quot;height: 300px;&quot; effects=&quot;parallax-background&quot;&gt;
 *   &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p>The fraction determines how far the background moves relative to the scroll position.<br>This value can be assigned via the <code>scalar</code> config value and it is typically a value<br>between 0 and 1 inclusive. If <code>scalar=0</code>, the background doesn’t move away from the header.</p>
 * <h2 id="styling">Styling</h2>
 * <table>
 * <thead>
 * <tr>
 * <th>Mixin</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--app-box-background-front-layer</code></td>
 * <td>Applies to the front layer of the background</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface AppBoxElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-box";
    @JsOverlay public static final String SRC = "app-layout/app-layout.html";


    /**
     * <p>Disables CSS transitions and scroll effects on the element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior AppBox
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Disables CSS transitions and scroll effects on the element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior AppBox
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>Allows to set a <code>scrollTop</code> threshold. When greater than 0, <code>thresholdTriggered</code><br>is true only when the scroll target’s <code>scrollTop</code> has reached this value.</p>
     * <p>For example, if <code>threshold = 100</code>, <code>thresholdTriggered</code> is true when the <code>scrollTop</code><br>is at least <code>100</code>.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * @behavior AppBox
     */
    @JsProperty double getThreshold();
    /**
     * <p>Allows to set a <code>scrollTop</code> threshold. When greater than 0, <code>thresholdTriggered</code><br>is true only when the scroll target’s <code>scrollTop</code> has reached this value.</p>
     * <p>For example, if <code>threshold = 100</code>, <code>thresholdTriggered</code> is true when the <code>scrollTop</code><br>is at least <code>100</code>.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * @behavior AppBox
     */
    @JsProperty void setThreshold(double value);

    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    @JsProperty Element getScrollTarget();
    /**
     * <p>Specifies the element that will handle the scroll event<br>on the behalf of the current element. This is typically a reference to an element,<br>but there are a few more posibilities:</p>
     * <h3 id="elements-id">Elements id</h3>
     * <pre><code class="lang-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
     *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
     *    &lt;!-- Content--&gt;
     *  &lt;/x-element&gt;
     * &lt;/div&gt;
     * </code></pre>
     * <p>In this case, the <code>scrollTarget</code> will point to the outer div element.</p>
     * <h3 id="document-scrolling">Document scrolling</h3>
     * <p>For document scrolling, you can use the reserved word <code>document</code>:</p>
     * <pre><code class="lang-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
     *   &lt;!-- Content --&gt;
     * &lt;/x-element&gt;
     * </code></pre>
     * <h3 id="elements-reference">Elements reference</h3>
     * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&#39;#scrollable-element&#39;);
     * </code></pre>
     *
     * JavaScript Info:
     * @property scrollTarget
     * @type Element
     * @behavior IronScrollThreshold
     */
    @JsProperty void setScrollTarget(Element value);

    /**
     * <p>An object that configurates the effects installed via the <code>effects</code> property. e.g.</p>
     * <pre><code class="lang-js"> element.effectsConfig = {
     *   &quot;blend-background&quot;: {
     *     &quot;startsAt&quot;: 0.5
     *   }
     * };
     * </code></pre>
     * <p>Every effect has at least two config properties: <code>startsAt</code> and <code>endsAt</code>.<br>These properties indicate when the event should start and end respectively<br>and relative to the overall element progress. So for example, if <code>blend-background</code><br>starts at <code>0.5</code>, the effect will only start once the current element reaches 0.5<br>of its progress. In this context, the progress is a value in the range of <code>[0, 1]</code><br>that indicates where this element is on the screen relative to the viewport.</p>
     *
     * JavaScript Info:
     * @property effectsConfig
     * @type Object
     * @behavior AppBox
     */
    @JsProperty JavaScriptObject getEffectsConfig();
    /**
     * <p>An object that configurates the effects installed via the <code>effects</code> property. e.g.</p>
     * <pre><code class="lang-js"> element.effectsConfig = {
     *   &quot;blend-background&quot;: {
     *     &quot;startsAt&quot;: 0.5
     *   }
     * };
     * </code></pre>
     * <p>Every effect has at least two config properties: <code>startsAt</code> and <code>endsAt</code>.<br>These properties indicate when the event should start and end respectively<br>and relative to the overall element progress. So for example, if <code>blend-background</code><br>starts at <code>0.5</code>, the effect will only start once the current element reaches 0.5<br>of its progress. In this context, the progress is a value in the range of <code>[0, 1]</code><br>that indicates where this element is on the screen relative to the viewport.</p>
     *
     * JavaScript Info:
     * @property effectsConfig
     * @type Object
     * @behavior AppBox
     */
    @JsProperty void setEffectsConfig(JavaScriptObject value);

    /**
     * <p>True if the <code>scrollTop</code> threshold (set in <code>scrollTopThreshold</code>) has<br>been reached.</p>
     *
     * JavaScript Info:
     * @property thresholdTriggered
     * @type Boolean
     * @behavior AppBox
     */
    @JsProperty boolean getThresholdTriggered();
    /**
     * <p>True if the <code>scrollTop</code> threshold (set in <code>scrollTopThreshold</code>) has<br>been reached.</p>
     *
     * JavaScript Info:
     * @property thresholdTriggered
     * @type Boolean
     * @behavior AppBox
     */
    @JsProperty void setThresholdTriggered(boolean value);

    /**
     * <p>A space-separated list of the effects names that will be triggered when the user scrolls.<br>e.g. <code>waterfall parallax-background</code> installs the <code>waterfall</code> and <code>parallax-background</code>.</p>
     *
     * JavaScript Info:
     * @property effects
     * @type String
     * @behavior AppBox
     */
    @JsProperty String getEffects();
    /**
     * <p>A space-separated list of the effects names that will be triggered when the user scrolls.<br>e.g. <code>waterfall parallax-background</code> installs the <code>waterfall</code> and <code>parallax-background</code>.</p>
     *
     * JavaScript Info:
     * @property effects
     * @type String
     * @behavior AppBox
     */
    @JsProperty void setEffects(String value);


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
     * <p>Creates an effect object from an effect’s name that can be used to run<br>effects programmatically.</p>
     *
     * JavaScript Info:
     * @method createEffect
     * @param {string} effectName  
     * @param {Object=} effectConfig  
     * @behavior AppBox
     * @return {JavaScriptObject}
     */
    JavaScriptObject createEffect(String effectName, JavaScriptObject effectConfig);

    /**
     * <p>Returns an object containing the progress value of the scroll effects.</p>
     *
     * JavaScript Info:
     * @method getScrollState
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject getScrollState();

    /**
     * <p>Returns true if there’s content below the current element. This method<br>should be overridden by the consumer of this behavior.</p>
     *
     * JavaScript Info:
     * @method isContentBelow
     * @behavior AppBox
     * @return {boolean}
     */
    boolean isContentBelow();

    /**
     * <p>Returns true if the current element is on the screen.<br>That is, visible in the current viewport. This method should be<br>overridden by the consumer of this behavior.</p>
     *
     * JavaScript Info:
     * @method isOnScreen
     * @behavior AppBox
     * @return {boolean}
     */
    boolean isOnScreen();

    /**
     * <p>Resets the layout. This method is automatically called when the element is attached to the DOM.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    void resetLayout();

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
     * <p>Scrolls the content to a particular place.</p>
     *
     * JavaScript Info:
     * @method scroll
     * @param {number} left  
     * @param {number} top  
     * @behavior IronScrollThreshold
     * 
     */
    void scroll(double left, double top);

    /**
     * <p>Enables or disables the scroll event listener.</p>
     *
     * JavaScript Info:
     * @method toggleScrollListener
     * @param {boolean} yes  
     * @behavior IronScrollThreshold
     * 
     */
    void toggleScrollListener(boolean yes);

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

}
