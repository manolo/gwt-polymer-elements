/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from hydrolysis project by unknown author
 * that is licensed with unknown license.
 */
package com.vaadin.polymer.hydrolysis.widget;

import com.vaadin.polymer.hydrolysis.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class HydrolysisAnalyzer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public HydrolysisAnalyzer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public HydrolysisAnalyzer(String html) {
        super(HydrolysisAnalyzerElement.TAG, HydrolysisAnalyzerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public HydrolysisAnalyzerElement getPolymerElement() {
        return (HydrolysisAnalyzerElement) getElement();
    }


    /**
     * <p>The resultant <code>Analyzer</code> object from Hydrolysis. </p>
     *
     * JavaScript Info:
     * @property analyzer
     * @type Object
     * 
     */
    public JavaScriptObject getAnalyzer() {
        return getPolymerElement().getAnalyzer();
    }
    /**
     * <p>The resultant <code>Analyzer</code> object from Hydrolysis. </p>
     *
     * JavaScript Info:
     * @property analyzer
     * @type Object
     * 
     */
    public void setAnalyzer(JavaScriptObject value) {
        getPolymerElement().setAnalyzer(value);
    }

    /**
     * <p>Whether the hydrolysis descriptors should be cleaned of redundant<br>properties.</p>
     *
     * JavaScript Info:
     * @property clean
     * @type Boolean
     * 
     */
    public boolean getClean() {
        return getPolymerElement().getClean();
    }
    /**
     * <p>Whether the hydrolysis descriptors should be cleaned of redundant<br>properties.</p>
     *
     * JavaScript Info:
     * @property clean
     * @type Boolean
     * 
     */
    public void setClean(boolean value) {
        getPolymerElement().setClean(value);
    }

    /**
     * <p>Whether the analyzer is loading/analyzing resources. </p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p>Whether the analyzer is loading/analyzing resources. </p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
    }

    /**
     * <p>Whether <em>all</em> dependencies should be loaded and analyzed.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    public boolean getTransitive() {
        return getPolymerElement().getTransitive();
    }
    /**
     * <p>Whether <em>all</em> dependencies should be loaded and analyzed.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    public void setTransitive(boolean value) {
        getPolymerElement().setTransitive(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property resolver
     * @type String
     * 
     */
    public String getResolver() {
        return getPolymerElement().getResolver();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property resolver
     * @type String
     * 
     */
    public void setResolver(String value) {
        getPolymerElement().setResolver(value);
    }

    /**
     * <p>The URL to an import that declares (or transitively imports) the<br>elements that you wish to see analyzed.</p>
     * <p>If the URL is relative, it will be resolved relative to the master<br>document.</p>
     * <p>If you change this value after the <code>&lt;hydrolysis-analyzer&gt;</code> has been<br>instantiated, you must call <code>analyze()</code>.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The URL to an import that declares (or transitively imports) the<br>elements that you wish to see analyzed.</p>
     * <p>If the URL is relative, it will be resolved relative to the master<br>document.</p>
     * <p>If you change this value after the <code>&lt;hydrolysis-analyzer&gt;</code> has been<br>instantiated, you must call <code>analyze()</code>.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }


    // Needed in UIBinder
    /**
     * <p>The resultant <code>Analyzer</code> object from Hydrolysis. </p>
     *
     * JavaScript Info:
     * @attribute analyzer
     * 
     */
    public void setAnalyzer(String value) {
        Polymer.property(this.getPolymerElement(), "analyzer", value);
    }


    /**
     * <p>Begins loading the imports referenced by <code>src</code>.</p>
     * <p>If you make changes to this element’s configuration, you must call this<br>function to kick off another analysis pass.</p>
     *
     * JavaScript Info:
     * @method analyze
     * 
     * 
     */
    public void analyze() {
        getPolymerElement().analyze();
    }


}
