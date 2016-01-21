/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-icons project by The Polymer Authors
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
 * <p><code>iron-icons</code> is a utility import that includes the definition for the <code>iron-icon</code> element, <code>iron-iconset-svg</code> element, as well as an import for the default icon set.</p>
 * <p>The <code>iron-icons</code> directory also includes imports for additional icon sets that can be loaded into your project.</p>
 * <p>Example loading icon set:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;../iron-icons/maps-icons.html&quot;&gt;
 * 
 * 
 * </code></pre><p>To use an icon from one of these sets, first prefix your <code>iron-icon</code> with the icon set name, followed by a colon, “:”, and then the icon id.</p>
 * <p>Example using the directions-bus icon from the maps icon set:</p>
 * <pre><code>&lt;iron-icon icon=&quot;maps:directions-bus&quot;&gt;&lt;/iron-icon&gt;
 * 
 * 
 * 
 * </code></pre><p>See <a href="#iron-icon">iron-icon</a> for more information about working with icons.</p>
 * <p>See <a href="#iron-iconset">iron-iconset</a> and <a href="#iron-iconset-svg">iron-iconset-svg</a> for more information about how to create a custom iconset.</p>
 */
public class IronIcons extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronIcons() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronIcons(String html) {
        super(IronIconsElement.TAG, IronIconsElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronIconsElement getPolymerElement() {
        try {
            return (IronIconsElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }





}
