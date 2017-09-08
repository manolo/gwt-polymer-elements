/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-demo-helpers project by The Polymer Authors
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
 * <p><code>url-bar</code> is a helper element that displays a simple read-only URL bar if<br>and only if the page is in an iframe. In this way we can demo elements that<br>deal with the URL in our iframe-based demo environments.</p>
 * <p>If the page is not in an iframe, the url-bar element is not displayed.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--url-bar</code></td>
 * <td>Mixin applied to the entire element</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface UrlBarElement extends HTMLElement {

    @JsOverlay public static final String TAG = "url-bar";
    @JsOverlay public static final String SRC = "iron-demo-helpers/url-bar.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getInIframe();
    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Object
     * 
     */
    @JsProperty void setInIframe(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getUrl();
    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type Object
     * 
     */
    @JsProperty void setUrl(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty String getHash();
    /**
     * 
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty void setHash(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty String getPath();
    /**
     * 
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty void setPath(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty String getQuery();
    /**
     * 
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty void setQuery(String value);


}
