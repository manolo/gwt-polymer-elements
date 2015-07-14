/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-icon project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>The <code>iron-icon</code> element displays an icon. By default an icon renders as a 24px square.</p>
 * <p>Example using src:</p>
 * <pre><code>&lt;iron-icon src=&quot;star.png&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>Example setting size to 32px x 32px:</p>
 * <pre><code>&lt;iron-icon class=&quot;big&quot; src=&quot;big_star.png&quot;&gt;&lt;/iron-icon&gt;
 * 
 * &lt;style is=&quot;custom-style&quot;&gt;
 *   .big {
 *     --iron-icon-height: 32px;
 *     --iron-icon-width: 32px;
 *   }
 * &lt;/style&gt;
 * 
 * 
 * </code></pre><p>The iron elements include several sets of icons.<br>To use the default set of icons, import  <code>iron-icons.html</code> and use the <code>icon</code> attribute to specify an icon:</p>
 * <pre><code>&amp;lt;!-- import default iconset and iron-icon --&amp;gt;
 * &lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/iron-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;menu&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>To use a different built-in set of icons, import  <code>iron-icons/&lt;iconset&gt;-icons.html</code>, and<br>specify the icon as <code>&lt;iconset&gt;:&lt;icon&gt;</code>. For example:</p>
 * <pre><code>&amp;lt;!-- import communication iconset and iron-icon --&amp;gt;
 * &lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/communication-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;communication:email&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>You can also create custom icon sets of bitmap or SVG icons.</p>
 * <p>Example of using an icon named <code>cherry</code> from a custom iconset with the ID <code>fruit</code>:</p>
 * <pre><code>&lt;iron-icon icon=&quot;fruit:cherry&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>See <a href="#iron-iconset">iron-iconset</a> and <a href="#iron-iconset-svg">iron-iconset-svg</a> for more information about<br>how to create a custom iconset.</p>
 * <p>See <a href="https://elements.polymer-project.org/elements/iron-icons?view=demo:demo/index.html">iron-icons</a> for the default set of icons.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling:</p>
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
 * <td><code>--iron-icon-width</code></td>
 * <td>Width of the icon</td>
 * <td><code>24px</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-height</code></td>
 * <td>Height of the icon</td>
 * <td><code>24px</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface IronIconElement extends HTMLElement {

    public static final String TAG = "iron-icon";
    public static final String SRC = "iron-icon/iron-icon.html";


    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty String getIcon();
    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    @JsProperty void setIcon(String value);
  
    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);
  
    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty String getTheme();
    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty void setTheme(String value);
  
}
