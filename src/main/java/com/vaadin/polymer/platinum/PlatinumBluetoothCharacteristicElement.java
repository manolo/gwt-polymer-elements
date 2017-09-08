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
 * <p>The <code>&lt;platinum-bluetooth-characteristic&gt;</code> element allows you to <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web">read<br>and write characteristics on nearby bluetooth devices</a> thanks to the<br>young <a href="https://github.com/WebBluetoothCG/web-bluetooth">Web Bluetooth API</a>. It is currently partially implemented<br>behind the experimental flag <code>chrome://flags/#enable-web-bluetooth</code>. It<br>is also now available in Chrome 53 as an <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web#available-for-origin-trials">origin trial</a> for Chrome<br>OS, Android M, and Mac.</p>
 * <p><code>&lt;platinum-bluetooth-characteristic&gt;</code> needs to be a child of a<br><code>&lt;platinum-bluetooth-service&gt;</code> element.</p>
 * <p>For instance, here’s how to read battery level from a nearby bluetooth<br>device advertising Battery service:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;battery_service&quot;]&#39;&gt;
 *   &lt;platinum-bluetooth-service service=&#39;battery_service&#39;&gt;
 *     &lt;platinum-bluetooth-characteristic characteristic=&#39;battery_level&#39;&gt;
 *     &lt;/platinum-bluetooth-characteristic&gt;
 *   &lt;/platinum-bluetooth-service&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-js">var bluetoothDevice = document.querySelector(&#39;platinum-bluetooth-device&#39;);
 * var batteryLevel = document.querySelector(&#39;platinum-bluetooth-characteristic&#39;);
 * 
 * button.addEventListener(&#39;click&#39;, function() {
 *   bluetoothDevice.request().then(function() {
 *     return batteryLevel.read().then(function(value) {
 *       console.log(&#39;Battery Level is &#39; + value.getUint8(0) + &#39;%&#39;);
 *     });
 *   })
 *   .catch(function(error) { });
 * });
 * </code></pre>
 * <p>Here’s another example on how to reset energy expended on nearby<br>bluetooth device advertising Heart Rate service:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;heart_rate&quot;]&#39;&gt;
 *   &lt;platinum-bluetooth-service service=&#39;heart_rate&#39;&gt;
 *     &lt;platinum-bluetooth-characteristic characteristic=&#39;heart_rate_control_point&#39;&gt;
 *     &lt;/platinum-bluetooth-characteristic&gt;
 *   &lt;/platinum-bluetooth-service&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-js">var bluetoothDevice = document.querySelector(&#39;platinum-bluetooth-device&#39;);
 * var heartRateCtrlPoint = document.querySelector(&#39;platinum-bluetooth-characteristic&#39;);
 * 
 * button.addEventListener(&#39;click&#39;, function() {
 *   bluetoothDevice.request().then(function() {
 *     // Writing 1 is the signal to reset energy expended.
 *     var resetEnergyExpended = new Uint8Array([1]);
 *     return heartRateCtrlPoint.write(resetEnergyExpended).then(function() {
 *       console.log(&#39;Energy expended has been reset&#39;);
 *     });
 *   })
 *   .catch(function(error) { });
 * });
 * </code></pre>
 * <p>It is also possible for <code>&lt;platinum-bluetooth-characteristic&gt;</code> to fill in<br>a data-bound field in response to a read.</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;heart_rate&quot;]&#39;&gt;
 *   &lt;platinum-bluetooth-service service=&#39;heart_rate&#39;&gt;
 *     &lt;platinum-bluetooth-characteristic characteristic=&#39;body_sensor_location&#39;
 *                                        value={{bodySensorLocation}}&gt;
 *     &lt;/platinum-bluetooth-characteristic&gt;
 *   &lt;/platinum-bluetooth-service&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * ...
 * &lt;span&gt;{{bodySensorLocation}}&lt;/span&gt;
 * </code></pre>
 * <pre><code class="lang-js">var bluetoothDevice = document.querySelector(&#39;platinum-bluetooth-device&#39;);
 * var bodySensorLocation = document.querySelector(&#39;platinum-bluetooth-characteristic&#39;);
 * 
 * button.addEventListener(&#39;click&#39;, function() {
 *   bluetoothDevice.request().then(function() {
 *     return bodySensorLocation.read()
 *   })
 *   .catch(function(error) { });
 * });
 * </code></pre>
 * <p>Starting and stopping notifications on a <code>&lt;platinum-bluetooth-characteristic&gt;</code> is pretty straightforward when taking advantage of the <a href="https://www.polymer-project.org/1.0/docs/devguide/data-binding.html#change-notification-protocol">Polymer Change notification protocol</a>. Here’s how to get your Heart Rate Measurement for instance:</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;heart_rate&quot;]&#39;&gt;
 *   &lt;platinum-bluetooth-service service=&#39;heart_rate&#39;&gt;
 *     &lt;platinum-bluetooth-characteristic characteristic=&#39;heart_rate_measurement&#39;
 *                                        on-value-changed=&#39;parseHeartRate&#39;&gt;
 *     &lt;/platinum-bluetooth-characteristic&gt;
 *   &lt;/platinum-bluetooth-service&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-js">var bluetoothDevice = document.querySelector(&#39;platinum-bluetooth-device&#39;);
 * var heartRate = document.querySelector(&#39;platinum-bluetooth-characteristic&#39;);
 * 
 * startButton.addEventListener(&#39;click&#39;, function() {
 *   bluetoothDevice.request().then(function() {
 *     return heartRate.startNotifications().catch(function(error) { });
 *   });
 * });
 * 
 * stopButton.addEventListener(&#39;click&#39;, function() {
 *   heartRate.stopNotifications().catch(function(error) { });
 * });
 * 
 * function parseHeartRate(event) {
 *  let value = event.target.value;
 *  // Do something with the DataView Object value...
 * }
 * </code></pre>
 * <p>You can also use changes in <code>value</code> to drive characteristic writes when<br><code>auto-write</code> property is set to true.</p>
 * <pre><code class="lang-html">&lt;platinum-bluetooth-device services-filter=&#39;[&quot;heart_rate&quot;]&#39;&gt;
 *   &lt;platinum-bluetooth-service service=&#39;heart_rate&#39;&gt;
 *     &lt;platinum-bluetooth-characteristic characteristic=&#39;heart_rate_control_point&#39;
 *                                        auto-write&gt;
 *     &lt;/platinum-bluetooth-characteristic&gt;
 *   &lt;/platinum-bluetooth-service&gt;
 * &lt;/platinum-bluetooth-device&gt;
 * </code></pre>
 * <pre><code class="lang-js">var bluetoothDevice = document.querySelector(&#39;platinum-bluetooth-device&#39;);
 * var heartRateCtrlPoint = document.querySelector(&#39;platinum-bluetooth-characteristic&#39;);
 * 
 * button.addEventListener(&#39;click&#39;, function() {
 *   bluetoothDevice.request().then(function() {
 *     // Writing 1 is the signal to reset energy expended.
 *     heartRateCtrlPoint.value = new Uint8Array([1]);
 *   })
 *   .catch(function(error) { });
 * });
 * 
 * heartRateCtrlPoint.addEventListener(&#39;platinum-bluetooth-auto-write-error&#39;,
 *     function(event) {
 *   // Handle error...
 * });
 * </code></pre>
 */
@JsType(isNative=true)
public interface PlatinumBluetoothCharacteristicElement extends HTMLElement {

    @JsOverlay public static final String TAG = "platinum-bluetooth-characteristic";
    @JsOverlay public static final String SRC = "platinum-bluetooth/platinum-bluetooth-elements.html";


    /**
     * <p>If true, automatically perform a write <code>value</code> on the characteristic<br>when <code>value</code> changes.</p>
     *
     * JavaScript Info:
     * @property autoWrite
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoWrite();
    /**
     * <p>If true, automatically perform a write <code>value</code> on the characteristic<br>when <code>value</code> changes.</p>
     *
     * JavaScript Info:
     * @property autoWrite
     * @type Boolean
     * 
     */
    @JsProperty void setAutoWrite(boolean value);

    /**
     * <p>Value gets populated with the characteristic value when it’s read<br>and during a notification session.</p>
     *
     * JavaScript Info:
     * @property value
     * @type DataView
     * 
     */
    @JsProperty JavaScriptObject getValue();
    /**
     * <p>Value gets populated with the characteristic value when it’s read<br>and during a notification session.</p>
     *
     * JavaScript Info:
     * @property value
     * @type DataView
     * 
     */
    @JsProperty void setValue(JavaScriptObject value);

    /**
     * <p>Required Bluetooth GATT characteristic for read and write operations.<br>You may provide either the full Bluetooth UUID as a string or a<br>short 16- or 32-bit form as integers like 0x2A19.</p>
     *
     * JavaScript Info:
     * @property characteristic
     * @type String
     * 
     */
    @JsProperty String getCharacteristic();
    /**
     * <p>Required Bluetooth GATT characteristic for read and write operations.<br>You may provide either the full Bluetooth UUID as a string or a<br>short 16- or 32-bit form as integers like 0x2A19.</p>
     *
     * JavaScript Info:
     * @property characteristic
     * @type String
     * 
     */
    @JsProperty void setCharacteristic(String value);


    /**
     * <p>Returns a promise that will resolve when Bluetooth GATT Characteristic<br>is written.</p>
     *
     * JavaScript Info:
     * @method write
     * @param {(ArrayBufferView|ArrayBuffer)} value  
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject write(Object value);

    /**
     * <p>Returns a promise that will resolve when Bluetooth GATT Characteristic<br>is read.</p>
     *
     * JavaScript Info:
     * @method read
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject read();

    /**
     * <p>Returns a promise that will resolve when Bluetooth GATT Characteristic<br>notification session starts.</p>
     *
     * JavaScript Info:
     * @method startNotifications
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject startNotifications();

    /**
     * <p>Returns a promise that will resolve when Bluetooth GATT Characteristic<br>notification session stops.</p>
     *
     * JavaScript Info:
     * @method stopNotifications
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject stopNotifications();

}
