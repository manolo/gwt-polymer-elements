/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from hydrolysis project by unknown author
 * that is licensed with unknown license.
 */
package com.vaadin.polymer.hydrolysis.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * 
 */
@JsType
public interface HydrolysisAnalyzerElement extends HTMLElement {

    public static final String TAG = "hydrolysis-analyzer";
    public static final String SRC = "hydrolysis/hydrolysis-analyzer.html";


    /**
     * <p>Begins loading the imports referenced by <code>src</code>.</p>
     * <p>If you make changes to this element’s configuration, you must call this<br>function to kick off another analysis pass.</p>
     *
     * JavaScript Info:
     * @method analyze
     * 
     */
    void analyze();

    /**
     * <p>The resultant <code>Analyzer</code> object from Hydrolysis. </p>
     *
     * JavaScript Info:
     * @property analyzer
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnalyzer();
    /**
     * <p>The resultant <code>Analyzer</code> object from Hydrolysis. </p>
     *
     * JavaScript Info:
     * @property analyzer
     * @type Object
     * 
     */
    @JsProperty void setAnalyzer(JavaScriptObject value);
  
    /**
     * <p>Whether the hydrolysis descriptors should be cleaned of redundant<br>properties.</p>
     *
     * JavaScript Info:
     * @property clean
     * @type Boolean
     * 
     */
    @JsProperty boolean getClean();
    /**
     * <p>Whether the hydrolysis descriptors should be cleaned of redundant<br>properties.</p>
     *
     * JavaScript Info:
     * @property clean
     * @type Boolean
     * 
     */
    @JsProperty void setClean(boolean value);
  
    /**
     * <p>Whether the analyzer is loading/analyzing resources. </p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoading();
    /**
     * <p>Whether the analyzer is loading/analyzing resources. </p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty void setLoading(boolean value);
  
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
    @JsProperty String getSrc();
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
    @JsProperty void setSrc(String value);
  
    /**
     * <p>Whether <em>all</em> dependencies should be loaded and analyzed.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    @JsProperty boolean getTransitive();
    /**
     * <p>Whether <em>all</em> dependencies should be loaded and analyzed.</p>
     * <p>Turning this on will probably slow down the load process dramatically.</p>
     *
     * JavaScript Info:
     * @property transitive
     * @type Boolean
     * 
     */
    @JsProperty void setTransitive(boolean value);
  
}
