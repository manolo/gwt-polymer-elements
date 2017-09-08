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
 * <p><code>Polymer.AppScrollEffectsBehavior</code> provides an interface that allows an element to use scrolls effects.</p>
 * <h3 id="importing-the-app-layout-effects">Importing the app-layout effects</h3>
 * <p>app-layout provides a set of scroll effects that can be used by explicitly importing<br><code>app-scroll-effects.html</code>:</p>
 * <pre><code class="lang-html">&lt;link rel=&quot;import&quot; href=&quot;/bower_components/app-layout/app-scroll-effects/app-scroll-effects.html&quot;&gt;
 * </code></pre>
 * <p>The scroll effects can also be used by individually importing<br><code>app-layout/app-scroll-effects/effects/[effectName].html</code>. For example:</p>
 * <pre><code class="lang-html"> &lt;link rel=&quot;import&quot; href=&quot;/bower_components/app-layout/app-scroll-effects/effects/waterfall.html&quot;&gt;
 * </code></pre>
 * <h3 id="consuming-effects">Consuming effects</h3>
 * <p>Effects can be consumed via the <code>effects</code> property. For example:</p>
 * <pre><code class="lang-html">&lt;app-header effects=&quot;waterfall&quot;&gt;&lt;/app-header&gt;
 * </code></pre>
 * <h3 id="creating-scroll-effects">Creating scroll effects</h3>
 * <p>You may want to create a custom scroll effect if you need to modify the CSS of an element<br>based on the scroll position.</p>
 * <p>A scroll effect definition is an object with <code>setUp()</code>, <code>tearDown()</code> and <code>run()</code> functions.</p>
 * <p>To register the effect, you can use <code>Polymer.AppLayout.registerEffect(effectName, effectDef)</code><br>For example, let’s define an effect that resizes the header’s logo:</p>
 * <pre><code class="lang-js">Polymer.AppLayout.registerEffect(&#39;resizable-logo&#39;, {
 *   setUp: function(config) {
 *     // the effect&#39;s config is passed to the setUp.
 *     this._fxResizeLogo = { logo: Polymer.dom(this).querySelector(&#39;[logo]&#39;) };
 *   },
 * 
 *   run: function(progress) {
 *      // the progress of the effect
 *      this.transform(&#39;scale3d(&#39; + progress + &#39;, &#39;+ progress +&#39;, 1)&#39;,  this._fxResizeLogo.logo);
 *   },
 * 
 *   tearDown: function() {
 *      // clean up and reset of states
 *      delete this._fxResizeLogo;
 *   }
 * });
 * </code></pre>
 * <p>Now, you can consume the effect:</p>
 * <pre><code class="lang-html">&lt;app-header id=&quot;appHeader&quot; effects=&quot;resizable-logo&quot;&gt;
 *   &lt;img logo src=&quot;logo.svg&quot;&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <h3 id="imperative-api">Imperative API</h3>
 * <pre><code class="lang-js">var logoEffect = appHeader.createEffect(&#39;resizable-logo&#39;, effectConfig);
 * // run the effect: logoEffect.run(progress);
 * // tear down the effect: logoEffect.tearDown();
 * </code></pre>
 * <h3 id="configuring-effects">Configuring effects</h3>
 * <p>For effects installed via the <code>effects</code> property, their configuration can be set<br>via the <code>effectsConfig</code> property. For example:</p>
 * <pre><code class="lang-html">&lt;app-header effects=&quot;waterfall&quot;
 *   effects-config=&#39;{&quot;waterfall&quot;: {&quot;startsAt&quot;: 0, &quot;endsAt&quot;: 0.5}}&#39;&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p>All effects have a <code>startsAt</code> and <code>endsAt</code> config property. They specify at what<br>point the effect should start and end. This value goes from 0 to 1 inclusive.</p>
 */
@JsType(isNative=true)
public interface AppScrollEffectsBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppScrollEffectsBehavior";
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

}
