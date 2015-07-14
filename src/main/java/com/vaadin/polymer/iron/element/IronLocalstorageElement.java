/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Element access to Web Storage API (window.localStorage).</p>
 * <p>Keeps <code>value</code> property in sync with localStorage.</p>
 * <p>Value is saved as json by default.</p>
 * <h3 id="usage-">Usage:</h3>
 * <p><code>ls-sample</code> will automatically save changes to its value.</p>
 * <pre><code>&lt;dom-module id=&quot;ls-sample&quot;&gt;
 *   &lt;iron-localstorage name=&quot;my-app-storage&quot;
 *     value=&quot;{{cartoon}}&quot;
 *     on-iron-localstorage-load-empty=&quot;initializeDefaultCartoon&quot;
 *   &gt;&lt;/iron-localstorage&gt;
 * &lt;/dom-module&gt;
 * 
 * &lt;script&gt;
 *   Polymer({
 *     is: &#39;ls-sample&#39;,
 *     properties: {
 *       cartoon: {
 *         type: Object
 *       }
 *     },
 *     // initializes default if nothing has been stored
 *     initializeDefaultCartoon: function() {
 *       this.cartoon = {
 *         name: &quot;Mickey&quot;,
 *         hasEars: true
 *       }
 *     },
 *     // use path set api to propagate changes to localstorage
 *     makeModifications: function() {
 *       this.set(&#39;cartoon.name&#39;, &quot;Minions&quot;);
 *       this.set(&#39;cartoon.hasEars&#39;, false);
 *     }
 *   });
 * &lt;/script&gt;
 * 
 * 
 * </code></pre><h3 id="tech-notes-">Tech notes:</h3>
 * <ul>
 * <li><p><code>value.*</code> is observed, and saved on modifications. You must use<br>property notification methods to modify value for changes to be observed.</p>
 * </li>
 * <li><p>Set <code>auto-save-disabled</code> to prevent automatic saving.</p>
 * </li>
 * <li><p>Value is saved as JSON by default.</p>
 * </li>
 * <li><p>To delete a key, set value to null</p>
 * </li>
 * </ul>
 * <p>Element listens to StorageAPI <code>storage</code> event, and will reload upon receiving it.</p>
 * <p><strong>Warning</strong>: do not bind value to sub-properties until Polymer<br><a href="https://github.com/Polymer/polymer/issues/1550">bug 1550</a><br>is resolved. Local storage will be blown away.<br><code>&lt;iron-localstorage value=&quot;{{foo.bar}}&quot;</code> will cause <strong>data loss</strong>.</p>
 */
@JsType
public interface IronLocalstorageElement extends HTMLElement {

    public static final String TAG = "iron-localstorage";
    public static final String SRC = "iron-localstorage/iron-localstorage.html";


    /**
     * <p>Value will not be saved automatically if true. You’ll have to do it manually with <code>save()</code></p>
     *
     * JavaScript Info:
     * @property autoSaveDisabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoSaveDisabled();
    /**
     * <p>Value will not be saved automatically if true. You’ll have to do it manually with <code>save()</code></p>
     *
     * JavaScript Info:
     * @property autoSaveDisabled
     * @type Boolean
     * 
     */
    @JsProperty void setAutoSaveDisabled(boolean value);
  
    /**
     * <p>Last error encountered while saving/loading items</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>Last error encountered while saving/loading items</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty void setErrorMessage(String value);
  
    /**
     * <p>localStorage item key</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>localStorage item key</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);
  
    /**
     * <p>Loads the value again. Use if you modify<br>localStorage using DOM calls, and want to<br>keep this element in sync.</p>
     *
     * JavaScript Info:
     * @method reload
     * 
     */
    void reload();

    /**
     * <p>Saves the value to localStorage. Call to save if autoSaveDisabled is set.<br>If <code>value</code> is null, deletes localStorage.</p>
     *
     * JavaScript Info:
     * @method save
     * 
     */
    void save();

    /**
     * <p>If true: do not convert value to JSON on save/load</p>
     *
     * JavaScript Info:
     * @property useRaw
     * @type Boolean
     * 
     */
    @JsProperty boolean getUseRaw();
    /**
     * <p>If true: do not convert value to JSON on save/load</p>
     *
     * JavaScript Info:
     * @property useRaw
     * @type Boolean
     * 
     */
    @JsProperty void setUseRaw(boolean value);
  
    /**
     * <p>The data associated with this storage.<br>If set to null item will be deleted.</p>
     *
     * JavaScript Info:
     * @property value
     * @type *
     * 
     */
    @JsProperty JavaScriptObject getValue();
    /**
     * <p>The data associated with this storage.<br>If set to null item will be deleted.</p>
     *
     * JavaScript Info:
     * @property value
     * @type *
     * 
     */
    @JsProperty void setValue(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
}
