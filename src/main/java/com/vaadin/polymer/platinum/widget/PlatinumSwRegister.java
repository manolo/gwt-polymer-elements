/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-sw project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget;

import com.vaadin.polymer.platinum.*;

import com.vaadin.polymer.platinum.widget.event.ServiceWorkerErrorEvent;
import com.vaadin.polymer.platinum.widget.event.ServiceWorkerErrorEventHandler;

import com.vaadin.polymer.platinum.widget.event.ServiceWorkerInstalledEvent;
import com.vaadin.polymer.platinum.widget.event.ServiceWorkerInstalledEventHandler;

import com.vaadin.polymer.platinum.widget.event.ServiceWorkerUpdatedEvent;
import com.vaadin.polymer.platinum.widget.event.ServiceWorkerUpdatedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PlatinumSwRegister extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumSwRegister() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumSwRegister(String html) {
        super(PlatinumSwRegisterElement.TAG, PlatinumSwRegisterElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumSwRegisterElement getPolymerElement() {
        return (PlatinumSwRegisterElement) getElement();
    }


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
    public boolean getAutoRegister() {
        return getPolymerElement().getAutoRegister();
    }
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
    public void setAutoRegister(boolean value) {
        getPolymerElement().setAutoRegister(value);
    }

    /**
     * <p>Whether the activated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#clients-claim-method">take immediate control</a><br>of any pages under its scope.</p>
     * <p>If this is <code>false</code>, the service worker won’t have any effect until the next time the page<br>is visited/reloaded.<br>If this is <code>true</code>, it will take control and start handling events for the current page<br>(and any pages under the same scope open in other tabs/windows) as soon it’s active.</p>
     *
     * JavaScript Info:
     * @property clientsClaim
     * @type Boolean
     * 
     */
    public boolean getClientsClaim() {
        return getPolymerElement().getClientsClaim();
    }
    /**
     * <p>Whether the activated service worker should <a href="https://slightlyoff.github.io/ServiceWorker/spec/service_worker/#clients-claim-method">take immediate control</a><br>of any pages under its scope.</p>
     * <p>If this is <code>false</code>, the service worker won’t have any effect until the next time the page<br>is visited/reloaded.<br>If this is <code>true</code>, it will take control and start handling events for the current page<br>(and any pages under the same scope open in other tabs/windows) as soon it’s active.</p>
     *
     * JavaScript Info:
     * @property clientsClaim
     * @type Boolean
     * 
     */
    public void setClientsClaim(boolean value) {
        getPolymerElement().setClientsClaim(value);
    }

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
    public boolean getReloadOnInstall() {
        return getPolymerElement().getReloadOnInstall();
    }
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
    public void setReloadOnInstall(boolean value) {
        getPolymerElement().setReloadOnInstall(value);
    }

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
    public boolean getSkipWaiting() {
        return getPolymerElement().getSkipWaiting();
    }
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
    public void setSkipWaiting(boolean value) {
        getPolymerElement().setSkipWaiting(value);
    }

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
    public String getBaseUri() {
        return getPolymerElement().getBaseUri();
    }
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
    public void setBaseUri(String value) {
        getPolymerElement().setBaseUri(value);
    }

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
    public String getHref() {
        return getPolymerElement().getHref();
    }
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
    public void setHref(String value) {
        getPolymerElement().setHref(value);
    }

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
    public String getScope() {
        return getPolymerElement().getScope();
    }
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
    public void setScope(String value) {
        getPolymerElement().setScope(value);
    }

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
    public String getState() {
        return getPolymerElement().getState();
    }
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
    public void setState(String value) {
        getPolymerElement().setState(value);
    }



    /**
     * <p>Registers the service worker based on the configuration options in this element and any<br>child elements.</p>
     * <p>If you set the <code>autoRegister</code> property to <code>true</code>, then this method is called automatically<br>at page load.<br>It can be useful to set <code>autoRegister</code> to <code>false</code> and then explicitly call this method if<br>there are options that are only configured after the page is loaded.</p>
     *
     * JavaScript Info:
     * @method register
     * 
     * 
     */
    public void register() {
        getPolymerElement().register();
    }


    /**
     * <p>Fired when an error prevents the service worker installation from completing.</p>
     *
     * JavaScript Info:
     * @event service-worker-error
     */
    public HandlerRegistration addServiceWorkerErrorHandler(ServiceWorkerErrorEventHandler handler) {
        return addDomHandler(handler, ServiceWorkerErrorEvent.TYPE);
    }

    /**
     * <p>Fired when the initial service worker installation completes successfully.<br>The service worker will normally only be installed once, the first time a page with a<br><code>&lt;platinum-sw-register&gt;</code> element is visited in a given browser. If the same page is visited<br>again, the existing service worker will be reused, and there won’t be another<br><code>service-worker-installed</code> fired.</p>
     *
     * JavaScript Info:
     * @event service-worker-installed
     */
    public HandlerRegistration addServiceWorkerInstalledHandler(ServiceWorkerInstalledEventHandler handler) {
        return addDomHandler(handler, ServiceWorkerInstalledEvent.TYPE);
    }

    /**
     * <p>Fired when the service worker update flow completes successfully.<br>If you make changes to your <code>&lt;platinum-sw-register&gt;</code> configuration (i.e. by adding in new<br><code>&lt;platinum-sw-*&gt;</code> child elements, or changing their attributes), users who had the old<br>service worker installed will get the update installed when they see the modified elements.</p>
     *
     * JavaScript Info:
     * @event service-worker-updated
     */
    public HandlerRegistration addServiceWorkerUpdatedHandler(ServiceWorkerUpdatedEventHandler handler) {
        return addDomHandler(handler, ServiceWorkerUpdatedEvent.TYPE);
    }

}
