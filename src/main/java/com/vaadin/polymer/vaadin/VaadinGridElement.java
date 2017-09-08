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
 * <p>High quality data grid for showing large amounts of tabular data.</p>
 * <p>Simple usage (static HTML data source):</p>
 * <pre><code class="lang-html">&lt;vaadin-grid&gt;
 *   &lt;table&gt;
 *     &lt;colgroup&gt;
 *       &lt;col name=&quot;firstName&quot;&gt;
 *       &lt;col name=&quot;lastName&quot;&gt;
 *       &lt;col name=&quot;email&quot;&gt;
 *     &lt;/colgroup&gt;
 *     &lt;thead&gt;
 *       &lt;tr&gt;
 *         &lt;th&gt;Name&lt;/th&gt;
 *         &lt;th&gt;Value&lt;/th&gt;
 *         &lt;th&gt;Progress&lt;/th&gt;
 *       &lt;/tr&gt;
 *     &lt;/thead&gt;
 *     &lt;tbody&gt;
 *       &lt;tr&gt;
 *         &lt;td&gt;Jonathan&lt;/td&gt;
 *         &lt;td&gt;Doe&lt;/td&gt;
 *         &lt;td&gt;jonathan.doe@example.com&lt;/td&gt;
 *       &lt;/tr&gt;
 *       &lt;tr&gt;
 *         &lt;td&gt;Jane&lt;/td&gt;
 *         &lt;td&gt;Smith&lt;/td&gt;
 *         &lt;td&gt;jane.smith@example.com&lt;/td&gt;
 *       &lt;/tr&gt;
 *     &lt;/tbody&gt;
 *   &lt;/table&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>The grid uses <code>--primary-color</code> from <a href="https://github.com/PolymerElements/paper-styles">paper-styles</a> as a highlight color. You can customize the color by defining your own primary default color.</p>
 * <pre><code class="lang-html">&lt;style is=&quot;custom-style&quot;&gt;
 *   vaadin-grid {
 *     --primary-color: red;
 *   }
 * &lt;/style&gt;
 * </code></pre>
 * <p>The following custom properties are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th style="text-align:left">Custom property</th>
 * <th style="text-align:left">Description</th>
 * <th style="text-align:right">Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-row-height</code></td>
 * <td style="text-align:left">Data row height</td>
 * <td style="text-align:right"><code>48px</code></td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-header-row-height</code></td>
 * <td style="text-align:left">Header row height</td>
 * <td style="text-align:right"><code>56px</code></td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-footer-row-height</code></td>
 * <td style="text-align:left">Footer row height</td>
 * <td style="text-align:right"><code>56px</code></td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-selected-row-cell</code></td>
 * <td style="text-align:left">Mixin which applies to the cell elements of a selected row</td>
 * <td style="text-align:right">{}</td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-row-cell</code></td>
 * <td style="text-align:left">Mixin which applies to the cell elements of the table</td>
 * <td style="text-align:right">{}</td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-row-stripe-cell</code></td>
 * <td style="text-align:left">Mixin applied on the cells of the striped rows</td>
 * <td style="text-align:right">{}</td>
 * </tr>
 * <tr>
 * <td style="text-align:left"><code>--vaadin-grid-row-focus</code></td>
 * <td style="text-align:left">Mixin applied on the after psuedo element of the rows for focus styling</td>
 * <td style="text-align:right">{}</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>See the <a href="demo/index.html">demo</a> for use case examples.</p>
 */
@JsType(isNative=true)
public interface VaadinGridElement extends VaadinGridElementBase {

