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
@JsType(isNative=true)
public interface IronAjaxElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-ajax";
    @JsOverlay public static final String SRC = "iron-ajax/iron-ajax.html";


    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    @JsProperty JsArray getActiveRequests();
    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    @JsProperty void setActiveRequests(JsArray value);

    /**
     * <p>By default, iron-ajax’s events do not bubble. Setting this attribute will cause its<br>request and response events as well as its iron-ajax-request, -response,  and -error<br>events to bubble to the window object. The vanilla error event never bubbles when<br>using shadow dom even if this.bubbles is true because a scoped flag is not passed with<br>it (first link) and because the shadow dom spec did not used to allow certain events,<br>including events named error, to leak outside of shadow trees (second link).<br><a href="https://www.w3.org/TR/shadow-dom/#scoped-flag">https://www.w3.org/TR/shadow-dom/#scoped-flag</a><br><a href="https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees">https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees</a></p>
     *
     * JavaScript Info:
     * @property bubbles
     * @type Boolean
     * 
     */
    @JsProperty boolean getBubbles();
    /**
     * <p>By default, iron-ajax’s events do not bubble. Setting this attribute will cause its<br>request and response events as well as its iron-ajax-request, -response,  and -error<br>events to bubble to the window object. The vanilla error event never bubbles when<br>using shadow dom even if this.bubbles is true because a scoped flag is not passed with<br>it (first link) and because the shadow dom spec did not used to allow certain events,<br>including events named error, to leak outside of shadow trees (second link).<br><a href="https://www.w3.org/TR/shadow-dom/#scoped-flag">https://www.w3.org/TR/shadow-dom/#scoped-flag</a><br><a href="https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees">https://www.w3.org/TR/2015/WD-shadow-dom-20151215/#events-that-are-not-leaked-into-ancestor-trees</a></p>
     *
     * JavaScript Info:
     * @property bubbles
     * @type Boolean
     * 
     */
    @JsProperty void setBubbles(boolean value);

    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty boolean getWithCredentials();
    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty void setWithCredentials(boolean value);

    /**
     * <p>Length of time in milliseconds to debounce multiple automatically generated requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    @JsProperty double getDebounceDuration();
    /**
     * <p>Length of time in milliseconds to debounce multiple automatically generated requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    @JsProperty void setDebounceDuration(double value);

    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    @JsProperty boolean getVerbose();
    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    @JsProperty void setVerbose(boolean value);

    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    @JsProperty boolean getAuto();
    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    @JsProperty void setAuto(boolean value);

    /**
     * <p>Set the timeout flag on the request.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    @JsProperty double getTimeout();
    /**
     * <p>Set the timeout flag on the request.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    @JsProperty void setTimeout(double value);

    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    @JsProperty boolean getSync();
    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    @JsProperty void setSync(boolean value);

    /**
     * <p>lastRequest’s error, if any.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getLastError();
    /**
     * <p>lastRequest’s error, if any.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    @JsProperty void setLastError(JavaScriptObject value);

    /**
     * <p>The most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getLastRequest();
    /**
     * <p>The most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    @JsProperty void setLastRequest(JavaScriptObject value);

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
    @JsProperty JavaScriptObject getLastResponse();
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
    @JsProperty void setLastResponse(JavaScriptObject value);

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
    @JsProperty JavaScriptObject getHeaders();
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
    @JsProperty void setHeaders(JavaScriptObject value);

    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request. If you wish to set the body<br>content when making a POST request, you should use the <code>body</code> property<br>instead.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getParams();
    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request. If you wish to set the body<br>content when making a POST request, you should use the <code>body</code> property<br>instead.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    @JsProperty void setParams(JavaScriptObject value);

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
    @JsProperty JavaScriptObject getBody();
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
    @JsProperty void setBody(JavaScriptObject value);

    /**
     * <p>True while lastRequest is in flight.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoading();
    /**
     * <p>True while lastRequest is in flight.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty void setLoading(boolean value);

    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty String getMethod();
    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty void setMethod(String value);

    /**
     * <p>Prefix to be stripped from a JSON response before parsing it.</p>
     * <p>In order to prevent an attack using CSRF with Array responses<br>(<a href="http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/">http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/</a>)<br>many backends will mitigate this by prefixing all JSON response bodies<br>with a string that would be nonsensical to a JavaScript parser.</p>
     *
     * JavaScript Info:
     * @property jsonPrefix
     * @type String
     * 
     */
    @JsProperty String getJsonPrefix();
    /**
     * <p>Prefix to be stripped from a JSON response before parsing it.</p>
     * <p>In order to prevent an attack using CSRF with Array responses<br>(<a href="http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/">http://haacked.com/archive/2008/11/20/anatomy-of-a-subtle-json-vulnerability.aspx/</a>)<br>many backends will mitigate this by prefixing all JSON response bodies<br>with a string that would be nonsensical to a JavaScript parser.</p>
     *
     * JavaScript Info:
     * @property jsonPrefix
     * @type String
     * 
     */
    @JsProperty void setJsonPrefix(String value);

    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty String getUrl();
    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty void setUrl(String value);

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
    @JsProperty String getHandleAs();
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
    @JsProperty void setHandleAs(String value);

    /**
     * <p>Content type to use when sending data. If the <code>contentType</code> property<br>is set and a <code>Content-Type</code> header is specified in the <code>headers</code><br>property, the <code>headers</code> property value will take precedence.</p>
     * <p>Varies the handling of the <code>body</code> param.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty String getContentType();
    /**
     * <p>Content type to use when sending data. If the <code>contentType</code> property<br>is set and a <code>Content-Type</code> header is specified in the <code>headers</code><br>property, the <code>headers</code> property value will take precedence.</p>
     * <p>Varies the handling of the <code>body</code> param.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty void setContentType(String value);


    /**
     * <p>Performs an AJAX request to the specified URL.</p>
     *
     * JavaScript Info:
     * @method generateRequest
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject generateRequest();

    /**
     * <p>Request options suitable for generating an <code>iron-request</code> instance based<br>on the current state of the <code>iron-ajax</code> instance’s properties.</p>
     *
     * JavaScript Info:
     * @method toRequestOptions
     * 
     * @return {Object}
     */
    Object toRequestOptions();

}
