/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>iron-request can be used to perform XMLHttpRequests.</p>
 * <pre><code>&lt;iron-request id=&quot;xhr&quot;&gt;&lt;/iron-request&gt;
 * ...
 * this.$.xhr.send({url: url, params: params});
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
     * <p>Aborts the request.</p>
     *
     * JavaScript Info:
     * @method abort
     * 
     */
    public void abort() {
        getPolymerElement().abort();
    }
  

  
    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    public boolean getAborted(){
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
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    public JavaScriptObject getCompletes(){
        return getPolymerElement().getCompletes();
    }
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    public void setCompletes(JavaScriptObject value) {
        getPolymerElement().setCompletes(value);
    }
   
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @attribute completes
     * 
     */
    public void setCompletes(String value) {
        getPolymerElement().setAttribute("completes", value);
    }
   
  

  
    /**
     * <p>Attempts to parse the response body of the XHR. If parsing succeeds,<br>the value returned will be deserialized based on the <code>responseType</code><br>set on the XHR.</p>
     *
     * JavaScript Info:
     * @method parseResponse
     * 
     */
    public void parseResponse() {
        getPolymerElement().parseResponse();
    }
  

  
    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    public JavaScriptObject getProgress(){
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
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @attribute progress
     * 
     */
    public void setProgress(String value) {
        getPolymerElement().setAttribute("progress", value);
    }
   
  

  
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type *
     * 
     */
    public JavaScriptObject getResponse(){
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
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @attribute response
     * 
     */
    public void setResponse(String value) {
        getPolymerElement().setAttribute("response", value);
    }
   
  

  
    /**
     * <p>Sends an HTTP request to the server and returns the XHR object.</p>
     *
     * JavaScript Info:
     * @method send
     * @param {{url: string, method: (string|undefined), async: (boolean|undefined), body: (ArrayBuffer|ArrayBufferView|Blob|Document|FormData|null|string|undefined), headers: (Object|undefined), handleAs: (string|undefined), withCredentials: (boolean|undefined)}} options  
     * 
     */
    public void send(JavaScriptObject options) {
        getPolymerElement().send(options);
    }
  

  
    /**
     * <p>Succeeded is true if the request succeeded. The request succeeded if the<br>status code is greater-than-or-equal-to 200, and less-than 300. Also,<br>the status code 0 is accepted as a success even though the outcome may<br>be ambiguous.</p>
     *
     * JavaScript Info:
     * @method succeeded
     * 
     */
    public void succeeded() {
        getPolymerElement().succeeded();
    }
  

  
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    public JavaScriptObject getXhr(){
        return getPolymerElement().getXhr();
    }
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    public void setXhr(JavaScriptObject value) {
        getPolymerElement().setXhr(value);
    }
   
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @attribute xhr
     * 
     */
    public void setXhr(String value) {
        getPolymerElement().setAttribute("xhr", value);
    }
   
  


}
