/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.ErrorEvent;
import com.vaadin.polymer.iron.widget.event.ErrorEventHandler;

import com.vaadin.polymer.iron.widget.event.RequestEvent;
import com.vaadin.polymer.iron.widget.event.RequestEventHandler;

import com.vaadin.polymer.iron.widget.event.ResponseEvent;
import com.vaadin.polymer.iron.widget.event.ResponseEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>iron-ajax</code> element exposes network request functionality.</p>
 * <pre><code>&lt;iron-ajax
 *     auto
 *     url=&quot;https://www.googleapis.com/youtube/v3/search&quot;
 *     params=&#39;{&quot;part&quot;:&quot;snippet&quot;, &quot;q&quot;:&quot;polymer&quot;, &quot;key&quot;: &quot;YOUTUBE_API_KEY&quot;, &quot;type&quot;: &quot;video&quot;}&#39;
 *     handle-as=&quot;json&quot;
 *     on-response=&quot;handleResponse&quot;
 *     debounce-duration=&quot;300&quot;&gt;&lt;/iron-ajax&gt;
 * 
 * 
 * </code></pre><p>With <code>auto</code> set to <code>true</code>, the element performs a request whenever<br>its <code>url</code>, <code>params</code> or <code>body</code> properties are changed. Automatically generated<br>requests will be debounced in the case that multiple attributes are changed<br>sequentially.</p>
 * <p>Note: The <code>params</code> attribute must be double quoted JSON.</p>
 * <p>You can trigger a request explicitly by calling <code>generateRequest</code> on the<br>element.</p>
 */
