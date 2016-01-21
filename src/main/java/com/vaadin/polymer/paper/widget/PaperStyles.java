/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-styles project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>&lt;paper-styles&gt;</code> component provides simple ways to use Material Design CSS styles<br>in your application. The following imports are available:</p>
 * <ol>
 * <li><p><a href="https://github.com/PolymerElements/paper-styles/blob/master/color.html">color.html</a>:<br>a complete list of the colors defined in the Material Design <a href="https://www.google.com/design/spec/style/color.html">palette</a></p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/paper-styles/blob/master/default-theme.html">default-theme.html</a>: text,<br>background and accent colors that match the default Material Design theme</p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/paper-styles/blob/master/shadow.html">shadow.html</a>: Material Design<br><a href="https://www.google.com/design/spec/what-is-material/elevation-shadows.html">elevation</a> and shadow styles</p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/paper-styles/blob/master/typography.html">typography.html</a>:<br>Material Design <a href="http://www.google.com/design/spec/style/typography.html#typography-styles">font</a> styles and sizes</p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/paper-styles/blob/master/demo-pages.html">demo-pages.html</a>: generic styles<br>used in the PolymerElements demo pages</p>
 * </li>
 * </ol>
 * <p>We recommend importing each of these individual files, and using the style mixins<br>available in each ones, rather than the aggregated <code>paper-styles.html</code> as a whole.</p>
 */
public class PaperStyles extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperStyles() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperStyles(String html) {
        super(PaperStylesElement.TAG, PaperStylesElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperStylesElement getPolymerElement() {
        try {
            return (PaperStylesElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }





}
