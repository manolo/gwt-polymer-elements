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
 * <p>Object for controlling and accessing a column in a <code>vaadin-grid</code>.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">var grid = document.querySelector(&#39;vaadin-grid&#39;);
 * 
 * // First get a reference to one column object, which has
 * // all the properties described in this documentation
 * var column = grid.columns[0];
 * 
 * // Then get or set any properties of the column, such as &#39;width&#39;
 * column.width = &quot;200px&quot;;
 * </code></pre>
 */
@JsType(isNative=true)
public interface Column {

    @JsOverlay public static final String NAME = "Column";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Flex ratio of the column, used to distribute any available horizontal<br>space among all flexed columns.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].flex = 2;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;!-- If you omit the value of the attribute,
     *      it is considered as &quot;1&quot; --&gt;
     * &lt;col&gt;
     * &lt;col flex&gt;
     * &lt;col flex=&quot;2&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property flex
     * @type number
     * 
     */
    @JsProperty double getFlex();
    /**
     * <p>Flex ratio of the column, used to distribute any available horizontal<br>space among all flexed columns.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].flex = 2;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;!-- If you omit the value of the attribute,
     *      it is considered as &quot;1&quot; --&gt;
     * &lt;col&gt;
     * &lt;col flex&gt;
     * &lt;col flex=&quot;2&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property flex
     * @type number
     * 
     */
    @JsProperty void setFlex(double value);

    /**
     * <p>Set whether it is possible for the user to hide this column or not.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidable = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hidable&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidable
     * @type boolean
     * 
     */
    @JsProperty boolean getHidable();
    /**
     * <p>Set whether it is possible for the user to hide this column or not.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidable = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hidable&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidable
     * @type boolean
     * 
     */
    @JsProperty void setHidable(boolean value);

    /**
     * <p>Hides or shows the column. By default columns are visible before<br>explicitly hiding them. A column can be programmatically hidden even if<br>the <code>hidable</code> property would be <code>false</code>.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidden = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hidden&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidden
     * @type boolean
     * 
     */
    @JsProperty boolean getHidden();
    /**
     * <p>Hides or shows the column. By default columns are visible before<br>explicitly hiding them. A column can be programmatically hidden even if<br>the <code>hidable</code> property would be <code>false</code>.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidden = true;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hidden&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidden
     * @type boolean
     * 
     */
    @JsProperty void setHidden(boolean value);

    /**
     * <p>Maximum width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].maxWidth = 400;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col max-width=&quot;400&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property maxWidth
     * @type number
     * 
     */
    @JsProperty double getMaxWidth();
    /**
     * <p>Maximum width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].maxWidth = 400;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col max-width=&quot;400&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property maxWidth
     * @type number
     * 
     */
    @JsProperty void setMaxWidth(double value);

    /**
     * <p>Minimum width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].minWidth = 100;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col min-width=&quot;100&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property minWidth
     * @type number
     * 
     */
    @JsProperty double getMinWidth();
    /**
     * <p>Minimum width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].minWidth = 100;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col min-width=&quot;100&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property minWidth
     * @type number
     * 
     */
    @JsProperty void setMinWidth(double value);

    /**
     * <p>Custom render function for the column’s data items. Default is<br>undefined.</p>
     * <p>Currently it is not possible to set the renderer declaratively.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">// Prefix the cell content with a dollar sign
     *  grid.columns[0].renderer = function(cell) {
     *      cell.element.innerHTML = &#39;$&#39; + cell.data;
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    @JsProperty Function getRenderer();
    /**
     * <p>Custom render function for the column’s data items. Default is<br>undefined.</p>
     * <p>Currently it is not possible to set the renderer declaratively.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">// Prefix the cell content with a dollar sign
     *  grid.columns[0].renderer = function(cell) {
     *      cell.element.innerHTML = &#39;$&#39; + cell.data;
     *  };
     * </code></pre>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    @JsProperty void setRenderer(Function value);

    /**
     * <p>Enables sorting the column data by the end user.</p>
     * <p>To programmatically or declaratively sort the columns, use the<br><code>grid.sortOrder</code> property, or the <code>sort-direction</code> attribute. Columns<br>can be sorted even if this property is <code>false</code>, it only controls the<br>end user sorting.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].sortable = true;
     * grid.sortOrder = [{column: 0, direction: &quot;asc&quot;}];
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col sortable sort-direction=&quot;asc&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property sortable
     * @type boolean
     * 
     */
    @JsProperty boolean getSortable();
    /**
     * <p>Enables sorting the column data by the end user.</p>
     * <p>To programmatically or declaratively sort the columns, use the<br><code>grid.sortOrder</code> property, or the <code>sort-direction</code> attribute. Columns<br>can be sorted even if this property is <code>false</code>, it only controls the<br>end user sorting.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].sortable = true;
     * grid.sortOrder = [{column: 0, direction: &quot;asc&quot;}];
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col sortable sort-direction=&quot;asc&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property sortable
     * @type boolean
     * 
     */
    @JsProperty void setSortable(boolean value);

    /**
     * <p>Width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].width = 200;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col width=&quot;200&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property width
     * @type number
     * 
     */
    @JsProperty double getWidth();
    /**
     * <p>Width of the column in pixels.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].width = 200;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col width=&quot;200&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property width
     * @type number
     * 
     */
    @JsProperty void setWidth(double value);

    /**
     * <p>Sets the hiding toggle’s caption for this column. Shown in the grid’s<br>column hiding dropdown menu if the column is hidable. Useful if the<br>header content is something else than text (i.e. a DOM element) or<br>empty.</p>
     * <p>If not specified, the default column header content/text is used.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidingToggleText = &quot;Profile picture&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hiding-toggle-text=&quot;Profile picture&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidingToggleText
     * @type string
     * 
     */
    @JsProperty String getHidingToggleText();
    /**
     * <p>Sets the hiding toggle’s caption for this column. Shown in the grid’s<br>column hiding dropdown menu if the column is hidable. Useful if the<br>header content is something else than text (i.e. a DOM element) or<br>empty.</p>
     * <p>If not specified, the default column header content/text is used.</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].hidingToggleText = &quot;Profile picture&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col hiding-toggle-text=&quot;Profile picture&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property hidingToggleText
     * @type string
     * 
     */
    @JsProperty void setHidingToggleText(String value);

    /**
     * <p>Name of the column, used in mapping the column to a property in the row<br>item/object provided by the <code>items</code> property.</p>
     * <p>Must be a valid JavaScript object reference<br>(e.g. “user.name.first”, “url”)</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].name = &quot;user.name.first&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col name=&quot;user.name.first&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    @JsProperty String getName();
    /**
     * <p>Name of the column, used in mapping the column to a property in the row<br>item/object provided by the <code>items</code> property.</p>
     * <p>Must be a valid JavaScript object reference<br>(e.g. “user.name.first”, “url”)</p>
     * <h4 id="javascript-example-">JavaScript example:</h4>
     * <pre><code class="lang-js">grid.columns[0].name = &quot;user.name.first&quot;;
     * </code></pre>
     * <h4 id="declarative-example-">Declarative example:</h4>
     * <pre><code class="lang-html">&lt;col name=&quot;user.name.first&quot;&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    @JsProperty void setName(String value);


}
