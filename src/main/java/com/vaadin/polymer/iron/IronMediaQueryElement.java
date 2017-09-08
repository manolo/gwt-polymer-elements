/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-media-query project by The Polymer Authors
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
 * <p><code>iron-media-query</code> can be used to data bind to a CSS media query.<br>The <code>query</code> property is a bare CSS media query.<br>The <code>query-matches</code> property is a boolean representing whether the page matches that media query.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{queryMatches}}&quot;&gt;&lt;/iron-media-query&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronMediaQueryElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-media-query";
    @JsOverlay public static final String SRC = "iron-media-query/iron-media-query.html";


    /**
     * <p>If true, the query attribute is assumed to be a complete media query<br>string rather than a single media feature.</p>
     *
     * JavaScript Info:
     * @property full
     * @type Boolean
     * 
     */
    @JsProperty boolean getFull();
    /**
     * <p>If true, the query attribute is assumed to be a complete media query<br>string rather than a single media feature.</p>
     *
     * JavaScript Info:
     * @property full
     * @type Boolean
     * 
     */
    @JsProperty void setFull(boolean value);

    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    @JsProperty boolean getQueryMatches();
    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    @JsProperty void setQueryMatches(boolean value);

    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty String getQuery();
    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty void setQuery(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method queryHandler
     * @param {} mq  
     * 
     * 
     */
    void queryHandler(Object mq);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryChanged
     * 
     * 
     */
    void queryChanged();

}
