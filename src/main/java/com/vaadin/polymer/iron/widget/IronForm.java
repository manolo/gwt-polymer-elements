/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronFormErrorEvent;
import com.vaadin.polymer.iron.widget.event.IronFormErrorEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormInvalidEvent;
import com.vaadin.polymer.iron.widget.event.IronFormInvalidEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormPresubmitEvent;
import com.vaadin.polymer.iron.widget.event.IronFormPresubmitEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormResetEvent;
import com.vaadin.polymer.iron.widget.event.IronFormResetEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormResponseEvent;
import com.vaadin.polymer.iron.widget.event.IronFormResponseEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormSubmitEvent;
import com.vaadin.polymer.iron.widget.event.IronFormSubmitEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronForm extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronForm() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronForm(String html) {
        super(IronFormElement.TAG, IronFormElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronFormElement getPolymerElement() {
        try {
            return (IronFormElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    public boolean getDisableNativeValidationUi() {
        return getPolymerElement().getDisableNativeValidationUi();
    }
    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    public void setDisableNativeValidationUi(boolean value) {
        getPolymerElement().setDisableNativeValidationUi(value);
    }

    /**
     * <p>HTTP request headers to send</p>
     * <p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
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
     * <p>HTTP request headers to send</p>
     * <p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
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
     * <p>iron-ajax request object used to submit the form.</p>
     *
     * JavaScript Info:
     * @property request
     * @type Object
     * 
     */
    public JavaScriptObject getRequest() {
        return getPolymerElement().getRequest();
    }
    /**
     * <p>iron-ajax request object used to submit the form.</p>
     *
     * JavaScript Info:
     * @property request
     * @type Object
     * 
     */
    public void setRequest(JavaScriptObject value) {
        getPolymerElement().setRequest(value);
    }

    /**
     * <p>Set the withCredentials flag when sending data.</p>
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
     * <p>Set the withCredentials flag when sending data.</p>
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
     * <p>Content type to use when sending data.</p>
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
     * <p>Content type to use when sending data.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public void setContentType(String value) {
        getPolymerElement().setContentType(value);
    }


    /**
     * <p>HTTP request headers to send</p>
     * <p>Note: setting a <code>Content-Type</code> header here will override the value<br>specified by the <code>contentType</code> property of this element.</p>
     *
     * JavaScript Info:
     * @attribute headers
     * 
     */
    public void setHeaders(String value) {
        getPolymerElement().setAttribute("headers", value);
    }

    /**
     * <p>iron-ajax request object used to submit the form.</p>
     *
     * JavaScript Info:
     * @attribute request
     * 
     */
    public void setRequest(String value) {
        getPolymerElement().setAttribute("request", value);
    }


    /**
     * <p>Returns a json object containing name/value pairs for all the registered<br>custom components and native elements of the form. If there are elements<br>with duplicate names, then their values will get aggregated into an<br>array of values.</p>
     *
     * JavaScript Info:
     * @method serialize
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject serialize() {
        return getPolymerElement().serialize();
    }

    /**
     * <p>Submits the form.</p>
     *
     * JavaScript Info:
     * @method submit
     * 
     * 
     */
    public void submit() {
        getPolymerElement().submit();
    }

    /**
     * <p>Validates all the required elements (custom and native) in the form.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    public boolean validate() {
        return getPolymerElement().validate();
    }


    /**
     * <p>Fired after the form is submitted and an error is received. An<br>IronRequestElement is included as the event.detail object.</p>
     *
     * JavaScript Info:
     * @event iron-form-error
     */
    public HandlerRegistration addIronFormErrorHandler(IronFormErrorEventHandler handler) {
        return addDomHandler(handler, IronFormErrorEvent.TYPE);
    }

    /**
     * <p>Fired if the form cannot be submitted because it’s invalid.</p>
     *
     * JavaScript Info:
     * @event iron-form-invalid
     */
    public HandlerRegistration addIronFormInvalidHandler(IronFormInvalidEventHandler handler) {
        return addDomHandler(handler, IronFormInvalidEvent.TYPE);
    }

    /**
     * <p>Fired before the form is submitted.</p>
     *
     * JavaScript Info:
     * @event iron-form-presubmit
     */
    public HandlerRegistration addIronFormPresubmitHandler(IronFormPresubmitEventHandler handler) {
        return addDomHandler(handler, IronFormPresubmitEvent.TYPE);
    }

    /**
     * <p>Fired after the form is reset.</p>
     *
     * JavaScript Info:
     * @event iron-form-reset
     */
    public HandlerRegistration addIronFormResetHandler(IronFormResetEventHandler handler) {
        return addDomHandler(handler, IronFormResetEvent.TYPE);
    }

    /**
     * <p>Fired after the form is submitted and a response is received. An<br>IronRequestElement is included as the event.detail object.</p>
     *
     * JavaScript Info:
     * @event iron-form-response
     */
    public HandlerRegistration addIronFormResponseHandler(IronFormResponseEventHandler handler) {
        return addDomHandler(handler, IronFormResponseEvent.TYPE);
    }

    /**
     * <p>Fired after the form is submitted.</p>
     *
     * JavaScript Info:
     * @event iron-form-submit
     */
    public HandlerRegistration addIronFormSubmitHandler(IronFormSubmitEventHandler handler) {
        return addDomHandler(handler, IronFormSubmitEvent.TYPE);
    }

}
