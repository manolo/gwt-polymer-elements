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
 * <p>The <code>&lt;platinum-sw-fetch&gt;</code> element creates custom <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#fetch-event-section"><code>fetch</code> event</a><br>handlers for given URL patterns. Possible use cases include:</p>
 * <ul>
 * <li>Using a special caching strategy for specific URLs.</li>
 * <li>Returning static “fallback” responses instead of network errors when a remote API<br>is unavailable.</li>
 * </ul>
 * <p>In short, any scenario in which you’d like a service worker to intercept network<br>requests and provide custom response handling.</p>
 * <p>If you’d like a single caching policy applied to all same-origin requests, then an alternative<br>to using <code>&lt;platinum-sw-fetch&gt;</code> is to use <code>&lt;platinum-sw-cache&gt;</code> with the <code>defaultCacheStategy</code><br>property set.</p>
 * <p>Under the hood, the <a href="https://github.com/googlechrome/sw-toolbox">sw-toolbox</a> library is used<br>for all the request handling logic.</p>
 * <p><code>&lt;platinum-sw-fetch&gt;</code> needs to be a child element of <code>&lt;platinum-sw-register&gt;</code>.</p>
 * <p>An example configuration is:</p>
 * <pre><code>&lt;platinum-sw-register auto-register&gt;
 *   &lt;platinum-sw-import-script href=&quot;custom-fetch-handler.js&quot;&gt;&lt;/platinum-sw-import-script&gt;
 *   &lt;platinum-sw-fetch handler=&quot;customFetchHandler&quot;
 *                      path=&quot;/(.*)/customFetch&quot;&gt;&lt;/platinum-sw-fetch&gt;
 * &lt;/platinum-sw-register&gt;
 * 
 * 
 * </code></pre><p>This implies that there’s a <code>custom-fetch-handler.js</code> file in the same directory as the current<br>page, which defines a <code>sw-toolbox</code> compliant<br><a href="https://github.com/googlechrome/sw-toolbox#request-handlers">request handler</a> named<br><code>customFetchHandler</code>. This definition is imported using <code>&lt;platinum-sw-import-script&gt;</code>. The<br><code>&lt;platinum-sw-fetch&gt;</code> element takes care of mapping which request paths are handled by<br><code>customFetchHandler</code>.</p>
 * <p>Anything not matching the <code>path</code> pattern is ignored by <code>&lt;platinum-sw-fetch&gt;</code>,<br>and it’s possible to have multiple <code>&lt;platinum-sw-fetch&gt;</code> elements that each define different<br>paths and different handlers. The path matching is performed top-down, starting with the first<br><code>&lt;platinum-sw-fetch&gt;</code> element.</p>
 * <p>The <code>path</code> will, by default, only match same-origin requests. If you’d like to define a custom<br>handler for requests on a specific cross-origin domain, you must use the <code>origin</code> parameter<br>in conjunction with <code>path</code> to match the domains you’d like to handle.</p>
 */
