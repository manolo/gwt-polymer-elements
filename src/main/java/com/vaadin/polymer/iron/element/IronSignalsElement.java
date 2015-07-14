/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-signals project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
@JsType
public interface IronSignalsElement extends HTMLElement {

    public static final String TAG = "iron-signals";
    public static final String SRC = "iron-signals/iron-signals.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    void detached();

}
