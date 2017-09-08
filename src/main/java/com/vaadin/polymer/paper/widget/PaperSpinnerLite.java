/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-spinner project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/progress-activity.html">Progress &amp; activity</a></p>
 * <p>Element providing a single color material design circular spinner.</p>
 * <pre><code>&lt;paper-spinner-lite active&gt;&lt;/paper-spinner-lite&gt;
 * 
 * 
 * </code></pre><p>The default spinner is blue. It can be customized to be a different color.</p>
 * <h3 id="accessibility">Accessibility</h3>
 * <p>Alt attribute should be set to provide adequate context for accessibility. If not provided,<br>it defaults to ‘loading’.<br>Empty alt can be provided to mark the element as decorative if alternative content is provided<br>in another form (e.g. a text block following the spinner).</p>
 * <pre><code>&lt;paper-spinner-lite alt=&quot;Loading contacts list&quot; active&gt;&lt;/paper-spinner-lite&gt;
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
 * <td><code>--paper-spinner-color</code></td>
 * <td>Color of the spinner</td>
 * <td><code>--google-blue-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-spinner-stroke-width</code></td>
 * <td>The width of the spinner stroke</td>
 * <td>3px</td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperSpinnerLite extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperSpinnerLite() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperSpinnerLite(String html) {
        super(PaperSpinnerLiteElement.TAG, PaperSpinnerLiteElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperSpinnerLiteElement getPolymerElement() {
        return (PaperSpinnerLiteElement) getElement();
    }


    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public boolean getActive() {
        return getPolymerElement().getActive();
    }
    /**
     * <p>Displays the spinner.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * 
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }

    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public String getAlt() {
        return getPolymerElement().getAlt();
    }
    /**
     * <p>Alternative text content for accessibility support.<br>If alt is present, it will add an aria-label whose content matches alt when active.<br>If alt is not present, it will default to ‘loading’ as the alt value.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public void setAlt(String value) {
        getPolymerElement().setAlt(value);
    }




}
