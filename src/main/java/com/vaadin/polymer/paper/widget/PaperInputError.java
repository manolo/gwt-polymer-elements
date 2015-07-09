/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
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
 * <p><code>&lt;paper-input-error&gt;</code> is an error message for use with <code>&lt;paper-input-container&gt;</code>. The error is<br>displayed when the <code>&lt;paper-input-container&gt;</code> is <code>invalid</code>.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;input is=&quot;iron-input&quot; pattern=&quot;[0-9]*&quot;&gt;
 *   &lt;paper-input-error&gt;Only numbers are allowed!&lt;/paper-input-error&gt;
 * &lt;/paper-input-container&gt;
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
 * <td><code>--paper-input-container-invalid-color</code></td>
 * <td>The foreground color of the error</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-error</code></td>
 * <td>Mixin applied to the error</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperInputError extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperInputError() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperInputError(String html) {
        super(PaperInputErrorElement.TAG, PaperInputErrorElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperInputErrorElement getPolymerElement() {
        return (PaperInputErrorElement) getElement();
    }


  
    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public boolean getInvalid(){
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method update
     * @param {} state  
     * 
     */
    public void update(JavaScriptObject state) {
        getPolymerElement().update(state);
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
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperInputCharCounter
     */
    public void attached() {
        getPolymerElement().attached();
    }
  


}
