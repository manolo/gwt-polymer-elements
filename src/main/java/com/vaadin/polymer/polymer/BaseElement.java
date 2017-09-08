/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>Polymer.Base</code> acts as a base prototype for all Polymer elements. It is composed via various calls to <code>Polymer.Base._addFeature()</code>.</p>
 * <p>The properties reflected here are the combined view of all features found in this library. There may be more properties added via other libraries, as well.</p>
 */
@JsType(isNative=true)
public interface BaseElement extends HTMLElement {

    @JsOverlay public static final String TAG = "Polymer.Base";
    @JsOverlay public static final String SRC = "polymer/polymer.html";


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
     * @property customStyle
     * @type object
     * 
     */
    @JsProperty JavaScriptObject getCustomStyle();
    /**
     * 
     *
     * JavaScript Info:
     * @property customStyle
     * @type object
     * 
     */
    @JsProperty void setCustomStyle(JavaScriptObject value);

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
     * @method cancelDebouncer
     * @param {} jobName  
     * 
     * 
     */
    void cancelDebouncer(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method getComputedStyleValue
     * @param {} property  
     * 
     * 
     */
    void getComputedStyleValue(Object property);

    /**
     * 
     *
     * JavaScript Info:
     * @method transform
     * @param {} transform  
     * @param {} node  
     * 
     * 
     */
    void transform(Object transform, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleClass
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    void toggleClass(Object name, Object bool, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method get
     * @param {} path  
     * @param {} root  
     * 
     * 
     */
    void get(Object path, Object root);

    /**
     * 
     *
     * JavaScript Info:
     * @method fire
     * @param {} type  
     * @param {} detail  
     * @param {} options  
     * 
     * 
     */
    void fire(Object type, Object detail, Object options);

    /**
     * 
     *
     * JavaScript Info:
     * @method getPropertyInfo
     * @param {} property  
     * 
     * 
     */
    void getPropertyInfo(Object property);

    /**
     * 
     *
     * JavaScript Info:
     * @method importHref
     * @param {} href  
     * @param {} onload  
     * @param {} onerror  
     * @param {} optAsync  
     * 
     * 
     */
    void importHref(Object href, Object onload, Object onerror, Object optAsync);

    /**
     * 
     *
     * JavaScript Info:
     * @method instanceTemplate
     * @param {} template  
     * 
     * 
     */
    void instanceTemplate(Object template);

    /**
     * 
     *
     * JavaScript Info:
     * @method splice
     * @param {} path  
     * @param {} start  
     * 
     * 
     */
    void splice(Object path, Object start);

    /**
     * 
     *
     * JavaScript Info:
     * @method classFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    void classFollows(Object name, Object toElement, Object fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @method isLocalDescendant
     * @param {} node  
     * 
     * 
     */
    void isLocalDescendant(Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method isLightDescendant
     * @param {} node  
     * 
     * 
     */
    void isLightDescendant(Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method elementMatches
     * @param {} selector  
     * @param {} node  
     * 
     * 
     */
    void elementMatches(Object selector, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method linkPaths
     * @param {} to  
     * @param {} from  
     * 
     * 
     */
    void linkPaths(Object to, Object from);

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
     * 
     */
    void translate3d(Object x, Object y, Object z, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method listen
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    void listen(Object node, Object eventName, Object methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * @param {} updateInsertionPoints  
     * 
     * 
     */
    void distributeContent(Object updateInsertionPoints);

    /**
     * 
     *
     * JavaScript Info:
     * @method notifyPath
     * @param {} path  
     * @param {} value  
     * @param {} fromAbove  
     * 
     * 
     */
    void notifyPath(Object path, Object value, Object fromAbove);

    /**
     * 
     *
     * JavaScript Info:
     * @method deserialize
     * @param {} value  
     * @param {} type  
     * 
     * 
     */
    void deserialize(Object value, Object type);

    /**
     * 
     *
     * JavaScript Info:
     * @method notifySplices
     * @param {} path  
     * @param {} splices  
     * 
     * 
     */
    void notifySplices(Object path, Object splices);

    /**
     * 
     *
     * JavaScript Info:
     * @method debounce
     * @param {} jobName  
     * @param {} callback  
     * @param {} wait  
     * 
     * 
     */
    void debounce(Object jobName, Object callback, Object wait);

    /**
     * 
     *
     * JavaScript Info:
     * @method prepareModelNotifyPath
     * @param {} model  
     * 
     * 
     */
    void prepareModelNotifyPath(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method async
     * @param {} callback  
     * @param {} waitTime  
     * 
     * 
     */
    void async(Object callback, Object waitTime);

    /**
     * 
     *
     * JavaScript Info:
     * @method push
     * @param {} path  
     * 
     * 
     */
    void push(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlinkPaths
     * @param {} path  
     * 
     * 
     */
    void unlinkPaths(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method pop
     * @param {} path  
     * 
     * 
     */
    void pop(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method shift
     * @param {} path  
     * 
     * 
     */
    void shift(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method create
     * @param {} tag  
     * @param {} props  
     * 
     * 
     */
    void create(Object tag, Object props);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    void queryEffectiveChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildNodes
     * @param {} slctr  
     * 
     * 
     */
    void getContentChildNodes(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildren
     * @param {} slctr  
     * 
     * 
     */
    void getContentChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method queryAllEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    void queryAllEffectiveChildren(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method attributeFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    void attributeFollows(Object name, Object toElement, Object fromElement);

    /**
     * 
     *
     * JavaScript Info:
     * @method isDebouncerActive
     * @param {} jobName  
     * 
     * 
     */
    void isDebouncerActive(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method flushDebouncer
     * @param {} jobName  
     * 
     * 
     */
    void flushDebouncer(Object jobName);

    /**
     * 
     *
     * JavaScript Info:
     * @method reflectPropertyToAttribute
     * @param {} property  
     * @param {} attribute  
     * @param {} value  
     * 
     * 
     */
    void reflectPropertyToAttribute(Object property, Object attribute, Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveUrl
     * @param {} url  
     * 
     * 
     */
    void resolveUrl(Object url);

    /**
     * 
     *
     * JavaScript Info:
     * @method cancelAsync
     * @param {} handle  
     * 
     * 
     */
    void cancelAsync(Object handle);

    /**
     * 
     *
     * JavaScript Info:
     * @method scopeSubtree
     * @param {} container  
     * @param {} shouldObserve  
     * 
     * 
     */
    void scopeSubtree(Object container, Object shouldObserve);

    /**
     * 
     *
     * JavaScript Info:
     * @method $$
     * @param {} slctr  
     * 
     * 
     */
    void $$(Object slctr);

    /**
     * 
     *
     * JavaScript Info:
     * @method serialize
     * @param {} value  
     * 
     * 
     */
    void serialize(Object value);

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleAttribute
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    void toggleAttribute(Object name, Object bool, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method serializeValueToAttribute
     * @param {} value  
     * @param {} attribute  
     * @param {} node  
     * 
     * 
     */
    void serializeValueToAttribute(Object value, Object attribute, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method unlisten
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    void unlisten(Object node, Object eventName, Object methodName);

    /**
     * 
     *
     * JavaScript Info:
     * @method set
     * @param {} path  
     * @param {} value  
     * @param {} root  
     * 
     * 
     */
    void set(Object path, Object value, Object root);

    /**
     * 
     *
     * JavaScript Info:
     * @method unshift
     * @param {} path  
     * 
     * 
     */
    void unshift(Object path);

    /**
     * 
     *
     * JavaScript Info:
     * @method setScrollDirection
     * @param {} direction  
     * @param {} node  
     * 
     * 
     */
    void setScrollDirection(Object direction, Object node);

    /**
     * 
     *
     * JavaScript Info:
     * @method getNativePrototype
     * @param {} tag  
     * 
     * 
     */
    void getNativePrototype(Object tag);

    /**
     * 
     *
     * JavaScript Info:
     * @method updateStyles
     * @param {} properties  
     * 
     * 
     */
    void updateStyles(Object properties);

    /**
     * 
     *
     * JavaScript Info:
     * @method arrayDelete
     * @param {} path  
     * @param {} item  
     * 
     * 
     */
    void arrayDelete(Object path, Object item);

    /**
     * 
     *
     * JavaScript Info:
     * @method attachedCallback
     * 
     * 
     */
    void attachedCallback();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveTextContent
     * 
     * 
     */
    void getEffectiveTextContent();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildren
     * 
     * 
     */
    void getEffectiveChildren();

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildNodes
     * 
     * 
     */
    void getEffectiveChildNodes();

    /**
     * 
     *
     * JavaScript Info:
     * @method distributeContent
     * 
     * 
     */
    void distributeContent();

    /**
     * 
     *
     * JavaScript Info:
     * @method detachedCallback
     * 
     * 
     */
    void detachedCallback();

}
