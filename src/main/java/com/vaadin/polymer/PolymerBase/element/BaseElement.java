/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.PolymerBase.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>Polymer.Base</code> acts as a base prototype for all Polymer elements. It is composed via various calls to <code>Polymer.Base._addFeature()</code>.</p>
 * <p>The properties reflected here are the combined view of all features found in this library. There may be more properties added via other libraries, as well.</p>
 */
@JsType
public interface BaseElement extends HTMLElement {

    public static final String TAG = "Polymer.Base";
    public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @method $$
     * @param {} slctr  
     * 
     */
    void $$(JavaScriptObject slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method arrayDelete
     * @param {} path  
     * @param {} item  
     * 
     */
    void arrayDelete(JavaScriptObject path, JavaScriptObject item);

    /**
     * 
     *
     * JavaScript Info:
     * @method async
     * @param {} callback  
     * @param {} waitTime  
     * 
     */
    void async(JavaScriptObject callback, JavaScriptObject waitTime);

    /**
     * 
     *
     * JavaScript Info:
     * @method attachedCallback
     * 
     */
    void attachedCallback();

    /**
     * 
     *
     * JavaScript Info:
     * @method attributeFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     */
    void attributeFollows(JavaScriptObject name, JavaScriptObject toElement, JavaScriptObject fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    @JsProperty JsArray getBehaviors();
    /**
     * 
     *
     * JavaScript Info:
     * @property behaviors
     * @type Array
     * 
     */
    @JsProperty void setBehaviors(JsArray value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method cancelAsync
     * @param {} handle  
     * 
     */
    void cancelAsync(JavaScriptObject handle);

    /**
     * 
     *
     * JavaScript Info:
     * @method cancelDebouncer
     * @param {} jobName  
     * 
     */
    void cancelDebouncer(JavaScriptObject jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method classFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     */
    void classFollows(JavaScriptObject name, JavaScriptObject toElement, JavaScriptObject fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @method create
     * @param {} tag  
     * @param {} props  
     * 
     */
    void create(JavaScriptObject tag, JavaScriptObject props);

    /**
     * 
     *
     * JavaScript Info:
     * @method debounce
     * @param {} jobName  
     * @param {} callback  
     * @param {} wait  
     * 
     */
    void debounce(JavaScriptObject jobName, JavaScriptObject callback, JavaScriptObject wait);

    /**
     * 
     *
     * JavaScript Info:
     * @method deserialize
     * @param {} value  
     * @param {} type  
     * 
     */
    void deserialize(JavaScriptObject value, JavaScriptObject type);

    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * 
     */
    void distributeContent();

    /**
     * 
     *
     * JavaScript Info:
     * @method domHost
     * 
     */
    void domHost();

    /**
     * 
     *
     * JavaScript Info:
     * @method elementMatches
     * @param {} selector  
     * @param {} node  
     * 
     */
    void elementMatches(JavaScriptObject selector, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method fire
     * @param {} type  
     * @param {} detail  
     * @param {} options  
     * 
     */
    void fire(JavaScriptObject type, JavaScriptObject detail, JavaScriptObject options);

    /**
     * 
     *
     * JavaScript Info:
     * @method flushDebouncer
     * @param {} jobName  
     * 
     */
    void flushDebouncer(JavaScriptObject jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method get
     * @param {} path  
     * @param {} root  
     * 
     */
    void get(JavaScriptObject path, JavaScriptObject root);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildNodes
     * @param {} slctr  
     * 
     */
    void getContentChildNodes(JavaScriptObject slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildren
     * @param {} slctr  
     * 
     */
    void getContentChildren(JavaScriptObject slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getNativePrototype
     * @param {} tag  
     * 
     */
    void getNativePrototype(JavaScriptObject tag);

    /**
     * 
     *
     * JavaScript Info:
     * @method getPropertyInfo
     * @param {} property  
     * 
     */
    void getPropertyInfo(JavaScriptObject property);

    /**
     * 
     *
     * JavaScript Info:
     * @method importHref
     * @param {} href  
     * @param {} onload  
     * @param {} onerror  
     * 
     */
    void importHref(JavaScriptObject href, JavaScriptObject onload, JavaScriptObject onerror);

    /**
     * 
     *
     * JavaScript Info:
     * @method instanceTemplate
     * @param {} template  
     * 
     */
    void instanceTemplate(JavaScriptObject template);

    /**
     * 
     *
     * JavaScript Info:
     * @method isDebouncerActive
     * @param {} jobName  
     * 
     */
    void isDebouncerActive(JavaScriptObject jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method linkPaths
     * @param {} to  
     * @param {} from  
     * 
     */
    void linkPaths(JavaScriptObject to, JavaScriptObject from);

    /**
     * 
     *
     * JavaScript Info:
     * @method listen
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     */
    void listen(JavaScriptObject node, JavaScriptObject eventName, JavaScriptObject methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getListeners();
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    @JsProperty void setListeners(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method notifyPath
     * @param {} path  
     * @param {} value  
     * @param {} fromAbove  
     * 
     */
    void notifyPath(JavaScriptObject path, JavaScriptObject value, JavaScriptObject fromAbove);

    /**
     * 
     *
     * JavaScript Info:
     * @method pop
     * @param {} path  
     * 
     */
    void pop(JavaScriptObject path);

    /**
     * 
     *
     * JavaScript Info:
     * @property properties
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getProperties();
    /**
     * 
     *
     * JavaScript Info:
     * @property properties
     * @type Object
     * 
     */
    @JsProperty void setProperties(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method push
     * @param {} path  
     * 
     */
    void push(JavaScriptObject path);

    /**
     * 
     *
     * JavaScript Info:
     * @method reflectPropertyToAttribute
     * @param {} name  
     * 
     */
    void reflectPropertyToAttribute(JavaScriptObject name);

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveUrl
     * @param {} url  
     * 
     */
    void resolveUrl(JavaScriptObject url);

    /**
     * 
     *
     * JavaScript Info:
     * @method scopeSubtree
     * @param {} container  
     * @param {} shouldObserve  
     * 
     */
    void scopeSubtree(JavaScriptObject container, JavaScriptObject shouldObserve);

    /**
     * 
     *
     * JavaScript Info:
     * @method serialize
     * @param {} value  
     * 
     */
    void serialize(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @method serializeValueToAttribute
     * @param {} value  
     * @param {} attribute  
     * @param {} node  
     * 
     */
    void serializeValueToAttribute(JavaScriptObject value, JavaScriptObject attribute, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method set
     * @param {} path  
     * @param {} value  
     * @param {} root  
     * 
     */
    void set(JavaScriptObject path, JavaScriptObject value, JavaScriptObject root);

    /**
     * 
     *
     * JavaScript Info:
     * @method setScrollDirection
     * @param {} direction  
     * @param {} node  
     * 
     */
    void setScrollDirection(JavaScriptObject direction, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method shift
     * @param {} path  
     * 
     */
    void shift(JavaScriptObject path);

    /**
     * 
     *
     * JavaScript Info:
     * @method splice
     * @param {} path  
     * @param {} start  
     * @param {} deleteCount  
     * 
     */
    void splice(JavaScriptObject path, JavaScriptObject start, JavaScriptObject deleteCount);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleAttribute
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     */
    void toggleAttribute(JavaScriptObject name, JavaScriptObject bool, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleClass
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     */
    void toggleClass(JavaScriptObject name, JavaScriptObject bool, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method transform
     * @param {} transform  
     * @param {} node  
     * 
     */
    void transform(JavaScriptObject transform, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method translate3d
     * @param {} x  
     * @param {} y  
     * @param {} z  
     * @param {} node  
     * 
     */
    void translate3d(JavaScriptObject x, JavaScriptObject y, JavaScriptObject z, JavaScriptObject node);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlinkPaths
     * @param {} path  
     * 
     */
    void unlinkPaths(JavaScriptObject path);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlisten
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     */
    void unlisten(JavaScriptObject node, JavaScriptObject eventName, JavaScriptObject methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @method unshift
     * @param {} path  
     * 
     */
    void unshift(JavaScriptObject path);

    /**
     * 
     *
     * JavaScript Info:
     * @method updateStyles
     * @param {} properties  
     * 
     */
    void updateStyles(JavaScriptObject properties);

}
