/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-overlay-behavior project by The Polymer Authors
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
 * <p><code>iron-overlay-backdrop</code> is a backdrop used by <code>Polymer.IronOverlayBehavior</code>. It should be a<br>singleton.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling.</p>
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
 * <td><code>--iron-overlay-backdrop-background-color</code></td>
 * <td>Backdrop background color</td>
 * <td>#000</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop-opacity</code></td>
 * <td>Backdrop opacity</td>
 * <td>0.6</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop</code></td>
 * <td>Mixin applied to <code>iron-overlay-backdrop</code>.</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop-opened</code></td>
 * <td>Mixin applied to <code>iron-overlay-backdrop</code> when it is displayed</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class IronOverlayBackdrop extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronOverlayBackdrop() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronOverlayBackdrop(String html) {
        super(IronOverlayBackdropElement.TAG, IronOverlayBackdropElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronOverlayBackdropElement getPolymerElement() {
        return (IronOverlayBackdropElement) getElement();
    }


  
    /**
     * <p>Hides the backdrop if needed.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     */
    public void close() {
        getPolymerElement().close();
    }
  

  
    /**
     * <p>Removes the backdrop from document body if needed.</p>
     *
     * JavaScript Info:
     * @method complete
     * 
     */
    public void complete() {
        getPolymerElement().complete();
    }
  

  
    /**
     * <p>Shows the backdrop if needed.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     */
    public void open() {
        getPolymerElement().open();
    }
  

  
    /**
     * <p>Returns true if the backdrop is opened.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened(){
        return getPolymerElement().getOpened();
    }
    /**
     * <p>Returns true if the backdrop is opened.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }
   
  

  
    /**
     * <p>Appends the backdrop to document body and sets its <code>z-index</code> to be below the latest overlay.</p>
     *
     * JavaScript Info:
     * @method prepare
     * 
     */
    public void prepare() {
        getPolymerElement().prepare();
    }
  


}
