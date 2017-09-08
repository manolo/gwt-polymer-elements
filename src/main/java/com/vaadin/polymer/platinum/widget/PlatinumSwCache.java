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
 * <p>The <code>&lt;platinum-sw-cache&gt;</code> element makes it easy to precache specific resources, perform runtime<br>caching, and serve your cached resources when a network is unavailable.<br>Under the hood, the <a href="https://github.com/googlechrome/sw-toolbox">sw-toolbox</a> library is used<br>for all the caching and request handling logic.<br><code>&lt;platinum-sw-cache&gt;</code> needs to be a child element of <code>&lt;platinum-sw-register&gt;</code>.<br>A simple, yet useful configuration is</p>
 * <pre><code>&lt;platinum-sw-register auto-register&gt;
 *   &lt;platinum-sw-cache&gt;&lt;/platinum-sw-cache&gt;
 * &lt;/platinum-sw-register&gt;
 * 
 * 
 * </code></pre><p>This is enough to have all of the resources your site uses cached at runtime, both local and<br>cross-origin.<br>(It uses the default <code>defaultCacheStrategy</code> of “networkFirst”.)<br>When there’s a network available, visits to your site will go against the network copy of the<br>resources, but if someone visits your site when they’re offline, all the cached resources will<br>be used.</p>
 */
