/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-form project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.iron.widget.event.IronFormErrorEvent;
import com.vaadin.polymer.iron.widget.event.IronFormErrorEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormInvalidEvent;
import com.vaadin.polymer.iron.widget.event.IronFormInvalidEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormResponseEvent;
import com.vaadin.polymer.iron.widget.event.IronFormResponseEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormSubmitEvent;
import com.vaadin.polymer.iron.widget.event.IronFormSubmitEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>`&lt;iron-form&gt;</code> is an HTML <code>&lt;form&gt;</code> element that can validate and submit any custom<br>elements that implement <code>Polymer.IronFormElementBehavior</code>, as well as any<br>native HTML elements.</p>
 * <p>It supports both <code>get</code> and <code>post</code> methods, and uses an <code>iron-ajax</code> element to<br>submit the form data to the action URL.</p>
 * <p>  Example:</p>
 * <pre><code>&lt;form is=&quot;iron-form&quot; id=&quot;form&quot; method=&quot;post&quot; action=&quot;/form/handler&quot;&gt;
 *   &lt;paper-input name=&quot;name&quot; label=&quot;name&quot;&gt;&lt;/paper-input&gt;
 *   &lt;input name=&quot;address&quot;&gt;
 *   ...
 * &lt;/form&gt;
 * 
 * 
 * </code></pre><p>By default, a native <code>&lt;button&gt;</code> element will submit this form. However, if you<br>want to submit it from a custom element’s click handler, you need to explicitly<br>call the form’s <code>submit</code> method.</p>
 * <p>  Example:</p>
 * <pre><code>&lt;paper-button raised onclick=&quot;submitForm()&quot;&gt;Submit&lt;/paper-button&gt;
 * 
 * function submitForm() {
 *   document.getElementById(&#39;form&#39;).submit();
 * }
 * 
 * 
 * </code></pre>
 */
public class IronForm extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronForm() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronForm(String html) {
        super(IronFormElement.TAG, IronFormElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormErrorEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormErrorEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormErrorEvent event) {
                fireEvent(new IronFormErrorEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormInvalidEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormInvalidEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormInvalidEvent event) {
                fireEvent(new IronFormInvalidEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormResponseEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormResponseEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormResponseEvent event) {
                fireEvent(new IronFormResponseEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronFormSubmitEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronFormSubmitEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronFormSubmitEvent event) {
                fireEvent(new IronFormSubmitEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronFormElement getPolymerElement() {
        return (IronFormElement) getElement();
    }


  
    /**
     * <p>Content type to use when sending data.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public String getContentType(){
        return getPolymerElement().getContentType();
    }
    /**
     * <p>Content type to use when sending data.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public void setContentType(String value) {
        getPolymerElement().setContentType(value);
    }
   
  

  
    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    public boolean getDisableNativeValidationUi(){
        return getPolymerElement().getDisableNativeValidationUi();
    }
    /**
     * <p>By default, the form will display the browser’s native validation<br>UI (i.e. popup bubbles and invalid styles on invalid fields). You can<br>manually disable this; however, if you do, note that you will have to<br>manually style invalid <em>native</em> HTML fields yourself, as you are<br>explicitly preventing the native form from doing so.</p>
     *
     * JavaScript Info:
     * @property disableNativeValidationUi
     * @type Boolean
     * 
     */
    public void setDisableNativeValidationUi(boolean value) {
        getPolymerElement().setDisableNativeValidationUi(value);
    }
   
  

  
    /**
     * <p>Returns a json object containing name/value pairs for all the registered<br>custom components and native elements of the form. If there are elements<br>with duplicate names, then their values will get aggregated into an<br>array of values.</p>
     *
     * JavaScript Info:
     * @method serialize
     * 
     */
    public void serialize() {
        getPolymerElement().serialize();
    }
  

  
    /**
     * <p>Called to submit the form.</p>
     *
     * JavaScript Info:
     * @method submit
     * 
     */
    public void submit() {
        getPolymerElement().submit();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public String getExtends(){
        return getPolymerElement().getExtends();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property extends
     * @type string
     * 
     */
    public void setExtends(String value) {
        getPolymerElement().setExtends(value);
    }
   
  

  
    /**
     * <p>Fired after the form is submitted and an error is received.</p>
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
     * <p>Fired after the form is submitted and an error is received.</p>
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  


    /**
     * <p>Fired after the form is submitted and an error is received.</p>
     *
     * JavaScript Info:
     * @event iron-form-error
     */
    public HandlerRegistration addIronFormErrorHandler(IronFormErrorEventHandler handler) {
        return addHandler(handler, IronFormErrorEvent.TYPE);
    }

    /**
     * <p>Fired if the form cannot be submitted because it’s invalid.</p>
     *
     * JavaScript Info:
     * @event iron-form-invalid
     */
    public HandlerRegistration addIronFormInvalidHandler(IronFormInvalidEventHandler handler) {
        return addHandler(handler, IronFormInvalidEvent.TYPE);
    }

    /**
     * <p>Fired after the form is submitted and a response is received.</p>
     *
     * JavaScript Info:
     * @event iron-form-response
     */
    public HandlerRegistration addIronFormResponseHandler(IronFormResponseEventHandler handler) {
        return addHandler(handler, IronFormResponseEvent.TYPE);
    }

    /**
     * <p>Fired after the form is submitted.</p>
     *
     * JavaScript Info:
     * @event iron-form-submit
     */
    public HandlerRegistration addIronFormSubmitHandler(IronFormSubmitEventHandler handler) {
        return addHandler(handler, IronFormSubmitEvent.TYPE);
    }

}
