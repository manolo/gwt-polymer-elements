/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-localize-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p><code>Polymer.AppLocalizeBehavior</code> wraps the <a href="http://formatjs.io/">format.js</a> library to<br>help you internationalize your application. Note that if you’re on a browser that<br>does not natively support the <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl">Intl</a><br>object, you must load the polyfill yourself. An example polyfill can<br>be found <a href="https://github.com/andyearnshaw/Intl.js/">here</a>.</p>
 * <p><code>Polymer.AppLocalizeBehavior</code> supports the same <a href="http://formatjs.io/guides/message-syntax/">message-syntax</a><br>of format.js, in its entirety; use the library docs as reference for the<br>available message formats and options.</p>
 * <p>Sample application loading resources from an external file:</p>
 * <pre><code>&lt;dom-module id=&quot;x-app&quot;&gt;
 *    &lt;template&gt;
 *     &lt;div&gt;{{localize(&#39;hello&#39;, &#39;name&#39;, &#39;Batman&#39;)}}&lt;/div&gt;
 *    &lt;/template&gt;
 *    &lt;script&gt;
 *       Polymer({
 *         is: &quot;x-app&quot;,
 * 
 *         behaviors: [
 *           Polymer.AppLocalizeBehavior
 *         ],
 * 
 *         properties: {
 *           language: {
 *             value: &#39;en&#39;
 *           },
 *         }
 * 
 *         attached: function() {
 *           this.loadResources(this.resolveUrl(&#39;locales.json&#39;));
 *         },
 *       });
 *    &amp;lt;/script&gt;
 * &lt;/dom-module&gt;
 * 
 * 
 * </code></pre><p>Alternatively, you can also inline your resources inside the app itself:</p>
 * <pre><code>&lt;dom-module id=&quot;x-app&quot;&gt;
 *    &lt;template&gt;
 *     &lt;div&gt;{{localize(&#39;hello&#39;, &#39;name&#39;, &#39;Batman&#39;)}}&lt;/div&gt;
 *    &lt;/template&gt;
 *    &lt;script&gt;
 *       Polymer({
 *         is: &quot;x-app&quot;,
 * 
 *         behaviors: [
 *           Polymer.AppLocalizeBehavior
 *         ],
 * 
 *         properties: {
 *           language: {
 *             value: &#39;en&#39;
 *           },
 *           resources: {
 *             value: function() {
 *               return {
 *                 &#39;en&#39;: { &#39;hello&#39;: &#39;My name is {name}.&#39; },
 *                 &#39;fr&#39;: { &#39;hello&#39;: &#39;Je m\&#39;apelle {name}.&#39; }
 *               }
 *           }
 *         }
 *       });
 *    &amp;lt;/script&gt;
 * &lt;/dom-module&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface AppLocalizeBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppLocalizeBehavior";
    @JsOverlay public static final String SRC = "app-localize-behavior/app-localize-behavior.html";


    /**
     * <p>If true, will bubble up the event to the parents</p>
     *
     * JavaScript Info:
     * @property bubbleEvent
     * @type Boolean
     * 
     */
    @JsProperty boolean getBubbleEvent();
    /**
     * <p>If true, will bubble up the event to the parents</p>
     *
     * JavaScript Info:
     * @property bubbleEvent
     * @type Boolean
     * 
     */
    @JsProperty void setBubbleEvent(boolean value);

    /**
     * <p>Optional dictionary of user defined formats, as explained here:<br><a href="http://formatjs.io/guides/message-syntax/#custom-formats">http://formatjs.io/guides/message-syntax/#custom-formats</a></p>
     * <p>For example, a valid dictionary of formats would be:<br>this.formats = {<br>   number: { USD: { style: ‘currency’, currency: ‘USD’ } }<br>}</p>
     *
     * JavaScript Info:
     * @property formats
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getFormats();
    /**
     * <p>Optional dictionary of user defined formats, as explained here:<br><a href="http://formatjs.io/guides/message-syntax/#custom-formats">http://formatjs.io/guides/message-syntax/#custom-formats</a></p>
     * <p>For example, a valid dictionary of formats would be:<br>this.formats = {<br>   number: { USD: { style: ‘currency’, currency: ‘USD’ } }<br>}</p>
     *
     * JavaScript Info:
     * @property formats
     * @type Object
     * 
     */
    @JsProperty void setFormats(JavaScriptObject value);

    /**
     * <p>Translates a string to the current <code>language</code>. Any parameters to the<br>string should be passed in order, as follows:<br><code>localize(stringKey, param1Name, param1Value, param2Name, param2Value)</code></p>
     *
     * JavaScript Info:
     * @property localize
     * @type Function
     * 
     */
    @JsProperty Function getLocalize();
    /**
     * <p>Translates a string to the current <code>language</code>. Any parameters to the<br>string should be passed in order, as follows:<br><code>localize(stringKey, param1Name, param1Value, param2Name, param2Value)</code></p>
     *
     * JavaScript Info:
     * @property localize
     * @type Function
     * 
     */
    @JsProperty void setLocalize(Function value);

    /**
     * <p>The dictionary of localized messages, for each of the languages that<br>are going to be used. See <a href="http://formatjs.io/guides/message-syntax/">http://formatjs.io/guides/message-syntax/</a> for<br>more information on the message syntax.</p>
     * <p>For example, a valid dictionary would be:<br>this.resources = {<br> ‘en’: { ‘greeting’: ‘Hello!’ }, ‘fr’ : { ‘greeting’: ‘Bonjour!’ }<br>}</p>
     *
     * JavaScript Info:
     * @property resources
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getResources();
    /**
     * <p>The dictionary of localized messages, for each of the languages that<br>are going to be used. See <a href="http://formatjs.io/guides/message-syntax/">http://formatjs.io/guides/message-syntax/</a> for<br>more information on the message syntax.</p>
     * <p>For example, a valid dictionary would be:<br>this.resources = {<br> ‘en’: { ‘greeting’: ‘Hello!’ }, ‘fr’ : { ‘greeting’: ‘Bonjour!’ }<br>}</p>
     *
     * JavaScript Info:
     * @property resources
     * @type Object
     * 
     */
    @JsProperty void setResources(JavaScriptObject value);

    /**
     * <p>If true, will use the provided key when<br>the translation does not exist for that key.</p>
     *
     * JavaScript Info:
     * @property useKeyIfMissing
     * @type Boolean
     * 
     */
    @JsProperty boolean getUseKeyIfMissing();
    /**
     * <p>If true, will use the provided key when<br>the translation does not exist for that key.</p>
     *
     * JavaScript Info:
     * @property useKeyIfMissing
     * @type Boolean
     * 
     */
    @JsProperty void setUseKeyIfMissing(boolean value);

    /**
     * <p>The language used for translation.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    @JsProperty String getLanguage();
    /**
     * <p>The language used for translation.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    @JsProperty void setLanguage(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method loadResources
     * @param {} path  
     * 
     * 
     */
    void loadResources(Object path);

}
