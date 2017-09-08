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
public class AppPouchdbQuery extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppPouchdbQuery() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppPouchdbQuery(String html) {
        super(AppPouchdbQueryElement.TAG, AppPouchdbQueryElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppPouchdbQueryElement getPolymerElement() {
        return (AppPouchdbQueryElement) getElement();
    }


    /**
     * <p>If true, all attempts to “put” or “post” values into the database<br>will be automatically structured as an “upsert”, where documents are<br>updated if already available, or created if not.</p>
     *
     * JavaScript Info:
     * @property upsert
     * @type Boolean
     * @behavior AppPouchdbQuery
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
     * @behavior AppPouchdbQuery
     */
    public void setUpsert(boolean value) {
        getPolymerElement().setUpsert(value);
    }

    /**
     * <p>The fields to include in the returned documents.</p>
     *
     * JavaScript Info:
     * @property fields
     * @type Array
     * 
     */
    public JsArray getFields() {
        return getPolymerElement().getFields();
    }
    /**
     * <p>The fields to include in the returned documents.</p>
     *
     * JavaScript Info:
     * @property fields
     * @type Array
     * 
     */
    public void setFields(JsArray value) {
        getPolymerElement().setFields(value);
    }

    /**
     * <p>The results of the query, if any.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    public JsArray getData() {
        return getPolymerElement().getData();
    }
    /**
     * <p>The results of the query, if any.</p>
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    public void setData(JsArray value) {
        getPolymerElement().setData(value);
    }

    /**
     * <p>If desired, assign a function that implements a conflict resolution<br>strategy. This conflict resolution strategy will take precedence when<br>a conflict occurs, and will prevent conflict notification events from<br>being fired.</p>
     * <p>Consider using an <code>app-pouchdb-conflict-resolver</code> element instead for<br>a more declarative experience!</p>
     *
     * JavaScript Info:
     * @property resolveConflict
     * @type Function
     * @behavior AppPouchdbQuery
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
     * @behavior AppPouchdbQuery
     */
    public void setResolveConflict(Function value) {
        getPolymerElement().setResolveConflict(value);
    }

    /**
     * <p>A list of field names to sort by. Fields in this list must have<br>indexes created for them.</p>
     *
     * JavaScript Info:
     * @property sort
     * @type Array
     * 
     */
    public JsArray getSort() {
        return getPolymerElement().getSort();
    }
    /**
     * <p>A list of field names to sort by. Fields in this list must have<br>indexes created for them.</p>
     *
     * JavaScript Info:
     * @property sort
     * @type Array
     * 
     */
    public void setSort(JsArray value) {
        getPolymerElement().setSort(value);
    }

    /**
     * <p>An object representing the parsed form of the selector, mapping to<br>a valid selector value as described in<br><a href="https://github.com/nolanlawson/pouchdb-find">the pouchdb-find docs</a>.</p>
     *
     * JavaScript Info:
     * @property parsedSelector
     * @type Object
     * 
     */
    public JavaScriptObject getParsedSelector() {
        return getPolymerElement().getParsedSelector();
    }
    /**
     * <p>An object representing the parsed form of the selector, mapping to<br>a valid selector value as described in<br><a href="https://github.com/nolanlawson/pouchdb-find">the pouchdb-find docs</a>.</p>
     *
     * JavaScript Info:
     * @property parsedSelector
     * @type Object
     * 
     */
    public void setParsedSelector(JavaScriptObject value) {
        getPolymerElement().setParsedSelector(value);
    }

    /**
     * <p>A configuration object suitable to be passed to the <code>find</code> method of<br>the PouchDB database. For more information, refer to the docs<br><a href="https://github.com/nolanlawson/pouchdb-find/blob/master/README.md#dbfindrequest--callback">here</a></p>
     *
     * JavaScript Info:
     * @property query
     * @type Object
     * 
     */
    public JavaScriptObject getQuery() {
        return getPolymerElement().getQuery();
    }
    /**
     * <p>A configuration object suitable to be passed to the <code>find</code> method of<br>the PouchDB database. For more information, refer to the docs<br><a href="https://github.com/nolanlawson/pouchdb-find/blob/master/README.md#dbfindrequest--callback">here</a></p>
     *
     * JavaScript Info:
     * @property query
     * @type Object
     * 
     */
    public void setQuery(JavaScriptObject value) {
        getPolymerElement().setQuery(value);
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
     * <p>The number of documents to skip before returning results that match<br>the query. In other words, the offset from the beginning of the<br>of the result set to start at.</p>
     *
     * JavaScript Info:
     * @property skip
     * @type Number
     * 
     */
    public double getSkip() {
        return getPolymerElement().getSkip();
    }
    /**
     * <p>The number of documents to skip before returning results that match<br>the query. In other words, the offset from the beginning of the<br>of the result set to start at.</p>
     *
     * JavaScript Info:
     * @property skip
     * @type Number
     * 
     */
    public void setSkip(double value) {
        getPolymerElement().setSkip(value);
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
     * <p>The maximum number of documents that can be returned. The default (0)<br>specifies no limit.</p>
     *
     * JavaScript Info:
     * @property limit
     * @type Number
     * 
     */
    public double getLimit() {
        return getPolymerElement().getLimit();
    }
    /**
     * <p>The maximum number of documents that can be returned. The default (0)<br>specifies no limit.</p>
     *
     * JavaScript Info:
     * @property limit
     * @type Number
     * 
     */
    public void setLimit(double value) {
        getPolymerElement().setLimit(value);
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
     * <p>The selector to use when querying for documents. Fields referenced<br>in the selector must have indexes created for them.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    public String getSelector() {
        return getPolymerElement().getSelector();
    }
    /**
     * <p>The selector to use when querying for documents. Fields referenced<br>in the selector must have indexes created for them.</p>
     *
     * JavaScript Info:
     * @property selector
     * @type String
     * 
     */
    public void setSelector(String value) {
        getPolymerElement().setSelector(value);
    }


    // Needed in UIBinder
    /**
     * <p>The results of the query, if any.</p>
     *
     * JavaScript Info:
     * @attribute data
     * 
     */
    public void setData(String value) {
        Polymer.property(this.getPolymerElement(), "data", value);
    }

    // Needed in UIBinder
    /**
     * <p>A list of field names to sort by. Fields in this list must have<br>indexes created for them.</p>
     *
     * JavaScript Info:
     * @attribute sort
     * 
     */
    public void setSort(String value) {
        Polymer.property(this.getPolymerElement(), "sort", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum number of documents that can be returned. The default (0)<br>specifies no limit.</p>
     *
     * JavaScript Info:
     * @attribute limit
     * 
     */
    public void setLimit(String value) {
        Polymer.property(this.getPolymerElement(), "limit", value);
    }

    // Needed in UIBinder
    /**
     * <p>The number of documents to skip before returning results that match<br>the query. In other words, the offset from the beginning of the<br>of the result set to start at.</p>
     *
     * JavaScript Info:
     * @attribute skip
     * 
     */
    public void setSkip(String value) {
        Polymer.property(this.getPolymerElement(), "skip", value);
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
     * <p>The fields to include in the returned documents.</p>
     *
     * JavaScript Info:
     * @attribute fields
     * 
     */
    public void setFields(String value) {
        Polymer.property(this.getPolymerElement(), "fields", value);
    }

    // Needed in UIBinder
    /**
     * <p>A configuration object suitable to be passed to the <code>find</code> method of<br>the PouchDB database. For more information, refer to the docs<br><a href="https://github.com/nolanlawson/pouchdb-find/blob/master/README.md#dbfindrequest--callback">here</a></p>
     *
     * JavaScript Info:
     * @attribute query
     * 
     */
    public void setQuery(String value) {
        Polymer.property(this.getPolymerElement(), "query", value);
    }

    // Needed in UIBinder
    /**
     * <p>A reference to the PouchDB database instance that has been created.</p>
     *
     * JavaScript Info:
     * @attribute db
     * @behavior AppPouchdbQuery
     */
    public void setDb(String value) {
        Polymer.property(this.getPolymerElement(), "db", value);
    }

    // Needed in UIBinder
    /**
     * <p>An object representing the parsed form of the selector, mapping to<br>a valid selector value as described in<br><a href="https://github.com/nolanlawson/pouchdb-find">the pouchdb-find docs</a>.</p>
     *
     * JavaScript Info:
     * @attribute parsed-selector
     * 
     */
    public void setParsedSelector(String value) {
        Polymer.property(this.getPolymerElement(), "parsedSelector", value);
    }


    /**
     * <p>PouchDB only notifies of additive changes to the result set of a query.<br>In order to keep the query results up to date with other types of<br>changes, this method can be called to perform the query again without<br>changing any of this element’s other properties.</p>
     *
     * JavaScript Info:
     * @method refresh
     * 
     * 
     */
    public void refresh() {
        getPolymerElement().refresh();
    }


}
