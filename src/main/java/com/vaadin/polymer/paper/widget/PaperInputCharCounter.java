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
 * <p><code>&lt;paper-input-char-counter&gt;</code> is a character counter for use with <code>&lt;paper-input-container&gt;</code>. It<br>shows the number of characters entered in the input and the max length if it is specified.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;input is=&quot;iron-input&quot; maxlength=&quot;20&quot;&gt;
 *   &lt;paper-input-char-counter&gt;&lt;/paper-input-char-counter&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following mixin is available for styling:</p>
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
 * <td><code>--paper-input-char-counter</code></td>
 * <td>Mixin applied to the element</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperInputCharCounter extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperInputCharCounter() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperInputCharCounter(String html) {
        super(PaperInputCharCounterElement.TAG, PaperInputCharCounterElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperInputCharCounterElement getPolymerElement() {
        return (PaperInputCharCounterElement) getElement();
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
     * @method attached
     * @behavior PaperInputCharCounter
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * @behavior PaperInputCharCounter
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
     * @behavior PaperInputCharCounter
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  


}