public class PlatinumSwCache extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumSwCache() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumSwCache(String html) {
        super(PlatinumSwCacheElement.TAG, PlatinumSwCacheElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumSwCacheElement getPolymerElement() {
        return (PlatinumSwCacheElement) getElement();
    }


    /**
     * <p>If set to true, this element will not set up service worker caching. This is useful to<br>conditionally enable or disable caching depending on the build environment.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If set to true, this element will not set up service worker caching. This is useful to<br>conditionally enable or disable caching depending on the build environment.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Used to provide a list of URLs that are always precached as soon as the service worker is<br>installed. Corresponds to  <a href="https://github.com/GoogleChrome/sw-toolbox#toolboxprecachearrayofurls"><code>sw-toolbox</code>‘s <code>precache()</code> method</a>.</p>
     * <p>This is useful for URLs that that wouldn’t necessarily be picked up by runtime caching,<br>i.e. a list of resources that are needed by one of the subpages of your site, or a list of<br>resources that are only loaded via user interaction.</p>
     * <p><code>precache</code> can be used in conjunction with <code>cacheConfigFile</code>, and the two arrays will be<br>concatenated.</p>
     *
     * JavaScript Info:
     * @property precache
     * @type Array
     * 
     */
    public JsArray getPrecache() {
        return getPolymerElement().getPrecache();
    }
    /**
     * <p>Used to provide a list of URLs that are always precached as soon as the service worker is<br>installed. Corresponds to  <a href="https://github.com/GoogleChrome/sw-toolbox#toolboxprecachearrayofurls"><code>sw-toolbox</code>‘s <code>precache()</code> method</a>.</p>
     * <p>This is useful for URLs that that wouldn’t necessarily be picked up by runtime caching,<br>i.e. a list of resources that are needed by one of the subpages of your site, or a list of<br>resources that are only loaded via user interaction.</p>
     * <p><code>precache</code> can be used in conjunction with <code>cacheConfigFile</code>, and the two arrays will be<br>concatenated.</p>
     *
     * JavaScript Info:
     * @property precache
     * @type Array
     * 
     */
    public void setPrecache(JsArray value) {
        getPolymerElement().setPrecache(value);
    }

    /**
     * <p>Used to configure <code>&lt;platinum-sw-precache&gt;</code> behavior via a JSON file instead of via<br>attributes. This can come in handy when the configuration (e.g. which files to precache)<br>depends on the results of a build script.</p>
     * <p>If configuration for the same properties are provided in both the JSON file and via the<br>element’s attributes, then in general the JSON file’s values take precedence. The one<br>exception is the <code>precache</code> property. Any values in the element’s <code>precache</code> attribute will<br>be concatenated with the values in the JSON file’s <code>precache</code> property and the set of files<br>that are precached will be the union of the two.</p>
     * <p>There’s one additional option, <code>precacheFingerprint</code>, that can be set in the JSON. If using<br>a build script that might output a large number of files to precache, its recommended<br>that your build script generate a unique “fingerprint” of the files. Any changes to the<br><code>precacheFingerprint</code> value will result in the underlying service worker kicking off the<br>process of caching the files listed in <code>precache</code>.<br>While there are a few different strategies for generating an appropriate<br><code>precacheFingerprint</code> value, a process that makes sense is to use a stable hash of the<br>serialized <code>precache</code> array. That way, any changes to the list of files in <code>precache</code><br>will result in a new <code>precacheFingerprint</code> value.<br>If your build script is Node.js based, one way to generate this hash is:</p>
     * <pre><code>var md5 = require(&#39;crypto&#39;).createHash(&#39;md5&#39;);
     * md5.update(JSON.stringify(precache));
     * var precacheFingerprint = md5.digest(&#39;hex&#39;);
     * 
     * 
     * </code></pre><p>Alternatively, you could use something like the<br><a href="http://stackoverflow.com/questions/1161869/how-to-get-sha-of-the-latest-commit-from-remote-git-repository">SHA-1 signature</a><br>of your latest <code>git</code> commit for the <code>precacheFingerprint</code> value.</p>
     * <p>An example file may look like:</p>
     * <pre><code>{
     *   &quot;cacheId&quot;: &quot;my-cache-id&quot;,
     *   &quot;defaultCacheStrategy&quot;: &quot;fastest&quot;,
     *   &quot;disabled&quot;: false,
     *   &quot;precache&quot;: [&quot;file1.html&quot;, &quot;file2.css&quot;],
     *   &quot;precacheFingerprint&quot;: &quot;FINGERPRINT_OF_FILES_IN_PRECACHE&quot;
     * }
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property cacheConfigFile
     * @type string
     * 
     */
    public String getCacheConfigFile() {
        return getPolymerElement().getCacheConfigFile();
    }
    /**
     * <p>Used to configure <code>&lt;platinum-sw-precache&gt;</code> behavior via a JSON file instead of via<br>attributes. This can come in handy when the configuration (e.g. which files to precache)<br>depends on the results of a build script.</p>
     * <p>If configuration for the same properties are provided in both the JSON file and via the<br>element’s attributes, then in general the JSON file’s values take precedence. The one<br>exception is the <code>precache</code> property. Any values in the element’s <code>precache</code> attribute will<br>be concatenated with the values in the JSON file’s <code>precache</code> property and the set of files<br>that are precached will be the union of the two.</p>
     * <p>There’s one additional option, <code>precacheFingerprint</code>, that can be set in the JSON. If using<br>a build script that might output a large number of files to precache, its recommended<br>that your build script generate a unique “fingerprint” of the files. Any changes to the<br><code>precacheFingerprint</code> value will result in the underlying service worker kicking off the<br>process of caching the files listed in <code>precache</code>.<br>While there are a few different strategies for generating an appropriate<br><code>precacheFingerprint</code> value, a process that makes sense is to use a stable hash of the<br>serialized <code>precache</code> array. That way, any changes to the list of files in <code>precache</code><br>will result in a new <code>precacheFingerprint</code> value.<br>If your build script is Node.js based, one way to generate this hash is:</p>
     * <pre><code>var md5 = require(&#39;crypto&#39;).createHash(&#39;md5&#39;);
     * md5.update(JSON.stringify(precache));
     * var precacheFingerprint = md5.digest(&#39;hex&#39;);
     * 
     * 
     * </code></pre><p>Alternatively, you could use something like the<br><a href="http://stackoverflow.com/questions/1161869/how-to-get-sha-of-the-latest-commit-from-remote-git-repository">SHA-1 signature</a><br>of your latest <code>git</code> commit for the <code>precacheFingerprint</code> value.</p>
     * <p>An example file may look like:</p>
     * <pre><code>{
     *   &quot;cacheId&quot;: &quot;my-cache-id&quot;,
     *   &quot;defaultCacheStrategy&quot;: &quot;fastest&quot;,
     *   &quot;disabled&quot;: false,
     *   &quot;precache&quot;: [&quot;file1.html&quot;, &quot;file2.css&quot;],
     *   &quot;precacheFingerprint&quot;: &quot;FINGERPRINT_OF_FILES_IN_PRECACHE&quot;
     * }
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property cacheConfigFile
     * @type string
     * 
     */
    public void setCacheConfigFile(String value) {
        getPolymerElement().setCacheConfigFile(value);
    }

    /**
     * <p>An id used to construct the name for the<br><a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#cache">Cache</a><br>in which all the resources will be stored.</p>
     * <p>If nothing is provided, the default value set in<br><a href="https://github.com/GoogleChrome/sw-toolbox/blob/8763dcc9fbc9352d58f184050e2131c42f7b6d68/lib/options.js#L28"><code>toolbox.options.cacheName</code></a><br>will be used.</p>
     * <p>The <code>cacheId</code> is combined with the service worker’s scope to construct the cache name, so<br>two <code>&lt;platinum-sw-cache&gt;</code> elements that are associated with different scopes will use<br>different caches.</p>
     *
     * JavaScript Info:
     * @property cacheId
     * @type string
     * 
     */
    public String getCacheId() {
        return getPolymerElement().getCacheId();
    }
    /**
     * <p>An id used to construct the name for the<br><a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#cache">Cache</a><br>in which all the resources will be stored.</p>
     * <p>If nothing is provided, the default value set in<br><a href="https://github.com/GoogleChrome/sw-toolbox/blob/8763dcc9fbc9352d58f184050e2131c42f7b6d68/lib/options.js#L28"><code>toolbox.options.cacheName</code></a><br>will be used.</p>
     * <p>The <code>cacheId</code> is combined with the service worker’s scope to construct the cache name, so<br>two <code>&lt;platinum-sw-cache&gt;</code> elements that are associated with different scopes will use<br>different caches.</p>
     *
     * JavaScript Info:
     * @property cacheId
     * @type string
     * 
     */
    public void setCacheId(String value) {
        getPolymerElement().setCacheId(value);
    }

    /**
     * <p>The caching strategy used for all requests, both for local and cross-origin resources.</p>
     * <p>For a list of strategies, see the <a href="https://github.com/GoogleChrome/sw-toolbox#built-in-handlers"><code>sw-toolbox</code> documentation</a>.<br>Specify a strategy as a string, without the “toolbox” prefix. E.g., for<br><code>toolbox.networkFirst</code>, set <code>defaultCacheStrategy</code> to “networkFirst”.</p>
     * <p>Note that the “cacheFirst” and “cacheOnly” strategies are not recommended, and may be<br>explicitly prevented in a future release. More information can be found at<br><a href="https://github.com/PolymerElements/platinum-sw#cacheonly--cachefirst-defaultcachestrategy-considered-harmful">https://github.com/PolymerElements/platinum-sw#cacheonly--cachefirst-defaultcachestrategy-considered-harmful</a></p>
     *
     * JavaScript Info:
     * @property defaultCacheStrategy
     * @type String
     * 
     */
    public String getDefaultCacheStrategy() {
        return getPolymerElement().getDefaultCacheStrategy();
    }
    /**
     * <p>The caching strategy used for all requests, both for local and cross-origin resources.</p>
     * <p>For a list of strategies, see the <a href="https://github.com/GoogleChrome/sw-toolbox#built-in-handlers"><code>sw-toolbox</code> documentation</a>.<br>Specify a strategy as a string, without the “toolbox” prefix. E.g., for<br><code>toolbox.networkFirst</code>, set <code>defaultCacheStrategy</code> to “networkFirst”.</p>
     * <p>Note that the “cacheFirst” and “cacheOnly” strategies are not recommended, and may be<br>explicitly prevented in a future release. More information can be found at<br><a href="https://github.com/PolymerElements/platinum-sw#cacheonly--cachefirst-defaultcachestrategy-considered-harmful">https://github.com/PolymerElements/platinum-sw#cacheonly--cachefirst-defaultcachestrategy-considered-harmful</a></p>
     *
     * JavaScript Info:
     * @property defaultCacheStrategy
     * @type String
     * 
     */
    public void setDefaultCacheStrategy(String value) {
        getPolymerElement().setDefaultCacheStrategy(value);
    }


    // Needed in UIBinder
    /**
     * <p>Used to provide a list of URLs that are always precached as soon as the service worker is<br>installed. Corresponds to  <a href="https://github.com/GoogleChrome/sw-toolbox#toolboxprecachearrayofurls"><code>sw-toolbox</code>‘s <code>precache()</code> method</a>.</p>
     * <p>This is useful for URLs that that wouldn’t necessarily be picked up by runtime caching,<br>i.e. a list of resources that are needed by one of the subpages of your site, or a list of<br>resources that are only loaded via user interaction.</p>
     * <p><code>precache</code> can be used in conjunction with <code>cacheConfigFile</code>, and the two arrays will be<br>concatenated.</p>
     *
     * JavaScript Info:
     * @attribute precache
     * 
     */
    public void setPrecache(String value) {
        Polymer.property(this.getPolymerElement(), "precache", value);
    }



}
