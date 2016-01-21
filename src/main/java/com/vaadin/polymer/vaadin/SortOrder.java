/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Object for defining the sorting order of the columns. Used inside the<br><code>sortOrder</code> array property.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">grid.sortOrder = [
 *  {
 *     column: 1,
 *     direction: &quot;asc&quot;
 *   },
 *   {
 *     column: 0,
 *     direction: &quot;desc&quot;
 *   }
 * ];
 * </code></pre>
 */
@JsType(isNative=true)
public interface SortOrder {

    @JsOverlay public static final String NAME = "sort-order";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Index of the column.</p>
     *
     * JavaScript Info:
     * @property column
     * @type number
     * 
     */
    @JsProperty double getColumn();
    /**
     * <p>Index of the column.</p>
     *
     * JavaScript Info:
     * @property column
     * @type number
     * 
     */
    @JsProperty void setColumn(double value);

    /**
     * <p>Sort direction for the given column.</p>
     * <h4 id="possible-values-">Possible values:</h4>
     * <ul>
     * <li><strong>asc</strong> - Sort the given column in ascending order (smaller first).</li>
     * <li><strong>desc</strong> - Sort the given column in descending order (bigger first).</li>
     * </ul>
     * <p>Can be set declaratively:</p>
     * <pre><code class="lang-html">&lt;col sort-direction=&quot;asc&quot;&gt;`
     * </code></pre>
     * <p>The sort order is defined by the column order in this case.</p>
     *
     * JavaScript Info:
     * @property direction
     * @type string
     * 
     */
    @JsProperty String getDirection();
    /**
     * <p>Sort direction for the given column.</p>
     * <h4 id="possible-values-">Possible values:</h4>
     * <ul>
     * <li><strong>asc</strong> - Sort the given column in ascending order (smaller first).</li>
     * <li><strong>desc</strong> - Sort the given column in descending order (bigger first).</li>
     * </ul>
     * <p>Can be set declaratively:</p>
     * <pre><code class="lang-html">&lt;col sort-direction=&quot;asc&quot;&gt;`
     * </code></pre>
     * <p>The sort order is defined by the column order in this case.</p>
     *
     * JavaScript Info:
     * @property direction
     * @type string
     * 
     */
    @JsProperty void setDirection(String value);


}
