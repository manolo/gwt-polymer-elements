/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface VaadinPouchdbElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-pouchdb";
    @JsOverlay public static final String SRC = "vaadin-pouchdb/vaadin-pouchdb.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty JsArray getData();
    /**
     * 
     *
     * JavaScript Info:
     * @property data
     * @type Array
     * 
     */
    @JsProperty void setData(JsArray value);

    /**
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    @JsProperty boolean getDescending();
    /**
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    @JsProperty void setDescending(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    @JsProperty boolean getNoAutoChanges();
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    @JsProperty void setNoAutoChanges(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    @JsProperty boolean getNoAutoSave();
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    @JsProperty void setNoAutoSave(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAttachments();
    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    @JsProperty void setAttachments(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    @JsProperty boolean getLiveSync();
    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    @JsProperty void setLiveSync(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    @JsProperty String getRemote();
    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    @JsProperty void setRemote(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    @JsProperty String getQueryString();
    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    @JsProperty void setQueryString(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    @JsProperty String getIndex();
    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    @JsProperty void setIndex(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    @JsProperty String getStatus();
    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    @JsProperty void setStatus(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    @JsProperty String getDbname();
    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    @JsProperty void setDbname(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method getAttachment
     * @param {} docId  
     * @param {} attachmentName  
     * 
     * 
     */
    void getAttachment(Object docId, Object attachmentName);

    /**
     * <p>Get all docs matching the query string if provided,<br>otherwise we will use the default index defined as an attribute.</p>
     *
     * JavaScript Info:
     * @method query
     * @param {} query  
     * @param {} conf  
     * 
     * 
     */
    void query(Object query, Object conf);

    /**
     * 
     *
     * JavaScript Info:
     * @method createIndex
     * @param {} prop  
     * 
     * 
     */
    void createIndex(Object prop);

    /**
     * <p>Close the DB and remove local instance in case</p>
     *
     * JavaScript Info:
     * @method close
     * @param {Boolean} destroy  
     * 
     * 
     */
    void close(boolean destroy);

    /**
     * <p>Put</p>
     *
     * JavaScript Info:
     * @method put
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    DbPromise put(JavaScriptObject obj);

    /**
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     * 
     * @return {DbPromise}
     */
    DbPromise allDocs();

    /**
     * <p>Cancel the synchronisation with remote process.</p>
     *
     * JavaScript Info:
     * @method cancelSync
     * 
     * 
     */
    void cancelSync();

    /**
     * <p>Cancel observing changes.</p>
     *
     * JavaScript Info:
     * @method cancelChanges
     * 
     * 
     */
    void cancelChanges();

    /**
     * <p>Sync</p>
     *
     * JavaScript Info:
     * @method sync
     * @param {Function} fnc  
     * @param {Function} err  
     * @param {} conf  
     * 
     * 
     */
    void sync(Function fnc, Function err, Object conf);

    /**
     * <p>Info</p>
     *
     * JavaScript Info:
     * @method info
     * @param {Object} info  
     * @param {Function} fnc  
     * @param {Function} err  
     * 
     * 
     */
    void info(JavaScriptObject info, Function fnc, Function err);

    /**
     * <p>Subscribe to changes</p>
     *
     * JavaScript Info:
     * @method changes
     * @param {Function} func  
     * @param {} conf  
     * 
     * 
     */
    void changes(Function func, Object conf);

    /**
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    DbPromise remove(JavaScriptObject obj);

    /**
     * <p>Post</p>
     *
     * JavaScript Info:
     * @method post
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    DbPromise post(JavaScriptObject obj);

    /**
     * <p>Save</p>
     *
     * JavaScript Info:
     * @method save
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    DbPromise save(JavaScriptObject obj);

}
