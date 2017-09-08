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
 * <p><code>app-pouchdb-conflict-resolution</code> enables declarative configuration of conflict<br>resolution strategies ordered by logical relationships in the DOM. Currently<br>two basic strategies are supported: <code>firstWriteWins</code> and <code>lastWriteWins</code>.</p>
 * <p>To use <code>app-pouchdb-conflict-resolution</code>, simply include the element somewhere<br>in a document subtree at or above the ShadowRoot of an <code>app-pouchdb-document</code><br>or <code>app-pouchdb-query</code>:</p>
 * <pre><code class="lang-html">&lt;app-pouchdb-conflict-resolution
 *     strategy=&quot;lastWriteWins&quot;&gt;
 * &lt;/app-pouchdb-conflict-resolution&gt;
 * &lt;app-pouchdb-document
 *     db-name=&quot;cats&quot;
 *     doc-id=&quot;parsnip&quot;&gt;
 * &lt;/app-pouchdb-document&gt;
 * </code></pre>
 * <p>When a conflict occurs, the <code>app-pouchdb-document</code> will request fire an event<br>to notify of the conflict and request a resolution strategy. The<br><code>app-pouchdb-conflict-resolution</code> element listens at its nearest ShadowRoot<br>boundary for conflict notifications, and responds to them as needed with a<br>configured strategy.</p>
 */
public class AppPouchdbConflictResolution extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppPouchdbConflictResolution() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppPouchdbConflictResolution(String html) {
        super(AppPouchdbConflictResolutionElement.TAG, AppPouchdbConflictResolutionElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppPouchdbConflictResolutionElement getPolymerElement() {
        return (AppPouchdbConflictResolutionElement) getElement();
    }


    /**
     * <p>By default, this element stops propagation of any conflict events<br>that it is able to handle. If set to <code>true</code>, the element will allow<br>such events to continue propagating, opening the possibility that<br>another conflict resolution strategy higher up the document tree will<br>superseed this one.</p>
     *
     * JavaScript Info:
     * @property allowAncestralResolution
     * @type Boolean
     * 
     */
    public boolean getAllowAncestralResolution() {
        return getPolymerElement().getAllowAncestralResolution();
    }
    /**
     * <p>By default, this element stops propagation of any conflict events<br>that it is able to handle. If set to <code>true</code>, the element will allow<br>such events to continue propagating, opening the possibility that<br>another conflict resolution strategy higher up the document tree will<br>superseed this one.</p>
     *
     * JavaScript Info:
     * @property allowAncestralResolution
     * @type Boolean
     * 
     */
    public void setAllowAncestralResolution(boolean value) {
        getPolymerElement().setAllowAncestralResolution(value);
    }

    /**
     * <p>The name of the strategy to use to reslve the conflict. Supported<br>strategies are <code>firstWriteWins</code> (the default) and <code>lastWriteWins</code>.</p>
     *
     * JavaScript Info:
     * @property strategy
     * @type String
     * 
     */
    public String getStrategy() {
        return getPolymerElement().getStrategy();
    }
    /**
     * <p>The name of the strategy to use to reslve the conflict. Supported<br>strategies are <code>firstWriteWins</code> (the default) and <code>lastWriteWins</code>.</p>
     *
     * JavaScript Info:
     * @property strategy
     * @type String
     * 
     */
    public void setStrategy(String value) {
        getPolymerElement().setStrategy(value);
    }



    /**
     * 
     *
     * JavaScript Info:
     * @method firstWriteWins
     * @param {} db  
     * @param {} method  
     * @param {} doc  
     * @param {} error  
     * 
     * 
     */
    public void firstWriteWins(Object db, Object method, Object doc, Object error) {
        getPolymerElement().firstWriteWins(db, method, doc, error);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method lastWriteWins
     * @param {} db  
     * @param {} method  
     * @param {} doc  
     * @param {} error  
     * 
     * 
     */
    public void lastWriteWins(Object db, Object method, Object doc, Object error) {
        getPolymerElement().lastWriteWins(db, method, doc, error);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveConflict
     * @param {} event  
     * 
     * 
     */
    public void resolveConflict(Object event) {
        getPolymerElement().resolveConflict(event);
    }


}
