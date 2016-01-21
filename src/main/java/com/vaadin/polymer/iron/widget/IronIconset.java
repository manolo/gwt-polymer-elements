/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-iconset project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class IronIconset extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronIconset() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronIconset(String html) {
        super(IronIconsetElement.TAG, IronIconsetElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronIconsetElement getPolymerElement() {
        try {
            return (IronIconsetElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    public JsArray getIconNames() {
        return getPolymerElement().getIconNames();
    }
    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @property iconNames
     * @type Array
     * 
     */
    public void setIconNames(JsArray value) {
        getPolymerElement().setIconNames(value);
    }

    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public double getSize() {
        return getPolymerElement().getSize();
    }
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    public void setSize(double value) {
        getPolymerElement().setSize(value);
    }

    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public double getWidth() {
        return getPolymerElement().getWidth();
    }
    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    public void setWidth(double value) {
        getPolymerElement().setWidth(value);
    }

    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    public String getIcons() {
        return getPolymerElement().getIcons();
    }
    /**
     * <p>A space separated list of names corresponding to icons in the iconset<br>image file. This list must be ordered the same as the icon images<br>in the image file.</p>
     *
     * JavaScript Info:
     * @property icons
     * @type String
     * 
     */
    public void setIcons(String value) {
        getPolymerElement().setIcons(value);
    }

    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of the iconset.</p>
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
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public String getSrc() {
        return getPolymerElement().getSrc();
    }
    /**
     * <p>The URL of the iconset image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    public void setSrc(String value) {
        getPolymerElement().setSrc(value);
    }


    /**
     * <p>Array of fully-qualified names of icons in this set.</p>
     *
     * JavaScript Info:
     * @attribute icon-names
     * 
     */
    public void setIconNames(String value) {
        getPolymerElement().setAttribute("icon-names", value);
    }

    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @attribute size
     * 
     */
    public void setSize(String value) {
        getPolymerElement().setAttribute("size", value);
    }

    /**
     * <p>The width of the iconset image. This must only be specified if the<br>icons are arranged into separate rows inside the image.</p>
     *
     * JavaScript Info:
     * @attribute width
     * 
     */
    public void setWidth(String value) {
        getPolymerElement().setAttribute("width", value);
    }


    /**
     * <p>Remove an icon from the given element by undoing the changes effected<br>by <code>applyIcon</code>.</p>
     *
     * JavaScript Info:
     * @method removeIcon
     * @param {Element} element  
     * 
     * 
     */
    public void removeIcon(Element element) {
        getPolymerElement().removeIcon(element);
    }

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
    public void applyIcon(Element element, Object icon, String theme, double scale) {
        getPolymerElement().applyIcon(element, icon, theme, scale);
    }


}
