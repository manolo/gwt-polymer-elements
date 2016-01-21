/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-grid project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.SelectedItemsChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.SelectedItemsChangedEventHandler;

import com.vaadin.polymer.vaadin.widget.event.SelectionModeChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.SelectionModeChangedEventHandler;

import com.vaadin.polymer.vaadin.widget.event.SortOrderChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.SortOrderChangedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
 * <p>The grid uses <code>--default-primary-color</code> from <a href="https://github.com/PolymerElements/paper-styles">paper-styles</a> as a highlight color. You can customize the color by defining your own primary default color.</p>
 * <pre><code class="lang-html">&lt;style is=&quot;custom-style&quot;&gt;
 *   vaadin-grid {
 *     --default-primary-color: red;
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
 * </tbody>
 * </table>
 * <p>See the <a href="demo/index.html">demo</a> for use case examples.</p>
 */
public class VaadinGrid extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinGrid() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinGrid(String html) {
        super(VaadinGridElement.TAG, VaadinGridElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinGridElement getPolymerElement() {
        try {
            return (VaadinGridElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Disables the grid.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid disabled&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property disabled
     * @type boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Disables the grid.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid disabled&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property disabled
     * @type boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Object for controlling and accessing the footer rows in the grid.</p>
     * <p>See the API documentation for “footer” for more details.</p>
     *
     * JavaScript Info:
     * @property footer
     * @type footer
     * 
     */
    public Footer getFooter() {
        return getPolymerElement().getFooter();
    }
    /**
     * <p>Object for controlling and accessing the footer rows in the grid.</p>
     * <p>See the API documentation for “footer” for more details.</p>
     *
     * JavaScript Info:
     * @property footer
     * @type footer
     * 
     */
    public void setFooter(Footer value) {
        getPolymerElement().setFooter(value);
    }

    /**
     * <p>The index of the last frozen columns in this grid. A frozen column will<br>always stay visible in the grid viewport when the user scrolls the grid<br>viewport horizontally.</p>
     * <p>Setting the property to 0 means that no columns will be frozen,<br>but the built-in selection checkbox column will still be frozen if<br>it’s in use. Setting the count to -1 will unfreeze the selection<br>column also.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid frozen-columns=&quot;2&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property frozenColumns
     * @type number
     * 
     */
    public double getFrozenColumns() {
        return getPolymerElement().getFrozenColumns();
    }
    /**
     * <p>The index of the last frozen columns in this grid. A frozen column will<br>always stay visible in the grid viewport when the user scrolls the grid<br>viewport horizontally.</p>
     * <p>Setting the property to 0 means that no columns will be frozen,<br>but the built-in selection checkbox column will still be frozen if<br>it’s in use. Setting the count to -1 will unfreeze the selection<br>column also.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid frozen-columns=&quot;2&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property frozenColumns
     * @type number
     * 
     */
    public void setFrozenColumns(double value) {
        getPolymerElement().setFrozenColumns(value);
    }

    /**
     * <p>Object for controlling and accessing the header rows in the grid.</p>
     * <p>See the API documentation for “header” for more details.</p>
     *
     * JavaScript Info:
     * @property header
     * @type header
     * 
     */
    public Header getHeader() {
        return getPolymerElement().getHeader();
    }
    /**
     * <p>Object for controlling and accessing the header rows in the grid.</p>
     * <p>See the API documentation for “header” for more details.</p>
     *
     * JavaScript Info:
     * @property header
     * @type header
     * 
     */
    public void setHeader(Header value) {
        getPolymerElement().setHeader(value);
    }

    /**
     * <p>An array or a function containing or returning items determining<br>the row data in the grid (i.e. the data source).</p>
     * <p>Implement the property as a function if you wish to provide data<br>lazily to the grid, for example from a REST service, to get only the<br>items that are necessary in the grid viewport.</p>
     * <p>See the API documentation for “items function” for more details.</p>
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
     * @type (Array.<Object>|function)
     * 
     */
    public Object getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * <p>An array or a function containing or returning items determining<br>the row data in the grid (i.e. the data source).</p>
     * <p>Implement the property as a function if you wish to provide data<br>lazily to the grid, for example from a REST service, to get only the<br>items that are necessary in the grid viewport.</p>
     * <p>See the API documentation for “items function” for more details.</p>
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
     * @type (Array.<Object>|function)
     * 
     */
    public void setItems(Object value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>The array of columns attached to the grid.</p>
     * <p>See the API documentation for “column” for more details about the<br>column objects.</p>
     *
     * JavaScript Info:
     * @property columns
     * @type Array.<object>
     * 
     */
    public JsArray getColumns() {
        return getPolymerElement().getColumns();
    }
    /**
     * <p>The array of columns attached to the grid.</p>
     * <p>See the API documentation for “column” for more details about the<br>column objects.</p>
     *
     * JavaScript Info:
     * @property columns
     * @type Array.<object>
     * 
     */
    public void setColumns(JsArray value) {
        getPolymerElement().setColumns(value);
    }

    /**
     * <p>Explicitly sets the number of records the <code>items</code> array/function<br>provides for the grid to display.</p>
     * <p>This may also be set indirectly by passing the value as the second<br>parameter for data request callback function.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public double getSize() {
        return getPolymerElement().getSize();
    }
    /**
     * <p>Explicitly sets the number of records the <code>items</code> array/function<br>provides for the grid to display.</p>
     * <p>This may also be set indirectly by passing the value as the second<br>parameter for data request callback function.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public void setSize(double value) {
        getPolymerElement().setSize(value);
    }

    /**
     * <p>An array defining the sorting of columns. The order of the objects in<br>the array defines the order of sort (if the grid is sorted by<br>multiple columns).</p>
     * <p>See the API documentation for the “sort-order” object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array
     * 
     */
    public JsArray getSortOrder() {
        return getPolymerElement().getSortOrder();
    }
    /**
     * <p>An array defining the sorting of columns. The order of the objects in<br>the array defines the order of sort (if the grid is sorted by<br>multiple columns).</p>
     * <p>See the API documentation for the “sort-order” object for more details.</p>
     *
     * JavaScript Info:
     * @property sortOrder
     * @type Array
     * 
     */
    public void setSortOrder(JsArray value) {
        getPolymerElement().setSortOrder(value);
    }

    /**
     * <p>Sets the height of the grid so that the specified amount of data rows<br>is visible. Overrides any height specified in CSS.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid visible-rows=&quot;5&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property visibleRows
     * @type number
     * 
     */
    public double getVisibleRows() {
        return getPolymerElement().getVisibleRows();
    }
    /**
     * <p>Sets the height of the grid so that the specified amount of data rows<br>is visible. Overrides any height specified in CSS.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid visible-rows=&quot;5&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property visibleRows
     * @type number
     * 
     */
    public void setVisibleRows(double value) {
        getPolymerElement().setVisibleRows(value);
    }

    /**
     * <p>Object for controlling and accessing the selected rows in the grid.</p>
     * <p>See the API documentation for the “selection” object for more details.</p>
     *
     * JavaScript Info:
     * @property selection
     * @type selection
     * 
     */
    public Selection getSelection() {
        return getPolymerElement().getSelection();
    }
    /**
     * <p>Object for controlling and accessing the selected rows in the grid.</p>
     * <p>See the API documentation for the “selection” object for more details.</p>
     *
     * JavaScript Info:
     * @property selection
     * @type selection
     * 
     */
    public void setSelection(Selection value) {
        getPolymerElement().setSelection(value);
    }

    /**
     * <p>A function which is used for generating CSS class names for data cells.</p>
     * <p>See the API documentation for the “cell” object for more details about<br>the parameter of this function.</p>
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
     * @type function
     * 
     */
    public Function getCellClassGenerator() {
        return getPolymerElement().getCellClassGenerator();
    }
    /**
     * <p>A function which is used for generating CSS class names for data cells.</p>
     * <p>See the API documentation for the “cell” object for more details about<br>the parameter of this function.</p>
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
     * @type function
     * 
     */
    public void setCellClassGenerator(Function value) {
        getPolymerElement().setCellClassGenerator(value);
    }

    /**
     * <p>A function which is used for generating CSS class names for data rows.</p>
     * <p>See the API documentation for the “row” object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowClassGenerator = function(row) {
     *   var activity = row.data[2];
     *   return &quot;activity-&quot; + activity.toLowerCase();
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowClassGenerator
     * @type function
     * 
     */
    public Function getRowClassGenerator() {
        return getPolymerElement().getRowClassGenerator();
    }
    /**
     * <p>A function which is used for generating CSS class names for data rows.</p>
     * <p>See the API documentation for the “row” object for more details about<br>the parameter of this function.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowClassGenerator = function(row) {
     *   var activity = row.data[2];
     *   return &quot;activity-&quot; + activity.toLowerCase();
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowClassGenerator
     * @type function
     * 
     */
    public void setRowClassGenerator(Function value) {
        getPolymerElement().setRowClassGenerator(value);
    }

    /**
     * <p>The row details generator is used for generating detail content for<br>data rows. The details element is added directly under the row.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowDetails.detailsGenerator = function(rowIndex) {
     *   var detail = document.createElement(&quot;div&quot;);
     *   detail.textContent = &quot;Row detail content for row &quot; + rowIndex;
     *   return detail;
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowDetailsGenerator
     * @type function
     * 
     */
    public Function getRowDetailsGenerator() {
        return getPolymerElement().getRowDetailsGenerator();
    }
    /**
     * <p>The row details generator is used for generating detail content for<br>data rows. The details element is added directly under the row.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.rowDetails.detailsGenerator = function(rowIndex) {
     *   var detail = document.createElement(&quot;div&quot;);
     *   detail.textContent = &quot;Row detail content for row &quot; + rowIndex;
     *   return detail;
     * };
     * </code></pre>
     *
     * JavaScript Info:
     * @property rowDetailsGenerator
     * @type function
     * 
     */
    public void setRowDetailsGenerator(Function value) {
        getPolymerElement().setRowDetailsGenerator(value);
    }


    /**
     * <p>The index of the last frozen columns in this grid. A frozen column will<br>always stay visible in the grid viewport when the user scrolls the grid<br>viewport horizontally.</p>
     * <p>Setting the property to 0 means that no columns will be frozen,<br>but the built-in selection checkbox column will still be frozen if<br>it’s in use. Setting the count to -1 will unfreeze the selection<br>column also.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid frozen-columns=&quot;2&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute frozen-columns
     * 
     */
    public void setFrozenColumns(String value) {
        getPolymerElement().setAttribute("frozen-columns", value);
    }

    /**
     * <p>Object for controlling and accessing the header rows in the grid.</p>
     * <p>See the API documentation for “header” for more details.</p>
     *
     * JavaScript Info:
     * @attribute header
     * 
     */
    public void setHeader(String value) {
        getPolymerElement().setAttribute("header", value);
    }

    /**
     * <p>An array or a function containing or returning items determining<br>the row data in the grid (i.e. the data source).</p>
     * <p>Implement the property as a function if you wish to provide data<br>lazily to the grid, for example from a REST service, to get only the<br>items that are necessary in the grid viewport.</p>
     * <p>See the API documentation for “items function” for more details.</p>
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
     * @attribute items
     * 
     */
    public void setItems(String value) {
        getPolymerElement().setAttribute("items", value);
    }

    /**
     * <p>The array of columns attached to the grid.</p>
     * <p>See the API documentation for “column” for more details about the<br>column objects.</p>
     *
     * JavaScript Info:
     * @attribute columns
     * 
     */
    public void setColumns(String value) {
        getPolymerElement().setAttribute("columns", value);
    }

    /**
     * <p>Object for controlling and accessing the footer rows in the grid.</p>
     * <p>See the API documentation for “footer” for more details.</p>
     *
     * JavaScript Info:
     * @attribute footer
     * 
     */
    public void setFooter(String value) {
        getPolymerElement().setAttribute("footer", value);
    }

    /**
     * <p>An array defining the sorting of columns. The order of the objects in<br>the array defines the order of sort (if the grid is sorted by<br>multiple columns).</p>
     * <p>See the API documentation for the “sort-order” object for more details.</p>
     *
     * JavaScript Info:
     * @attribute sort-order
     * 
     */
    public void setSortOrder(String value) {
        getPolymerElement().setAttribute("sort-order", value);
    }

    /**
     * <p>Sets the height of the grid so that the specified amount of data rows<br>is visible. Overrides any height specified in CSS.</p>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;vaadin-grid visible-rows=&quot;5&quot;&gt;...&lt;/vaadin-grid&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute visible-rows
     * 
     */
    public void setVisibleRows(String value) {
        getPolymerElement().setAttribute("visible-rows", value);
    }

    /**
     * <p>Object for controlling and accessing the selected rows in the grid.</p>
     * <p>See the API documentation for the “selection” object for more details.</p>
     *
     * JavaScript Info:
     * @attribute selection
     * 
     */
    public void setSelection(String value) {
        getPolymerElement().setAttribute("selection", value);
    }

    /**
     * <p>Explicitly sets the number of records the <code>items</code> array/function<br>provides for the grid to display.</p>
     * <p>This may also be set indirectly by passing the value as the second<br>parameter for data request callback function.</p>
     *
     * JavaScript Info:
     * @attribute size
     * 
     */
    public void setSize(String value) {
        getPolymerElement().setAttribute("size", value);
    }


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
    public VaadinGridElement scrollToEnd() {
        return getPolymerElement().scrollToEnd();
    }

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
    public VaadinGridElement scrollToStart() {
        return getPolymerElement().scrollToStart();
    }

    /**
     * <p>Clears the grid’s internal data cache, causing it to request the<br>visible items in the grid viewport from the <code>items</code> property or the<br><code>datasource</code> function, and to scroll back to the top of the grid viewport.</p>
     * <p>Needs to be called whenever the data items are modified in some way<br>(added, removed, updated, re-ordered etc.).</p>
     *
     * JavaScript Info:
     * @method refreshItems
     * 
     * 
     */
    public void refreshItems() {
        getPolymerElement().refreshItems();
    }

    /**
     * <p>Shows or hides row details for the row at the given index.</p>
     *
     * JavaScript Info:
     * @method setRowDetailsVisible
     * @param {number} rowIndex  
     * @param {boolean} visible  
     * 
     * 
     */
    public void setRowDetailsVisible(double rowIndex, boolean visible) {
        getPolymerElement().setRowDetailsVisible(rowIndex, visible);
    }

    /**
     * <p>Adds a new column. Column is added at the end if <code>beforeColumn</code> is not defined.</p>
     *
     * JavaScript Info:
     * @method addColumn
     * @param {column} column  
     * @param {string} beforeColumn  
     * 
     * 
     */
    public void addColumn(Column column, String beforeColumn) {
        getPolymerElement().addColumn(column, beforeColumn);
    }

    /**
     * <p>Scrolls to a certain row, using user-specified scroll destination.</p>
     * <p>Scrolling happens asynchronously, so this method returns a ‘thenable’<br>which can be used to be notified when the scrolling is finished.</p>
     * <h4 id="example-">Example:</h4>
     * <pre><code class="lang-js">grid.scrollToRow(10, &quot;end&quot;).then(function() {...});
     * </code></pre>
     *
     * JavaScript Info:
     * @method scrollToRow
     * @param {number} index  
     * @param {string} scrollDestination  
     * 
     * @return {VaadinGridElement}
     */
    public VaadinGridElement scrollToRow(double index, String scrollDestination) {
        return getPolymerElement().scrollToRow(index, scrollDestination);
    }

    /**
     * <p>Invokes the callback with row data of the provided row index as the<br>parameter. If the row is not cached, it’s fetched from the data source<br>first.</p>
     *
     * JavaScript Info:
     * @method getItem
     * @param {number} rowIndex  
     * @param {Function} callback  
     * @param {boolean} onlyCached  
     * 
     * 
     */
    public void getItem(double rowIndex, Function callback, boolean onlyCached) {
        getPolymerElement().getItem(rowIndex, callback, onlyCached);
    }

    /**
     * <p>Executes a callback when the grid has finished any pending work.</p>
     *
     * JavaScript Info:
     * @method then
     * @param {Function} callback  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject then(Function callback) {
        return getPolymerElement().then(callback);
    }

    /**
     * <p>Removes a column with certain id</p>
     *
     * JavaScript Info:
     * @method removeColumn
     * @param {string} id  
     * 
     * 
     */
    public void removeColumn(String id) {
        getPolymerElement().removeColumn(id);
    }


    /**
     * <p>A row is selected or deselected.</p>
     *
     * JavaScript Info:
     * @event selected-items-changed
     */
    public HandlerRegistration addSelectedItemsChangedHandler(SelectedItemsChangedEventHandler handler) {
        return addDomHandler(handler, SelectedItemsChangedEvent.TYPE);
    }

    /**
     * <p>A change in the selection mode.</p>
     *
     * JavaScript Info:
     * @event selection-mode-changed
     */
    public HandlerRegistration addSelectionModeChangedHandler(SelectionModeChangedEventHandler handler) {
        return addDomHandler(handler, SelectionModeChangedEvent.TYPE);
    }

    /**
     * <p>A change in the sorting order.</p>
     *
     * JavaScript Info:
     * @event sort-order-changed
     */
    public HandlerRegistration addSortOrderChangedHandler(SortOrderChangedEventHandler handler) {
        return addDomHandler(handler, SortOrderChangedEvent.TYPE);
    }

}
