/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-component-page project by The Polymer Authors
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
 * <p>Loads Polymer element and behavior documentation using<br><a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a> and renders a complete<br>documentation page including demos (if available).</p>
 */
@JsType(isNative=true)
public interface IronComponentPageElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-component-page";
    @JsOverlay public static final String SRC = "iron-component-page/iron-component-page.html";


    /**
     * <p>Toggle flag to be used when this element is being displayed in the<br>Polymer Elements catalog.</p>
     *
     * JavaScript Info:
     * @property catalog
     * @type Boolean
     * 
     */
    @JsProperty boolean getCatalog();
    /**
     * <p>Toggle flag to be used when this element is being displayed in the<br>Polymer Elements catalog.</p>
     *
     * JavaScript Info:
     * @property catalog
     * @type Boolean
     * 
     */
    @JsProperty void setCatalog(boolean value);

    /**
     * <p>The Hydrolysis behavior descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docBehaviors
     * @type Array
     * 
     */
    @JsProperty JsArray getDocBehaviors();
    /**
     * <p>The Hydrolysis behavior descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docBehaviors
     * @type Array
     * 
     */
    @JsProperty void setDocBehaviors(JsArray value);

    /**
     * <p>Demos for the currently selected element.</p>
     *
     * JavaScript Info:
     * @property docDemos
     * @type Array
     * 
     */
    @JsProperty JsArray getDocDemos();
    /**
     * <p>Demos for the currently selected element.</p>
     *
     * JavaScript Info:
     * @property docDemos
     * @type Array
     * 
     */
    @JsProperty void setDocDemos(JsArray value);

    /**
     * <p>The Hydrolysis element descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docElements
     * @type Array
     * 
     */
    @JsProperty JsArray getDocElements();
    /**
     * <p>The Hydrolysis element descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docElements
     * @type Array
     * 
     */
    @JsProperty void setDocElements(JsArray value);

    /**
     * <p>Whether <em>all</em> dependencies should be loaded and documented.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    @JsProperty boolean getTransitive();
    /**
     * <p>Whether <em>all</em> dependencies should be loaded and documented.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    @JsProperty void setTransitive(boolean value);

    /**
     * <p>The scroll mode for the page. For details about the modes,<br>see the mode property in paper-header-panel.</p>
     *
     * JavaScript Info:
     * @property scrollMode
     * @type String
     * 
     */
    @JsProperty String getScrollMode();
    /**
     * <p>The scroll mode for the page. For details about the modes,<br>see the mode property in paper-header-panel.</p>
     *
     * JavaScript Info:
     * @property scrollMode
     * @type String
     * 
     */
    @JsProperty void setScrollMode(String value);

    /**
     * <p>The URL to an import that declares (or transitively imports) the<br>elements that you wish to see documented.</p>
     * <p>If the URL is relative, it will be resolved relative to the master<br>document.</p>
     * <p>If a <code>src</code> URL is not specified, it will resolve the name of the<br>directory containing this element, followed by <code>dirname.html</code>. For<br>example:</p>
     * <p><code>awesome-sauce/index.html</code>:</p>
     * <pre><code>&lt;iron-doc-viewer&gt;&lt;/iron-doc-viewer&gt;
     * 
     * 
     * </code></pre><p>Would implicitly have <code>src=&quot;awesome-sauce.html&quot;</code>.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The URL to an import that declares (or transitively imports) the<br>elements that you wish to see documented.</p>
     * <p>If the URL is relative, it will be resolved relative to the master<br>document.</p>
     * <p>If a <code>src</code> URL is not specified, it will resolve the name of the<br>directory containing this element, followed by <code>dirname.html</code>. For<br>example:</p>
     * <p><code>awesome-sauce/index.html</code>:</p>
     * <pre><code>&lt;iron-doc-viewer&gt;&lt;/iron-doc-viewer&gt;
     * 
     * 
     * </code></pre><p>Would implicitly have <code>src=&quot;awesome-sauce.html&quot;</code>.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);

    /**
     * <p>The relative root for determining paths to demos and default source<br>detection.</p>
     *
     * JavaScript Info:
     * @property base
     * @type String
     * 
     */
    @JsProperty String getBase();
    /**
     * <p>The relative root for determining paths to demos and default source<br>detection.</p>
     *
     * JavaScript Info:
     * @property base
     * @type String
     * 
     */
    @JsProperty void setBase(String value);

    /**
     * <p>An optional version string.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    @JsProperty String getVersion();
    /**
     * <p>An optional version string.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    @JsProperty void setVersion(String value);

    /**
     * <p>The current view. Can be <code>docs</code> or <code>demo</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty String getView();
    /**
     * <p>The current view. Can be <code>docs</code> or <code>demo</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty void setView(String value);

    /**
     * <p>The URL to a precompiled JSON descriptor. If you have precompiled<br>and stored a documentation set using Hydrolysis, you can load the<br>analyzer directly via AJAX by specifying this attribute.</p>
     * <p>If a <code>doc-src</code> is not specified, it is ignored and the default<br>rules according to the <code>src</code> attribute are used.</p>
     *
     * JavaScript Info:
     * @property docSrc
     * @type String
     * 
     */
    @JsProperty String getDocSrc();
    /**
     * <p>The URL to a precompiled JSON descriptor. If you have precompiled<br>and stored a documentation set using Hydrolysis, you can load the<br>analyzer directly via AJAX by specifying this attribute.</p>
     * <p>If a <code>doc-src</code> is not specified, it is ignored and the default<br>rules according to the <code>src</code> attribute are used.</p>
     *
     * JavaScript Info:
     * @property docSrc
     * @type String
     * 
     */
    @JsProperty void setDocSrc(String value);

    /**
     * <p>The element or behavior that will be displayed on the page. Defaults<br>to the element matching the name of the source file.</p>
     *
     * JavaScript Info:
     * @property active
     * @type String
     * 
     */
    @JsProperty String getActive();
    /**
     * <p>The element or behavior that will be displayed on the page. Defaults<br>to the element matching the name of the source file.</p>
     *
     * JavaScript Info:
     * @property active
     * @type String
     * 
     */
    @JsProperty void setActive(String value);


    /**
     * <p>Renders this element into static HTML for offline use.</p>
     * <p>This is mostly useful for debugging and one-off documentation generation.<br>If you want to integrate doc generation into your build process, you<br>probably want to be calling <code>hydrolysis.Analyzer.analyze()</code> directly.</p>
     *
     * JavaScript Info:
     * @method marshal
     * 
     * @return {String}
     */
    String marshal();

}
