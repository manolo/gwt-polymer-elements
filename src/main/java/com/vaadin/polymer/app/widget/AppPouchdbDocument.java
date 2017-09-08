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
public class AppPouchdbDocument extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppPouchdbDocument() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppPouchdbDocument(String html) {
        super(AppPouchdbDocumentElement.TAG, AppPouchdbDocumentElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppPouchdbDocumentElement getPolymerElement() {
        return (AppPouchdbDocumentElement) getElement();
    }


    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * 
     */
    public boolean getUpsert() {
        return getPolymerElement().getUpsert();
    }
    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * 
     */
    public void setUpsert(boolean value) {
        getPolymerElement().setUpsert(value);
    }

    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * @behavior AppPouchdbQuery
     */
    public double getRevsLimit() {
        return getPolymerElement().getRevsLimit();
    }
    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * @behavior AppPouchdbQuery
     */
    public void setRevsLimit(double value) {
        getPolymerElement().setRevsLimit(value);
    }

    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * @behavior AppPouchdbQuery
     */
    public JavaScriptObject getDb() {
        return getPolymerElement().getDb();
    }
    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * @behavior AppPouchdbQuery
     */
    public void setDb(JavaScriptObject value) {
        getPolymerElement().setDb(value);
    }

    /**
     * <p>Override this getter to define the default value to use when<br>there’s no data stored.</p>
     *
     * JavaScript Info:
     * @property zeroValue
     * @type *
     * @behavior AppPouchdbDocument
     */
    public JavaScriptObject getZeroValue() {
        return getPolymerElement().getZeroValue();
    }
    /**
     * <p>Override this getter to define the default value to use when<br>there’s no data stored.</p>
     *
     * JavaScript Info:
     * @property zeroValue
     * @type *
     * @behavior AppPouchdbDocument
     */
    public void setZeroValue(JavaScriptObject value) {
        getPolymerElement().setZeroValue(value);
    }

    /**
     * <p>The data to synchronize.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * @behavior AppPouchdbDocument
     */
    public JavaScriptObject getData() {
        return getPolymerElement().getData();
    }
    /**
     * <p>The data to synchronize.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * @behavior AppPouchdbDocument
     */
    public void setData(JavaScriptObject value) {
        getPolymerElement().setData(value);
    }

    /**
     * <p>A changes event emitter. Notifies of changes to the PouchDB document<br>referred to by <code>docId</code>, if a <code>docId</code> has been provided.</p>
     *
     * JavaScript Info:
     * @property changes
     * @type Object
     * 
     */
    public JavaScriptObject getChanges() {
        return getPolymerElement().getChanges();
    }
    /**
     * <p>A changes event emitter. Notifies of changes to the PouchDB document<br>referred to by <code>docId</code>, if a <code>docId</code> has been provided.</p>
     *
     * JavaScript Info:
     * @property changes
     * @type Object
     * 
     */
    public void setChanges(JavaScriptObject value) {
        getPolymerElement().setChanges(value);
    }

    /**
     * <p>Override this getter to return true if the value has never been<br>persisted to storage.</p>
     *
     * JavaScript Info:
     * @property isNew
     * @type boolean
     * @behavior AppPouchdbDocument
     */
    public boolean getIsNew() {
        return getPolymerElement().getIsNew();
    }
    /**
     * <p>Override this getter to return true if the value has never been<br>persisted to storage.</p>
     *
     * JavaScript Info:
     * @property isNew
     * @type boolean
     * @behavior AppPouchdbDocument
     */
    public void setIsNew(boolean value) {
        getPolymerElement().setIsNew(value);
    }

    /**
     * <p>When true, will perform detailed logging.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    public boolean getLog() {
        return getPolymerElement().getLog();
    }
    /**
     * <p>When true, will perform detailed logging.</p>
     *
     * JavaScript Info:
     * @property log
     * @type Boolean
     * @behavior AppPouchdbDocument
     */
    public void setLog(boolean value) {
        getPolymerElement().setLog(value);
    }

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
    public boolean getSequentialTransactions() {
        return getPolymerElement().getSequentialTransactions();
    }
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
    public void setSequentialTransactions(boolean value) {
        getPolymerElement().setSequentialTransactions(value);
    }

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
    public JavaScriptObject getTransactionsComplete() {
        return getPolymerElement().getTransactionsComplete();
    }
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
    public void setTransactionsComplete(JavaScriptObject value) {
        getPolymerElement().setTransactionsComplete(value);
    }

    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * 
     */
    public Function getResolveConflict() {
        return getPolymerElement().getResolveConflict();
    }
    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * 
     */
    public void setResolveConflict(Function value) {
        getPolymerElement().setResolveConflict(value);
    }

    /**
     * <p>The current _rev (revision) of the PouchDB document that this<br>element’s data refers to, if the document is not new.</p>
     *
     * JavaScript Info:
     * @property rev
     * @type String
     * 
     */
    public String getRev() {
        return getPolymerElement().getRev();
    }
    /**
     * <p>The current _rev (revision) of the PouchDB document that this<br>element’s data refers to, if the document is not new.</p>
     *
     * JavaScript Info:
     * @property rev
     * @type String
     * 
     */
    public void setRev(String value) {
        getPolymerElement().setRev(value);
    }

    /**
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * @behavior AppPouchdbQuery
     */
    public String getAdapter() {
        return getPolymerElement().getAdapter();
    }
    /**
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * @behavior AppPouchdbQuery
     */
    public void setAdapter(String value) {
        getPolymerElement().setAdapter(value);
    }

    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * @behavior AppPouchdbQuery
     */
    public String getDbName() {
        return getPolymerElement().getDbName();
    }
    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * @behavior AppPouchdbQuery
     */
    public void setDbName(String value) {
        getPolymerElement().setDbName(value);
    }

    /**
     * <p>The value of the _id (Pouch/Couch unique identifier) of the PouchDB<br>document that this element’s data should refer to.</p>
     *
     * JavaScript Info:
     * @property docId
     * @type String
     * 
     */
    public String getDocId() {
        return getPolymerElement().getDocId();
    }
    /**
     * <p>The value of the _id (Pouch/Couch unique identifier) of the PouchDB<br>document that this element’s data should refer to.</p>
     *
     * JavaScript Info:
     * @property docId
     * @type String
     * 
     */
    public void setDocId(String value) {
        getPolymerElement().setDocId(value);
    }


    // Needed in UIBinder
    /**
     * <p>Override this getter to define the default value to use when<br>there’s no data stored.</p>
     *
     * JavaScript Info:
     * @attribute zero-value
     * @behavior AppPouchdbDocument
     */
    public void setZeroValue(String value) {
        Polymer.property(this.getPolymerElement(), "zeroValue", value);
    }

    // Needed in UIBinder
    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @attribute db
     * 
     */
    public void setDb(String value) {
        Polymer.property(this.getPolymerElement(), "db", value);
    }

    // Needed in UIBinder
    /**
     * <p>The data to synchronize.</p>
     *
     * JavaScript Info:
     * @attribute data
     * @behavior AppPouchdbDocument
     */
    public void setData(String value) {
        Polymer.property(this.getPolymerElement(), "data", value);
    }

    // Needed in UIBinder
    /**
     * <p>A promise that will resolve once all queued transactions<br>have completed.</p>
     * <p>This field is updated as new transactions are enqueued, so it will<br>only wait for transactions which were enqueued when the field<br>was accessed.</p>
     * <p>This promise never rejects.</p>
     *
     * JavaScript Info:
     * @attribute transactions-complete
     * @behavior AppPouchdbDocument
     */
    public void setTransactionsComplete(String value) {
        Polymer.property(this.getPolymerElement(), "transactionsComplete", value);
    }

    // Needed in UIBinder
    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @attribute revs-limit
     * @behavior AppPouchdbQuery
     */
    public void setRevsLimit(String value) {
        Polymer.property(this.getPolymerElement(), "revsLimit", value);
    }

    // Needed in UIBinder
    /**
     * <p>A changes event emitter. Notifies of changes to the PouchDB document<br>referred to by <code>docId</code>, if a <code>docId</code> has been provided.</p>
     *
     * JavaScript Info:
     * @attribute changes
     * 
     */
    public void setChanges(String value) {
        Polymer.property(this.getPolymerElement(), "changes", value);
    }


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
    public void setStoredValue(Object storagePath, Object value) {
        getPolymerElement().setStoredValue(storagePath, value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getStoredValue
     * @param {} storagePath  
     * 
     * 
     */
    public void getStoredValue(Object storagePath) {
        getPolymerElement().getStoredValue(storagePath);
    }

    /**
     * <p>A convenience method. Returns true iff value is null, undefined,<br>an empty array, or an object with no keys.</p>
     *
     * JavaScript Info:
     * @method valueIsEmpty
     * @param {} value  
     * @behavior AppPouchdbDocument
     * 
     */
    public void valueIsEmpty(Object value) {
        getPolymerElement().valueIsEmpty(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    public void reset() {
        getPolymerElement().reset();
    }

    /**
     * <p>Perform the initial sync between storage and memory. This method<br>is called automatically while the element is being initialized.<br>Implementations may override it.</p>
     * <p>If an implementation intends to call this method, it should instead<br>call _initializeStoredValue, which provides reentrancy protection.</p>
     *
     * JavaScript Info:
     * @method initializeStoredValue
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    public JavaScriptObject initializeStoredValue() {
        return getPolymerElement().initializeStoredValue();
    }

    /**
     * <p>Remove the data from storage.</p>
     *
     * JavaScript Info:
     * @method destroy
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    public JavaScriptObject destroy() {
        return getPolymerElement().destroy();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method save
     * 
     * 
     */
    public void save() {
        getPolymerElement().save();
    }

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
    public JavaScriptObject saveValue(JavaScriptObject args) {
        return getPolymerElement().saveValue(args);
    }

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
    public JavaScriptObject setStoredValue(String storagePath, JavaScriptObject value) {
        return getPolymerElement().setStoredValue(storagePath, value);
    }

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
    public String storagePathToMemoryPath(String path) {
        return getPolymerElement().storagePathToMemoryPath(path);
    }

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
    public String memoryPathToStoragePath(String path) {
        return getPolymerElement().memoryPathToStoragePath(path);
    }

    /**
     * <p>Enables performing transformations on the in-memory representation of<br>storage without activating observers that will cause those<br>transformations to be re-applied to the storage backend. This is useful<br>for preventing redundant (or cyclical) application of transformations.</p>
     *
     * JavaScript Info:
     * @method syncToMemory
     * @param {Function} operation  
     * @behavior AppPouchdbDocument
     * 
     */
    public void syncToMemory(Function operation) {
        getPolymerElement().syncToMemory(operation);
    }


}
