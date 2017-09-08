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
 * <p><code>app-pouchdb-query</code> allows for declarative, read-only querying into a PouchDB<br>database. The semantics for querying match those of the<br><a href="https://github.com/nolanlawson/pouchdb-find">pouchdb-find plugin</a>.</p>
 * <p>In order to create an <code>app-pouchdb-query</code> against any field other than <code>_id</code>, at<br>least one index needs to have been created in your PouchDB database. You can use<br><code>app-pouchdb-index</code> to do this declaratively. For example:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-index
 *     db-name=&quot;cats&quot;
 *     fields=&#39;[&quot;name&quot;]&#39;&gt;
 * &lt;/app-pouchdb-index&gt;
 * &lt;app-pouchdb-query
 *     db-name=&quot;cats&quot;
 *     selector=&quot;name $exists true&quot;
 *     fields=&#39;[&quot;_id&quot;,&quot;name&quot;]&#39;
 *     sort=&#39;[&quot;name&quot;]&#39;
 *     data=&quot;{{cats}}&quot;&gt;
 * &lt;/app-pouchdb-query&gt;
 * </code></pre>
 * <p>In the above example, an index is created on the “name” field of the “cats”<br>database. This allows the query to select by the “name” field, and sort by the<br>“name” field.</p>
 * <p>By default, PouchDB creates an index on the “_id” field, so if you don’t<br>particularly care about sorting or selecting on other fields, you don’t need to<br>create any extra indexes.</p>
 * <h2 id="describing-selectors">Describing selectors</h2>
 * <p>This element requires a specialized selector syntax that maps to the semantics<br>of the pouchdb-find plugin. For example, if you wish to create the following<br>selector:</p>
 * <pre><code class="lang-javascript">{
 *   series: &#39;Mario&#39;,
 *   debut: { $gt: 1990 }
 * }
 * </code></pre>
 * <p>You should format the <code>selector</code> property this way:</p>
 * <pre><code class="lang-javascript">&quot;series $eq &#39;Mario&#39;, debut $gt 1990&quot;
 * </code></pre>
 * <p>This makes selectors more convenient to write declaratively, while still<br>maintaining the ability to express selectors with full fidelity. For more<br>documentation on pouchdb-find selectors, please check out the docs<br><a href="https://github.com/nolanlawson/pouchdb-find#dbfindrequest--callback">here</a>.</p>
 */
@JsType(isNative=true)
public interface AppPouchdbQueryElement extends HTMLElement {

    @JsOverlay public static final String TAG = "app-pouchdb-query";
    @JsOverlay public static final String SRC = "app-pouchdb/app-pouchdb-query.html";


    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * @behavior AppPouchdbQuery
     */
    @JsProperty boolean getUpsert();
    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setUpsert(boolean value);

    /**
     * <p>The fields to include in the returned documents.</p>
     *
     * JavaScript Info:
     * @property fields
     * @type Array
     * 
     */
    @JsProperty JsArray getFields();
    /**
     * <p>The fields to include in the returned documents.</p>
     *
     * JavaScript Info:
     * @property fields
     * @type Array
     * 
     */
    @JsProperty void setFields(JsArray value);

    /**
     * <p>The results of the query, if any.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty JsArray getData();
    /**
     * <p>The results of the query, if any.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty void setData(JsArray value);

    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * @behavior AppPouchdbQuery
     */
    @JsProperty Function getResolveConflict();
    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * @behavior AppPouchdbQuery
     */
    @JsProperty void setResolveConflict(Function value);

    /**
     * <p>A list of field names to sort by. Fields in this list must have<br>indexes created for them.</p>
     *
     * JavaScript Info:
     * @property sort
     * @type Array
     * 
     */
    @JsProperty JsArray getSort();
    /**
     * <p>A list of field names to sort by. Fields in this list must have<br>indexes created for them.</p>
     *
     * JavaScript Info:
     * @property sort
     * @type Array
     * 
     */
    @JsProperty void setSort(JsArray value);

    /**
     * <p>An object representing the parsed form of the selector, mapping to<br>a valid selector value as described in<br><a href="https://github.com/nolanlawson/pouchdb-find">the pouchdb-find docs</a>.</p>
     *
     * JavaScript Info:
     * @property parsedSelector
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getParsedSelector();
    /**
     * <p>An object representing the parsed form of the selector, mapping to<br>a valid selector value as described in<br><a href="https://github.com/nolanlawson/pouchdb-find">the pouchdb-find docs</a>.</p>
     *
     * JavaScript Info:
     * @property parsedSelector
     * @type Object
     * 
     */
    @JsProperty void setParsedSelector(JavaScriptObject value);

    /**
     * <p>A configuration object suitable to be passed to the <code>find</code> method of<br>the PouchDB database. For more information, refer to the docs<br><a href="https://github.com/nolanlawson/pouchdb-find/blob/master/README.md#dbfindrequest--callback">here</a></p>
     *
     * JavaScript Info:
     * @property query
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getQuery();
    /**
     * <p>A configuration object suitable to be passed to the <code>find</code> method of<br>the PouchDB database. For more information, refer to the docs<br><a href="https://github.com/nolanlawson/pouchdb-find/blob/master/README.md#dbfindrequest--callback">here</a></p>
     *
     * JavaScript Info:
     * @property query
     * @type Object
     * 
     */
    @JsProperty void setQuery(JavaScriptObject value);

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
     * <p>The number of documents to skip before returning results that match<br>the query. In other words, the offset from the beginning of the<br>of the result set to start at.</p>
     *
     * JavaScript Info:
     * @property skip
     * @type Number
     * 
     */
    @JsProperty double getSkip();
    /**
     * <p>The number of documents to skip before returning results that match<br>the query. In other words, the offset from the beginning of the<br>of the result set to start at.</p>
     *
     * JavaScript Info:
     * @property skip
     * @type Number
     * 
     */
    @JsProperty void setSkip(double value);

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
     * <p>The maximum number of documents that can be returned. The default (0)<br>specifies no limit.</p>
     *
     * JavaScript Info:
     * @property limit
     * @type Number
     * 
     */
    @JsProperty double getLimit();
    /**
     * <p>The maximum number of documents that can be returned. The default (0)<br>specifies no limit.</p>
     *
     * JavaScript Info:
     * @property limit
     * @type Number
     * 
     */
    @JsProperty void setLimit(double value);

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
     * <p>The selector to use when querying for documents. Fields referenced<br>in the selector must have indexes created for them.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    @JsProperty String getSelector();
    /**
     * <p>The selector to use when querying for documents. Fields referenced<br>in the selector must have indexes created for them.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    @JsProperty void setSelector(String value);


    /**
     * <p>PouchDB only notifies of additive changes to the result set of a query.<br>In order to keep the query results up to date with other types of<br>changes, this method can be called to perform the query again without<br>changing any of this element’s other properties.</p>
     *
     * JavaScript Info:
     * @method refresh
     * 
     * 
     */
    void refresh();

}
