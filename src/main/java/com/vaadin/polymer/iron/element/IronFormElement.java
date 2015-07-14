/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>`&lt;iron-form&gt;</code> is an HTML <code>&lt;form&gt;</code> element that can validate and submit any custom<br>elements that implement <code>Polymer.IronFormElementBehavior</code>, as well as any<br>native HTML elements.</p>
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
 * </code></pre>
 */
@JsType
public interface IronFormElement extends HTMLElement {

    public static final String TAG = "iron-form";
    public static final String SRC = "iron-form/iron-form.html";


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
     * <p>Returns a json object containing name/value pairs for all the registered<br>custom components and native elements of the form. If there are elements<br>with duplicate names, then their values will get aggregated into an<br>array of values.</p>
     *
     * JavaScript Info:
     * @method serialize
     * 
     */
    void serialize();

    /**
     * <p>Called to submit the form.</p>
     *
     * JavaScript Info:
     * @method submit
     * 
     */
    void submit();

    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty String getExtends();
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    @JsProperty void setExtends(String value);
  
    /**
     * <p>Fired after the form is submitted and an error is received.</p>
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * <p>Fired after the form is submitted and an error is received.</p>
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
}
