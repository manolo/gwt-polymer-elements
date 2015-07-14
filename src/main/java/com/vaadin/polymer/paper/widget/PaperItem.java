/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-item project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;paper-item&gt;</code> is a non-interactive list item. By default, it is a horizontal flexbox.</p>
 * <pre><code>&lt;paper-item&gt;Item&lt;/paper-item&gt;
 * 
 * 
 * </code></pre><p>Use this element with <code>&lt;paper-item-body&gt;</code> to make Material Design styled two-line and three-line<br>items.</p>
 * <pre><code>&lt;paper-item&gt;
 *   &lt;paper-item-body two-line&gt;
 *     &lt;div&gt;Show your status&lt;/div&gt;
 *     &lt;div secondary&gt;Your status is visible to everyone&lt;/div&gt;
 *   &lt;/paper-item-body&gt;
 *   &lt;iron-icon icon=&quot;warning&quot;&gt;&lt;/iron-icon&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-item-min-height</code></td>
 * <td>Minimum height of the item</td>
 * <td><code>48px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-item</code></td>
 * <td>Mixin applied to the item</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>This element has <code>role=&quot;listitem&quot;</code> by default. Depending on usage, it may be more appropriate to set<br><code>role=&quot;menuitem&quot;</code>, <code>role=&quot;menuitemcheckbox&quot;</code> or <code>role=&quot;menuitemradio&quot;</code>.</p>
 * <pre><code>&lt;paper-item role=&quot;menuitemcheckbox&quot;&gt;
 *   &lt;paper-item-body&gt;
 *     Show your status
 *   &lt;/paper-item-body&gt;
 *   &lt;paper-checkbox&gt;&lt;/paper-checkbox&gt;
 * &lt;/paper-item&gt;
 * 
 * 
 * </code></pre>
 */
public class PaperItem extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperItem() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperItem(String html) {
        super(PaperItemElement.TAG, PaperItemElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperItemElement getPolymerElement() {
        return (PaperItemElement) getElement();
    }


  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  


}
