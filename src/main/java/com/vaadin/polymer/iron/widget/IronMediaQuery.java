/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-media-query project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>iron-media-query</code> can be used to data bind to a CSS media query.<br>The <code>query</code> property is a bare CSS media query.<br>The <code>query-matches</code> property is a boolean representing whether the page matches that media query.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-media-query query=&quot;(min-width: 600px)&quot; query-matches=&quot;{{queryMatches}}&quot;&gt;&lt;/iron-media-query&gt;
 * 
 * 
 * </code></pre>
 */
public class IronMediaQuery extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronMediaQuery() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronMediaQuery(String html) {
        super(IronMediaQueryElement.TAG, IronMediaQueryElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronMediaQueryElement getPolymerElement() {
        return (IronMediaQueryElement) getElement();
    }


  
    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    public String getQuery(){
        return getPolymerElement().getQuery();
    }
    /**
     * <p>The CSS media query to evaluate.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    public void setQuery(String value) {
        getPolymerElement().setQuery(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method queryChanged
     * @param {} query  
     * 
     */
    public void queryChanged(JavaScriptObject query) {
        getPolymerElement().queryChanged(query);
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method queryHandler
     * @param {} mq  
     * 
     */
    public void queryHandler(JavaScriptObject mq) {
        getPolymerElement().queryHandler(mq);
    }
  

  
    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    public boolean getQueryMatches(){
        return getPolymerElement().getQueryMatches();
    }
    /**
     * <p>The Boolean return value of the media query.</p>
     *
     * JavaScript Info:
     * @property queryMatches
     * @type Boolean
     * 
     */
    public void setQueryMatches(boolean value) {
        getPolymerElement().setQueryMatches(value);
    }
   
  


}
