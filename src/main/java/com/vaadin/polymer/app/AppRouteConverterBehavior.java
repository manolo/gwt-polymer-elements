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
 * <p>Provides bidirectional mapping between <code>path</code> and <code>queryParams</code> and a<br>app-route compatible <code>route</code> object.</p>
 * <p>For more information, see the docs for <code>app-route-converter</code>.</p>
 */
@JsType(isNative=true)
public interface AppRouteConverterBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppRouteConverterBehavior";
    @JsOverlay public static final String SRC = "app-route/app-route-converter.html";


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
     * <p>A route object is the kernel of the routing system. It is intended to<br>be fed into consuming elements such as <code>app-route</code>.</p>
     *
     * JavaScript Info:
     * @property route
     * @type ?Object
     * 
     */
    @JsProperty JavaScriptObject getRoute();
    /**
     * <p>A model representing the deserialized path through the route tree, as<br>well as the current queryParams.</p>
     * <p>A route object is the kernel of the routing system. It is intended to<br>be fed into consuming elements such as <code>app-route</code>.</p>
     *
     * JavaScript Info:
     * @property route
     * @type ?Object
     * 
     */
    @JsProperty void setRoute(JavaScriptObject value);

    /**
     * <p>The serialized path through the route tree. This corresponds to the<br><code>window.location.pathname</code> value, and will update to reflect changes<br>to that value.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty String getPath();
    /**
     * <p>The serialized path through the route tree. This corresponds to the<br><code>window.location.pathname</code> value, and will update to reflect changes<br>to that value.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty void setPath(String value);


}
