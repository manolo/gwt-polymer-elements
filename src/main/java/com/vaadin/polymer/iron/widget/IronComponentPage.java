/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-component-page project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Loads Polymer element and behavior documentation using<br><a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a> and renders a complete<br>documentation page including demos (if available).</p>
 * <p>To display a warning inside an <code>iron-component-page</code> element,<br>add the <code>.warning</code> class to a child.</p>
 */
public class IronComponentPage extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronComponentPage() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronComponentPage(String html) {
        super(IronComponentPageElement.TAG, IronComponentPageElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronComponentPageElement getPolymerElement() {
        return (IronComponentPageElement) getElement();
    }


    /**
     * <p>Toggle flag to be used when this element is being displayed in the<br>Polymer Elements catalog.</p>
     *
     * JavaScript Info:
     * @property catalog
     * @type Boolean
     * 
     */
    public boolean getCatalog() {
        return getPolymerElement().getCatalog();
    }
    /**
     * <p>Toggle flag to be used when this element is being displayed in the<br>Polymer Elements catalog.</p>
     *
     * JavaScript Info:
     * @property catalog
     * @type Boolean
     * 
     */
    public void setCatalog(boolean value) {
        getPolymerElement().setCatalog(value);
    }

    /**
     * <p>The Hydrolysis behavior descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docBehaviors
     * @type Array
     * 
     */
    public JsArray getDocBehaviors() {
        return getPolymerElement().getDocBehaviors();
    }
    /**
     * <p>The Hydrolysis behavior descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docBehaviors
     * @type Array
     * 
     */
    public void setDocBehaviors(JsArray value) {
        getPolymerElement().setDocBehaviors(value);
    }

    /**
     * <p>Demos for the currently selected element.</p>
     *
     * JavaScript Info:
     * @property docDemos
     * @type Array
     * 
     */
    public JsArray getDocDemos() {
        return getPolymerElement().getDocDemos();
    }
    /**
     * <p>Demos for the currently selected element.</p>
     *
     * JavaScript Info:
     * @property docDemos
     * @type Array
     * 
     */
    public void setDocDemos(JsArray value) {
        getPolymerElement().setDocDemos(value);
    }

    /**
     * <p>The Hydrolysis element descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docElements
     * @type Array
     * 
     */
    public JsArray getDocElements() {
        return getPolymerElement().getDocElements();
    }
    /**
     * <p>The Hydrolysis element descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @property docElements
     * @type Array
     * 
     */
    public void setDocElements(JsArray value) {
        getPolymerElement().setDocElements(value);
    }

    /**
     * <p>Whether <em>all</em> dependencies should be loaded and documented.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    public boolean getTransitive() {
        return getPolymerElement().getTransitive();
    }
    /**
     * <p>Whether <em>all</em> dependencies should be loaded and documented.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    public void setTransitive(boolean value) {
        getPolymerElement().setTransitive(value);
    }

    /**
     * <p>The relative root for determining paths to demos and default source<br>detection.</p>
     *
     * JavaScript Info:
     * @property base
     * @type String
     * 
     */
    public String getBase() {
        return getPolymerElement().getBase();
    }
    /**
     * <p>The relative root for determining paths to demos and default source<br>detection.</p>
     *
     * JavaScript Info:
     * @property base
     * @type String
     * 
     */
    public void setBase(String value) {
        getPolymerElement().setBase(value);
    }

    /**
     * <p>The scroll mode for the page. For details about the modes,<br>see the mode property in paper-header-panel.</p>
     *
     * JavaScript Info:
     * @property scrollMode
     * @type String
     * 
     */
    public String getScrollMode() {
        return getPolymerElement().getScrollMode();
    }
    /**
     * <p>The scroll mode for the page. For details about the modes,<br>see the mode property in paper-header-panel.</p>
     *
     * JavaScript Info:
     * @property scrollMode
     * @type String
     * 
     */
    public void setScrollMode(String value) {
        getPolymerElement().setScrollMode(value);
    }

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
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
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
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }

