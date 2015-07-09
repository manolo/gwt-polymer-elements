/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog-scrollable project by The Polymer Authors
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
 * <p><code>paper-dialog-scrollable</code> implements a scrolling area used in a Material Design dialog. It shows<br>a divider at the top and/or bottom indicating more content, depending on scroll position. Use this<br>together with elements implementing <code>Polymer.PaperDialogBehavior</code>.</p>
 * <pre><code>&lt;paper-dialog-impl&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;paper-dialog-scrollable&gt;
 *     Lorem ipsum...
 *   &lt;/paper-dialog-scrollable&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button&gt;OK&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog-impl&gt;
 * 
 * 
 * </code></pre><p>It shows a top divider after scrolling if it is not the first child in its parent container,<br>indicating there is more content above. It shows a bottom divider if it is scrollable and it is not<br>the last child in its parent container, indicating there is more content below. The bottom divider<br>is hidden if it is scrolled to the bottom.</p>
 */
public class PaperDialogScrollable extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDialogScrollable() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDialogScrollable(String html) {
        super(PaperDialogScrollableElement.TAG, PaperDialogScrollableElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDialogScrollableElement getPolymerElement() {
        return (PaperDialogScrollableElement) getElement();
    }


  
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    public JavaScriptObject getDialogElement(){
        return getPolymerElement().getDialogElement();
    }
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @property dialogElement
     * @type ?Node
     * 
     */
    public void setDialogElement(JavaScriptObject value) {
        getPolymerElement().setDialogElement(value);
    }
   
    /**
     * <p>The dialog element that implements <code>Polymer.PaperDialogBehavior</code> containing this element.</p>
     *
     * JavaScript Info:
     * @attribute dialog-element
     * 
     */
    public void setDialogElement(String value) {
        getPolymerElement().setAttribute("dialog-element", value);
    }
   
  

  
    /**
     * <p>Returns the scrolling element.</p>
     *
     * JavaScript Info:
     * @method scrollTarget
     * 
     */
    public void scrollTarget() {
        getPolymerElement().scrollTarget();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    public void attached() {
        getPolymerElement().attached();
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
