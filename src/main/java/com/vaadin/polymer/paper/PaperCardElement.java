/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-card project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
@JsType(isNative=true)
public interface PaperCardElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-card";
    @JsOverlay public static final String SRC = "paper-card/paper-card.html";


    /**
     * <p>Read-only property used to pass down the <code>animatedShadow</code> value to<br>the underlying paper-material style (since they have different names).</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimated();
    /**
     * <p>Read-only property used to pass down the <code>animatedShadow</code> value to<br>the underlying paper-material style (since they have different names).</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty void setAnimated(boolean value);

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
     * <p>When <code>preloadImage</code> is true, setting <code>fadeImage</code> to true will cause the<br>image to fade into place.</p>
     *
     * JavaScript Info:
     * @property fadeImage
     * @type Boolean
     * 
     */
    @JsProperty boolean getFadeImage();
    /**
     * <p>When <code>preloadImage</code> is true, setting <code>fadeImage</code> to true will cause the<br>image to fade into place.</p>
     *
     * JavaScript Info:
     * @property fadeImage
     * @type Boolean
     * 
     */
    @JsProperty void setFadeImage(boolean value);

    /**
     * <p>When <code>true</code>, any change to the image url property will cause the<br><code>placeholder</code> image to be shown until the image is fully rendered.</p>
     *
     * JavaScript Info:
     * @property preloadImage
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreloadImage();
    /**
     * <p>When <code>true</code>, any change to the image url property will cause the<br><code>placeholder</code> image to be shown until the image is fully rendered.</p>
     *
     * JavaScript Info:
     * @property preloadImage
     * @type Boolean
     * 
     */
    @JsProperty void setPreloadImage(boolean value);

    /**
     * <p>The text alternative of the card’s title image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty String getAlt();
    /**
     * <p>The text alternative of the card’s title image.</p>
     *
     * JavaScript Info:
     * @property alt
     * @type String
     * 
     */
    @JsProperty void setAlt(String value);

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

    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded. Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholderImage
     * @type String
     * 
     */
    @JsProperty String getPlaceholderImage();
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded. Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholderImage
     * @type String
     * 
     */
    @JsProperty void setPlaceholderImage(String value);


}
