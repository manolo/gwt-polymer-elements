/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-meta project by The Polymer Authors
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
 * <p><code>iron-meta</code> is a generic element you can use for sharing information across the DOM tree.<br>It uses <a href="http://c2.com/cgi/wiki?MonostatePattern">monostate pattern</a> such that any<br>instance of iron-meta has access to the shared<br>information. You can use <code>iron-meta</code> to share whatever you want (or create an extension<br>[like x-meta] for enhancements).</p>
 * <p>The <code>iron-meta</code> instances containing your actual data can be loaded in an import,<br>or constructed in any way you see fit. The only requirement is that you create them<br>before you try to access them.</p>
 * <p>Examples:</p>
 * <p>If I create an instance like this:</p>
 * <pre><code>&lt;iron-meta key=&quot;info&quot; value=&quot;foo/bar&quot;&gt;&lt;/iron-meta&gt;
 * 
 * 
 * </code></pre><p>Note that value=”foo/bar” is the metadata I’ve defined. I could define more<br>attributes or use child nodes to define additional metadata.</p>
 * <p>Now I can access that element (and it’s metadata) from any iron-meta instance<br>via the byKey method, e.g.</p>
 * <pre><code>meta.byKey(&#39;info&#39;).getAttribute(&#39;value&#39;).
 * 
 * 
 * </code></pre><p>Pure imperative form would be like:</p>
 * <pre><code>document.createElement(&#39;iron-meta&#39;).byKey(&#39;info&#39;).getAttribute(&#39;value&#39;);
 * 
 * 
 * </code></pre><p>Or, in a Polymer element, you can include a meta in your template:</p>
 * <pre><code>&lt;iron-meta id=&quot;meta&quot;&gt;&lt;/iron-meta&gt;
 * ...
 * this.$.meta.byKey(&#39;info&#39;).getAttribute(&#39;value&#39;);
 * 
 * 
 * </code></pre>
 */
public class IronMetaQuery extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronMetaQuery() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronMetaQuery(String html) {
        super(IronMetaQueryElement.TAG, IronMetaQueryElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronMetaQueryElement getPolymerElement() {
        return (IronMetaQueryElement) getElement();
    }


  
    /**
     * <p>Retrieves meta data value by key.</p>
     *
     * JavaScript Info:
     * @method byKey
     * @param {string} key  
     * 
     */
    public void byKey(String key) {
        getPolymerElement().byKey(key);
    }
  

  
    /**
     * <p>Actually a factory method, not a true constructor. Only runs if<br>someone invokes it directly (via <code>new Polymer.IronMeta()</code>);</p>
     *
     * JavaScript Info:
     * @method factoryImpl
     * @param {} config  
     * 
     */
    public void factoryImpl(JavaScriptObject config) {
        getPolymerElement().factoryImpl(config);
    }
  

  
    /**
     * <p>Specifies a key to use for retrieving <code>value</code> from the <code>type</code><br>namespace.</p>
     *
     * JavaScript Info:
     * @property key
     * @type String
     * 
     */
    public String getKey(){
        return getPolymerElement().getKey();
    }
    /**
     * <p>Specifies a key to use for retrieving <code>value</code> from the <code>type</code><br>namespace.</p>
     *
     * JavaScript Info:
     * @property key
     * @type String
     * 
     */
    public void setKey(String value) {
        getPolymerElement().setKey(value);
    }
   
  

  
    /**
     * <p>Array of all meta-data values for the given type.</p>
     *
     * JavaScript Info:
     * @property list
     * @type Array
     * 
     */
    public JsArray getList(){
        return getPolymerElement().getList();
    }
    /**
     * <p>Array of all meta-data values for the given type.</p>
     *
     * JavaScript Info:
     * @property list
     * @type Array
     * 
     */
    public void setList(JsArray value) {
        getPolymerElement().setList(value);
    }
   
    /**
     * <p>Array of all meta-data values for the given type.</p>
     *
     * JavaScript Info:
     * @attribute list
     * 
     */
    public void setList(String value) {
        getPolymerElement().setAttribute("list", value);
    }
   
  

  
    /**
     * <p>The type of meta-data.  All meta-data of the same type is stored<br>together.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    public String getType(){
        return getPolymerElement().getType();
    }
    /**
     * <p>The type of meta-data.  All meta-data of the same type is stored<br>together.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    public void setType(String value) {
        getPolymerElement().setType(value);
    }
   
  

  
    /**
     * <p>The meta-data to store or retrieve.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public JavaScriptObject getValue(){
        return getPolymerElement().getValue();
    }
    /**
     * <p>The meta-data to store or retrieve.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public void setValue(JavaScriptObject value) {
        getPolymerElement().setValue(value);
    }
   
    /**
     * <p>The meta-data to store or retrieve.</p>
     *
     * JavaScript Info:
     * @attribute value
     * 
     */
    public void setValue(String value) {
        getPolymerElement().setAttribute("value", value);
    }
   
  


}
