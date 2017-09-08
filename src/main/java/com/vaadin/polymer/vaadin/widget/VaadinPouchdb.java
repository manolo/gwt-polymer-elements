/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-pouchdb project by Manolo Carrasco Moñino <manolo@apache.org>
 * that is licensed with Apache license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.PouchdbChangesEvent;
import com.vaadin.polymer.vaadin.widget.event.PouchdbChangesEventHandler;

import com.vaadin.polymer.vaadin.widget.event.PouchdbConnectEvent;
import com.vaadin.polymer.vaadin.widget.event.PouchdbConnectEventHandler;

import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncActiveEvent;
import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncActiveEventHandler;

import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncChangeEvent;
import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncChangeEventHandler;

import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncPausedEvent;
import com.vaadin.polymer.vaadin.widget.event.PouchdbSyncPausedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinPouchdb extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinPouchdb() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinPouchdb(String html) {
        super(VaadinPouchdbElement.TAG, VaadinPouchdbElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinPouchdbElement getPolymerElement() {
        return (VaadinPouchdbElement) getElement();
    }


    /**
     * 
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
     * 
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
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    public boolean getDescending() {
        return getPolymerElement().getDescending();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property descending
     * @type Boolean
     * 
     */
    public void setDescending(boolean value) {
        getPolymerElement().setDescending(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    public boolean getNoAutoChanges() {
        return getPolymerElement().getNoAutoChanges();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoChanges
     * @type boolean
     * 
     */
    public void setNoAutoChanges(boolean value) {
        getPolymerElement().setNoAutoChanges(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    public boolean getNoAutoSave() {
        return getPolymerElement().getNoAutoSave();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property noAutoSave
     * @type boolean
     * 
     */
    public void setNoAutoSave(boolean value) {
        getPolymerElement().setNoAutoSave(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    public JavaScriptObject getAttachments() {
        return getPolymerElement().getAttachments();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property attachments
     * @type Object
     * 
     */
    public void setAttachments(JavaScriptObject value) {
        getPolymerElement().setAttachments(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    public boolean getLiveSync() {
        return getPolymerElement().getLiveSync();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property liveSync
     * @type Boolean
     * 
     */
    public void setLiveSync(boolean value) {
        getPolymerElement().setLiveSync(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    public String getRemote() {
        return getPolymerElement().getRemote();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property remote
     * @type string
     * 
     */
    public void setRemote(String value) {
        getPolymerElement().setRemote(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    public String getQueryString() {
        return getPolymerElement().getQueryString();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property queryString
     * @type String
     * 
     */
    public void setQueryString(String value) {
        getPolymerElement().setQueryString(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    public String getIndex() {
        return getPolymerElement().getIndex();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property index
     * @type string
     * 
     */
    public void setIndex(String value) {
        getPolymerElement().setIndex(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    public String getStatus() {
        return getPolymerElement().getStatus();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property status
     * @type String
     * 
     */
    public void setStatus(String value) {
        getPolymerElement().setStatus(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    public String getDbname() {
        return getPolymerElement().getDbname();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property dbname
     * @type string
     * 
     */
    public void setDbname(String value) {
        getPolymerElement().setDbname(value);
    }


    // Needed in UIBinder
    /**
     * 
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
     * 
     *
     * JavaScript Info:
     * @attribute attachments
     * 
     */
    public void setAttachments(String value) {
        Polymer.property(this.getPolymerElement(), "attachments", value);
    }


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
    public void getAttachment(Object docId, Object attachmentName) {
        getPolymerElement().getAttachment(docId, attachmentName);
    }

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
    public void query(Object query, Object conf) {
        getPolymerElement().query(query, conf);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method createIndex
     * @param {} prop  
     * 
     * 
     */
    public void createIndex(Object prop) {
        getPolymerElement().createIndex(prop);
    }

    /**
     * <p>Cancel the synchronisation with remote process.</p>
     *
     * JavaScript Info:
     * @method cancelSync
     * 
     * 
     */
    public void cancelSync() {
        getPolymerElement().cancelSync();
    }

    /**
     * <p>Cancel observing changes.</p>
     *
     * JavaScript Info:
     * @method cancelChanges
     * 
     * 
     */
    public void cancelChanges() {
        getPolymerElement().cancelChanges();
    }

    /**
     * <p>allDocs</p>
     *
     * JavaScript Info:
     * @method allDocs
     * 
     * @return {DbPromise}
     */
    public DbPromise allDocs() {
        return getPolymerElement().allDocs();
    }

    /**
     * <p>Close the DB and remove local instance in case</p>
     *
     * JavaScript Info:
     * @method close
     * @param {Boolean} destroy  
     * 
     * 
     */
    public void close(boolean destroy) {
        getPolymerElement().close(destroy);
    }

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
    public void info(JavaScriptObject info, Function fnc, Function err) {
        getPolymerElement().info(info, fnc, err);
    }

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
    public void changes(Function func, Object conf) {
        getPolymerElement().changes(func, conf);
    }

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
    public void sync(Function fnc, Function err, Object conf) {
        getPolymerElement().sync(fnc, err, conf);
    }

    /**
     * <p>Remove</p>
     *
     * JavaScript Info:
     * @method remove
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public DbPromise remove(JavaScriptObject obj) {
        return getPolymerElement().remove(obj);
    }

    /**
     * <p>Put</p>
     *
     * JavaScript Info:
     * @method put
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public DbPromise put(JavaScriptObject obj) {
        return getPolymerElement().put(obj);
    }

    /**
     * <p>Post</p>
     *
     * JavaScript Info:
     * @method post
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public DbPromise post(JavaScriptObject obj) {
        return getPolymerElement().post(obj);
    }

    /**
     * <p>Save</p>
     *
     * JavaScript Info:
     * @method save
     * @param {Object} obj  
     * 
     * @return {DbPromise}
     */
    public DbPromise save(JavaScriptObject obj) {
        return getPolymerElement().save(obj);
    }


    /**
     * <p>A change in the data.</p>
     *
     * JavaScript Info:
     * @event pouchdb-changes
     */
    public HandlerRegistration addPouchdbChangesHandler(PouchdbChangesEventHandler handler) {
        return addDomHandler(handler, PouchdbChangesEvent.TYPE);
    }

    /**
     * <p>Connected to the database</p>
     *
     * JavaScript Info:
     * @event pouchdb-connect
     */
    public HandlerRegistration addPouchdbConnectHandler(PouchdbConnectEventHandler handler) {
        return addDomHandler(handler, PouchdbConnectEvent.TYPE);
    }

    /**
     * <p>Synchronisation active</p>
     *
     * JavaScript Info:
     * @event pouchdb-sync-active
     */
    public HandlerRegistration addPouchdbSyncActiveHandler(PouchdbSyncActiveEventHandler handler) {
        return addDomHandler(handler, PouchdbSyncActiveEvent.TYPE);
    }

    /**
     * <p>Synchronisation change</p>
     *
     * JavaScript Info:
     * @event pouchdb-sync-change
     */
    public HandlerRegistration addPouchdbSyncChangeHandler(PouchdbSyncChangeEventHandler handler) {
        return addDomHandler(handler, PouchdbSyncChangeEvent.TYPE);
    }

    /**
     * <p>Synchronisation paused</p>
     *
     * JavaScript Info:
     * @event pouchdb-sync-paused
     */
    public HandlerRegistration addPouchdbSyncPausedHandler(PouchdbSyncPausedEventHandler handler) {
        return addDomHandler(handler, PouchdbSyncPausedEvent.TYPE);
    }

}
