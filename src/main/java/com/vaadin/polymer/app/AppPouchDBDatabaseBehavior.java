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
 * <p><code>Polymer.AppPouchDBDatabaseBehavior</code> is an abstract implementation that<br>is intended to be shared by any element that refers to and operates on a<br>PouchDB database instance. It includes implementation for creating and<br>configuring a PouchDB database instance, and some advanced macro<br>operations that might be performed on the database, including “upsert”<br>and conflict-aware “put” and “post” operations.</p>
 */
@JsType(isNative=true)
public interface AppPouchDBDatabaseBehavior {

    @JsOverlay public static final String NAME = "Polymer.AppPouchDBDatabaseBehavior";
    @JsOverlay public static final String SRC = "app-pouchdb/app-pouchdb-query.html";


    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getDb();
    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @property db
     * @type Object
     * 
     */
    @JsProperty void setDb(JavaScriptObject value);

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
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * 
     */
    @JsProperty double getRevsLimit();
    /**
     * <p>The number of document revisions to keep track of. The default value<br>(0) indicates no limit.</p>
     *
     * JavaScript Info:
     * @property revsLimit
     * @type Number
     * 
     */
    @JsProperty void setRevsLimit(double value);

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
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * 
     */
    @JsProperty String getAdapter();
    /**
     * <p>The PouchDB adapter to use. For more information on PouchDB adapters,<br>please refer to the PouchDB documentation<br><a href="https://pouchdb.com/api.html#create_database">here</a>.</p>
     *
     * JavaScript Info:
     * @property adapter
     * @type String
     * 
     */
    @JsProperty void setAdapter(String value);

    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * 
     */
    @JsProperty String getDbName();
    /**
     * <p>The name of the database. This can be either a local database (such<br>as “cats”), or a remote one (e.g., “<a href="https://example.com:5678/cats">https://example.com:5678/cats</a>“).</p>
     *
     * JavaScript Info:
     * @property dbName
     * @type String
     * 
     */
    @JsProperty void setDbName(String value);


}
