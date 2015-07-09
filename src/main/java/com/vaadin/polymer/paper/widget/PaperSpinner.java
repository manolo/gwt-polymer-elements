/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-spinner project by The Polymer Authors
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
 * <p>Element providing material design circular spinner.</p>
 * <pre><code>&lt;paper-spinner active&gt;&lt;/paper-spinner&gt;
 * 
 * 
 * </code></pre><p>The default spinner cycles between four layers of colors; by default they are<br>blue, red, yellow and green. It can be customized so that it uses one color only<br>by setting all the layer colors to the same value.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>Alt attribute should be set to provide adequate context for accessibility. If not provided,<br>it defaults to ‘loading’.<br>Empty alt can be provided to mark the element as decorative if alternative content is provided<br>in another form (e.g. a text block following the spinner).</p>
 * <pre><code>&lt;paper-spinner alt=&quot;Loading contacts list&quot; active&gt;&lt;/paper-spinner&gt;
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
 * <td><code>--paper-spinner-layer-1-color</code></td>
 * <td>Color of the first spinner rotation</td>
 * <td><code>--google-blue-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-2-color</code></td>
 * <td>Color of the second spinner rotation</td>
 * <td><code>--google-red-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-3-color</code></td>
 * <td>Color of the third spinner rotation</td>
 * <td><code>--google-yellow-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-layer-4-color</code></td>
 * <td>Color of the fourth spinner rotation</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperSpinner extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperSpinner() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperSpinner(String html) {
        super(PaperSpinnerElement.TAG, PaperSpinnerElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperSpinnerElement getPolymerElement() {
        return (PaperSpinnerElement) getElement();
    }


  
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public boolean getActive(){
        return getPolymerElement().getActive();
    }
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }
   
  

  
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public String getAlt(){
        return getPolymerElement().getAlt();
    }
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public void setAlt(String value) {
        getPolymerElement().setAlt(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     */
    public void reset() {
        getPolymerElement().reset();
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
