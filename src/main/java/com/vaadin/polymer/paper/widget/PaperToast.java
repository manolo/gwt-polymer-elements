/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
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
 * <p><code>paper-toast</code> provides a subtle notification toast.</p>
 */
public class PaperToast extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperToast() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperToast(String html) {
        super(PaperToastElement.TAG, PaperToastElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperToastElement getPolymerElement() {
        return (PaperToastElement) getElement();
    }


  
    /**
     * <p>The duration in milliseconds to show the toast.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public double getDuration(){
        return getPolymerElement().getDuration();
    }
    /**
     * <p>The duration in milliseconds to show the toast.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public void setDuration(double value) {
        getPolymerElement().setDuration(value);
    }
   
    /**
     * <p>The duration in milliseconds to show the toast.</p>
     *
     * JavaScript Info:
     * @attribute duration
     * 
     */
    public void setDuration(String value) {
        getPolymerElement().setAttribute("duration", value);
    }
   
  

  
    /**
     * <p>Hide the toast</p>
     *
     * JavaScript Info:
     * @method hide
     * 
     */
    public void hide() {
        getPolymerElement().hide();
    }
  

  
    /**
     * <p>Show the toast.</p>
     *
     * JavaScript Info:
     * @method show
     * 
     */
    public void show() {
        getPolymerElement().show();
    }
  

  
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public String getText(){
        return getPolymerElement().getText();
    }
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public void setText(String value) {
        getPolymerElement().setText(value);
    }
   
  

  
    /**
     * <p>Toggle the opened state of the toast.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }
  

  
    /**
     * <p>True if the toast is currently visible.</p>
     *
     * JavaScript Info:
     * @property visible
     * @type Boolean
     * 
     */
    public boolean getVisible(){
        return getPolymerElement().getVisible();
    }
    /**
     * <p>True if the toast is currently visible.</p>
     *
     * JavaScript Info:
     * @property visible
     * @type Boolean
     * 
     */
    public void setVisible(boolean value) {
        getPolymerElement().setVisible(value);
    }
   
  


}
