/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-signals project by The Polymer Authors
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
 * <p><code>iron-signals</code> provides basic publish-subscribe functionality.</p>
 * <p>Note: avoid using <code>iron-signals</code> whenever you can use<br>a controller (parent element) to mediate communication<br>instead.</p>
 * <p>To send a signal, fire a custom event of type <code>iron-signal</code>, with<br>a detail object containing <code>name</code> and <code>data</code> fields.</p>
 * <pre><code>this.fire(&#39;iron-signal&#39;, {name: &#39;hello&#39;, data: null});
 * 
 * 
 * </code></pre><p>To receive a signal, listen for <code>iron-signal-&lt;name&gt;</code> event on a<br><code>iron-signals</code> element.</p>
 *   <iron-signals on-iron-signal-hello="{{helloSignal}}">
 * 
 * <p>You can fire a signal event from anywhere, and all<br><code>iron-signals</code> elements will receive the event, regardless<br>of where they are in DOM.</p>
 */
public class IronSignals extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronSignals() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronSignals(String html) {
        super(IronSignalsElement.TAG, IronSignalsElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronSignalsElement getPolymerElement() {
        return (IronSignalsElement) getElement();
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
     * @method detached
     * 
     */
    public void detached() {
        getPolymerElement().detached();
    }
  


}
