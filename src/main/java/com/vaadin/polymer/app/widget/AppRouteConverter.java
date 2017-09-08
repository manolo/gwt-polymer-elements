/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-route project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>app-route-converter</code> provides a means to convert a path and query<br>parameters into a route object and vice versa. This produced route object<br>is to be fed into route-consuming elements such as <code>app-route</code>.</p>
 * <blockquote>
 * <p>n.b. This element is intended to be a primitive of the routing system and for<br>creating bespoke routing solutions from scratch. To simply include routing in<br>an app, please refer to <a href="https://github.com/PolymerElements/app-route/blob/master/app-location.html">app-location</a><br>and <a href="https://github.com/PolymerElements/app-route/blob/master/app-route.html">app-route</a>.</p>
 * </blockquote>
 * <p>An example of a route object that describes<br><code>https://elements.polymer-project.org/elements/app-route-converter?foo=bar&amp;baz=qux</code><br>and should be passed to other <code>app-route</code> elements:</p>
 * <pre><code>{
 *   prefix: &#39;&#39;,
 *   path: &#39;/elements/app-route-converter&#39;,
 *   __queryParams: {
 *     foo: &#39;bar&#39;,
 *     baz: &#39;qux&#39;
 *   }
 * }
 * 
 * 
 * </code></pre><p><code>__queryParams</code> is private to discourage directly data-binding to it. This is so<br>that routing elements like <code>app-route</code> can intermediate changes to the query<br>params and choose whether to propagate them upstream or not. <code>app-route</code> for<br>example will not propagate changes to its <code>queryParams</code> property if it is not<br>currently active. A public queryParams object will also be produced in which you<br>should perform data-binding operations.</p>
 * <p>Example Usage:</p>
 * <pre><code>&lt;iron-location path=&quot;{{path}}&quot; query=&quot;{{query}}&quot;&gt;&lt;/iron-location&gt;
 * &lt;iron-query-params
 *     params-string=&quot;{{query}}&quot;
 *     params-object=&quot;{{queryParams}}&quot;&gt;
 * &lt;/iron-query-params&gt;
 * &lt;app-route-converter
 *     path=&quot;{{path}}&quot;
 *     query-params=&quot;{{queryParams}}&quot;
 *     route=&quot;{{route}}&quot;&gt;
 * &lt;/app-route-converter&gt;
 * &lt;app-route route=&#39;{{route}}&#39; pattern=&#39;/:page&#39; data=&#39;{{data}}&#39;&gt;
 * &lt;/app-route&gt;
 * 
 * 
 * </code></pre><p>This is a simplified implementation of the <code>app-location</code> element. Here the<br><code>iron-location</code> produces a path and a query, the <code>iron-query-params</code> consumes<br>the query and produces a queryParams object, and the <code>app-route-converter</code><br>consumes the path and the query params and converts it into a route which is in<br>turn is consumed by the <code>app-route</code>.</p>
 */
public class AppRouteConverter extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppRouteConverter() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppRouteConverter(String html) {
        super(AppRouteConverterElement.TAG, AppRouteConverterElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppRouteConverterElement getPolymerElement() {
        return (AppRouteConverterElement) getElement();
    }


    /**
     * <p>A set of key/value pairs that are universally accessible to branches of<br>the route tree.</p>
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    public JavaScriptObject getQueryParams() {
        return getPolymerElement().getQueryParams();
    }
    /**
     * <p>A set of key/value pairs that are universally accessible to branches of<br>the route tree.</p>
     *
     * JavaScript Info:
     * @property queryParams
     * @type ?Object
     * 
     */
    public void setQueryParams(JavaScriptObject value) {
        getPolymerElement().setQueryParams(value);
    }

    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     * <p>A route object is the kernel of the routing system. It is intended to<br>be fed into consuming elements such as <code>app-route</code>.</p>
     *
     * JavaScript Info:
     * @property route
     * @type ?Object
     * 
     */
    public JavaScriptObject getRoute() {
        return getPolymerElement().getRoute();
    }
    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     * <p>A route object is the kernel of the routing system. It is intended to<br>be fed into consuming elements such as <code>app-route</code>.</p>
     *
     * JavaScript Info:
     * @property route
     * @type ?Object
     * 
     */
    public void setRoute(JavaScriptObject value) {
        getPolymerElement().setRoute(value);
    }

    /**
     * <p>The serialized path through the route tree. This corresponds to the<br><code>window.location.pathname</code> value, and will update to reflect changes<br>to that value.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    public String getPath() {
        return getPolymerElement().getPath();
    }
    /**
     * <p>The serialized path through the route tree. This corresponds to the<br><code>window.location.pathname</code> value, and will update to reflect changes<br>to that value.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    public void setPath(String value) {
        getPolymerElement().setPath(value);
    }


    // Needed in UIBinder
    /**
     * <p>A set of key/value pairs that are universally accessible to branches of<br>the route tree.</p>
     *
     * JavaScript Info:
     * @attribute query-params
     * 
     */
    public void setQueryParams(String value) {
        Polymer.property(this.getPolymerElement(), "queryParams", value);
    }

    // Needed in UIBinder
    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     * <p>A route object is the kernel of the routing system. It is intended to<br>be fed into consuming elements such as <code>app-route</code>.</p>
     *
     * JavaScript Info:
     * @attribute route
     * 
     */
    public void setRoute(String value) {
        Polymer.property(this.getPolymerElement(), "route", value);
    }



}