    @JsOverlay public static final String TAG = "vaadin-grid";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>A function which is used for generating CSS class names for data rows.</p>
     * <p>See the API documentation for the <code>Row</code> object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowClassGenerator = function(row) {
     *   var activity = row.data[2];
     *   return &quot;activity-&quot; + activity.toLowerCase();
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowClassGenerator
     * @type Function
     * 
     */
    @JsProperty Function getRowClassGenerator();
    /**
     * <p>A function which is used for generating CSS class names for data rows.</p>
     * <p>See the API documentation for the <code>Row</code> object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowClassGenerator = function(row) {
     *   var activity = row.data[2];
     *   return &quot;activity-&quot; + activity.toLowerCase();
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowClassGenerator
     * @type Function
     * 
     */
    @JsProperty void setRowClassGenerator(Function value);

    /**
     * <p>The array of columns attached to the grid.</p>
     * <p>See the API documentation for <code>Column</code> for more details about the<br>column objects.</p>
     *
     * JavaScript Info:
     * @property columns
     * @type Array.<Object>
     * 
     */
    @JsProperty JsArray getColumns();
    /**
     * <p>The array of columns attached to the grid.</p>
     * <p>See the API documentation for <code>Column</code> for more details about the<br>column objects.</p>
     *
     * JavaScript Info:
     * @property columns
     * @type Array.<Object>
     * 
     */
    @JsProperty void setColumns(JsArray value);

    /**
     * <p>List of the pointer events that should be observed in the internal grid implementation.<br>When any of the observed events is performed, the grid will fire a <code>detailed-event</code><br>where -event is replaced by the original event type.</p>
     *
     * JavaScript Info:
     * @property detailedEvents
     * @type Array.<String>
     * 
     */
    @JsProperty JsArray getDetailedEvents();
    /**
     * <p>List of the pointer events that should be observed in the internal grid implementation.<br>When any of the observed events is performed, the grid will fire a <code>detailed-event</code><br>where -event is replaced by the original event type.</p>
     *
     * JavaScript Info:
     * @property detailedEvents
     * @type Array.<String>
     * 
     */
    @JsProperty void setDetailedEvents(JsArray value);

    /**
     * <p>Disables the grid.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid disabled&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Disables the grid.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid disabled&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>Object for controlling and accessing the footer rows in the grid.</p>
     * <p>See the API documentation for <code>Footer</code> for more details.</p>
     *
     * JavaScript Info:
     * @property footer
     * @type Footer
     * 
     */
    @JsProperty Footer getFooter();
    /**
     * <p>Object for controlling and accessing the footer rows in the grid.</p>
     * <p>See the API documentation for <code>Footer</code> for more details.</p>
     *
     * JavaScript Info:
     * @property footer
     * @type Footer
     * 
     */
    @JsProperty void setFooter(Footer value);

    /**
     * <p>Boolean property to set whether column reordering is allowed by the grid.</p>
     *
     * JavaScript Info:
     * @property columnReorderingAllowed
     * @type Boolean
     * 
     */
    @JsProperty boolean getColumnReorderingAllowed();
    /**
     * <p>Boolean property to set whether column reordering is allowed by the grid.</p>
     *
     * JavaScript Info:
     * @property columnReorderingAllowed
     * @type Boolean
     * 
     */
    @JsProperty void setColumnReorderingAllowed(boolean value);

    /**
     * <p>Object for controlling and accessing the header rows in the grid.</p>
     * <p>See the API documentation for <code>Header</code> for more details.</p>
     *
     * JavaScript Info:
     * @property header
     * @type Header
     * 
     */
    @JsProperty Header getHeader();
    /**
     * <p>Object for controlling and accessing the header rows in the grid.</p>
     * <p>See the API documentation for <code>Header</code> for more details.</p>
     *
     * JavaScript Info:
     * @property header
     * @type Header
     * 
     */
    @JsProperty void setHeader(Header value);

    /**
     * <p>An array or a function containing or returning items determining<br>the row data in the grid (i.e. the data source).</p>
     * <p>Implement the property as a function if you wish to provide data<br>lazily to the grid, for example from a REST service, to get only the<br>items that are necessary in the grid viewport.</p>
     * <p>See the API documentation for <code>ItemsFunction</code> for more details.</p>
     * <p>For an in-memory list of items, use the <code>items</code> array property instead.</p>
     * <p>In both options, at the end the grid expects to receive an array, which<br>can contain either arrays, objects or primitive types.</p>
     * <h4 id="examples-">Examples:</h4>
     * <pre><code> grid.items = [
     *      {
     *        firsName: &quot;Jonathan&quot;,
     *        lastName: &quot;Doe&quot;,
     *        email: &quot;jonathan.doe@example.com&quot;
     *      },
     *      {
     *        firstName: &quot;Jane&quot;,
     *        lastName: &quot;Smith&quot;,
     *        email: &quot;jane.smith@example.com&quot;
     *      }
     *  ];
     * </code></pre><pre><code> grid.items = function(params, callback) {
     *    callback([&quot;foo&quot;, &quot;bar&quot;], 2);
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property items
     * @type (Array.<Object>|Function)
     * 
     */
    @JsProperty Object getItems();
    /**
     * <p>An array or a function containing or returning items determining<br>the row data in the grid (i.e. the data source).</p>
     * <p>Implement the property as a function if you wish to provide data<br>lazily to the grid, for example from a REST service, to get only the<br>items that are necessary in the grid viewport.</p>
     * <p>See the API documentation for <code>ItemsFunction</code> for more details.</p>
     * <p>For an in-memory list of items, use the <code>items</code> array property instead.</p>
     * <p>In both options, at the end the grid expects to receive an array, which<br>can contain either arrays, objects or primitive types.</p>
     * <h4 id="examples-">Examples:</h4>
     * <pre><code> grid.items = [
     *      {
     *        firsName: &quot;Jonathan&quot;,
     *        lastName: &quot;Doe&quot;,
     *        email: &quot;jonathan.doe@example.com&quot;
     *      },
     *      {
     *        firstName: &quot;Jane&quot;,
     *        lastName: &quot;Smith&quot;,
     *        email: &quot;jane.smith@example.com&quot;
     *      }
     *  ];
     * </code></pre><pre><code> grid.items = function(params, callback) {
     *    callback([&quot;foo&quot;, &quot;bar&quot;], 2);
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property items
     * @type (Array.<Object>|Function)
     * 
     */
    @JsProperty void setItems(Object value);

    /**
     * <p>Object for controlling and accessing the selected rows in the grid.</p>
     * <p>See the API documentation for the <code>Selection</code> object for more details.</p>
     *
     * JavaScript Info:
     * @property selection
     * @type Selection
     * 
     */
    @JsProperty Selection getSelection();
    /**
     * <p>Object for controlling and accessing the selected rows in the grid.</p>
     * <p>See the API documentation for the <code>Selection</code> object for more details.</p>
     *
     * JavaScript Info:
     * @property selection
     * @type Selection
     * 
     */
    @JsProperty void setSelection(Selection value);

    /**
     * <p>An array defining the sorting of columns. The order of the objects in<br>the array defines the order of sort (if the grid is sorted by<br>multiple columns).</p>
     * <p>See the API documentation for the <code>SortOrder</code> object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array
     * 
     */
    @JsProperty JsArray getSortOrder();
    /**
     * <p>An array defining the sorting of columns. The order of the objects in<br>the array defines the order of sort (if the grid is sorted by<br>multiple columns).</p>
     * <p>See the API documentation for the <code>SortOrder</code> object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array
     * 
     */
    @JsProperty void setSortOrder(JsArray value);

    /**
     * <p>Explicitly sets the number of records the <code>items</code> array/function<br>provides for the grid to display.</p>
     * <p>This may also be set indirectly by passing the value as the second<br>parameter for data request callback function.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>Explicitly sets the number of records the <code>items</code> array/function<br>provides for the grid to display.</p>
     * <p>This may also be set indirectly by passing the value as the second<br>parameter for data request callback function.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>Sets the height of the grid so that the specified amount of data rows<br>is visible. Overrides any height specified in CSS.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid visible-rows=&quot;5&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property visibleRows
     * @type Number
     * 
     */
    @JsProperty double getVisibleRows();
    /**
     * <p>Sets the height of the grid so that the specified amount of data rows<br>is visible. Overrides any height specified in CSS.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid visible-rows=&quot;5&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property visibleRows
     * @type Number
     * 
     */
    @JsProperty void setVisibleRows(double value);

    /**
     * <p>The index of the last frozen columns in this grid. A frozen column will<br>always stay visible in the grid viewport when the user scrolls the grid<br>viewport horizontally.</p>
     * <p>Setting the property to 0 means that no columns will be frozen,<br>but the built-in selection checkbox column will still be frozen if<br>it’s in use. Setting the count to -1 will unfreeze the selection<br>column also.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid frozen-columns=&quot;2&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property frozenColumns
     * @type Number
     * 
     */
    @JsProperty double getFrozenColumns();
    /**
     * <p>The index of the last frozen columns in this grid. A frozen column will<br>always stay visible in the grid viewport when the user scrolls the grid<br>viewport horizontally.</p>
     * <p>Setting the property to 0 means that no columns will be frozen,<br>but the built-in selection checkbox column will still be frozen if<br>it’s in use. Setting the count to -1 will unfreeze the selection<br>column also.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid frozen-columns=&quot;2&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property frozenColumns
     * @type Number
     * 
     */
    @JsProperty void setFrozenColumns(double value);

    /**
     * <p>A function which is used for generating CSS class names for data cells.</p>
     * <p>See the API documentation for the <code>Cell</code> object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.cellClassGenerator = function(cell) {
     *   if (cell.index == 2) {
     *      return &quot;activity-&quot; + cell.data.toLowerCase();
     *    }
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property cellClassGenerator
     * @type Function
     * 
     */
    @JsProperty Function getCellClassGenerator();
    /**
     * <p>A function which is used for generating CSS class names for data cells.</p>
     * <p>See the API documentation for the <code>Cell</code> object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.cellClassGenerator = function(cell) {
     *   if (cell.index == 2) {
     *      return &quot;activity-&quot; + cell.data.toLowerCase();
     *    }
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property cellClassGenerator
     * @type Function
     * 
     */
    @JsProperty void setCellClassGenerator(Function value);

    /**
     * <p>The row details generator is used for generating detail content for<br>data rows. The details element is added directly under the row.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowDetailsGenerator = function(rowIndex) {
     *   var detail = document.createElement(&quot;div&quot;);
     *   detail.textContent = &quot;Row detail content for row &quot; + rowIndex;
     *   return detail;
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowDetailsGenerator
     * @type Function
     * 
     */
    @JsProperty Function getRowDetailsGenerator();
    /**
     * <p>The row details generator is used for generating detail content for<br>data rows. The details element is added directly under the row.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowDetailsGenerator = function(rowIndex) {
     *   var detail = document.createElement(&quot;div&quot;);
     *   detail.textContent = &quot;Row detail content for row &quot; + rowIndex;
     *   return detail;
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowDetailsGenerator
     * @type Function
     * 
     */
    @JsProperty void setRowDetailsGenerator(Function value);


    /**
     * <p>Scrolls to the end of the grid.</p>
     * <p>Scrolling happens asynchronously, so this method returns a ‘thenable’<br>which can be used to be notified when the scrolling is finished.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.scrollToEnd().then(function() {...});
     * </code></pre>
     *
     * JavaScript Info:
     * @method scrollToEnd
     * 
     * @return {VaadinGridElement}
     */
    VaadinGridElement scrollToEnd();

    /**
     * <p>Scrolls to the beginning of the grid.</p>
     * <p>Scrolling happens asynchronously, so this method returns a ‘thenable’<br>which can be used to be notified when the scrolling is finished.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.scrollToStart().then(function() {...});
     * </code></pre>
     *
     * JavaScript Info:
     * @method scrollToStart
     * 
     * @return {VaadinGridElement}
     */
    VaadinGridElement scrollToStart();

    /**
     * <p>Clears the grid’s internal data cache, causing it to request the<br>visible items in the grid viewport from the <code>items</code> property or the<br><code>datasource</code> function.</p>
     * <p>Needs to be called whenever the data items are modified in some way<br>(added, removed, updated, re-ordered etc.).</p>
     *
     * JavaScript Info:
     * @method refreshItems
     * 
     * 
     */
    void refreshItems();

    /**
     * <p>Scrolls to a certain row, using user-specified scroll destination.</p>
     * <p>Scrolling happens asynchronously, so this method returns a ‘thenable’<br>which can be used to be notified when the scrolling is finished.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.scrollToRow(10, &quot;end&quot;).then(function() {...});
     * </code></pre>
     *
     * JavaScript Info:
     * @method scrollToRow
     * @param {Number} index  
     * @param {String} scrollDestination  
     * 
     * @return {VaadinGridElement}
     */
    VaadinGridElement scrollToRow(double index, String scrollDestination);

    /**
     * <p>Adds a new column. Column is added at the end if <code>beforeColumn</code> is not defined.</p>
     *
     * JavaScript Info:
     * @method addColumn
     * @param {Column} column  
     * @param {String} beforeColumn  
     * 
     * 
     */
    void addColumn(Column column, String beforeColumn);

    /**
     * <p>Removes a column with certain id</p>
     *
     * JavaScript Info:
     * @method removeColumn
     * @param {String} id  
     * 
     * 
     */
    void removeColumn(String id);

    /**
     * <p>Executes a callback when the grid has finished any pending work.</p>
     *
     * JavaScript Info:
     * @method then
     * @param {Function} callback  
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject then(Function callback);

    /**
     * <p>Shows or hides row details for the row at the given index.</p>
     *
     * JavaScript Info:
     * @method setRowDetailsVisible
     * @param {Number} rowIndex  
     * @param {Boolean} visible  
     * 
     * 
     */
    void setRowDetailsVisible(double rowIndex, boolean visible);

    /**
     * <p>Invokes the callback with row data of the provided row index as the<br>parameter. If the row is not cached, it’s fetched from the data source<br>first.</p>
     *
     * JavaScript Info:
     * @method getItem
     * @param {Number} rowIndex  
     * @param {Function} callback  
     * @param {Boolean} onlyCached  
     * 
     * 
     */
    void getItem(double rowIndex, Function callback, boolean onlyCached);

}
