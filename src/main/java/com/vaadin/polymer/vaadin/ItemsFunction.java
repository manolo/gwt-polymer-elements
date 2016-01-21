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
 * <p>The grid passes a <code>params</code> object as the first parameter to the <code>items</code><br>function. It contains information about the exact items/rows the grid wants<br>to display in its viewport as well as the sort order of the grid (see the<br>documentation for <code>SortOrder</code>).</p>
 * <p>The second parameter for the <code>items</code> function is a callback function for<br>providing the grid with the requested items. The callback function takes an<br>array containing the items and optinally the total number of items in the<br>data source (see grid’s <code>size</code> property) as its parameters.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">grid.items = function(params, callback) {
 *   var start = params.index;
 *   var end = params.index + params.count;
 *   callback([start...end], totalItems);
 * }
 * </code></pre>
 */
@JsType(isNative=true)
public interface ItemsFunction {

    @JsOverlay public static final String NAME = "items-function";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Number of data items to fetch.</p>
     *
     * JavaScript Info:
     * @property count
     * @type number
     * 
     */
    @JsProperty double getCount();
    /**
     * <p>Number of data items to fetch.</p>
     *
     * JavaScript Info:
     * @property count
     * @type number
     * 
     */
    @JsProperty void setCount(double value);

    /**
     * <p>Index of the first data item to fetch.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty double getIndex();
    /**
     * <p>Index of the first data item to fetch.</p>
     *
     * JavaScript Info:
     * @property index
     * @type number
     * 
     */
    @JsProperty void setIndex(double value);

    /**
     * <p>Sorting order for the fetched data items.</p>
     * <p>See the API documentation for the <code>sortOrder</code> property and the<br>“SortOrder” object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array.<SortOrder>
     * 
     */
    @JsProperty JsArray getSortOrder();
    /**
     * <p>Sorting order for the fetched data items.</p>
     * <p>See the API documentation for the <code>sortOrder</code> property and the<br>“SortOrder” object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array.<SortOrder>
     * 
     */
    @JsProperty void setSortOrder(JsArray value);


}
