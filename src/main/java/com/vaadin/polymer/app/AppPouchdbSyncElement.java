/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-pouchdb project by The Polymer Authors
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
 * <p><code>app-pouchdb-sync</code> arranges for one-directional or bi-directional<br>synchronization between two PouchDB databases. For one-directional<br>synchronization, it forwards to <code>PouchDB.replicate</code>, and for bi-directional<br>synchronization, it forwards to <code>PouchDB.sync</code>.</p>
 * <p>Here is an example of bi-directional synchronization between a local database<br>and a remote one:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-sync
 *     src=&quot;cats&quot;
 *     target=&quot;https://example.com:5678/cats&quot;
 *     bidirectional&gt;
 * &lt;/app-pouchdb-sync&gt;
 * </code></pre>
 * <p>For more information on PouchDB synchronization topics, please refer to the<br>documentation <a href="https://pouchdb.com/guides/replication.html">here</a>.</p>
 */
@JsType(isNative=true)
public interface AppPouchdbSyncElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-pouchdb-sync";
    @JsOverlay public static final String SRC = "app-pouchdb/app-pouchdb-sync.html";


    /**
     * <p>While <code>false</code>, synchronization will only happen from the <code>src</code> to the<br><code>target</code>. One-directional synchronization follows the semantics of<br><code>PouchDB.replicate</code>. Set to <code>true</code> to make the sync bidirectional,<br>which uses <code>PouchDB.sync</code> instead.</p>
     *
     * JavaScript Info:
     * @property bidirectional
     * @type Boolean
     * 
     */
    @JsProperty boolean getBidirectional();
    /**
     * <p>While <code>false</code>, synchronization will only happen from the <code>src</code> to the<br><code>target</code>. One-directional synchronization follows the semantics of<br><code>PouchDB.replicate</code>. Set to <code>true</code> to make the sync bidirectional,<br>which uses <code>PouchDB.sync</code> instead.</p>
     *
     * JavaScript Info:
     * @property bidirectional
     * @type Boolean
     * 
     */
    @JsProperty void setBidirectional(boolean value);

    /**
     * <p>Set to true to log change events that are emitted by the <code>sync</code><br>instance.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * 
     */
    @JsProperty boolean getLog();
    /**
     * <p>Set to true to log change events that are emitted by the <code>sync</code><br>instance.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * 
     */
    @JsProperty void setLog(boolean value);

    /**
     * <p>An event emitter that notifies of events in the synchronization<br>process.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSync();
    /**
     * <p>An event emitter that notifies of events in the synchronization<br>process.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Object
     * 
     */
    @JsProperty void setSync(JavaScriptObject value);

    /**
     * <p>The source to sync from. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The source to sync from. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);

    /**
     * <p>The <code>target</code> to sync to. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty String getTarget();
    /**
     * <p>The <code>target</code> to sync to. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty void setTarget(String value);


}
