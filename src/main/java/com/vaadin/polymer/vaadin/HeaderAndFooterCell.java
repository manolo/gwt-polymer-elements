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
 * <p>Represents a grid header/footer cell configuration.</p>
 * <h4 id="example-">Example:</h4>
 * <pre><code class="lang-js">var headerCell = grid.header.getCell(1,0);
 * headerCell.content = document.createElement(&quot;input&quot;);
 * headerCell.className = &quot;filter&quot;;
 * </code></pre>
 */
@JsType(isNative=true)
public interface HeaderAndFooterCell {

    @JsOverlay public static final String NAME = "HeaderAndFooterCell";
    @JsOverlay public static final String SRC = "vaadin-grid/vaadin-grid-doc.html";


    /**
     * <p>Number of columns which the cell should span/group.</p>
     *
     * JavaScript Info:
     * @property colspan
     * @type number
     * 
     */
    @JsProperty double getColspan();
    /**
     * <p>Number of columns which the cell should span/group.</p>
     *
     * JavaScript Info:
     * @property colspan
     * @type number
     * 
     */
    @JsProperty void setColspan(double value);

    /**
     * <p>Contents of the cell. Can be either a string of HTML or a reference to<br>a HTML element</p>
     *
     * JavaScript Info:
     * @property content
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getContent();
    /**
     * <p>Contents of the cell. Can be either a string of HTML or a reference to<br>a HTML element</p>
     *
     * JavaScript Info:
     * @property content
     * @type Object
     * 
     */
    @JsProperty void setContent(JavaScriptObject value);

    /**
     * <p>Class name of the cell.</p>
     *
     * JavaScript Info:
     * @property className
     * @type string
     * 
     */
    @JsProperty String getClassName();
    /**
     * <p>Class name of the cell.</p>
     *
     * JavaScript Info:
     * @property className
     * @type string
     * 
     */
    @JsProperty void setClassName(String value);


}
