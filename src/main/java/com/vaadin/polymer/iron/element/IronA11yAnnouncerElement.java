/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-announcer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>iron-a11y-announcer</code> is a singleton element that is intended to add a11y<br>to features that require on-demand announcement from screen readers. In<br>order to make use of the announcer, it is best to request its availability<br>in the announcing element.</p>
 * <p>Example:</p>
 * <pre><code>Polymer({
 * 
 *   is: &#39;x-chatty&#39;,
 * 
 *   attached: function() {
 *     // This will create the singlton element if it has not
 *     // been created yet:
 *     Polymer.IronA11yAnnouncer.requestAvailability();
 *   }
 * });
 * 
 * 
 * </code></pre><p>After the <code>iron-a11y-announcer</code> has been made available, elements can<br>make announces by firing bubbling <code>iron-announce</code> events.</p>
 * <p>Example:</p>
 * <pre><code>this.fire(&#39;iron-announce&#39;, {
 *   text: &#39;This is an announcement!&#39;
 * }, { bubbles: true });
 * 
 * 
 * </code></pre><p>Note: announcements are only audible if you have a screen reader enabled.</p>
 */
@JsType
public interface IronA11yAnnouncerElement extends HTMLElement {

    public static final String TAG = "iron-a11y-announcer";
    public static final String SRC = "iron-a11y-announcer/iron-a11y-announcer.html";


    /**
     * <p>Cause a text string to be announced by screen readers.</p>
     *
     * JavaScript Info:
     * @method announce
     * @param {string} text  
     * 
     */
    void announce(String text);

    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    @JsProperty String getMode();
    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    @JsProperty void setMode(String value);
  
}
