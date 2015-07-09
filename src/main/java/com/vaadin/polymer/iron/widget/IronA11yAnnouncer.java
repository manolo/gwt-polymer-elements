/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-announcer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class IronA11yAnnouncer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronA11yAnnouncer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronA11yAnnouncer(String html) {
        super(IronA11yAnnouncerElement.TAG, IronA11yAnnouncerElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronA11yAnnouncerElement getPolymerElement() {
        return (IronA11yAnnouncerElement) getElement();
    }


  
    /**
     * <p>Cause a text string to be announced by screen readers.</p>
     *
     * JavaScript Info:
     * @method announce
     * @param {string} text  
     * 
     */
    public void announce(String text) {
        getPolymerElement().announce(text);
    }
  

  
    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    public String getMode(){
        return getPolymerElement().getMode();
    }
    /**
     * <p>The value of mode is used to set the <code>aria-live</code> attribute<br>for the element that will be announced. Valid values are: <code>off</code>,<br><code>polite</code> and <code>assertive</code>.</p>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    public void setMode(String value) {
        getPolymerElement().setMode(value);
    }
   
  


}
