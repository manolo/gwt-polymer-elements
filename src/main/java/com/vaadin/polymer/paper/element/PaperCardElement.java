/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-card project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Material Design: <a href="http://www.google.com/design/spec/components/cards.html">Cards</a></p>
 * <p><code>paper-card</code> is a container with a drop shadow.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-card heading=&quot;Card Title&quot;&gt;
 *   &lt;div class=&quot;card-content&quot;&gt;Some content&lt;/div&gt;
 *   &lt;div class=&quot;card-actions&quot;&gt;
 *     &lt;paper-button&gt;Some action&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-card&gt;
 * 
 * 
 * </code></pre><h3 id="accessibility">Accessibility</h3>
 * <p>By default, the <code>aria-label</code> will be set to the value of the <code>heading</code> attribute.</p>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--paper-card-header-color</code></td>
 * <td>The color of the header text</td>
 * <td><code>#000</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-header</code></td>
 * <td>Mixin applied to the card header section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-header-text</code></td>
 * <td>Mixin applied to the title in the card header section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-header-image</code></td>
 * <td>Mixin applied to the image in the card header section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-header-image-text</code></td>
 * <td>Mixin applied to the text overlapping the image in the card header section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-content</code></td>
 * <td>Mixin applied to the card content section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card-actions</code></td>
 * <td>Mixin applied to the card action section</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-card</code></td>
 * <td>Mixin applied to the card</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperCardElement extends HTMLElement {

    public static final String TAG = "paper-card";
    public static final String SRC = "paper-card/paper-card.html";


    /**
     * <p>Set this to true to animate the card shadow when setting a new<br><code>z</code> value.</p>
     *
     * JavaScript Info:
     * @property animatedShadow
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimatedShadow();
    /**
     * <p>Set this to true to animate the card shadow when setting a new<br><code>z</code> value.</p>
     *
     * JavaScript Info:
     * @property animatedShadow
     * @type Boolean
     * 
     */
    @JsProperty void setAnimatedShadow(boolean value);
  
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty double getElevation();
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    @JsProperty void setElevation(double value);
  
    /**
     * <p>The title of the card.</p>
     *
     * JavaScript Info:
     * @property heading
     * @type String
     * 
     */
    @JsProperty String getHeading();
    /**
     * <p>The title of the card.</p>
     *
     * JavaScript Info:
     * @property heading
     * @type String
     * 
     */
    @JsProperty void setHeading(String value);
  
    /**
     * <p>The url of the title image of the card.</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    @JsProperty String getImage();
    /**
     * <p>The url of the title image of the card.</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    @JsProperty void setImage(String value);
  
}
