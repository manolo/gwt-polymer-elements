/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-spinner project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Element providing material design circular spinner.</p>
 * <pre><code>&lt;paper-spinner active&gt;&lt;/paper-spinner&gt;
 * 
 * 
 * </code></pre><p>The default spinner cycles between four layers of colors; by default they are<br>blue, red, yellow and green. It can be customized so that it uses one color only<br>by setting all the layer colors to the same value.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>Alt attribute should be set to provide adequate context for accessibility. If not provided,<br>it defaults to ‘loading’.<br>Empty alt can be provided to mark the element as decorative if alternative content is provided<br>in another form (e.g. a text block following the spinner).</p>
 * <pre><code>&lt;paper-spinner alt=&quot;Loading contacts list&quot; active&gt;&lt;/paper-spinner&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-spinner-layer-1-color</code></td>
 * <td>Color of the first spinner rotation</td>
 * <td><code>--google-blue-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-2-color</code></td>
 * <td>Color of the second spinner rotation</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-3-color</code></td>
 * <td>Color of the third spinner rotation</td>
 * <td><code>--google-yellow-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-4-color</code></td>
 * <td>Color of the fourth spinner rotation</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperSpinnerElement extends HTMLElement {

    public static final String TAG = "paper-spinner";
    public static final String SRC = "paper-spinner/paper-spinner.html";


    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty boolean getActive();
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    @JsProperty void setActive(boolean value);
  
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty String getAlt();
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty void setAlt(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     */
    void reset();

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
}
