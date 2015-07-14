/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-iconset project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>The <code>iron-iconset</code> element allows users to define their own icon sets.<br>The <code>src</code> property specifies the url of the icon image. Multiple icons may<br>be included in this image and they may be organized into rows.<br>The <code>icons</code> property is a space separated list of names corresponding to the<br>icons. The names must be ordered as the icons are ordered in the icon image.<br>Icons are expected to be square and are the size specified by the <code>size</code><br>property. The <code>width</code> property corresponds to the width of the icon image<br>and must be specified if icons are arranged into multiple rows in the image.</p>
 * <p>All <code>iron-iconset</code> elements are available for use by other <code>iron-iconset</code><br>elements via a database keyed by id. Typically, an element author that wants<br>to support a set of custom icons uses a <code>iron-iconset</code> to retrieve<br>and use another, user-defined iconset.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-iconset id=&quot;my-icons&quot; src=&quot;my-icons.png&quot; width=&quot;96&quot; size=&quot;24&quot;
 *     icons=&quot;location place starta stopb bus car train walk&quot;&gt;
 * &lt;/iron-iconset&gt;
 * 
 * 
 * </code></pre><p>This will automatically register the icon set “my-icons” to the iconset<br>database.  To use these icons from within another element, make a<br><code>iron-iconset</code> element and call the <code>byId</code> method to retrieve a<br>given iconset. To apply a particular icon to an element, use the<br><code>applyIcon</code> method. For example:</p>
 * <pre><code>iconset.applyIcon(iconNode, &#39;car&#39;);
 * 
 * 
 * </code></pre><p>Themed icon sets are also supported. The <code>iron-iconset</code> can contain child<br><code>property</code> elements that specify a theme with an offsetX and offsetY of the<br>theme within the icon resource. For example.</p>
 * <pre><code>&lt;iron-iconset id=&quot;my-icons&quot; src=&quot;my-icons.png&quot; width=&quot;96&quot; size=&quot;24&quot;
 *     icons=&quot;location place starta stopb bus car train walk&quot;&gt;
 *   &lt;property theme=&quot;special&quot; offsetX=&quot;256&quot; offsetY=&quot;24&quot;&gt;&lt;/property&gt;
 * &lt;/iron-iconset&gt;
 * 
 * 
 * </code></pre><p>Then a themed icon can be applied like this:</p>
 * <pre><code>iconset.applyIcon(iconNode, &#39;car&#39;, &#39;special&#39;);
 * 
 * 
 * </code></pre>
 */
@JsType
public interface IronIconsetElement extends HTMLElement {

    public static final String TAG = "iron-iconset";
    public static final String SRC = "iron-iconset/iron-iconset.html";


    /**
     * <p>Applies an icon to the given element as a css background image. This<br>method does not size the element, and it’s usually necessary to set<br>the element’s height and width so that the background image is visible.</p>
     *
     * JavaScript Info:
     * @method applyIcon
     * @param {Element} element  
     * @param {(String|Number)} icon  
     * @param {String} theme  
     * @param {Number} scale  
     * 
     */
    void applyIcon(Element element, JavaScriptObject icon, String theme, double scale);

    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    @JsProperty JsArray getIconNames();
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    @JsProperty void setIconNames(JsArray value);
  
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    @JsProperty String getIcons();
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    @JsProperty void setIcons(String value);
  
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);
  
    /**
     * <p>Remove an icon from the given element by undoing the changes effected<br>by <code>applyIcon</code>.</p>
     *
     * JavaScript Info:
     * @method removeIcon
     * @param {Element} element  
     * 
     */
    void removeIcon(Element element);

    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);
  
    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);
  
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty double getWidth();
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty void setWidth(double value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
}
