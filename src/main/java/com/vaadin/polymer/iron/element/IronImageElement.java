/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-image project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>iron-image</code> is an element for displaying an image that provides useful sizing and<br>preloading options not found on the standard <code>&lt;img&gt;</code> tag.</p>
 * <p>The <code>sizing</code> option allows the image to be either cropped (<code>cover</code>) or<br>letterboxed (<code>contain</code>) to fill a fixed user-size placed on the element.</p>
 * <p>The <code>preload</code> option prevents the browser from rendering the image until the<br>image is fully loaded.  In the interim, either the element’s CSS <code>background-color</code><br>can be be used as the placeholder, or the <code>placeholder</code> property can be<br>set to a URL (preferably a data-URI, for instant rendering) for an<br>placeholder image.</p>
 * <p>The <code>fade</code> option (only valid when <code>preload</code> is set) will cause the placeholder<br>image/color to be faded out once the image is rendered.</p>
 * <p>Examples:</p>
 * <p>  Basically identical to &lt;img src=”…”&gt; tag:</p>
 * <pre><code>&lt;iron-image src=&quot;http://lorempixel.com/400/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will letterbox the image to fit:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; sizing=&quot;contain&quot;
 *   src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will crop the image to fit:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; sizing=&quot;cover&quot;
 *   src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will show light-gray background until the image loads:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px; background-color: lightgray;&quot;
 *   sizing=&quot;cover&quot; preload src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will show a base-64 encoded placeholder image until the image loads:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px;&quot; placeholder=&quot;data:image/gif;base64,...&quot;
 *   sizing=&quot;cover&quot; preload src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * </code></pre><p>  Will fade the light-gray background out once the image is loaded:</p>
 * <pre><code>&lt;iron-image style=&quot;width:400px; height:400px; background-color: lightgray;&quot;
 *   sizing=&quot;cover&quot; preload fade src=&quot;http://lorempixel.com/600/400&quot;&gt;&lt;/iron-image&gt;
 * 
 * 
 * 
 * </code></pre>
 */
@JsType
public interface IronImageElement extends HTMLElement {

    public static final String TAG = "iron-image";
    public static final String SRC = "iron-image/iron-image.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property canLoad
     * @type Boolean
     * 
     */
    @JsProperty boolean getCanLoad();
    /**
     * 
     *
     * JavaScript Info:
     * @property canLoad
     * @type Boolean
     * 
     */
    @JsProperty void setCanLoad(boolean value);
  
    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    @JsProperty boolean getFade();
    /**
     * <p>When <code>preload</code> is true, setting <code>fade</code> to true will cause the image to<br>fade into place.</p>
     *
     * JavaScript Info:
     * @property fade
     * @type Boolean
     * 
     */
    @JsProperty void setFade(boolean value);
  
    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    @JsProperty double getHeight();
    /**
     * <p>Can be used to set the height of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    @JsProperty void setHeight(double value);
  
    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoaded();
    /**
     * <p>Read-only value that is true when the image is loaded.</p>
     *
     * JavaScript Info:
     * @property loaded
     * @type Boolean
     * 
     */
    @JsProperty void setLoaded(boolean value);
  
    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoading();
    /**
     * <p>Read-only value that tracks the loading state of the image when the <code>preload</code><br>option is used.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty void setLoading(boolean value);
  
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>This image will be used as a background/placeholder until the src image has<br>loaded.  Use of a data-URI for placeholder is encouraged for instant rendering.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);
  
    /**
     * <p>When a sizing option is uzed (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty String getPosition();
    /**
     * <p>When a sizing option is uzed (<code>cover</code> or <code>contain</code>), this determines<br>how the image is aligned within the element bounds.</p>
     *
     * JavaScript Info:
     * @property position
     * @type String
     * 
     */
    @JsProperty void setPosition(String value);
  
    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreload();
    /**
     * <p>When <code>true</code>, any change to the <code>src</code> property will cause the <code>placeholder</code><br>image to be shown until the</p>
     *
     * JavaScript Info:
     * @property preload
     * @type Boolean
     * 
     */
    @JsProperty void setPreload(boolean value);
  
    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreventLoad();
    /**
     * <p>When true, the image is prevented from loading and any placeholder is<br>shown.  This may be useful when a binding to the src property is known to<br>be invalid, to prevent 404 requests.</p>
     *
     * JavaScript Info:
     * @property preventLoad
     * @type Boolean
     * 
     */
    @JsProperty void setPreventLoad(boolean value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property requiresPreload
     * @type Boolean
     * 
     */
    @JsProperty boolean getRequiresPreload();
    /**
     * 
     *
     * JavaScript Info:
     * @property requiresPreload
     * @type Boolean
     * 
     */
    @JsProperty void setRequiresPreload(boolean value);
  
    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    @JsProperty String getSizing();
    /**
     * <p>Sets a sizing option for the image.  Valid values are <code>contain</code> (full<br>aspect ratio of the image is contained within the element and<br>letterboxed) or <code>cover</code> (image is cropped in order to fully cover the<br>bounds of the element), or <code>null</code> (default: image takes natural size).</p>
     *
     * JavaScript Info:
     * @property sizing
     * @type String
     * 
     */
    @JsProperty void setSizing(String value);
  
    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty String getSrc();
    /**
     * <p>The URL of an image.</p>
     *
     * JavaScript Info:
     * @property src
     * @type String
     * 
     */
    @JsProperty void setSrc(String value);
  
    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty double getWidth();
    /**
     * <p>Can be used to set the width of image (e.g. via binding); size may also be<br>set via CSS.</p>
     *
     * JavaScript Info:
     * @property width
     * @type Number
     * 
     */
    @JsProperty void setWidth(double value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
}
