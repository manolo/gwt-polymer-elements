/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>The <code>&lt;platinum-sw-register&gt;</code> element handles<br><a href="http://www.html5rocks.com/en/tutorials/service-worker/introduction/">service worker</a><br>registration, reflects the overall service worker state, and coordinates the configuration<br>provided by other Service Worker Elements.<br><code>&lt;platinum-sw-register&gt;</code> is used as a parent element for child elements in the<br><code>&lt;platinum-sw-*&gt;</code> group.</p>
 * <pre><code>&lt;platinum-sw-register skip-waiting
 *                       clients-claim
 *                       auto-register
 *                       state=&quot;{{state}}&quot;
 *                       on-service-worker-error=&quot;handleSWError&quot;
 *                       on-service-worker-updated=&quot;handleSWUpdated&quot;
 *                       on-service-worker-installed=&quot;handleSWInstalled&quot;&gt;
 *   ...one or more &lt;platinum-sw-*&gt; children which share the service worker registration...
 * &lt;/platinum-sw-register&gt;
 * 
 * 
 * </code></pre><p>Please see <a href="https://github.com/PolymerElements/platinum-sw#top-level-sw-importjs">https://github.com/PolymerElements/platinum-sw#top-level-sw-importjs</a> for a<br><em>crucial</em> prerequisite file you must create before <code>&lt;platinum-sw-register&gt;</code> can be used!</p>
 */
@JsType(isNative=true)
public interface PlatinumSwRegisterElement extends HTMLElement {

    @JsOverlay public static final String TAG = "platinum-sw-register";
    @JsOverlay public static final String SRC = "platinum-sw/platinum-sw-elements.html";


    /**
     * <p>Whether this element should automatically register the corresponding service worker as<br>soon as its added to a page.</p>
     * <p>If set to <code>false</code>, then the service worker won’t be automatically registered, and you<br>must call this element’s <code>register()</code> method if you want service worker functionality.<br>This is useful if, for example, the service worker needs to be configured using<br>information that isn’t immediately available at the time the page loads.</p>
     * <p>If set to <code>true</code>, the service worker will be automatically registered without having to<br>call any methods.</p>
     *
     * JavaScript Info:
     * @property autoRegister
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoRegister();
    /**
     * <p>Whether this element should automatically register the corresponding service worker as<br>soon as its added to a page.</p>
     * <p>If set to <code>false</code>, then the service worker won’t be automatically registered, and you<br>must call this element’s <code>register()</code> method if you want service worker functionality.<br>This is useful if, for example, the service worker needs to be configured using<br>information that isn’t immediately available at the time the page loads.</p>
     * <p>If set to <code>true</code>, the service worker will be automatically registered without having to<br>call any methods.</p>
     *
     * JavaScript Info:
     * @property autoRegister
     * @type Boolean
     * 
     */
    @JsProperty void setAutoRegister(boolean value);

    /**
     * <p>Whether the activated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#clients-claim-method">take immediate control</a><br>of any pages under its scope.</p>
     * <p>If this is <code>false</code>, the service worker won’t have any effect until the next time the page<br>is visited/reloaded.<br>If this is <code>true</code>, it will take control and start handling events for the current page<br>(and any pages under the same scope open in other tabs/windows) as soon it’s active.</p>
     *
     * JavaScript Info:
     * @property clientsClaim
     * @type Boolean
     * 
     */
    @JsProperty boolean getClientsClaim();
    /**
     * <p>Whether the activated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#clients-claim-method">take immediate control</a><br>of any pages under its scope.</p>
     * <p>If this is <code>false</code>, the service worker won’t have any effect until the next time the page<br>is visited/reloaded.<br>If this is <code>true</code>, it will take control and start handling events for the current page<br>(and any pages under the same scope open in other tabs/windows) as soon it’s active.</p>
     *
     * JavaScript Info:
     * @property clientsClaim
     * @type Boolean
     * 
     */
    @JsProperty void setClientsClaim(boolean value);

