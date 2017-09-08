/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-card project by The Polymer Authors
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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/cards.html">Cards</a></p>
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
 * </code></pre><p>Example - top card image:</p>
 * <pre><code>&lt;paper-card heading=&quot;Card Title&quot; image=&quot;/path/to/image.png&quot; alt=&quot;image&quot;&gt;
 *   ...
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
 * <td><code>--paper-card-background-color</code></td>
 * <td>The background color of the card</td>
 * <td><code>--primary-background-color</code></td>
 * </tr>
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
public class PaperCard extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperCard() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperCard(String html) {
        super(PaperCardElement.TAG, PaperCardElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperCardElement getPolymerElement() {
        return (PaperCardElement) getElement();
    }


    /**
     * <p>Read-only property used to pass down the <code>animatedShadow</code> value to<br>the underlying paper-material style (since they have different names).</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public boolean getAnimated() {
        return getPolymerElement().getAnimated();
    }
    /**
     * <p>Read-only property used to pass down the <code>animatedShadow</code> value to<br>the underlying paper-material style (since they have different names).</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public void setAnimated(boolean value) {
        getPolymerElement().setAnimated(value);
    }

    /**
     * <p>Set this to true to animate the card shadow when setting a new<br><code>z</code> value.</p>
     *
     * JavaScript Info:
     * @property animatedShadow
     * @type Boolean
     * 
     */
    public boolean getAnimatedShadow() {
        return getPolymerElement().getAnimatedShadow();
    }
    /**
     * <p>Set this to true to animate the card shadow when setting a new<br><code>z</code> value.</p>
     *
     * JavaScript Info:
     * @property animatedShadow
     * @type Boolean
     * 
     */
    public void setAnimatedShadow(boolean value) {
        getPolymerElement().setAnimatedShadow(value);
    }

    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    public double getElevation() {
        return getPolymerElement().getElevation();
    }
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type Number
     * 
     */
    public void setElevation(double value) {
        getPolymerElement().setElevation(value);
    }

    /**
     * <p>When <code>preloadImage</code> is true, setting <code>fadeImage</code> to true will cause the<br>image to fade into place.</p>
     *
     * JavaScript Info:
     * @property fadeImage
     * @type Boolean
     * 
     */
    public boolean getFadeImage() {
        return getPolymerElement().getFadeImage();
    }
    /**
     * <p>When <code>preloadImage</code> is true, setting <code>fadeImage</code> to true will cause the<br>image to fade into place.</p>
     *
     * JavaScript Info:
     * @property fadeImage
     * @type Boolean
     * 
     */
    public void setFadeImage(boolean value) {
        getPolymerElement().setFadeImage(value);
    }

    /**
     * <p>When <code>true</code>, any change to the image url property will cause the<br><code>placeholder</code> image to be shown until the image is fully rendered.</p>
     *
     * JavaScript Info:
     * @property preloadImage
     * @type Boolean
     * 
     */
    public boolean getPreloadImage() {
        return getPolymerElement().getPreloadImage();
    }
    /**
     * <p>When <code>true</code>, any change to the image url property will cause the<br><code>placeholder</code> image to be shown until the image is fully rendered.</p>
     *
     * JavaScript Info:
     * @property preloadImage
     * @type Boolean
     * 
     */
    public void setPreloadImage(boolean value) {
        getPolymerElement().setPreloadImage(value);
    }

    /**
     * <p>The text alternative of the card’s title image.</p>
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
     * <p>The text alternative of the card’s title image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    public void setAlt(String value) {
        getPolymerElement().setAlt(value);
    }

    /**
     * <p>The title of the card.</p>
     *
     * JavaScript Info:
     * @property heading
     * @type String
     * 
     */
    public String getHeading() {
        return getPolymerElement().getHeading();
    }
    /**
     * <p>The title of the card.</p>
     *
     * JavaScript Info:
     * @property heading
     * @type String
     * 
     */
    public void setHeading(String value) {
        getPolymerElement().setHeading(value);
    }

    /**
     * <p>The url of the title image of the card.</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    public String getImage() {
        return getPolymerElement().getImage();
    }
    /**
     * <p>The url of the title image of the card.</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    public void setImage(String value) {
        getPolymerElement().setImage(value);
    }

    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded. Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholderImage
     * @type String
     * 
     */
    public String getPlaceholderImage() {
        return getPolymerElement().getPlaceholderImage();
    }
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded. Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholderImage
     * @type String
     * 
     */
    public void setPlaceholderImage(String value) {
        getPolymerElement().setPlaceholderImage(value);
    }


    // Needed in UIBinder
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @attribute elevation
     * 
     */
    public void setElevation(String value) {
        Polymer.property(this.getPolymerElement(), "elevation", value);
    }



}
