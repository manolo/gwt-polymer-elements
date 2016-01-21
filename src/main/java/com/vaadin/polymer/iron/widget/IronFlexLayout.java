/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-flex-layout project by The Polymer Authors
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
 * <p>The <code>&lt;iron-flex-layout&gt;</code> component provides simple ways to use <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Flexible_boxes">CSS flexible box layout</a>, also known as flexbox. This component provides two different ways to use flexbox:</p>
 * <ol>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/classes">Layout classes</a>. The layout class stylesheet provides a simple set of class-based flexbox rules. Layout classes let you specify layout properties directly in markup.</p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/blob/master/iron-flex-layout.html">Custom CSS mixins</a>. The mixin stylesheet includes custom CSS mixins that can be applied inside a CSS rule using the <code>@apply</code> function.</p>
 * </li>
 * </ol>
 * <p>A complete <a href="https://elements.polymer-project.org/guides/flex-layout">guide</a> to <code>&lt;iron-flex-layout&gt;</code> is available.</p>
 */
public class IronFlexLayout extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronFlexLayout() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronFlexLayout(String html) {
        super(IronFlexLayoutElement.TAG, IronFlexLayoutElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronFlexLayoutElement getPolymerElement() {
        try {
            return (IronFlexLayoutElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }





}
