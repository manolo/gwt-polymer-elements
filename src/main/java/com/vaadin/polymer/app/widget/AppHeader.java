/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

import com.vaadin.polymer.app.widget.event.AppHeaderResetLayoutEvent;
import com.vaadin.polymer.app.widget.event.AppHeaderResetLayoutEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>app-header is container element for app-toolbars at the top of the screen that can have scroll<br>effects. By default, an app-header moves away from the viewport when scrolling down and<br>if using <code>reveals</code>, the header slides back when scrolling back up. For example:</p>
 * <pre><code class="lang-html">&lt;app-header reveals&gt;
 *   &lt;app-toolbar&gt;
 *     &lt;div main-title&gt;App name&lt;/div&gt;
 *   &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p>app-header can also condense when scrolling down. To achieve this behavior, the header<br>must have a larger height than the <code>sticky</code> element in the light DOM. For example:</p>
 * <pre><code class="lang-html">&lt;app-header style=&quot;height: 96px;&quot; condenses fixed&gt;
 *   &lt;app-toolbar style=&quot;height: 64px;&quot;&gt;
 *     &lt;div main-title&gt;App name&lt;/div&gt;
 *   &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p>In this case the header is initially <code>96px</code> tall, and it shrinks to <code>64px</code> when scrolling down.<br>That is what is meant by “condensing”.</p>
 * <h3 id="sticky-element">Sticky element</h3>
 * <p>The element that is positioned fixed to top of the header’s <code>scrollTarget</code> when a threshold<br>is reached, similar to <code>position: sticky</code> in CSS. This element <strong>must</strong> be an immediate<br>child of app-header. By default, the <code>sticky</code> element is the first `app-toolbar that<br>is an immediate child of app-header.</p>
 * <pre><code class="lang-html">&lt;app-header condenses&gt;
 *   &lt;app-toolbar&gt; Sticky element &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <h4 id="customizing-the-sticky-element">Customizing the sticky element</h4>
 * <pre><code class="lang-html">&lt;app-header condenses&gt;
 *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
 *   &lt;app-toolbar sticky&gt; Sticky element &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <h3 id="scroll-target">Scroll target</h3>
 * <p>The app-header’s <code>scrollTarget</code> property allows to customize the scrollable element to which<br>the header responds when the user scrolls. By default, app-header uses the document as<br>the scroll target, but you can customize this property by setting the id of the element, e.g.</p>
 * <pre><code class="lang-html">&lt;div id=&quot;scrollingRegion&quot; style=&quot;overflow-y: auto;&quot;&gt;
 *   &lt;app-header scroll-target=&quot;scrollingRegion&quot;&gt;
 *   &lt;/app-header&gt;
 * &lt;/div&gt;
 * </code></pre>
 * <p>In this case, the <code>scrollTarget</code> property points to the outer div element. Alternatively,<br>you can set this property programmatically:</p>
 * <pre><code class="lang-js">appHeader.scrollTarget = document.querySelector(&quot;#scrollingRegion&quot;);
 * </code></pre>
 * <h2 id="backgrounds">Backgrounds</h2>
 * <p>app-header has two background layers that can be used for styling when the header is condensed<br>or when the scrollable element is scrolled to the top.</p>
 * <h2 id="scroll-effects">Scroll effects</h2>
 * <p>Scroll effects are <em>optional</em> visual effects applied in app-header based on scroll position. For example,<br>The <a href="https://www.google.com/design/spec/patterns/scrolling-techniques.html">Material Design scrolling techniques</a><br>recommends effects that can be installed via the <code>effects</code> property. e.g.</p>
 * <pre><code class="lang-html">&lt;app-header effects=&quot;waterfall&quot;&gt;
 *   &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <h4 id="importing-the-effects">Importing the effects</h4>
 * <p>To use the scroll effects, you must explicitly import them in addition to <code>app-header</code>:</p>
 * <pre><code class="lang-html">&lt;link rel=&quot;import&quot; href=&quot;/bower_components/app-layout/app-scroll-effects/app-scroll-effects.html&quot;&gt;
 * </code></pre>
 * <h4 id="list-of-effects">List of effects</h4>
 * <p><strong>blend-background</strong><br>Fades in/out two background elements by applying CSS opacity based on scroll position.<br>You can use this effect to smoothly change the background color or image of the header.<br>For example, using the mixin <code>--app-header-background-rear-layer</code> lets you assign a different<br>background when the header is condensed:</p>
 * <pre><code class="lang-css">app-header {
 *   background-color: red;
 *   --app-header-background-rear-layer: {
 *     /* The header is blue when condensed * /
 *     background-color: blue;
 *   };
 * }
 * </code></pre>
 * <p><strong>fade-background</strong><br>Upon scrolling past a threshold, this effect will trigger an opacity transition to<br>fade in/out the backgrounds. Compared to the <code>blend-background</code> effect,<br>this effect doesn’t interpolate the opacity based on scroll position.</p>
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
 * <p><strong>resize-title</strong><br>Progressively interpolates the size of the title from the element with the <code>main-title</code> attribute<br>to the element with the <code>condensed-title</code> attribute as the header condenses. For example:</p>
 * <pre><code class="lang-html">&lt;app-header condenses reveals effects=&quot;resize-title&quot;&gt;
 *   &lt;app-toolbar&gt;
 *       &lt;h4 condensed-title&gt;App name&lt;/h4&gt;
 *   &lt;/app-toolbar&gt;
 *   &lt;app-toolbar&gt;
 *       &lt;h1 main-title&gt;App name&lt;/h1&gt;
 *   &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p><strong>resize-snapped-title</strong><br>Upon scrolling past a threshold, this effect fades in/out the titles using opacity transitions.<br>Similarly to <code>resize-title</code>, the <code>main-title</code> and <code>condensed-title</code> elements must be placed in the<br>light DOM.</p>
 * <p><strong>waterfall</strong><br>Toggles the shadow property in app-header to create a sense of depth (as recommended in the<br>MD spec) between the header and the underneath content. You can change the shadow by<br>customizing the <code>--app-header-shadow</code> mixin. For example:</p>
 * <pre><code class="lang-css">app-header {
 *   --app-header-shadow: {
 *     box-shadow: inset 0px 5px 2px -3px rgba(0, 0, 0, 0.2);
 *   };
 * }
 * </code></pre>
 * <pre><code class="lang-html">&lt;app-header condenses reveals effects=&quot;waterfall&quot;&gt;
 *   &lt;app-toolbar&gt;
 *       &lt;h1 main-title&gt;App name&lt;/h1&gt;
 *   &lt;/app-toolbar&gt;
 * &lt;/app-header&gt;
 * </code></pre>
 * <p><strong>material</strong><br>Installs the waterfall, resize-title, blend-background and parallax-background effects.</p>
 * <h3 id="content-attributes">Content attributes</h3>
 * <table>
 * <thead>
 * <tr>
 * <th>Attribute</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>sticky</code></td>
 * <td>Element that remains at the top when the header condenses.</td>
 * <td>The first app-toolbar in the light DOM.</td>
 * </tr>
 * </tbody>
 * </table>
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
 * <td><code>--app-header-background-front-layer</code></td>
 * <td>Applies to the front layer of the background.</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--app-header-background-rear-layer</code></td>
 * <td>Applies to the rear layer of the background.</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--app-header-shadow</code></td>
 * <td>Applies to the shadow.</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class AppHeader extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppHeader() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppHeader(String html) {
        super(AppHeaderElement.TAG, AppHeaderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppHeaderElement getPolymerElement() {
        return (AppHeaderElement) getElement();
    }


    /**
     * <p>If true, the header will automatically collapse when scrolling down.<br>That is, the <code>sticky</code> element remains visible when the header is fully condensed<br>whereas the rest of the elements will collapse below <code>sticky</code> element.</p>
     * <p>By default, the <code>sticky</code> element is the first toolbar in the light DOM:</p>
     * <pre><code class="lang-html">&lt;app-header condenses&gt;
     *   &lt;app-toolbar&gt;This toolbar remains on top&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     * &lt;/app-header&gt;
     * </code></pre>
     * <p>Additionally, you can specify which toolbar or element remains visible in condensed mode<br>by adding the <code>sticky</code> attribute to that element. For example: if we want the last<br>toolbar to remain visible, we can add the <code>sticky</code> attribute to it.</p>
     * <pre><code class="lang-html">&lt;app-header condenses&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar sticky&gt;This toolbar remains on top&lt;/app-toolbar&gt;
     * &lt;/app-header&gt;
     * </code></pre>
     * <p>Note the <code>sticky</code> element must be a direct child of <code>app-header</code>.</p>
     *
     * JavaScript Info:
     * @property condenses
     * @type Boolean
     * 
     */
    public boolean getCondenses() {
        return getPolymerElement().getCondenses();
    }
    /**
     * <p>If true, the header will automatically collapse when scrolling down.<br>That is, the <code>sticky</code> element remains visible when the header is fully condensed<br>whereas the rest of the elements will collapse below <code>sticky</code> element.</p>
     * <p>By default, the <code>sticky</code> element is the first toolbar in the light DOM:</p>
     * <pre><code class="lang-html">&lt;app-header condenses&gt;
     *   &lt;app-toolbar&gt;This toolbar remains on top&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     * &lt;/app-header&gt;
     * </code></pre>
     * <p>Additionally, you can specify which toolbar or element remains visible in condensed mode<br>by adding the <code>sticky</code> attribute to that element. For example: if we want the last<br>toolbar to remain visible, we can add the <code>sticky</code> attribute to it.</p>
     * <pre><code class="lang-html">&lt;app-header condenses&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar&gt;&lt;/app-toolbar&gt;
     *   &lt;app-toolbar sticky&gt;This toolbar remains on top&lt;/app-toolbar&gt;
     * &lt;/app-header&gt;
     * </code></pre>
     * <p>Note the <code>sticky</code> element must be a direct child of <code>app-header</code>.</p>
     *
     * JavaScript Info:
     * @property condenses
     * @type Boolean
     * 
     */
    public void setCondenses(boolean value) {
        getPolymerElement().setCondenses(value);
    }

    /**
     * <p>Slides back the header when scrolling back up.</p>
     *
     * JavaScript Info:
     * @property reveals
     * @type Boolean
     * 
     */
    public boolean getReveals() {
        return getPolymerElement().getReveals();
    }
    /**
     * <p>Slides back the header when scrolling back up.</p>
     *
     * JavaScript Info:
     * @property reveals
     * @type Boolean
     * 
     */
    public void setReveals(boolean value) {
        getPolymerElement().setReveals(value);
    }

    /**
     * <p>Displays a shadow below the header.</p>
     *
     * JavaScript Info:
     * @property shadow
     * @type Boolean
     * 
     */
    public boolean getShadow() {
        return getPolymerElement().getShadow();
    }
    /**
     * <p>Displays a shadow below the header.</p>
     *
     * JavaScript Info:
     * @property shadow
     * @type Boolean
     * 
     */
    public void setShadow(boolean value) {
        getPolymerElement().setShadow(value);
    }

    /**
     * <p>Disables CSS transitions and scroll effects on the element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior AppBox
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Disables CSS transitions and scroll effects on the element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior AppBox
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Mantains the header fixed at the top so it never moves away.</p>
     *
     * JavaScript Info:
     * @property fixed
     * @type Boolean
     * 
     */
    public boolean getFixed() {
        return getPolymerElement().getFixed();
    }
    /**
     * <p>Mantains the header fixed at the top so it never moves away.</p>
     *
     * JavaScript Info:
     * @property fixed
     * @type Boolean
     * 
     */
    public void setFixed(boolean value) {
        getPolymerElement().setFixed(value);
    }

    /**
     * <p>Allows to set a <code>scrollTop</code> threshold. When greater than 0, <code>thresholdTriggered</code><br>is true only when the scroll target’s <code>scrollTop</code> has reached this value.</p>
     * <p>For example, if <code>threshold = 100</code>, <code>thresholdTriggered</code> is true when the <code>scrollTop</code><br>is at least <code>100</code>.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * @behavior AppBox
     */
    public double getThreshold() {
        return getPolymerElement().getThreshold();
    }
    /**
     * <p>Allows to set a <code>scrollTop</code> threshold. When greater than 0, <code>thresholdTriggered</code><br>is true only when the scroll target’s <code>scrollTop</code> has reached this value.</p>
     * <p>For example, if <code>threshold = 100</code>, <code>thresholdTriggered</code> is true when the <code>scrollTop</code><br>is at least <code>100</code>.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * @behavior AppBox
     */
    public void setThreshold(double value) {
        getPolymerElement().setThreshold(value);
    }

    /**
     * <p>True if the <code>scrollTop</code> threshold (set in <code>scrollTopThreshold</code>) has<br>been reached.</p>
     *
     * JavaScript Info:
     * @property thresholdTriggered
     * @type Boolean
     * @behavior AppBox
     */
    public boolean getThresholdTriggered() {
        return getPolymerElement().getThresholdTriggered();
    }
    /**
     * <p>True if the <code>scrollTop</code> threshold (set in <code>scrollTopThreshold</code>) has<br>been reached.</p>
     *
     * JavaScript Info:
     * @property thresholdTriggered
     * @type Boolean
     * @behavior AppBox
     */
    public void setThresholdTriggered(boolean value) {
        getPolymerElement().setThresholdTriggered(value);
    }

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
    public Element getScrollTarget() {
        return getPolymerElement().getScrollTarget();
    }
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
    public void setScrollTarget(Element value) {
        getPolymerElement().setScrollTarget(value);
    }

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
    public JavaScriptObject getEffectsConfig() {
        return getPolymerElement().getEffectsConfig();
    }
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
    public void setEffectsConfig(JavaScriptObject value) {
        getPolymerElement().setEffectsConfig(value);
    }

    /**
     * <p>A space-separated list of the effects names that will be triggered when the user scrolls.<br>e.g. <code>waterfall parallax-background</code> installs the <code>waterfall</code> and <code>parallax-background</code>.</p>
     *
     * JavaScript Info:
     * @property effects
     * @type String
     * @behavior AppBox
     */
    public String getEffects() {
        return getPolymerElement().getEffects();
    }
    /**
     * <p>A space-separated list of the effects names that will be triggered when the user scrolls.<br>e.g. <code>waterfall parallax-background</code> installs the <code>waterfall</code> and <code>parallax-background</code>.</p>
     *
     * JavaScript Info:
     * @property effects
     * @type String
     * @behavior AppBox
     */
    public void setEffects(String value) {
        getPolymerElement().setEffects(value);
    }


    // Needed in UIBinder
    /**
     * <p>Allows to set a <code>scrollTop</code> threshold. When greater than 0, <code>thresholdTriggered</code><br>is true only when the scroll target’s <code>scrollTop</code> has reached this value.</p>
     * <p>For example, if <code>threshold = 100</code>, <code>thresholdTriggered</code> is true when the <code>scrollTop</code><br>is at least <code>100</code>.</p>
     *
     * JavaScript Info:
     * @attribute threshold
     * @behavior AppBox
     */
    public void setThreshold(String value) {
        Polymer.property(this.getPolymerElement(), "threshold", value);
    }

    // Needed in UIBinder
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
     * @attribute scroll-target
     * @behavior IronScrollThreshold
     */
    public void setScrollTarget(String value) {
        Polymer.property(this.getPolymerElement(), "scrollTarget", value);
    }

    // Needed in UIBinder
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
     * @attribute effects-config
     * @behavior AppBox
     */
    public void setEffectsConfig(String value) {
        Polymer.property(this.getPolymerElement(), "effectsConfig", value);
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
     * <p>Returns true if there’s content below the current element.</p>
     *
     * JavaScript Info:
     * @method isContentBelow
     * 
     * @return {boolean}
     */
    public boolean isContentBelow() {
        return getPolymerElement().isContentBelow();
    }

    /**
     * <p>Resets the layout. If you changed the size of app-header via CSS<br>you can notify the changes by either firing the <code>iron-resize</code> event<br>or calling <code>resetLayout</code> directly.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    public void resetLayout() {
        getPolymerElement().resetLayout();
    }

    /**
     * <p>Returns an object containing the progress value of the scroll effects<br>and the top position of the header.</p>
     *
     * JavaScript Info:
     * @method getScrollState
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject getScrollState() {
        return getPolymerElement().getScrollState();
    }

    /**
     * <p>Returns true if the current header will condense based on the size of the header<br>and the <code>consenses</code> property.</p>
     *
     * JavaScript Info:
     * @method willCondense
     * 
     * @return {boolean}
     */
    public boolean willCondense() {
        return getPolymerElement().willCondense();
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
     * <p>Returns true if the current element is on the screen.<br>That is, visible in the current viewport.</p>
     *
     * JavaScript Info:
     * @method isOnScreen
     * 
     * @return {boolean}
     */
    public boolean isOnScreen() {
        return getPolymerElement().isOnScreen();
    }

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
    public void scroll(double left, double top) {
        getPolymerElement().scroll(left, top);
    }

    /**
     * <p>Enables or disables the scroll event listener.</p>
     *
     * JavaScript Info:
     * @method toggleScrollListener
     * @param {boolean} yes  
     * @behavior IronScrollThreshold
     * 
     */
    public void toggleScrollListener(boolean yes) {
        getPolymerElement().toggleScrollListener(yes);
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
     * <p>Creates an effect object from an effect’s name that can be used to run<br>effects programmatically.</p>
     *
     * JavaScript Info:
     * @method createEffect
     * @param {string} effectName  
     * @param {Object=} effectConfig  
     * @behavior AppBox
     * @return {JavaScriptObject}
     */
    public JavaScriptObject createEffect(String effectName, JavaScriptObject effectConfig) {
        return getPolymerElement().createEffect(effectName, effectConfig);
    }


    /**
     * <p>Fires when the layout of <code>app-header</code> changed.</p>
     *
     * JavaScript Info:
     * @event app-header-reset-layout
     */
    public HandlerRegistration addAppHeaderResetLayoutHandler(AppHeaderResetLayoutEventHandler handler) {
        return addDomHandler(handler, AppHeaderResetLayoutEvent.TYPE);
    }

}
