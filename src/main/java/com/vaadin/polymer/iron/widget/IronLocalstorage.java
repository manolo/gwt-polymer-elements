/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-localstorage project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.iron.widget.event.IronLocalstorageLoadEvent;
import com.vaadin.polymer.iron.widget.event.IronLocalstorageLoadEventHandler;

import com.vaadin.polymer.iron.widget.event.IronLocalstorageLoadEmptyEvent;
import com.vaadin.polymer.iron.widget.event.IronLocalstorageLoadEmptyEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Element access to Web Storage API (window.localStorage).</p>
 * <p>Keeps <code>value</code> property in sync with localStorage.</p>
 * <p>Value is saved as json by default.</p>
 * <h3 id="usage-">Usage:</h3>
 * <p><code>ls-sample</code> will automatically save changes to its value.</p>
 * <pre><code>&lt;dom-module id=&quot;ls-sample&quot;&gt;
 *   &lt;iron-localstorage name=&quot;my-app-storage&quot;
 *     value=&quot;{{cartoon}}&quot;
 *     on-iron-localstorage-load-empty=&quot;initializeDefaultCartoon&quot;
 *   &gt;&lt;/iron-localstorage&gt;
 * &lt;/dom-module&gt;
 * 
 * &lt;script&gt;
 *   Polymer({
 *     is: &#39;ls-sample&#39;,
 *     properties: {
 *       cartoon: {
 *         type: Object
 *       }
 *     },
 *     // initializes default if nothing has been stored
 *     initializeDefaultCartoon: function() {
 *       this.cartoon = {
 *         name: &quot;Mickey&quot;,
 *         hasEars: true
 *       }
 *     },
 *     // use path set api to propagate changes to localstorage
 *     makeModifications: function() {
 *       this.set(&#39;cartoon.name&#39;, &quot;Minions&quot;);
 *       this.set(&#39;cartoon.hasEars&#39;, false);
 *     }
 *   });
 * &lt;/script&gt;
 * 
 * 
 * </code></pre><h3 id="tech-notes-">Tech notes:</h3>
 * <ul>
 * <li><p><code>value.*</code> is observed, and saved on modifications. You must use<br>property notification methods to modify value for changes to be observed.</p>
 * </li>
 * <li><p>Set <code>auto-save-disabled</code> to prevent automatic saving.</p>
 * </li>
 * <li><p>Value is saved as JSON by default.</p>
 * </li>
 * <li><p>To delete a key, set value to null</p>
 * </li>
 * </ul>
 * <p>Element listens to StorageAPI <code>storage</code> event, and will reload upon receiving it.</p>
 * <p><strong>Warning</strong>: do not bind value to sub-properties until Polymer<br><a href="https://github.com/Polymer/polymer/issues/1550">bug 1550</a><br>is resolved. Local storage will be blown away.<br><code>&lt;iron-localstorage value=&quot;{{foo.bar}}&quot;</code> will cause <strong>data loss</strong>.</p>
 */
public class IronLocalstorage extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronLocalstorage() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronLocalstorage(String html) {
        super(IronLocalstorageElement.TAG, IronLocalstorageElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEvent event) {
                fireEvent(new IronLocalstorageLoadEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEmptyEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEmptyEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronLocalstorageLoadEmptyEvent event) {
                fireEvent(new IronLocalstorageLoadEmptyEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronLocalstorageElement getPolymerElement() {
        return (IronLocalstorageElement) getElement();
    }


  
    /**
     * <p>Value will not be saved automatically if true. You’ll have to do it manually with <code>save()</code></p>
     *
     * JavaScript Info:
     * @property autoSaveDisabled
     * @type Boolean
     * 
     */
    public boolean getAutoSaveDisabled(){
        return getPolymerElement().getAutoSaveDisabled();
    }
    /**
     * <p>Value will not be saved automatically if true. You’ll have to do it manually with <code>save()</code></p>
     *
     * JavaScript Info:
     * @property autoSaveDisabled
     * @type Boolean
     * 
     */
    public void setAutoSaveDisabled(boolean value) {
        getPolymerElement().setAutoSaveDisabled(value);
    }
   
  

  
    /**
     * <p>Last error encountered while saving/loading items</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    public String getErrorMessage(){
        return getPolymerElement().getErrorMessage();
    }
    /**
     * <p>Last error encountered while saving/loading items</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    public void setErrorMessage(String value) {
        getPolymerElement().setErrorMessage(value);
    }
   
  

  
    /**
     * <p>localStorage item key</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public String getName(){
        return getPolymerElement().getName();
    }
    /**
     * <p>localStorage item key</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }
   
  

  
    /**
     * <p>Loads the value again. Use if you modify<br>localStorage using DOM calls, and want to<br>keep this element in sync.</p>
     *
     * JavaScript Info:
     * @method reload
     * 
     */
    public void reload() {
        getPolymerElement().reload();
    }
  

  
    /**
     * <p>Saves the value to localStorage. Call to save if autoSaveDisabled is set.<br>If <code>value</code> is null, deletes localStorage.</p>
     *
     * JavaScript Info:
     * @method save
     * 
     */
    public void save() {
        getPolymerElement().save();
    }
  

  
    /**
     * <p>If true: do not convert value to JSON on save/load</p>
     *
     * JavaScript Info:
     * @property useRaw
     * @type Boolean
     * 
     */
    public boolean getUseRaw(){
        return getPolymerElement().getUseRaw();
    }
    /**
     * <p>If true: do not convert value to JSON on save/load</p>
     *
     * JavaScript Info:
     * @property useRaw
     * @type Boolean
     * 
     */
    public void setUseRaw(boolean value) {
        getPolymerElement().setUseRaw(value);
    }
   
  

  
    /**
     * <p>The data associated with this storage.<br>If set to null item will be deleted.</p>
     *
     * JavaScript Info:
     * @property value
     * @type *
     * 
     */
    public JavaScriptObject getValue(){
        return getPolymerElement().getValue();
    }
    /**
     * <p>The data associated with this storage.<br>If set to null item will be deleted.</p>
     *
     * JavaScript Info:
     * @property value
     * @type *
     * 
     */
    public void setValue(JavaScriptObject value) {
        getPolymerElement().setValue(value);
    }
   
    /**
     * <p>The data associated with this storage.<br>If set to null item will be deleted.</p>
     *
     * JavaScript Info:
     * @attribute value
     * 
     */
    public void setValue(String value) {
        getPolymerElement().setAttribute("value", value);
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
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  


    /**
     * <p>Fired when value loads from localStorage.</p>
     *
     * JavaScript Info:
     * @event iron-localstorage-load
     */
    public HandlerRegistration addIronLocalstorageLoadHandler(IronLocalstorageLoadEventHandler handler) {
        return addHandler(handler, IronLocalstorageLoadEvent.TYPE);
    }

    /**
     * <p>Fired when loaded value does not exist.<br>Event handler can be used to initialize default value.</p>
     *
     * JavaScript Info:
     * @event iron-localstorage-load-empty
     */
    public HandlerRegistration addIronLocalstorageLoadEmptyHandler(IronLocalstorageLoadEmptyEventHandler handler) {
        return addHandler(handler, IronLocalstorageLoadEmptyEvent.TYPE);
    }

}
