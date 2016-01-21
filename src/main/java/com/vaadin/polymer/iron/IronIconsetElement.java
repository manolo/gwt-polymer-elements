/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-iconset project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface IronIconsetElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-iconset";
    @JsOverlay public static final String SRC = "iron-iconset/iron-iconset.html";


    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    @JsProperty JsArray getIconNames();
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    @JsProperty void setIconNames(JsArray value);

    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty double getWidth();
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty void setWidth(double value);

    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    @JsProperty String getIcons();
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    @JsProperty void setIcons(String value);

    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);

    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);


    /**
     * <p>Remove an icon from the given element by undoing the changes effected<br>by <code>applyIcon</code>.</p>
     *
     * JavaScript Info:
     * @method removeIcon
     * @param {Element} element  
     * 
     * 
     */
    void removeIcon(Element element);

    /**
     * <p>Applies an icon to the given element as a css background image. This<br>method does not size the element, and it’s usually necessary to set<br>the element’s height and width so that the background image is visible.</p>
     *
     * JavaScript Info:
     * @method applyIcon
     * @param {Element} element  
     * @param {(string|number)} icon  
     * @param {string=} theme  
     * @param {number=} scale  
     * 
     * 
     */
    void applyIcon(Element element, Object icon, String theme, double scale);

}