    /**
     * <p>Whether the page should be automatically reloaded (via <code>window.location.reload()</code>) when<br>the service worker is successfully installed.</p>
     * <p>While it’s perfectly valid to continue using a page with a freshly installed service<br>worker, it’s a common pattern to want to reload it immediately following the install.<br>This ensures that, for example, if you’re using a <code>&lt;platinum-sw-cache&gt;</code> with an on the<br>fly caching strategy, it will get a chance to intercept all the requests needed to render<br>your page and store them in the cache.</p>
     * <p>If you don’t immediately reload your page, then any resources that were loaded before the<br>service worker was installed (e.g. this <code>platinum-sw-register.html</code> file) won’t be present<br>in the cache until the next time the page is loaded.</p>
     * <p>Note that this reload will only happen when a service worker is installed for the first<br>time. If the service worker is subsequently updated, it won’t trigger another reload.</p>
     *
     * JavaScript Info:
     * @property reloadOnInstall
     * @type Boolean
     * 
     */
    @JsProperty boolean getReloadOnInstall();
    /**
     * <p>Whether the page should be automatically reloaded (via <code>window.location.reload()</code>) when<br>the service worker is successfully installed.</p>
     * <p>While it’s perfectly valid to continue using a page with a freshly installed service<br>worker, it’s a common pattern to want to reload it immediately following the install.<br>This ensures that, for example, if you’re using a <code>&lt;platinum-sw-cache&gt;</code> with an on the<br>fly caching strategy, it will get a chance to intercept all the requests needed to render<br>your page and store them in the cache.</p>
     * <p>If you don’t immediately reload your page, then any resources that were loaded before the<br>service worker was installed (e.g. this <code>platinum-sw-register.html</code> file) won’t be present<br>in the cache until the next time the page is loaded.</p>
     * <p>Note that this reload will only happen when a service worker is installed for the first<br>time. If the service worker is subsequently updated, it won’t trigger another reload.</p>
     *
     * JavaScript Info:
     * @property reloadOnInstall
     * @type Boolean
     * 
     */
    @JsProperty void setReloadOnInstall(boolean value);

    /**
     * <p>Whether an updated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#service-worker-global-scope-skipwaiting">bypass the <code>waiting</code> state</a><br>and immediately become <code>active</code>.</p>
     * <p>Normally, during an update, the new service worker stays in the<br><code>waiting</code> state until the current page and any other tabs/windows that are using the old<br>service worker are unloaded.</p>
     * <p>If this is <code>false</code>, an updated service worker won’t be activated until all instances of<br>the old server worker have been unloaded.</p>
     * <p>If this is <code>true</code>, an updated service worker will become <code>active</code> immediately.</p>
     *
     * JavaScript Info:
     * @property skipWaiting
     * @type Boolean
     * 
     */
    @JsProperty boolean getSkipWaiting();
    /**
     * <p>Whether an updated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#service-worker-global-scope-skipwaiting">bypass the <code>waiting</code> state</a><br>and immediately become <code>active</code>.</p>
     * <p>Normally, during an update, the new service worker stays in the<br><code>waiting</code> state until the current page and any other tabs/windows that are using the old<br>service worker are unloaded.</p>
     * <p>If this is <code>false</code>, an updated service worker won’t be activated until all instances of<br>the old server worker have been unloaded.</p>
     * <p>If this is <code>true</code>, an updated service worker will become <code>active</code> immediately.</p>
     *
     * JavaScript Info:
     * @property skipWaiting
     * @type Boolean
     * 
     */
    @JsProperty void setSkipWaiting(boolean value);

    /**
     * <p>The URI used as a base when constructing relative paths to service worker helper libraries<br>that need to be loaded.</p>
     * <p>This can normally be kept set to the default, which will use the directory containing this<br>element as the base. However, if you <a href="https://github.com/polymer/vulcanize">Vulcanize</a> your<br>elements, then the default base might not be appropriate anymore. This will allow you to<br>override it.</p>
     * <p>See <a href="https://github.com/PolymerElements/platinum-sw#relative-paths--vulcanization">https://github.com/PolymerElements/platinum-sw#relative-paths--vulcanization</a> for more<br>information.</p>
     *
     * JavaScript Info:
     * @property baseUri
     * @type String
     * 
     */
    @JsProperty String getBaseUri();
    /**
     * <p>The URI used as a base when constructing relative paths to service worker helper libraries<br>that need to be loaded.</p>
     * <p>This can normally be kept set to the default, which will use the directory containing this<br>element as the base. However, if you <a href="https://github.com/polymer/vulcanize">Vulcanize</a> your<br>elements, then the default base might not be appropriate anymore. This will allow you to<br>override it.</p>
     * <p>See <a href="https://github.com/PolymerElements/platinum-sw#relative-paths--vulcanization">https://github.com/PolymerElements/platinum-sw#relative-paths--vulcanization</a> for more<br>information.</p>
     *
     * JavaScript Info:
     * @property baseUri
     * @type String
     * 
     */
    @JsProperty void setBaseUri(String value);

