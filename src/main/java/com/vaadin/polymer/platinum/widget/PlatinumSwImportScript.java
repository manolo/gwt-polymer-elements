/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget;

import com.vaadin.polymer.platinum.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>&lt;platinum-sw-import-script&gt;</code> element is used to import a JavaScript file that is executed<br>each time the service worker starts up.</p>
 * <p><code>&lt;platinum-sw-import-script&gt;</code> needs to be a child element of <code>&lt;platinum-sw-register&gt;</code>.</p>
 * <p>A common use case is to define a custom request handler for a <code>fetch</code> event, but it can be used<br>for any type of code that you want to be executed by the service worker.</p>
 * <pre><code>&lt;platinum-sw-register auto-register&gt;
 *   &lt;platinum-sw-import-script href=&quot;custom-fetch-handler.js&quot;&gt;&lt;/platinum-sw-import-script&gt;
 *   &lt;platinum-sw-fetch handler=&quot;customFetchHandler&quot;
 *                      path=&quot;/(.*)/customFetch&quot;&gt;&lt;/platinum-sw-fetch&gt;
 * &lt;/platinum-sw-register&gt;
 * 
 * 
 * </code></pre><p>You can specify multiple <code>&lt;platinum-sw-import-script&gt;</code> elements, each one corresponding to a<br>different JavaScript file. The JavaScript files will be loaded in the order in which the<br><code>&lt;platinum-sw-import-script&gt;</code> elements appear. Under the hood, this results in an<br><a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts"><code>importScripts()</code></a><br>call made from the context of the service worker.</p>
 */
public class PlatinumSwImportScript extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumSwImportScript() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumSwImportScript(String html) {
        super(PlatinumSwImportScriptElement.TAG, PlatinumSwImportScriptElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumSwImportScriptElement getPolymerElement() {
        return (PlatinumSwImportScriptElement) getElement();
    }


    /**
     * <p>The URL of the JavaScript file that you want imported.</p>
     * <p>Relative URLs are assumed to be<br>relative to the service worker’s script location, which will almost always be the same<br>location as the page which includes this element.</p>
     *
     * JavaScript Info:
     * @property href
     * @type string
     * 
     */
    public String getHref() {
        return getPolymerElement().getHref();
    }
    /**
     * <p>The URL of the JavaScript file that you want imported.</p>
     * <p>Relative URLs are assumed to be<br>relative to the service worker’s script location, which will almost always be the same<br>location as the page which includes this element.</p>
     *
     * JavaScript Info:
     * @property href
     * @type string
     * 
     */
    public void setHref(String value) {
        getPolymerElement().setHref(value);
    }




}
