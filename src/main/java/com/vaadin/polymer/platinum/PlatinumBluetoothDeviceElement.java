/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>The <code>&lt;platinum-bluetooth-device&gt;</code> element allows you to <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web">discover nearby<br>bluetooth devices</a> thanks to the young <a href="https://github.com/WebBluetoothCG/web-bluetooth">Web Bluetooth API</a>. It is<br>currently partially implemented behind the experimental flag<br><code>chrome://flags/#enable-web-bluetooth</code>. It is also now available in<br>Chrome 53 as an <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web#available-for-origin-trials">origin trial</a> for Chrome OS, Android M, and Mac.</p>
 * <p><code>&lt;platinum-bluetooth-device&gt;</code> is used as a parent element for<br><code>&lt;platinum-bluetooth-service&gt;</code> child elements.</p>
 * <p>For instance, here’s how to request a nearby bluetooth device advertising<br>Battery service:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;battery_service&quot;]&#39;&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-js">button.addEventListener(&#39;click&#39;, function() {
 *   document.querySelector(&#39;platinum-bluetooth-device&#39;).request()
 *   .then(function(device) { console.log(device.name); })
 *   .catch(function(error) { console.error(error); });
 * });
 * </code></pre>
 * <p>You can also request a nearby bluetooth device by setting a filter on<br>a name or name Prefix:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device name-filter=&#39;foobar&#39;&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device name-prefix-filter=&#39;foo&#39;&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <p>And you can combine some of the filters as well. Here’s how to request a<br>nearby bluetooth device advertising Battery service and whose name is<br>“foobar”:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;battery_service&quot;]&#39;
 *                            name-filter=&#39;foobar&#39;&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <p>If you filter just by name, then you must use <code>optional-services-filter</code><br>to get access to any services:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device name-filter=&#39;foobar&#39;
 *                            optional-services-filter=&#39;[&quot;battery_service&quot;]&#39;&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <p>Disconnecting manually from a connected bluetooth device is pretty<br>straightforward:</p>
 * <pre><code class="lang-js">disconnectButton.addEventListener(&#39;click&#39;, function() {
 *   document.querySelector(&#39;platinum-bluetooth-device&#39;).disconnect();
 * });
 * </code></pre>
 */
@JsType(isNative=true)
public interface PlatinumBluetoothDeviceElement extends HTMLElement {

    @JsOverlay public static final String TAG = "platinum-bluetooth-device";
    @JsOverlay public static final String SRC = "platinum-bluetooth/platinum-bluetooth-elements.html";


    /**
     * <p>Current Bluetooth device picked by user.</p>
     *
     * JavaScript Info:
     * @property device
     * @type BluetoothDevice
     * 
     */
    @JsProperty JavaScriptObject getDevice();
    /**
     * <p>Current Bluetooth device picked by user.</p>
     *
     * JavaScript Info:
     * @property device
     * @type BluetoothDevice
     * 
     */
    @JsProperty void setDevice(JavaScriptObject value);

    /**
     * <p>Optional Bluetooth GATT services filter. This implies that if you<br>filter just by name, you must use <code>optionalServicesFilter</code> to get<br>access to any services. You may provide either the full Bluetooth<br>UUID as a string or a short 16- or 32-bit form as integers like<br>0x180d.</p>
     *
     * JavaScript Info:
     * @property optionalServicesFilter
     * @type Array
     * 
     */
    @JsProperty JsArray getOptionalServicesFilter();
    /**
     * <p>Optional Bluetooth GATT services filter. This implies that if you<br>filter just by name, you must use <code>optionalServicesFilter</code> to get<br>access to any services. You may provide either the full Bluetooth<br>UUID as a string or a short 16- or 32-bit form as integers like<br>0x180d.</p>
     *
     * JavaScript Info:
     * @property optionalServicesFilter
     * @type Array
     * 
     */
    @JsProperty void setOptionalServicesFilter(JsArray value);

    /**
     * <p>Bluetooth GATT services filter. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property servicesFilter
     * @type Array
     * 
     */
    @JsProperty JsArray getServicesFilter();
    /**
     * <p>Bluetooth GATT services filter. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property servicesFilter
     * @type Array
     * 
     */
    @JsProperty void setServicesFilter(JsArray value);

    /**
     * <p>Indicates whether the Web Bluetooth API is supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    @JsProperty boolean getSupported();
    /**
     * <p>Indicates whether the Web Bluetooth API is supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    @JsProperty void setSupported(boolean value);

    /**
     * <p>Device name filter.</p>
     *
     * JavaScript Info:
     * @property nameFilter
     * @type String
     * 
     */
    @JsProperty String getNameFilter();
    /**
     * <p>Device name filter.</p>
     *
     * JavaScript Info:
     * @property nameFilter
     * @type String
     * 
     */
    @JsProperty void setNameFilter(String value);

    /**
     * <p>Device name prefix filter.</p>
     *
     * JavaScript Info:
     * @property namePrefixFilter
     * @type String
     * 
     */
    @JsProperty String getNamePrefixFilter();
    /**
     * <p>Device name prefix filter.</p>
     *
     * JavaScript Info:
     * @property namePrefixFilter
     * @type String
     * 
     */
    @JsProperty void setNamePrefixFilter(String value);


    /**
     * <p>Disconnect GATT Server connection from current bluetooth device.</p>
     *
     * JavaScript Info:
     * @method disconnect
     * 
     * 
     */
    void disconnect();

    /**
     * <p>Request a nearby bluetooth device and returns a Promise that will<br>resolve when user picked one Bluetooth device based on filters.</p>
     * <p>It must be called on user gesture.</p>
     *
     * JavaScript Info:
     * @method request
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject request();

    /**
     * <p>Reset device to pick a new device.</p>
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    void reset();

}
