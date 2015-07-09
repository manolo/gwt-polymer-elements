/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>iron-request can be used to perform XMLHttpRequests.</p>
 * <pre><code>&lt;iron-request id=&quot;xhr&quot;&gt;&lt;/iron-request&gt;
 * ...
 * this.$.xhr.send({url: url, params: params});
 * 
 * </code></pre>
 */
@JsType
public interface IronRequestElement extends HTMLElement {

    public static final String TAG = "iron-request";
    public static final String SRC = "iron-ajax/iron-ajax.html";


    /**
     * <p>Aborts the request.</p>
     *
     * JavaScript Info:
     * @method abort
     * 
     */
    void abort();

    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    @JsProperty boolean getAborted();
    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    @JsProperty void setAborted(boolean value);
  
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getCompletes();
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    @JsProperty void setCompletes(JavaScriptObject value);
  
    /**
     * <p>Attempts to parse the response body of the XHR. If parsing succeeds,<br>the value returned will be deserialized based on the <code>responseType</code><br>set on the XHR.</p>
     *
     * JavaScript Info:
     * @method parseResponse
     * 
     */
    void parseResponse();

    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getProgress();
    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    @JsProperty void setProgress(JavaScriptObject value);
  
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type *
     * 
     */
    @JsProperty JavaScriptObject getResponse();
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type *
     * 
     */
    @JsProperty void setResponse(JavaScriptObject value);
  
    /**
     * <p>Sends an HTTP request to the server and returns the XHR object.</p>
     *
     * JavaScript Info:
     * @method send
     * @param {{url: string, method: (string|undefined), async: (boolean|undefined), body: (ArrayBuffer|ArrayBufferView|Blob|Document|FormData|null|string|undefined), headers: (Object|undefined), handleAs: (string|undefined), withCredentials: (boolean|undefined)}} options  
     * 
     */
    void send(JavaScriptObject options);

    /**
     * <p>Succeeded is true if the request succeeded. The request succeeded if the<br>status code is greater-than-or-equal-to 200, and less-than 300. Also,<br>the status code 0 is accepted as a success even though the outcome may<br>be ambiguous.</p>
     *
     * JavaScript Info:
     * @method succeeded
     * 
     */
    void succeeded();

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getXhr();
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    @JsProperty void setXhr(JavaScriptObject value);
  
}