public class PlatinumSwFetch extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumSwFetch() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumSwFetch(String html) {
        super(PlatinumSwFetchElement.TAG, PlatinumSwFetchElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumSwFetchElement getPolymerElement() {
        return (PlatinumSwFetchElement) getElement();
    }


    /**
     * <p>The name of the request handler to use. This should be a <code>sw-toolbox</code>-style<br><a href="https://github.com/googlechrome/sw-toolbox#request-handlers">request handler</a>.</p>
     * <p><code>handler</code> is a <code>String</code>, not a <code>function</code>, so you’re providing the name of a function, not<br>the function itself. It can be a function defined in the<br><a href="https://github.com/googlechrome/sw-toolbox#built-in-handlers"><code>toolbox</code> scope</a><br>(e.g. ‘networkFirst’, ‘fastest’, ‘networkOnly’, etc.) or a function defined in the<br><a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#service-worker-global-scope"><code>ServiceWorkerGlobalScope</code></a>,<br>like a function that is defined in a file that’s imported via <code>platinum-sw-import-script</code>.<br>*</p>
     *
     * JavaScript Info:
     * @property handler
     * @type string
     * 
     */
    public String getHandler() {
        return getPolymerElement().getHandler();
    }
    /**
     * <p>The name of the request handler to use. This should be a <code>sw-toolbox</code>-style<br><a href="https://github.com/googlechrome/sw-toolbox#request-handlers">request handler</a>.</p>
     * <p><code>handler</code> is a <code>String</code>, not a <code>function</code>, so you’re providing the name of a function, not<br>the function itself. It can be a function defined in the<br><a href="https://github.com/googlechrome/sw-toolbox#built-in-handlers"><code>toolbox</code> scope</a><br>(e.g. ‘networkFirst’, ‘fastest’, ‘networkOnly’, etc.) or a function defined in the<br><a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#service-worker-global-scope"><code>ServiceWorkerGlobalScope</code></a>,<br>like a function that is defined in a file that’s imported via <code>platinum-sw-import-script</code>.<br>*</p>
     *
     * JavaScript Info:
     * @property handler
     * @type string
     * 
     */
    public void setHandler(String value) {
        getPolymerElement().setHandler(value);
    }

    /**
     * <p>By default, <code>path</code> will only match URLs under the current host (i.e. same-origin requests).<br>If you’d like to apply <code>handler</code> to cross-origin requests, then use <code>origin</code> to specify<br>which hosts will match. Setting <code>origin</code> is optional.</p>
     * <p><code>origin</code> is a <code>String</code>, but it is used internally to construct a<br><a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions"><code>RegExp</code> object</a>,<br>which is used for the matching.</p>
     * <p>Note that the <code>origin</code> value will be matched against the full domain name and the protocol.<br>If you want to match  ‘http’ and ‘https’, then use ‘https?://‘ at the start of your string.</p>
     * <p>Some examples:</p>
     * <ul>
     * <li><code>origin=&quot;https?://.+\.google\.com&quot;</code> → a RegExp that matches <code>http</code> or <code>https</code> requests<br>made to any domain that ends in <code>.google.com</code>.</li>
     * <li><code>origin=&quot;https://www\.example\.com&quot; → a RegExp that will only match</code>https<code>requests to
     * one domain,</code>www.example.com`.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property origin
     * @type string
     * 
     */
    public String getOrigin() {
        return getPolymerElement().getOrigin();
    }
    /**
     * <p>By default, <code>path</code> will only match URLs under the current host (i.e. same-origin requests).<br>If you’d like to apply <code>handler</code> to cross-origin requests, then use <code>origin</code> to specify<br>which hosts will match. Setting <code>origin</code> is optional.</p>
     * <p><code>origin</code> is a <code>String</code>, but it is used internally to construct a<br><a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions"><code>RegExp</code> object</a>,<br>which is used for the matching.</p>
     * <p>Note that the <code>origin</code> value will be matched against the full domain name and the protocol.<br>If you want to match  ‘http’ and ‘https’, then use ‘https?://‘ at the start of your string.</p>
     * <p>Some examples:</p>
     * <ul>
     * <li><code>origin=&quot;https?://.+\.google\.com&quot;</code> → a RegExp that matches <code>http</code> or <code>https</code> requests<br>made to any domain that ends in <code>.google.com</code>.</li>
     * <li><code>origin=&quot;https://www\.example\.com&quot; → a RegExp that will only match</code>https<code>requests to
     * one domain,</code>www.example.com`.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property origin
     * @type string
     * 
     */
    public void setOrigin(String value) {
        getPolymerElement().setOrigin(value);
    }

    /**
     * <p>URLs with paths matching <code>path</code> will have <code>handler</code> applied to them.</p>
     * <p>By default, <code>path</code> will only match same-origin URLs. If you’d like it to match<br>cross-origin URLs, use <code>path</code> in conjunction with <code>origin</code>.</p>
     * <p>As explained in the<br><a href="https://github.com/googlechrome/sw-toolbox#toolboxrouterheadurlpattern-handler-options"><code>sw-toolbox</code> docs</a>,<br>the URL path matching is done using the <a href="https://github.com/pillarjs/path-to-regexp"><code>path-to-regexp</code></a><br>module, which is the same logic used in <a href="http://expressjs.com/guide/routing.html">Express-style routing</a>.</p>
     * <p>In practice, you need to always use ‘/‘ as the first character of your <code>path</code>, and then<br>can use ‘(.*)’ as a wildcard.</p>
     * <p>Some examples:</p>
     * <ul>
     * <li><code>path=&quot;/(.*)/customFetch&quot;</code> → matches any path that ends with ‘/customFetch’.</li>
     * <li><code>path=&quot;/customFetch(.*)&quot;</code> → matches any path that starts with ‘/customFetch’, optionally<br>followed by other characters.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property path
     * @type string
     * 
     */
    public String getPath() {
        return getPolymerElement().getPath();
    }
    /**
     * <p>URLs with paths matching <code>path</code> will have <code>handler</code> applied to them.</p>
     * <p>By default, <code>path</code> will only match same-origin URLs. If you’d like it to match<br>cross-origin URLs, use <code>path</code> in conjunction with <code>origin</code>.</p>
     * <p>As explained in the<br><a href="https://github.com/googlechrome/sw-toolbox#toolboxrouterheadurlpattern-handler-options"><code>sw-toolbox</code> docs</a>,<br>the URL path matching is done using the <a href="https://github.com/pillarjs/path-to-regexp"><code>path-to-regexp</code></a><br>module, which is the same logic used in <a href="http://expressjs.com/guide/routing.html">Express-style routing</a>.</p>
     * <p>In practice, you need to always use ‘/‘ as the first character of your <code>path</code>, and then<br>can use ‘(.*)’ as a wildcard.</p>
     * <p>Some examples:</p>
     * <ul>
     * <li><code>path=&quot;/(.*)/customFetch&quot;</code> → matches any path that ends with ‘/customFetch’.</li>
     * <li><code>path=&quot;/customFetch(.*)&quot;</code> → matches any path that starts with ‘/customFetch’, optionally<br>followed by other characters.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property path
     * @type string
     * 
     */
    public void setPath(String value) {
        getPolymerElement().setPath(value);
    }




}
