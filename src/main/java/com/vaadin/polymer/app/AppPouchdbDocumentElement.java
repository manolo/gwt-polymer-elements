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
 * <p><code>app-pouchdb-document</code> is an implementation of <code>Polymer.AppStorageBehavior</code><br>for reading and writing to individual PouchDB documents.</p>
 * <p>In order to refer to a PouchDB document, provide the name of the database<br>(both local and remote databases are supported) and the ID of the document.</p>
 * <p>For example:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-document
 *     db-name=&quot;cats&quot;
 *     doc-id=&quot;parsnip&quot;&gt;
 * &lt;/app-pouchdb-document&gt;
 * </code></pre>
 * <p>In the above example, a PouchDB instance will be created to connect to the<br>local database named “cats”. Then it will check to see if a document with the<br>ID “parsnip” exists. If it does, the <code>data</code> property of the document will be<br>set to the value of the document. If it does not, then any subsequent<br>assignments to the <code>data</code> property will cause a document with ID “parsnip” to<br>be created.</p>
 * <p>Here is an example of a simple form that can be used to read and write to a<br>PouchDB document:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-document
 *     db-name=&quot;cats&quot;
 *     doc-id=&quot;parsnip&quot;
 *     data=&quot;{{cat}}&quot;&gt;
 * &lt;/app-pouchdb-document&gt;
 * &lt;input
 *     is=&quot;iron-input&quot;
 *     bind-value=&quot;{{cat.name}}&quot;&gt;
 * &lt;/input&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface AppPouchdbDocumentElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-pouchdb-document";
    @JsOverlay public static final String SRC = "app-pouchdb/app-pouchdb-document.html";


    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * 
     */
    @JsProperty boolean getUpsert();
    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * 
     */
    @JsProperty void setUpsert(boolean value);

    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * @behavior AppPouchdbQuery
     */
    @JsProperty double getRevsLimit();
    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setRevsLimit(double value);

    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * @behavior AppPouchdbQuery
     */
    @JsProperty JavaScriptObject getDb();
    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setDb(JavaScriptObject value);

    /**
     * <p>Override this getter to define the default value to use when<br>there’s no data stored.</p>
     *
     * JavaScript Info:
     * @property zeroValue
     * @type *
     * @behavior AppPouchdbDocument
     */
    @JsProperty JavaScriptObject getZeroValue();
    /**
     * <p>Override this getter to define the default value to use when<br>there’s no data stored.</p>
     *
     * JavaScript Info:
     * @property zeroValue
     * @type *
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setZeroValue(JavaScriptObject value);

    /**
     * <p>The data to synchronize.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * @behavior AppPouchdbDocument
     */
    @JsProperty JavaScriptObject getData();
    /**
     * <p>The data to synchronize.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setData(JavaScriptObject value);

    /**
     * <p>A changes event emitter. Notifies of changes to the PouchDB document<br>referred to by <code>docId</code>, if a <code>docId</code> has been provided.</p>
     *
     * JavaScript Info:
     * @property changes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getChanges();
    /**
     * <p>A changes event emitter. Notifies of changes to the PouchDB document<br>referred to by <code>docId</code>, if a <code>docId</code> has been provided.</p>
     *
     * JavaScript Info:
     * @property changes
     * @type Object
     * 
     */
    @JsProperty void setChanges(JavaScriptObject value);

    /**
     * <p>Override this getter to return true if the value has never been<br>persisted to storage.</p>
     *
     * JavaScript Info:
     * @property isNew
     * @type boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty boolean getIsNew();
    /**
     * <p>Override this getter to return true if the value has never been<br>persisted to storage.</p>
     *
     * JavaScript Info:
     * @property isNew
     * @type boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setIsNew(boolean value);

    /**
     * <p>When true, will perform detailed logging.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty boolean getLog();
    /**
     * <p>When true, will perform detailed logging.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setLog(boolean value);

    /**
     * <p>If this is true transactions will happen one after the other,<br>never in parallel.</p>
     * <p>Specifically, no transaction will begin until every previously<br>enqueued transaction by this element has completed.</p>
     * <p>If it is false, new transactions will be executed as they are<br>received.</p>
     *
     * JavaScript Info:
     * @property sequentialTransactions
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty boolean getSequentialTransactions();
    /**
     * <p>If this is true transactions will happen one after the other,<br>never in parallel.</p>
     * <p>Specifically, no transaction will begin until every previously<br>enqueued transaction by this element has completed.</p>
     * <p>If it is false, new transactions will be executed as they are<br>received.</p>
     *
     * JavaScript Info:
     * @property sequentialTransactions
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setSequentialTransactions(boolean value);

    /**
     * <p>A promise that will resolve once all queued transactions<br>have completed.</p>
     * <p>This field is updated as new transactions are enqueued, so it will<br>only wait for transactions which were enqueued when the field<br>was accessed.</p>
     * <p>This promise never rejects.</p>
     *
     * JavaScript Info:
     * @property transactionsComplete
     * @type Promise
     * @behavior AppPouchdbDocument
     */
    @JsProperty JavaScriptObject getTransactionsComplete();
    /**
     * <p>A promise that will resolve once all queued transactions<br>have completed.</p>
     * <p>This field is updated as new transactions are enqueued, so it will<br>only wait for transactions which were enqueued when the field<br>was accessed.</p>
     * <p>This promise never rejects.</p>
     *
     * JavaScript Info:
     * @property transactionsComplete
     * @type Promise
     * @behavior AppPouchdbDocument
     */
    @JsProperty void setTransactionsComplete(JavaScriptObject value);

    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * 
     */
    @JsProperty Function getResolveConflict();
    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * 
     */
    @JsProperty void setResolveConflict(Function value);

    /**
     * <p>The current _rev (revision) of the PouchDB document that this<br>element’s data refers to, if the document is not new.</p>
     *
     * JavaScript Info:
     * @property rev
     * @type String
     * 
     */
    @JsProperty String getRev();
    /**
     * <p>The current _rev (revision) of the PouchDB document that this<br>element’s data refers to, if the document is not new.</p>
     *
     * JavaScript Info:
     * @property rev
     * @type String
     * 
     */
    @JsProperty void setRev(String value);

    /**
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * @behavior AppPouchdbQuery
     */
    @JsProperty String getAdapter();
    /**
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setAdapter(String value);

    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * @behavior AppPouchdbQuery
     */
    @JsProperty String getDbName();
    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setDbName(String value);

    /**
     * <p>The value of the _id (Pouch/Couch unique identifier) of the PouchDB<br>document that this element’s data should refer to.</p>
     *
     * JavaScript Info:
     * @property docId
     * @type String
     * 
     */
    @JsProperty String getDocId();
    /**
     * <p>The value of the _id (Pouch/Couch unique identifier) of the PouchDB<br>document that this element’s data should refer to.</p>
     *
     * JavaScript Info:
     * @property docId
     * @type String
     * 
     */
    @JsProperty void setDocId(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method setStoredValue
     * @param {} storagePath  
     * @param {} value  
     * 
     * 
     */
    void setStoredValue(Object storagePath, Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method getStoredValue
     * @param {} storagePath  
     * 
     * 
     */
    void getStoredValue(Object storagePath);

    /**
     * <p>A convenience method. Returns true iff value is null, undefined,<br>an empty array, or an object with no keys.</p>
     *
     * JavaScript Info:
     * @method valueIsEmpty
     * @param {} value  
     * @behavior AppPouchdbDocument
     * 
     */
    void valueIsEmpty(Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    void reset();

    /**
     * <p>Perform the initial sync between storage and memory. This method<br>is called automatically while the element is being initialized.<br>Implementations may override it.</p>
     * <p>If an implementation intends to call this method, it should instead<br>call _initializeStoredValue, which provides reentrancy protection.</p>
     *
     * JavaScript Info:
     * @method initializeStoredValue
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    JavaScriptObject initializeStoredValue();

    /**
     * <p>Remove the data from storage.</p>
     *
     * JavaScript Info:
     * @method destroy
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    JavaScriptObject destroy();

    /**
     * 
     *
     * JavaScript Info:
     * @method save
     * 
     * 
     */
    void save();

    /**
     * <p>Override this method.</p>
     * <p>If the data value represented by this storage instance is new, this<br>method generates an attempt to write the value to storage.</p>
     *
     * JavaScript Info:
     * @method saveValue
     * @param {*} args  
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    JavaScriptObject saveValue(JavaScriptObject args);

    /**
     * <p>Override this method to implement creating and updating<br>stored values.</p>
     *
     * JavaScript Info:
     * @method setStoredValue
     * @param {string} storagePath  
     * @param {*} value  
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    JavaScriptObject setStoredValue(String storagePath, JavaScriptObject value);

    /**
     * <p>Maps a storage path to the corresponding Polymer databinding path.<br>Override to define a custom mapping.</p>
     * <p>The inverse of memoryPathToStoragePath.</p>
     *
     * JavaScript Info:
     * @method storagePathToMemoryPath
     * @param {string} path  
     * @behavior AppPouchdbDocument
     * @return {String}
     */
    String storagePathToMemoryPath(String path);

    /**
     * <p>Maps a Polymer databinding path to the corresponding path in the<br>storage system. Override to define a custom mapping.</p>
     * <p>The inverse of storagePathToMemoryPath.</p>
     *
     * JavaScript Info:
     * @method memoryPathToStoragePath
     * @param {string} path  
     * @behavior AppPouchdbDocument
     * @return {String}
     */
    String memoryPathToStoragePath(String path);

    /**
     * <p>Enables performing transformations on the in-memory representation of<br>storage without activating observers that will cause those<br>transformations to be re-applied to the storage backend. This is useful<br>for preventing redundant (or cyclical) application of transformations.</p>
     *
     * JavaScript Info:
     * @method syncToMemory
     * @param {Function} operation  
     * @behavior AppPouchdbDocument
     * 
     */
    void syncToMemory(Function operation);

}
