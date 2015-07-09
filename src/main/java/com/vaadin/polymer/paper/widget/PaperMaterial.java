/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-material project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-material</code> is a container that renders two shadows on top of each other to<br>create the effect of a lifted piece of paper.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-material elevation=&quot;1&quot;&gt;
 *   ... content ...
 * &lt;/paper-material&gt;
 * 
 * 
 * </code></pre>
 */
public class PaperMaterial extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperMaterial() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperMaterial(String html) {
        super(PaperMaterialElement.TAG, PaperMaterialElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperMaterialElement getPolymerElement() {
        return (PaperMaterialElement) getElement();
    }


  
    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public boolean getAnimated(){
        return getPolymerElement().getAnimated();
    }
    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public void setAnimated(boolean value) {
        getPolymerElement().setAnimated(value);
    }
   
  

  
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    public double getElevation(){
        return getPolymerElement().getElevation();
    }
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    public void setElevation(double value) {
        getPolymerElement().setElevation(value);
    }
   
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @attribute elevation
     * 
     */
    public void setElevation(String value) {
        getPolymerElement().setAttribute("elevation", value);
    }
   
  


}
