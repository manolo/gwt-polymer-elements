/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
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
 * <p>iron-request can be used to perform XMLHttpRequests.</p>
 * <pre><code>&lt;iron-request id=&quot;xhr&quot;&gt;&lt;/iron-request&gt;
 * ...
 * this.$.xhr.send({url: url, params: params});
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronRequestElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-request";
    @JsOverlay public static final String SRC = "iron-ajax/iron-ajax.html";


    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Promise
     * 
     */
    @JsProperty JavaScriptObject getCompletes();
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Promise
     * 
     */
    @JsProperty void setCompletes(JavaScriptObject value);

    /**
     * <p>Errored will be true if the browser fired an error event from the<br>XHR object (mainly network errors).</p>
     *
     * JavaScript Info:
     * @property errored
     * @type Boolean
     * 
     */
    @JsProperty boolean getErrored();
    /**
     * <p>Errored will be true if the browser fired an error event from the<br>XHR object (mainly network errors).</p>
     *
     * JavaScript Info:
     * @property errored
     * @type Boolean
     * 
     */
    @JsProperty void setErrored(boolean value);

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
     * <p>A reference to the status code, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property status
     * @type Number
     * 
     */
    @JsProperty double getStatus();
    /**
     * <p>A reference to the status code, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property status
     * @type Number
     * 
     */
    @JsProperty void setStatus(double value);

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty JavaScriptObject getXhr();
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty void setXhr(JavaScriptObject value);

    /**
     * <p>TimedOut will be true if the XHR threw a timeout event.</p>
     *
     * JavaScript Info:
     * @property timedOut
     * @type Boolean
     * 
     */
    @JsProperty boolean getTimedOut();
    /**
     * <p>TimedOut will be true if the XHR threw a timeout event.</p>
     *
     * JavaScript Info:
     * @property timedOut
     * @type Boolean
     * 
     */
    @JsProperty void setTimedOut(boolean value);

    /**
     * <p>A reference to the status text, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property statusText
     * @type String
     * 
     */
    @JsProperty String getStatusText();
    /**
     * <p>A reference to the status text, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property statusText
     * @type String
     * 
     */
    @JsProperty void setStatusText(String value);


    /**
     * <p>Sends an HTTP request to the server and returns the XHR object.</p>
     *
     * JavaScript Info:
     * @method send
     * @param {{url: string, method: (string|undefined), async: (boolean|undefined), body: (ArrayBuffer|ArrayBufferView|Blob|Document|FormData|null|string|undefined|Object), headers: (Object|undefined), handleAs: (string|undefined), jsonPrefix: (string|undefined), withCredentials: (boolean|undefined)}} options  
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject send(Object options);

    /**
     * <p>Aborts the request.</p>
     *
     * JavaScript Info:
     * @method abort
     * 
     * 
     */
    void abort();

    /**
     * <p>Attempts to parse the response body of the XHR. If parsing succeeds,<br>the value returned will be deserialized based on the <code>responseType</code><br>set on the XHR.</p>
     *
     * JavaScript Info:
     * @method parseResponse
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject parseResponse();

}
