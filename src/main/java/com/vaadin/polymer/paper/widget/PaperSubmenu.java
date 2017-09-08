/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.PaperSubmenuCloseEvent;
import com.vaadin.polymer.paper.widget.event.PaperSubmenuCloseEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperSubmenuOpenEvent;
import com.vaadin.polymer.paper.widget.event.PaperSubmenuOpenEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;paper-submenu&gt;</code> is a nested menu inside of a parent <code>&lt;paper-menu&gt;</code>. It<br>consists of a trigger that expands or collapses another <code>&lt;paper-menu&gt;</code>:</p>
 * <pre><code>&lt;paper-menu&gt;
 *   &lt;paper-submenu&gt;
 *     &lt;paper-item class=&quot;menu-trigger&quot;&gt;Topics&lt;/paper-item&gt;
 *     &lt;paper-menu class=&quot;menu-content&quot;&gt;
 *       &lt;paper-item&gt;Topic 1&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Topic 2&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Topic 3&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/paper-submenu&gt;
 *   &lt;paper-submenu&gt;
 *     &lt;paper-item class=&quot;menu-trigger&quot;&gt;Faves&lt;/paper-item&gt;
 *     &lt;paper-menu class=&quot;menu-content&quot;&gt;
 *       &lt;paper-item&gt;Fave 1&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Fave 2&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/paper-submenu&gt;
 *   &lt;paper-submenu disabled&gt;
 *     &lt;paper-item class=&quot;menu-trigger&quot;&gt;Unavailable&lt;/paper-item&gt;
 *     &lt;paper-menu class=&quot;menu-content&quot;&gt;
 *       &lt;paper-item&gt;Disabled 1&lt;/paper-item&gt;
 *       &lt;paper-item&gt;Disabled 2&lt;/paper-item&gt;
 *     &lt;/paper-menu&gt;
 *   &lt;/paper-submenu&gt;
 * &lt;/paper-menu&gt;
 * 
 * 
 * </code></pre><p>Just like in <code>&lt;paper-menu&gt;</code>, the focused item is highlighted, and the selected<br>item has bolded text. Please see the <code>&lt;paper-menu&gt;</code> docs for which attributes<br>(such as <code>multi</code> and <code>selected</code>), and styling options are available for the<br><code>menu-content</code> menu.</p>
 */
public class PaperSubmenu extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperSubmenu() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperSubmenu(String html) {
        super(PaperSubmenuElement.TAG, PaperSubmenuElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperSubmenuElement getPolymerElement() {
        return (PaperSubmenuElement) getElement();
    }


    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }



    /**
     * <p>Collapse the submenu content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>Expand the submenu content.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Toggle the submenu.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }


    /**
     * <p>Fired when the submenu is closed.</p>
     *
     * JavaScript Info:
     * @event paper-submenu-close
     */
    public HandlerRegistration addPaperSubmenuCloseHandler(PaperSubmenuCloseEventHandler handler) {
        return addDomHandler(handler, PaperSubmenuCloseEvent.TYPE);
    }

    /**
     * <p>Fired when the submenu is opened.</p>
     *
     * JavaScript Info:
     * @event paper-submenu-open
     */
    public HandlerRegistration addPaperSubmenuOpenHandler(PaperSubmenuOpenEventHandler handler) {
        return addDomHandler(handler, PaperSubmenuOpenEvent.TYPE);
    }

}
