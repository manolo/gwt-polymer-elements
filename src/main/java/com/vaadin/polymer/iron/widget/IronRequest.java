/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>iron-request can be used to perform XMLHttpRequests.</p>
 * <pre><code>&lt;iron-request id=&quot;xhr&quot;&gt;&lt;/iron-request&gt;
 * ...
 * this.$.xhr.send({url: url, body: params});
 * 
 * </code></pre>
 */
public class IronRequest extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronRequest() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronRequest(String html) {
        super(IronRequestElement.TAG, IronRequestElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronRequestElement getPolymerElement() {
        return (IronRequestElement) getElement();
    }


    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Promise
     * 
     */
    public JavaScriptObject getCompletes() {
        return getPolymerElement().getCompletes();
    }
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Promise
     * 
     */
    public void setCompletes(JavaScriptObject value) {
        getPolymerElement().setCompletes(value);
    }

    /**
     * <p>Errored will be true if the browser fired an error event from the<br>XHR object (mainly network errors).</p>
     *
     * JavaScript Info:
     * @property errored
     * @type Boolean
     * 
     */
    public boolean getErrored() {
        return getPolymerElement().getErrored();
    }
    /**
     * <p>Errored will be true if the browser fired an error event from the<br>XHR object (mainly network errors).</p>
     *
     * JavaScript Info:
     * @property errored
     * @type Boolean
     * 
     */
    public void setErrored(boolean value) {
        getPolymerElement().setErrored(value);
    }

    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    public JavaScriptObject getProgress() {
        return getPolymerElement().getProgress();
    }
    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    public void setProgress(JavaScriptObject value) {
        getPolymerElement().setProgress(value);
    }

    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type *
     * 
     */
    public JavaScriptObject getResponse() {
        return getPolymerElement().getResponse();
    }
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type *
     * 
     */
    public void setResponse(JavaScriptObject value) {
        getPolymerElement().setResponse(value);
    }

    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    public boolean getAborted() {
        return getPolymerElement().getAborted();
    }
    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    public void setAborted(boolean value) {
        getPolymerElement().setAborted(value);
    }

    /**
     * <p>A reference to the status code, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property status
     * @type Number
     * 
     */
    public double getStatus() {
        return getPolymerElement().getStatus();
    }
    /**
     * <p>A reference to the status code, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property status
     * @type Number
     * 
     */
    public void setStatus(double value) {
        getPolymerElement().setStatus(value);
    }

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public JavaScriptObject getXhr() {
        return getPolymerElement().getXhr();
    }
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public void setXhr(JavaScriptObject value) {
        getPolymerElement().setXhr(value);
    }

    /**
     * <p>TimedOut will be true if the XHR threw a timeout event.</p>
     *
     * JavaScript Info:
     * @property timedOut
     * @type Boolean
     * 
     */
    public boolean getTimedOut() {
        return getPolymerElement().getTimedOut();
    }
    /**
     * <p>TimedOut will be true if the XHR threw a timeout event.</p>
     *
     * JavaScript Info:
     * @property timedOut
     * @type Boolean
     * 
     */
    public void setTimedOut(boolean value) {
        getPolymerElement().setTimedOut(value);
    }

    /**
     * <p>A reference to the status text, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property statusText
     * @type String
     * 
     */
    public String getStatusText() {
        return getPolymerElement().getStatusText();
    }
    /**
     * <p>A reference to the status text, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @property statusText
     * @type String
     * 
     */
    public void setStatusText(String value) {
        getPolymerElement().setStatusText(value);
    }


    // Needed in UIBinder
    /**
     * <p>A reference to the status code, if the <code>xhr</code> has completely resolved.</p>
     *
     * JavaScript Info:
     * @attribute status
     * 
     */
    public void setStatus(String value) {
        Polymer.property(this.getPolymerElement(), "status", value);
    }

    // Needed in UIBinder
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @attribute completes
     * 
     */
    public void setCompletes(String value) {
        Polymer.property(this.getPolymerElement(), "completes", value);
    }

    // Needed in UIBinder
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @attribute response
     * 
     */
    public void setResponse(String value) {
        Polymer.property(this.getPolymerElement(), "response", value);
    }

    // Needed in UIBinder
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @attribute xhr
     * 
     */
    public void setXhr(String value) {
        Polymer.property(this.getPolymerElement(), "xhr", value);
    }

    // Needed in UIBinder
    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @attribute progress
     * 
     */
    public void setProgress(String value) {
        Polymer.property(this.getPolymerElement(), "progress", value);
    }


    /**
     * <p>Sends an HTTP request to the server and returns the XHR object.</p>
     * <p>The handling of the <code>body</code> parameter will vary based on the Content-Type<br>header. See the docs for iron-ajax’s <code>body</code> param for details.</p>
     *
     * JavaScript Info:
     * @method send
     * @param {{url: string, method: (string|undefined), async: (boolean|undefined), body: (ArrayBuffer|ArrayBufferView|Blob|Document|FormData|null|string|undefined|Object), headers: (Object|undefined), handleAs: (string|undefined), jsonPrefix: (string|undefined), withCredentials: (boolean|undefined)}} options  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject send(Object options) {
        return getPolymerElement().send(options);
    }

    /**
     * <p>Aborts the request.</p>
     *
     * JavaScript Info:
     * @method abort
     * 
     * 
     */
    public void abort() {
        getPolymerElement().abort();
    }

    /**
     * <p>Attempts to parse the response body of the XHR. If parsing succeeds,<br>the value returned will be deserialized based on the <code>responseType</code><br>set on the XHR.</p>
     *
     * JavaScript Info:
     * @method parseResponse
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject parseResponse() {
        return getPolymerElement().parseResponse();
    }


}