    /**
     * <p>The service worker script that is <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#navigator-service-worker-register">registered</a>.<br>The script <em>should</em> be located at the top level of your site, to ensure that it is able<br>to control all the pages on your site.</p>
     * <p>It’s <em>strongly</em> recommended that you create a top-level file named <code>sw-import.js</code><br>containing only:</p>
     * <p><code>importScripts(&#39;bower_components/platinum-sw/service-worker.js&#39;);</code></p>
     * <p>(adjust to match the path where your <code>platinum-sw</code> element directory can be found).</p>
     * <p>This will ensure that your service worker script contains everything needed to play<br>nicely with the Service Worker Elements group.</p>
     *
     * JavaScript Info:
     * @property href
     * @type String
     * 
     */
    @JsProperty String getHref();
    /**
     * <p>The service worker script that is <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#navigator-service-worker-register">registered</a>.<br>The script <em>should</em> be located at the top level of your site, to ensure that it is able<br>to control all the pages on your site.</p>
     * <p>It’s <em>strongly</em> recommended that you create a top-level file named <code>sw-import.js</code><br>containing only:</p>
     * <p><code>importScripts(&#39;bower_components/platinum-sw/service-worker.js&#39;);</code></p>
     * <p>(adjust to match the path where your <code>platinum-sw</code> element directory can be found).</p>
     * <p>This will ensure that your service worker script contains everything needed to play<br>nicely with the Service Worker Elements group.</p>
     *
     * JavaScript Info:
     * @property href
     * @type String
     * 
     */
    @JsProperty void setHref(String value);

    /**
     * <p>By default, the service worker will use a scope that applies to all pages at the same<br>directory level or lower. This is almost certainly what you want, as illustrated by the<br>following hypothetical serving setup:</p>
     * <pre><code>/root/
     *   service-worker.js
     *   index.html
     *   subdir1/
     *     index.html
     *   subdir2/
     *     index.html
     * </code></pre><p>So by default, registering <code>/root/service-worker.js</code> will cause the service worker’s scope<br>to cover <code>/root/index.html</code>, <code>/root/subdir1/index.html</code>, and /root/subdir2/index.html`.</p>
     * <p>If, for some reason, you need to register <code>/root/service-worker.js</code> from within<br><code>/root/subdir1/index.html</code>, <em>and</em> you want that registration to only cover<br><code>/root/subdir1/**</code>, you can override this <code>scope</code> property and set it to <code>&#39;./&#39;</code>.</p>
     * <p>There is more context about default scopes and how scope overrides work in<br><a href="http://stackoverflow.com/a/33881341/385997">this Stack Overflow</a> response.</p>
     *
     * JavaScript Info:
     * @property scope
     * @type String
     * 
     */
    @JsProperty String getScope();
    /**
     * <p>By default, the service worker will use a scope that applies to all pages at the same<br>directory level or lower. This is almost certainly what you want, as illustrated by the<br>following hypothetical serving setup:</p>
     * <pre><code>/root/
     *   service-worker.js
     *   index.html
     *   subdir1/
     *     index.html
     *   subdir2/
     *     index.html
     * </code></pre><p>So by default, registering <code>/root/service-worker.js</code> will cause the service worker’s scope<br>to cover <code>/root/index.html</code>, <code>/root/subdir1/index.html</code>, and /root/subdir2/index.html`.</p>
     * <p>If, for some reason, you need to register <code>/root/service-worker.js</code> from within<br><code>/root/subdir1/index.html</code>, <em>and</em> you want that registration to only cover<br><code>/root/subdir1/**</code>, you can override this <code>scope</code> property and set it to <code>&#39;./&#39;</code>.</p>
     * <p>There is more context about default scopes and how scope overrides work in<br><a href="http://stackoverflow.com/a/33881341/385997">this Stack Overflow</a> response.</p>
     *
     * JavaScript Info:
     * @property scope
     * @type String
     * 
     */
    @JsProperty void setScope(String value);

    /**
     * <p>The current state of the service worker registered by this element.</p>
     * <p>One of:</p>
     * <ul>
     * <li>‘installed’</li>
     * <li>‘updated’</li>
     * <li>‘error’</li>
     * <li>‘unsupported’</li>
     * </ul>
     *
     * JavaScript Info:
     * @property state
     * @type String
     * 
     */
    @JsProperty String getState();
    /**
     * <p>The current state of the service worker registered by this element.</p>
     * <p>One of:</p>
     * <ul>
     * <li>‘installed’</li>
     * <li>‘updated’</li>
     * <li>‘error’</li>
     * <li>‘unsupported’</li>
     * </ul>
     *
     * JavaScript Info:
     * @property state
     * @type String
     * 
     */
    @JsProperty void setState(String value);


    /**
     * <p>Registers the service worker based on the configuration options in this element and any<br>child elements.</p>
     * <p>If you set the <code>autoRegister</code> property to <code>true</code>, then this method is called automatically<br>at page load.<br>It can be useful to set <code>autoRegister</code> to <code>false</code> and then explicitly call this method if<br>there are options that are only configured after the page is loaded.</p>
     *
     * JavaScript Info:
     * @method register
     * 
     * 
     */
    void register();

}
