/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-route project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>app-location</code> is an element that provides synchronization between the<br>browser location bar and the state of an app. When created, <code>app-location</code><br>elements will automatically watch the global location for changes. As changes<br>occur, <code>app-location</code> produces and updates an object called <code>route</code>. This<br><code>route</code> object is suitable for passing into a <code>app-route</code>, and other similar<br>elements.</p>
 * <p>An example of the public API of a route object that describes the URL<br><code>https://elements.polymer-project.org/elements/app-location</code>:</p>
 * <pre><code>{
 *   prefix: &#39;&#39;,
 *   path: &#39;/elements/app-location&#39;
 * }
 * 
 * 
 * </code></pre><p>Example Usage:</p>
 * <pre><code>&lt;app-location route=&quot;{{route}}&quot;&gt;&lt;/app-location&gt;
 * &lt;app-route route=&quot;{{route}}&quot; pattern=&quot;/:page&quot; data=&quot;{{data}}&quot;&gt;&lt;/app-route&gt;
 * 
 * 
 * </code></pre><p>As you can see above, the <code>app-location</code> element produces a <code>route</code> and that<br>property is then bound into the <code>app-route</code> element. The bindings are two-<br>directional, so when changes to the <code>route</code> object occur within <code>app-route</code>,<br>they automatically reflect back to the global location.</p>
 * <h3 id="hashes-vs-paths">Hashes vs Paths</h3>
 * <p>By default <code>app-location</code> routes using the pathname portion of the URL. This has<br>broad browser support but it does require cooperation of the backend server. An<br><code>app-location</code> can be configured to use the hash part of a URL instead using<br>the <code>use-hash-as-path</code> attribute, like so:</p>
 * <pre><code>&lt;app-location route=&quot;{{route}}&quot; use-hash-as-path&gt;&lt;/app-location&gt;
 * 
 * 
 * </code></pre><h3 id="integrating-with-other-routing-code">Integrating with other routing code</h3>
 * <p>There is no standard event that is fired when window.location is modified.<br><code>app-location</code> fires a <code>location-changed</code> event on <code>window</code> when it updates the<br>location. It also listens for that same event, and re-reads the URL when it’s<br>fired. This makes it very easy to interop with other routing code.</p>
 * <p>So for example if you want to navigate to <code>/new_path</code> imperatively you could<br>call <code>window.location.pushState</code> or <code>window.location.replaceState</code> followed by<br>firing a <code>location-changed</code> event on <code>window</code>. i.e.</p>
 * <pre><code>window.history.pushState({}, null, &#39;/new_path&#39;);
 * window.dispatchEvent(new CustomEvent(&#39;location-changed&#39;));
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface AppLocationElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-location";
    @JsOverlay public static final String SRC = "app-route/app-location.html";


    /**
     * <p>A set of key/value pairs that are universally accessible to branches of<br>the route tree.</p>
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    @JsProperty JavaScriptObject getQueryParams();
    /**
     * <p>A set of key/value pairs that are universally accessible to branches of<br>the route tree.</p>
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    @JsProperty void setQueryParams(JavaScriptObject value);

    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     *
     * JavaScript Info:
     * @property route
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getRoute();
    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     *
     * JavaScript Info:
     * @property route
     * @type Object
     * 
     */
    @JsProperty void setRoute(JavaScriptObject value);

    /**
     * <p>A regexp that defines the set of URLs that should be considered part<br>of this web app.</p>
     * <p>Clicking on a link that matches this regex won’t result in a full page<br>navigation, but will instead just update the URL state in place.</p>
     * <p>This regexp is given everything after the origin in an absolute<br>URL. So to match just URLs that start with /search/ do:<br>    url-space-regex=”^/search/“</p>
     *
     * JavaScript Info:
     * @property urlSpaceRegex
     * @type (string|RegExp)
     * 
     */
    @JsProperty Object getUrlSpaceRegex();
    /**
     * <p>A regexp that defines the set of URLs that should be considered part<br>of this web app.</p>
     * <p>Clicking on a link that matches this regex won’t result in a full page<br>navigation, but will instead just update the URL state in place.</p>
     * <p>This regexp is given everything after the origin in an absolute<br>URL. So to match just URLs that start with /search/ do:<br>    url-space-regex=”^/search/“</p>
     *
     * JavaScript Info:
     * @property urlSpaceRegex
     * @type (string|RegExp)
     * 
     */
    @JsProperty void setUrlSpaceRegex(Object value);

    /**
     * <p>In many scenarios, it is convenient to treat the <code>hash</code> as a stand-in<br>alternative to the <code>path</code>. For example, if deploying an app to a static<br>web server (e.g., Github Pages) - where one does not have control over<br>server-side routing - it is usually a better experience to use the hash<br>to represent paths through one’s app.</p>
     * <p>When this property is set to true, the <code>hash</code> will be used in place of</p>
     * <p>the <code>path</code> for generating a <code>route</code>.</p>
     *
     * JavaScript Info:
     * @property useHashAsPath
     * @type Boolean
     * 
     */
    @JsProperty boolean getUseHashAsPath();
    /**
     * <p>In many scenarios, it is convenient to treat the <code>hash</code> as a stand-in<br>alternative to the <code>path</code>. For example, if deploying an app to a static<br>web server (e.g., Github Pages) - where one does not have control over<br>server-side routing - it is usually a better experience to use the hash<br>to represent paths through one’s app.</p>
     * <p>When this property is set to true, the <code>hash</code> will be used in place of</p>
     * <p>the <code>path</code> for generating a <code>route</code>.</p>
     *
     * JavaScript Info:
     * @property useHashAsPath
     * @type Boolean
     * 
     */
    @JsProperty void setUseHashAsPath(boolean value);

    /**
     * <p>The route path, which will be either the hash or the path, depending<br>on useHashAsPath.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty String getPath();
    /**
     * <p>The route path, which will be either the hash or the path, depending<br>on useHashAsPath.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty void setPath(String value);


}
