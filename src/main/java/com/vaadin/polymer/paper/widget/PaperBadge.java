/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-badge project by The Polymer Authors
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
 * <p><code>&lt;paper-badge&gt;</code> is a circular text badge that is displayed on the top right<br>corner of an element, representing a status or a notification. It will badge<br>the anchor element specified in the <code>for</code> attribute, or, if that doesn’t exist,<br>centered to the parent node containing it.</p>
 * <p>Badges can also contain an icon by adding the <code>icon</code> attribute and setting<br>it to the id of the desired icon. Please note that you should still set the<br><code>label</code> attribute in order to keep the element accessible. Also note that you will need to import<br>the <code>iron-iconset</code> that includes the icons you want to use. See <a href="../iron-icon">iron-icon</a><br>for more information on how to import and use icon sets.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;display:inline-block&quot;&gt;
 *   &lt;span&gt;Inbox&lt;/span&gt;
 *   &lt;paper-badge label=&quot;3&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;paper-button id=&quot;btn&quot;&gt;Status&lt;/paper-button&gt;
 *   &lt;paper-badge icon=&quot;favorite&quot; for=&quot;btn&quot; label=&quot;favorite icon&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
 * 
 * &lt;div&gt;
 *   &lt;paper-icon-button id=&quot;account-box&quot; icon=&quot;account-box&quot; alt=&quot;account-box&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;paper-badge icon=&quot;social:mood&quot; for=&quot;account-box&quot; label=&quot;mood icon&quot;&gt;&lt;/paper-badge&gt;
 * &lt;/div&gt;
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
 * <td><code>--paper-badge-background</code></td>
 * <td>The background color of the badge</td>
 * <td><code>--accent-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-opacity</code></td>
 * <td>The opacity of the badge</td>
 * <td><code>1.0</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-text-color</code></td>
 * <td>The color of the badge text</td>
 * <td><code>white</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-width</code></td>
 * <td>The width of the badge circle</td>
 * <td><code>20px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-height</code></td>
 * <td>The height of the badge circle</td>
 * <td><code>20px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-left</code></td>
 * <td>Optional spacing added to the left of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge-margin-bottom</code></td>
 * <td>Optional spacing added to the bottom of the badge.</td>
 * <td><code>0px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-badge</code></td>
 * <td>Mixin applied to the badge</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperBadge extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperBadge() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperBadge(String html) {
        super(PaperBadgeElement.TAG, PaperBadgeElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperBadgeElement getPolymerElement() {
        try {
            return (PaperBadgeElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>An iron-icon ID. When given, the badge content will use an<br><code>&lt;iron-icon&gt;</code> element displaying the given icon ID rather than the<br>label text. However, the label text will still be used for<br>accessibility purposes.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public String getIcon() {
        return getPolymerElement().getIcon();
    }
    /**
     * <p>An iron-icon ID. When given, the badge content will use an<br><code>&lt;iron-icon&gt;</code> element displaying the given icon ID rather than the<br>label text. However, the label text will still be used for<br>accessibility purposes.</p>
     *
     * JavaScript Info:
     * @property icon
     * @type String
     * 
     */
    public void setIcon(String value) {
        getPolymerElement().setIcon(value);
    }

    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    public String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label displayed in the badge. The label is centered, and ideally<br>should have very few characters.</p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    public void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }

    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    public String getFor() {
        return getPolymerElement().getFor();
    }
    /**
     * <p>The id of the element that the badge is anchored to. This element<br>must be a sibling of the badge.</p>
     *
     * JavaScript Info:
     * @property for
     * @type String
     * 
     */
    public void setFor(String value) {
        getPolymerElement().setFor(value);
    }



    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Repositions the badge relative to its anchor element. This is called<br>automatically when the badge is attached or an <code>iron-resize</code> event is<br>fired (for exmaple if the window has resized, or your target is a<br>custom element that implements IronResizableBehavior).</p>
     * <p>You should call this in all other cases when the achor’s position<br>might have changed (for example, if it’s visibility has changed, or<br>you’ve manually done a page re-layout).</p>
     *
     * JavaScript Info:
     * @method updatePosition
     * 
     * 
     */
    public void updatePosition() {
        getPolymerElement().updatePosition();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