    /**
     * <p>The URL to a precompiled JSON descriptor. If you have precompiled<br>and stored a documentation set using Hydrolysis, you can load the<br>analyzer directly via AJAX by specifying this attribute.</p>
     * <p>If a <code>doc-src</code> is not specified, it is ignored and the default<br>rules according to the <code>src</code> attribute are used.</p>
     *
     * JavaScript Info:
     * @property docSrc
     * @type String
     * 
     */
    public String getDocSrc() {
        return getPolymerElement().getDocSrc();
    }
    /**
     * <p>The URL to a precompiled JSON descriptor. If you have precompiled<br>and stored a documentation set using Hydrolysis, you can load the<br>analyzer directly via AJAX by specifying this attribute.</p>
     * <p>If a <code>doc-src</code> is not specified, it is ignored and the default<br>rules according to the <code>src</code> attribute are used.</p>
     *
     * JavaScript Info:
     * @property docSrc
     * @type String
     * 
     */
    public void setDocSrc(String value) {
        getPolymerElement().setDocSrc(value);
    }

    /**
     * <p>An optional version string.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    public String getVersion() {
        return getPolymerElement().getVersion();
    }
    /**
     * <p>An optional version string.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    public void setVersion(String value) {
        getPolymerElement().setVersion(value);
    }

    /**
     * <p>The current view. Can be <code>docs</code> or <code>demo</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public String getView() {
        return getPolymerElement().getView();
    }
    /**
     * <p>The current view. Can be <code>docs</code> or <code>demo</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public void setView(String value) {
        getPolymerElement().setView(value);
    }

    /**
     * <p>The name of a branch used to fetch source for gh-pages.<br>If not specified <code>master</code> is used.</p>
     *
     * JavaScript Info:
     * @property branchName
     * @type String
     * 
     */
    public String getBranchName() {
        return getPolymerElement().getBranchName();
    }
    /**
     * <p>The name of a branch used to fetch source for gh-pages.<br>If not specified <code>master</code> is used.</p>
     *
     * JavaScript Info:
     * @property branchName
     * @type String
     * 
     */
    public void setBranchName(String value) {
        getPolymerElement().setBranchName(value);
    }

    /**
     * <p>The element or behavior that will be displayed on the page. Defaults<br>to the element matching the name of the source file.</p>
     *
     * JavaScript Info:
     * @property active
     * @type String
     * 
     */
    public String getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * <p>The element or behavior that will be displayed on the page. Defaults<br>to the element matching the name of the source file.</p>
     *
     * JavaScript Info:
     * @property active
     * @type String
     * 
     */
    public void setActive(String value) {
        getPolymerElement().setActive(value);
    }


    // Needed in UIBinder
    /**
     * <p>The Hydrolysis behavior descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @attribute doc-behaviors
     * 
     */
    public void setDocBehaviors(String value) {
        Polymer.property(this.getPolymerElement(), "docBehaviors", value);
    }

    // Needed in UIBinder
    /**
     * <p>Demos for the currently selected element.</p>
     *
     * JavaScript Info:
     * @attribute doc-demos
     * 
     */
    public void setDocDemos(String value) {
        Polymer.property(this.getPolymerElement(), "docDemos", value);
    }

    // Needed in UIBinder
    /**
     * <p>The Hydrolysis element descriptors that have been loaded. </p>
     *
     * JavaScript Info:
     * @attribute doc-elements
     * 
     */
    public void setDocElements(String value) {
        Polymer.property(this.getPolymerElement(), "docElements", value);
    }


    /**
     * <p>Renders this element into static HTML for offline use.</p>
     * <p>This is mostly useful for debugging and one-off documentation generation.<br>If you want to integrate doc generation into your build process, you<br>probably want to be calling <code>hydrolysis.Analyzer.analyze()</code> directly.</p>
     *
     * JavaScript Info:
     * @method marshal
     * 
     * @return {String}
     */
    public String marshal() {
        return getPolymerElement().marshal();
    }


}
