/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-storage project by The Polymer Authors
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
 * <p>AppStorageBehavior is an abstract behavior that makes it easy to<br>synchronize in-memory data and a persistant storage system, such as<br>the browser’s IndexedDB, or a remote database like Firebase.</p>
 * <p>For examples of how to use this behavior to write your own app storage<br>elements see <code>&lt;app-localstorage-document&gt;</code> here, or check out<br><a href="https://github.com/Firebase/polymerfire">polymerfire</a> and<br><a href="https://github.com/PolymerElements/app-pouchdb">app-pouchdb</a>.</p>
 */
@JsType(isNative=true)
public interface AppStorageBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppStorageBehavior";
    @JsOverlay public static final String SRC = "app-storage/app-storage-behavior.html";


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
     * <p>Optional. Override this method to clear out the mapping of this<br>storage object and a logical location within storage.</p>
     * <p>If this method is supported, after it’s called, isNew() should be<br>true.</p>
     *
     * JavaScript Info:
     * @method reset
     * @behavior AppPouchdbDocument
     * 
     */
    void reset();

    /**
     * <p>Override this method to implement reading a value from storage.</p>
     *
     * JavaScript Info:
     * @method getStoredValue
     * @param {string} storagePath  
     * @behavior AppPouchdbDocument
     * @return {JavaScriptObject}
     */
    JavaScriptObject getStoredValue(String storagePath);

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
