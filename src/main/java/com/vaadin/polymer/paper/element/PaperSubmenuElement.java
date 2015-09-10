/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

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
@JsType
public interface PaperSubmenuElement extends HTMLElement {

    public static final String TAG = "paper-submenu";
    public static final String SRC = "paper-menu/paper-submenu.html";


    /**
     * <p>Collapse the submenu content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     */
    void close();

    /**
     * 
     *
     * JavaScript Info:
     * @method dettached
     * 
     */
    void dettached();

    /**
     * <p>Expand the submenu content.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     */
    void open();

    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>Set opened to true to show the collapse element and to false to hide it.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * 
     */
    void attached();

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);
  
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTab
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTab
     */
    @JsProperty void setObservers(JsArray value);
  
}
