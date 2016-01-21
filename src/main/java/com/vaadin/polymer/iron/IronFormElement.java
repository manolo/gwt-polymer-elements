/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
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
 * <p><code>&lt;iron-form&gt;</code> is an HTML <code>&lt;form&gt;</code> element that can validate and submit any custom<br>elements that implement <code>Polymer.IronFormElementBehavior</code>, as well as any<br>native HTML elements.</p>
 * <p>It supports both <code>get</code> and <code>post</code> methods, and uses an <code>iron-ajax</code> element to<br>submit the form data to the action URL.</p>
 * <p>  Example:</p>
 * <pre><code>&lt;form is=&quot;iron-form&quot; id=&quot;form&quot; method=&quot;post&quot; action=&quot;/form/handler&quot;&gt;
 *   &lt;paper-input name=&quot;name&quot; label=&quot;name&quot;&gt;&lt;/paper-input&gt;
 *   &lt;input name=&quot;address&quot;&gt;
 *   ...
 * &lt;/form&gt;
 * 
 * 
 * </code></pre><p>By default, a native <code>&lt;button&gt;</code> element will submit this form. However, if you<br>want to submit it from a custom element’s click handler, you need to explicitly<br>call the form’s <code>submit</code> method.</p>
 * <p>  Example:</p>
 * <pre><code>&lt;paper-button raised onclick=&quot;submitForm()&quot;&gt;Submit&lt;/paper-button&gt;
 * 
 * function submitForm() {
 *   document.getElementById(&#39;form&#39;).submit();
 * }
 * 
 * 
 * </code></pre><p>To customize the request sent to the server, you can listen to the <code>iron-form-presubmit</code><br>event, and modify the form’s<a href="https://elements.polymer-project.org/elements/iron-ajax"><code>iron-ajax</code></a><br>object. However, If you want to not use <code>iron-ajax</code> at all, you can cancel the<br>event and do your own custom submission:</p>
 * <p>  Example of modifying the request, but still using the build-in form submission:</p>
 * <pre><code>form.addEventListener(&#39;iron-form-presubmit&#39;, function() {
 *   this.request.method = &#39;put&#39;;
 *   this.request.params = someCustomParams;
 * });
 * 
 * 
 * </code></pre><p>  Example of bypassing the build-in form submission:</p>
 * <pre><code>form.addEventListener(&#39;iron-form-presubmit&#39;, function(event) {
 *   event.preventDefault();
 *   var firebase = new Firebase(form.getAttribute(&#39;action&#39;));
 *   firebase.set(form.serialize());
 * });
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronFormElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-form";
    @JsOverlay public static final String SRC = "iron-form/iron-form.html";


    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisableNativeValidationUi();
    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    @JsProperty void setDisableNativeValidationUi(boolean value);

    /**
     * <p>HTTP request headers to send</p>
     * <p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHeaders();
    /**
     * <p>HTTP request headers to send</p>
     * <p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty void setHeaders(JavaScriptObject value);

    /**
     * <p>iron-ajax request object used to submit the form.</p>
     *
     * JavaScript Info:
     * @property request
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getRequest();
    /**
     * <p>iron-ajax request object used to submit the form.</p>
     *
     * JavaScript Info:
     * @property request
     * @type Object
     * 
     */
    @JsProperty void setRequest(JavaScriptObject value);

    /**
     * <p>Set the withCredentials flag when sending data.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty boolean getWithCredentials();
    /**
     * <p>Set the withCredentials flag when sending data.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty void setWithCredentials(boolean value);

    /**
     * <p>Content type to use when sending data.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty String getContentType();
    /**
     * <p>Content type to use when sending data.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty void setContentType(String value);


    /**
     * <p>Returns a json object containing name/value pairs for all the registered<br>custom components and native elements of the form. If there are elements<br>with duplicate names, then their values will get aggregated into an<br>array of values.</p>
     *
     * JavaScript Info:
     * @method serialize
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject serialize();

    /**
     * <p>Submits the form.</p>
     *
     * JavaScript Info:
     * @method submit
     * 
     * 
     */
    void submit();

    /**
     * <p>Validates all the required elements (custom and native) in the form.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    boolean validate();

}
