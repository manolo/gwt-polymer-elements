/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-icon project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
 * </code></pre><p>The iron elements include several sets of icons.<br>To use the default set of icons, import <code>iron-icons.html</code> and use the <code>icon</code> attribute to specify an icon:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/iron-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;menu&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>To use a different built-in set of icons, import the specific <code>iron-icons/&lt;iconset&gt;-icons.html</code>, and<br>specify the icon as <code>&lt;iconset&gt;:&lt;icon&gt;</code>. For example, to use a communication icon, you would<br>use:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;/components/iron-icons/communication-icons.html&quot;&gt;
 * 
 * &lt;iron-icon icon=&quot;communication:email&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>You can also create custom icon sets of bitmap or SVG icons.</p>
 * <p>Example of using an icon named <code>cherry</code> from a custom iconset with the ID <code>fruit</code>:</p>
 * <pre><code>&lt;iron-icon icon=&quot;fruit:cherry&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * </code></pre><p>See <a href="iron-iconset">iron-iconset</a> and <a href="iron-iconset-svg">iron-iconset-svg</a> for more information about<br>how to create a custom iconset.</p>
 * <p>See the <a href="iron-icons?view=demo:demo/index.html">iron-icons demo</a> to see the icons available<br>in the various iconsets.</p>
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
 * <tr>
 * <td><code>--iron-icon-fill-color</code></td>
 * <td>Fill color of the svg icon</td>
 * <td><code>currentcolor</code></td>
 * </tr>
 * <tr>
 * <td><code>--iron-icon-stroke-color</code></td>
 * <td>Stroke color of the svg icon</td>
 * <td>none</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class IronIcon extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronIcon() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronIcon(String html) {
        super(IronIconElement.TAG, IronIconElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronIconElement getPolymerElement() {
        try {
            return (IronIconElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public String getIcon() {
        return getPolymerElement().getIcon();
    }
    /**
     * <p>The name of the icon to use. The name should be of the form:<br><code>iconset_name:icon_name</code>.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public void setIcon(String value) {
        getPolymerElement().setIcon(value);
    }

    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>If using iron-icon without an iconset, you can set the src to be<br>the URL of an individual icon image file. Note that this will take<br>precedence over a given icon attribute.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }

    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public String getTheme() {
        return getPolymerElement().getTheme();
    }
    /**
     * <p>The name of the theme to used, if one is specified by the<br>iconset.</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public void setTheme(String value) {
        getPolymerElement().setTheme(value);
    }




}
