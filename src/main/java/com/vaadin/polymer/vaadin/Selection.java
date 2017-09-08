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
 * <p>Object for accessing and controlling selected rows of the grid.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">grid.selection.mode = &quot;multi&quot;;
 * grid.selection.selectAll();
 * grid.selection.selected(); // [0, 1, 2, 3, ...]
 * grid.selection.selected(function(index) {
 *   // Iterate over the selected indexes without populating an array
 * });
 * </code></pre>
 */
@JsType(isNative=true)
public interface Selection {

    @JsOverlay public static final String NAME = "Selection";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Size of the selection (i.e. how many rows are selected).</p>
     *
     * JavaScript Info:
     * @property size
     * @type number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>Size of the selection (i.e. how many rows are selected).</p>
     *
     * JavaScript Info:
     * @property size
     * @type number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The selection mode dictates how many rows can be selected.</p>
     * <h4 id="possible-values-">Possible values:</h4>
     * <ul>
     * <li><strong>disabled</strong>: No rows can be selected.</li>
     * <li><strong>single</strong>: A single row can be selected at any given time.</li>
     * <li><strong>multi</strong>: Multiple rows can be selected.</li>
     * <li><strong>all</strong>: For the end user this is the same as “multi”, except that<br>the “select all” checkbox in the grid header is checked. This mode is<br>useful in determining whether to get the <code>selected</code> or <code>deselected</code><br>rows array.</li>
     * </ul>
     * <p>Setting the selection mode has the side-effect of clearing any previous<br>selection.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.selection.mode = &quot;multi&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid selection-mode=&quot;multi&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property mode
     * @type string
     * 
     */
    @JsProperty String getMode();
    /**
     * <p>The selection mode dictates how many rows can be selected.</p>
     * <h4 id="possible-values-">Possible values:</h4>
     * <ul>
     * <li><strong>disabled</strong>: No rows can be selected.</li>
     * <li><strong>single</strong>: A single row can be selected at any given time.</li>
     * <li><strong>multi</strong>: Multiple rows can be selected.</li>
     * <li><strong>all</strong>: For the end user this is the same as “multi”, except that<br>the “select all” checkbox in the grid header is checked. This mode is<br>useful in determining whether to get the <code>selected</code> or <code>deselected</code><br>rows array.</li>
     * </ul>
     * <p>Setting the selection mode has the side-effect of clearing any previous<br>selection.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.selection.mode = &quot;multi&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid selection-mode=&quot;multi&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property mode
     * @type string
     * 
     */
    @JsProperty void setMode(String value);


    /**
     * <p>Selected row indexes.</p>
     *
     * JavaScript Info:
     * @method selected
     * @param {Function} iterator  
     * @param {Number} startIndex  
     * @param {Number} endIndex  
     * 
     * @return {JsArray}
     */
    JsArray selected(Function iterator, double startIndex, double endIndex);

    /**
     * <p>Deselect a row.</p>
     *
     * JavaScript Info:
     * @method deselect
     * @param {Number} index  
     * 
     * 
     */
    void deselect(double index);

    /**
     * <p>Select a row.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {Number} index  
     * 
     * 
     */
    void select(double index);

    /**
     * <p>Clear the selection.</p>
     * <p>If the selection mode is “all”, calling <code>clear()</code> sets the selection mode<br>to “multi” as a side-effect.</p>
     *
     * JavaScript Info:
     * @method clear
     * 
     * 
     */
    void clear();

    /**
     * <p>Deselected row indexes. Only returns indexes when selection mode is<br>“all”, otherwise returns an empty array.</p>
     *
     * JavaScript Info:
     * @method deselected
     * 
     * @return {JsArray}
     */
    JsArray deselected();

    /**
     * <p>Select all rows. Does nothing if the selection mode is not “multi” or<br>“all”.</p>
     * <p>If the selection mode is “multi”, calling <code>selectAll()</code> sets the<br>selection mode to “all” as a side-effect.</p>
     *
     * JavaScript Info:
     * @method selectAll
     * 
     * 
     */
    void selectAll();

}
