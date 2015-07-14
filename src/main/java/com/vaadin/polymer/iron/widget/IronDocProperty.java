/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
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
 * <p>Renders documentation describing a specific property of an element.</p>
 * <p>Give it a hydrolysis <code>PropertyDescriptor</code> (via <code>descriptor</code>), and watch it go!</p>
 */
public class IronDocProperty extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronDocProperty() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronDocProperty(String html) {
        super(IronDocPropertyElement.TAG, IronDocPropertyElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronDocPropertyElement getPolymerElement() {
        return (IronDocPropertyElement) getElement();
    }


  
    /**
     * <p>Whether the property should show a one-liner, or full summary.</p>
     * <p>Note that this property <em>is</em> reflected as an attribute, but we perform<br>the reflection manually. In order to support the CSS transitions, we<br>must calculate the element height before setting the attribute.</p>
     *
     * JavaScript Info:
     * @property collapsed
     * @type Boolean
     * 
     */
    public boolean getCollapsed(){
        return getPolymerElement().getCollapsed();
    }
    /**
     * <p>Whether the property should show a one-liner, or full summary.</p>
     * <p>Note that this property <em>is</em> reflected as an attribute, but we perform<br>the reflection manually. In order to support the CSS transitions, we<br>must calculate the element height before setting the attribute.</p>
     *
     * JavaScript Info:
     * @property collapsed
     * @type Boolean
     * 
     */
    public void setCollapsed(boolean value) {
        getPolymerElement().setCollapsed(value);
    }
   
  

  
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.PropertyDescriptor
     * 
     */
    public JavaScriptObject getDescriptor(){
        return getPolymerElement().getDescriptor();
    }
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @property descriptor
     * @type hydrolysis.PropertyDescriptor
     * 
     */
    public void setDescriptor(JavaScriptObject value) {
        getPolymerElement().setDescriptor(value);
    }
   
    /**
     * <p>The <a href="https://github.com/PolymerLabs/hydrolysis">Hydrolysis</a>-generated<br>element descriptor to display details for.</p>
     * <p>Alternatively, the element descriptor can be provided as JSON via the text content<br>of this element.</p>
     *
     * JavaScript Info:
     * @attribute descriptor
     * 
     */
    public void setDescriptor(String value) {
        getPolymerElement().setAttribute("descriptor", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  


}
