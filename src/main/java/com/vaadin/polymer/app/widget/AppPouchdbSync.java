/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-pouchdb project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class AppPouchdbSync extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppPouchdbSync() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppPouchdbSync(String html) {
        super(AppPouchdbSyncElement.TAG, AppPouchdbSyncElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppPouchdbSyncElement getPolymerElement() {
        return (AppPouchdbSyncElement) getElement();
    }


    /**
     * <p>While <code>false</code>, synchronization will only happen from the <code>src</code> to the<br><code>target</code>. One-directional synchronization follows the semantics of<br><code>PouchDB.replicate</code>. Set to <code>true</code> to make the sync bidirectional,<br>which uses <code>PouchDB.sync</code> instead.</p>
     *
     * JavaScript Info:
     * @property bidirectional
     * @type Boolean
     * 
     */
    public boolean getBidirectional() {
        return getPolymerElement().getBidirectional();
    }
    /**
     * <p>While <code>false</code>, synchronization will only happen from the <code>src</code> to the<br><code>target</code>. One-directional synchronization follows the semantics of<br><code>PouchDB.replicate</code>. Set to <code>true</code> to make the sync bidirectional,<br>which uses <code>PouchDB.sync</code> instead.</p>
     *
     * JavaScript Info:
     * @property bidirectional
     * @type Boolean
     * 
     */
    public void setBidirectional(boolean value) {
        getPolymerElement().setBidirectional(value);
    }

    /**
     * <p>Set to true to log change events that are emitted by the <code>sync</code><br>instance.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * 
     */
    public boolean getLog() {
        return getPolymerElement().getLog();
    }
    /**
     * <p>Set to true to log change events that are emitted by the <code>sync</code><br>instance.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * 
     */
    public void setLog(boolean value) {
        getPolymerElement().setLog(value);
    }

    /**
     * <p>An event emitter that notifies of events in the synchronization<br>process.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Object
     * 
     */
    public JavaScriptObject getSync() {
        return getPolymerElement().getSync();
    }
    /**
     * <p>An event emitter that notifies of events in the synchronization<br>process.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Object
     * 
     */
    public void setSync(JavaScriptObject value) {
        getPolymerElement().setSync(value);
    }

    /**
     * <p>The source to sync from. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The source to sync from. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }

    /**
     * <p>The <code>target</code> to sync to. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    public String getTarget() {
        return getPolymerElement().getTarget();
    }
    /**
     * <p>The <code>target</code> to sync to. If this sync is <code>bidirectional</code>, then the<br><code>src</code> and <code>target</code> values are interchangeable.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    public void setTarget(String value) {
        getPolymerElement().setTarget(value);
    }


    // Needed in UIBinder
    /**
     * <p>An event emitter that notifies of events in the synchronization<br>process.</p>
     *
     * JavaScript Info:
     * @attribute sync
     * 
     */
    public void setSync(String value) {
        Polymer.property(this.getPolymerElement(), "sync", value);
    }



}
