/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-iconset project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronIconset extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronIconset() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronIconset(String html) {
        super(IronIconsetElement.TAG, IronIconsetElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronIconsetElement getPolymerElement() {
        return (IronIconsetElement) getElement();
    }


  
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
    public void applyIcon(Element element, JavaScriptObject icon, String theme, double scale) {
        getPolymerElement().applyIcon(element, icon, theme, scale);
    }
  

  
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    public JsArray getIconNames(){
        return getPolymerElement().getIconNames();
    }
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    public void setIconNames(JsArray value) {
        getPolymerElement().setIconNames(value);
    }
   
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @attribute icon-names
     * 
     */
    public void setIconNames(String value) {
        getPolymerElement().setAttribute("icon-names", value);
    }
   
  

  
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    public String getIcons(){
        return getPolymerElement().getIcons();
    }
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    public void setIcons(String value) {
        getPolymerElement().setIcons(value);
    }
   
  

  
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public String getName(){
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }
   
  

  
    /**
     * <p>Remove an icon from the given element by undoing the changes effected<br>by <code>applyIcon</code>.</p>
     *
     * JavaScript Info:
     * @method removeIcon
     * @param {Element} element  
     * 
     */
    public void removeIcon(Element element) {
        getPolymerElement().removeIcon(element);
    }
  

  
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public double getSize(){
        return getPolymerElement().getSize();
    }
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
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
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @attribute size
     * 
     */
    public void setSize(String value) {
        getPolymerElement().setAttribute("size", value);
    }
   
  

  
    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc(){
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The URL of the iconset image.</p>
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
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public double getWidth(){
        return getPolymerElement().getWidth();
    }
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public void setWidth(double value) {
        getPolymerElement().setWidth(value);
    }
   
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @attribute width
     * 
     */
    public void setWidth(String value) {
        getPolymerElement().setAttribute("width", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  


}
