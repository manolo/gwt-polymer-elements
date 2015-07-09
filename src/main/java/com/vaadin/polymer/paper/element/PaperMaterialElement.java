/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-material project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
@JsType
public interface PaperMaterialElement extends HTMLElement {

    public static final String TAG = "paper-material";
    public static final String SRC = "paper-material/paper-material.html";


    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimated();
    /**
     * <p>Set this to true to animate the shadow when setting a new<br><code>elevation</code> value.</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty void setAnimated(boolean value);
  
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty double getElevation();
    /**
     * <p>The z-depth of this element, from 0-5. Setting to 0 will remove the<br>shadow, and each increasing number greater than 0 will be “deeper”<br>than the last.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty void setElevation(double value);
  
}