public class IronAjax extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronAjax() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronAjax(String html) {
        super(IronAjaxElement.TAG, IronAjaxElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronAjaxElement getPolymerElement() {
        return (IronAjaxElement) getElement();
    }


    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    public JsArray getActiveRequests() {
        return getPolymerElement().getActiveRequests();
    }
    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    public void setActiveRequests(JsArray value) {
        getPolymerElement().setActiveRequests(value);
    }

    /**
     * <p>By default, iron-ajax’s events do not bubble. Setting this attribute will cause its<br>request and response events as well as its iron-ajax-request, -response,  and -error<br>events to bubble to the window object. The vanilla error event never bubbles when<br>using shadow dom even if this.bubbles is true because a scoped flag is not passed with<br>it (first link) and because the shadow dom spec did not used to allow certain events,<br>including events named error, to leak outside of shadow trees (second link).<br><a href="https://www.w3.org/TR/shadow-dom/#scoped-flag">https://www.w3.org/TR/shadow-dom/#scoped-flag</a><br><a href="https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees">https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees</a></p>
     *
     * JavaScript Info:
     * @property bubbles
     * @type Boolean
     * 
     */
    public boolean getBubbles() {
        return getPolymerElement().getBubbles();
    }
    /**
     * <p>By default, iron-ajax’s events do not bubble. Setting this attribute will cause its<br>request and response events as well as its iron-ajax-request, -response,  and -error<br>events to bubble to the window object. The vanilla error event never bubbles when<br>using shadow dom even if this.bubbles is true because a scoped flag is not passed with<br>it (first link) and because the shadow dom spec did not used to allow certain events,<br>including events named error, to leak outside of shadow trees (second link).<br><a href="https://www.w3.org/TR/shadow-dom/#scoped-flag">https://www.w3.org/TR/shadow-dom/#scoped-flag</a><br><a href="https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees">https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees</a></p>
     *
     * JavaScript Info:
     * @property bubbles
     * @type Boolean
     * 
     */
    public void setBubbles(boolean value) {
        getPolymerElement().setBubbles(value);
    }

    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    public boolean getWithCredentials() {
        return getPolymerElement().getWithCredentials();
    }
    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    public void setWithCredentials(boolean value) {
        getPolymerElement().setWithCredentials(value);
    }

    /**
     * <p>Length of time in milliseconds to debounce multiple automatically generated requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    public double getDebounceDuration() {
        return getPolymerElement().getDebounceDuration();
    }
    /**
     * <p>Length of time in milliseconds to debounce multiple automatically generated requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    public void setDebounceDuration(double value) {
        getPolymerElement().setDebounceDuration(value);
    }

    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    public boolean getVerbose() {
        return getPolymerElement().getVerbose();
    }
    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    public void setVerbose(boolean value) {
        getPolymerElement().setVerbose(value);
    }

    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    public boolean getAuto() {
        return getPolymerElement().getAuto();
    }
    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    public void setAuto(boolean value) {
        getPolymerElement().setAuto(value);
    }

    /**
     * <p>Set the timeout flag on the request.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    public double getTimeout() {
        return getPolymerElement().getTimeout();
    }
    /**
     * <p>Set the timeout flag on the request.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    public void setTimeout(double value) {
        getPolymerElement().setTimeout(value);
    }

    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    public boolean getSync() {
        return getPolymerElement().getSync();
    }
    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    public void setSync(boolean value) {
        getPolymerElement().setSync(value);
    }

    /**
     * <p>lastRequest’s error, if any.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    public JavaScriptObject getLastError() {
        return getPolymerElement().getLastError();
    }
    /**
     * <p>lastRequest’s error, if any.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    public void setLastError(JavaScriptObject value) {
        getPolymerElement().setLastError(value);
    }

    /**
     * <p>The most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    public JavaScriptObject getLastRequest() {
        return getPolymerElement().getLastRequest();
    }
    /**
     * <p>The most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    public void setLastRequest(JavaScriptObject value) {
        getPolymerElement().setLastRequest(value);
    }

    /**
     * <p>lastRequest’s response.</p>
     * <p>Note that lastResponse and lastError are set when lastRequest finishes,<br>so if loading is true, then lastResponse and lastError will correspond<br>to the result of the previous request.</p>
     * <p>The type of the response is determined by the value of <code>handleAs</code> at<br>the time that the request was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    public JavaScriptObject getLastResponse() {
        return getPolymerElement().getLastResponse();
    }
    /**
     * <p>lastRequest’s response.</p>
     * <p>Note that lastResponse and lastError are set when lastRequest finishes,<br>so if loading is true, then lastResponse and lastError will correspond<br>to the result of the previous request.</p>
     * <p>The type of the response is determined by the value of <code>handleAs</code> at<br>the time that the request was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    public void setLastResponse(JavaScriptObject value) {
        getPolymerElement().setLastResponse(value);
    }

    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * 
     * </code></pre><p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    public JavaScriptObject getHeaders() {
        return getPolymerElement().getHeaders();
    }
    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * 
     * </code></pre><p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    public void setHeaders(JavaScriptObject value) {
        getPolymerElement().setHeaders(value);
    }

    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request. If you wish to set the body<br>content when making a POST request, you should use the <code>body</code> property<br>instead.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    public JavaScriptObject getParams() {
        return getPolymerElement().getParams();
    }
    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request. If you wish to set the body<br>content when making a POST request, you should use the <code>body</code> property<br>instead.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    public void setParams(JavaScriptObject value) {
        getPolymerElement().setParams(value);
    }

    /**
     * <p>Body content to send with the request, typically used with “POST”<br>requests.</p>
     * <p>If body is a string it will be sent unmodified.</p>
     * <p>If Content-Type is set to a value listed below, then<br>the body will be encoded accordingly.</p>
     * <ul>
     * <li><code>content-type=&quot;application/json&quot;</code><ul>
     * <li>body is encoded like <code>{&quot;foo&quot;:&quot;bar baz&quot;,&quot;x&quot;:1}</code></li>
     * </ul>
     * </li>
     * <li><code>content-type=&quot;application/x-www-form-urlencoded&quot;</code><ul>
     * <li>body is encoded like <code>foo=bar+baz&amp;x=1</code></li>
     * </ul>
     * </li>
     * </ul>
     * <p>Otherwise the body will be passed to the browser unmodified, and it<br>will handle any encoding (e.g. for FormData, Blob, ArrayBuffer).</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    public JavaScriptObject getBody() {
        return getPolymerElement().getBody();
    }
    /**
     * <p>Body content to send with the request, typically used with “POST”<br>requests.</p>
     * <p>If body is a string it will be sent unmodified.</p>
     * <p>If Content-Type is set to a value listed below, then<br>the body will be encoded accordingly.</p>
     * <ul>
     * <li><code>content-type=&quot;application/json&quot;</code><ul>
     * <li>body is encoded like <code>{&quot;foo&quot;:&quot;bar baz&quot;,&quot;x&quot;:1}</code></li>
     * </ul>
     * </li>
     * <li><code>content-type=&quot;application/x-www-form-urlencoded&quot;</code><ul>
     * <li>body is encoded like <code>foo=bar+baz&amp;x=1</code></li>
     * </ul>
     * </li>
     * </ul>
     * <p>Otherwise the body will be passed to the browser unmodified, and it<br>will handle any encoding (e.g. for FormData, Blob, ArrayBuffer).</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    public void setBody(JavaScriptObject value) {
        getPolymerElement().setBody(value);
    }

    /**
     * <p>True while lastRequest is in flight.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p>True while lastRequest is in flight.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
    }

    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    public String getMethod() {
        return getPolymerElement().getMethod();
    }
    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    public void setMethod(String value) {
        getPolymerElement().setMethod(value);
    }

    /**
     * <p>Prefix to be stripped from a JSON response before parsing it.</p>
     * <p>In order to prevent an attack using CSRF with Array responses<br>(<a href="http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/">http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/</a>)<br>many backends will mitigate this by prefixing all JSON response bodies<br>with a string that would be nonsensical to a JavaScript parser.</p>
     *
     * JavaScript Info:
     * @property jsonPrefix
     * @type String
     * 
     */
    public String getJsonPrefix() {
        return getPolymerElement().getJsonPrefix();
    }
    /**
     * <p>Prefix to be stripped from a JSON response before parsing it.</p>
     * <p>In order to prevent an attack using CSRF with Array responses<br>(<a href="http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/">http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/</a>)<br>many backends will mitigate this by prefixing all JSON response bodies<br>with a string that would be nonsensical to a JavaScript parser.</p>
     *
     * JavaScript Info:
     * @property jsonPrefix
     * @type String
     * 
     */
    public void setJsonPrefix(String value) {
        getPolymerElement().setJsonPrefix(value);
    }

    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public String getUrl() {
        return getPolymerElement().getUrl();
    }
    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public void setUrl(String value) {
        getPolymerElement().setUrl(value);
    }

    /**
     * <p>Specifies what data to store in the <code>response</code> property, and<br>to deliver as <code>event.detail.response</code> in <code>response</code> events.</p>
     * <p>One of:</p>
     * <p>   <code>text</code>: uses <code>XHR.responseText</code>.</p>
     * <p>   <code>xml</code>: uses <code>XHR.responseXML</code>.</p>
     * <p>   <code>json</code>: uses <code>XHR.responseText</code> parsed as JSON.</p>
     * <p>   <code>arraybuffer</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>blob</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>document</code>: uses <code>XHR.response</code>.</p>
     *
     * JavaScript Info:
     * @property handleAs
     * @type String
     * 
     */
    public String getHandleAs() {
        return getPolymerElement().getHandleAs();
    }
    /**
     * <p>Specifies what data to store in the <code>response</code> property, and<br>to deliver as <code>event.detail.response</code> in <code>response</code> events.</p>
     * <p>One of:</p>
     * <p>   <code>text</code>: uses <code>XHR.responseText</code>.</p>
     * <p>   <code>xml</code>: uses <code>XHR.responseXML</code>.</p>
     * <p>   <code>json</code>: uses <code>XHR.responseText</code> parsed as JSON.</p>
     * <p>   <code>arraybuffer</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>blob</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>document</code>: uses <code>XHR.response</code>.</p>
     *
     * JavaScript Info:
     * @property handleAs
     * @type String
     * 
     */
    public void setHandleAs(String value) {
        getPolymerElement().setHandleAs(value);
    }

    /**
     * <p>Content type to use when sending data. If the <code>contentType</code> property<br>is set and a <code>Content-Type</code> header is specified in the <code>headers</code><br>property, the <code>headers</code> property value will take precedence.</p>
     * <p>Varies the handling of the <code>body</code> param.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public String getContentType() {
        return getPolymerElement().getContentType();
    }
    /**
     * <p>Content type to use when sending data. If the <code>contentType</code> property<br>is set and a <code>Content-Type</code> header is specified in the <code>headers</code><br>property, the <code>headers</code> property value will take precedence.</p>
     * <p>Varies the handling of the <code>body</code> param.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public void setContentType(String value) {
        getPolymerElement().setContentType(value);
    }


    // Needed in UIBinder
    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @attribute active-requests
     * 
     */
    public void setActiveRequests(String value) {
        Polymer.property(this.getPolymerElement(), "activeRequests", value);
    }

    // Needed in UIBinder
    /**
     * <p>Length of time in milliseconds to debounce multiple automatically generated requests.</p>
     *
     * JavaScript Info:
     * @attribute debounce-duration
     * 
     */
    public void setDebounceDuration(String value) {
        Polymer.property(this.getPolymerElement(), "debounceDuration", value);
    }

    // Needed in UIBinder
    /**
     * <p>Set the timeout flag on the request.</p>
     *
     * JavaScript Info:
     * @attribute timeout
     * 
     */
    public void setTimeout(String value) {
        Polymer.property(this.getPolymerElement(), "timeout", value);
    }

    // Needed in UIBinder
    /**
     * <p>The most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @attribute last-request
     * 
     */
    public void setLastRequest(String value) {
        Polymer.property(this.getPolymerElement(), "lastRequest", value);
    }

    // Needed in UIBinder
    /**
     * <p>lastRequest’s response.</p>
     * <p>Note that lastResponse and lastError are set when lastRequest finishes,<br>so if loading is true, then lastResponse and lastError will correspond<br>to the result of the previous request.</p>
     * <p>The type of the response is determined by the value of <code>handleAs</code> at<br>the time that the request was generated.</p>
     *
     * JavaScript Info:
     * @attribute last-response
     * 
     */
    public void setLastResponse(String value) {
        Polymer.property(this.getPolymerElement(), "lastResponse", value);
    }

    // Needed in UIBinder
    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * 
     * </code></pre><p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @attribute headers
     * 
     */
    public void setHeaders(String value) {
        Polymer.property(this.getPolymerElement(), "headers", value);
    }

    // Needed in UIBinder
    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request. If you wish to set the body<br>content when making a POST request, you should use the <code>body</code> property<br>instead.</p>
     *
     * JavaScript Info:
     * @attribute params
     * 
     */
    public void setParams(String value) {
        Polymer.property(this.getPolymerElement(), "params", value);
    }

    // Needed in UIBinder
    /**
     * <p>Body content to send with the request, typically used with “POST”<br>requests.</p>
     * <p>If body is a string it will be sent unmodified.</p>
     * <p>If Content-Type is set to a value listed below, then<br>the body will be encoded accordingly.</p>
     * <ul>
     * <li><code>content-type=&quot;application/json&quot;</code><ul>
     * <li>body is encoded like <code>{&quot;foo&quot;:&quot;bar baz&quot;,&quot;x&quot;:1}</code></li>
     * </ul>
     * </li>
     * <li><code>content-type=&quot;application/x-www-form-urlencoded&quot;</code><ul>
     * <li>body is encoded like <code>foo=bar+baz&amp;x=1</code></li>
     * </ul>
     * </li>
     * </ul>
     * <p>Otherwise the body will be passed to the browser unmodified, and it<br>will handle any encoding (e.g. for FormData, Blob, ArrayBuffer).</p>
     *
     * JavaScript Info:
     * @attribute body
     * 
     */
    public void setBody(String value) {
        Polymer.property(this.getPolymerElement(), "body", value);
    }

    // Needed in UIBinder
    /**
     * <p>lastRequest’s error, if any.</p>
     *
     * JavaScript Info:
     * @attribute last-error
     * 
     */
    public void setLastError(String value) {
        Polymer.property(this.getPolymerElement(), "lastError", value);
    }


    /**
     * <p>Performs an AJAX request to the specified URL.</p>
     *
     * JavaScript Info:
     * @method generateRequest
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject generateRequest() {
        return getPolymerElement().generateRequest();
    }

    /**
     * <p>Request options suitable for generating an <code>iron-request</code> instance based<br>on the current state of the <code>iron-ajax</code> instance’s properties.</p>
     *
     * JavaScript Info:
     * @method toRequestOptions
     * 
     * @return {Object}
     */
    public Object toRequestOptions() {
        return getPolymerElement().toRequestOptions();
    }


    /**
     * <p>Fired when an error is received.</p>
     *
     * JavaScript Info:
     * @event error
     */
    public HandlerRegistration addErrorHandler(ErrorEventHandler handler) {
        return addDomHandler(handler, ErrorEvent.TYPE);
    }

    /**
     * <p>Fired when a request is sent.</p>
     *
     * JavaScript Info:
     * @event request
     */
    public HandlerRegistration addRequestHandler(RequestEventHandler handler) {
        return addDomHandler(handler, RequestEvent.TYPE);
    }

    /**
     * <p>Fired when a response is received.</p>
     *
     * JavaScript Info:
     * @event response
     */
    public HandlerRegistration addResponseHandler(ResponseEventHandler handler) {
        return addDomHandler(handler, ResponseEvent.TYPE);
    }

}
