/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget;

import com.vaadin.polymer.platinum.*;

import com.vaadin.polymer.platinum.widget.event.DeviceChangedEvent;
import com.vaadin.polymer.platinum.widget.event.DeviceChangedEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PlatinumBluetoothDevice extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumBluetoothDevice() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumBluetoothDevice(String html) {
        super(PlatinumBluetoothDeviceElement.TAG, PlatinumBluetoothDeviceElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumBluetoothDeviceElement getPolymerElement() {
        return (PlatinumBluetoothDeviceElement) getElement();
    }


    /**
     * <p>Current Bluetooth device picked by user.</p>
     *
     * JavaScript Info:
     * @property device
     * @type BluetoothDevice
     * 
     */
    public JavaScriptObject getDevice() {
        return getPolymerElement().getDevice();
    }
    /**
     * <p>Current Bluetooth device picked by user.</p>
     *
     * JavaScript Info:
     * @property device
     * @type BluetoothDevice
     * 
     */
    public void setDevice(JavaScriptObject value) {
        getPolymerElement().setDevice(value);
    }

    /**
     * <p>Optional Bluetooth GATT services filter. This implies that if you<br>filter just by name, you must use <code>optionalServicesFilter</code> to get<br>access to any services. You may provide either the full Bluetooth<br>UUID as a string or a short 16- or 32-bit form as integers like<br>0x180d.</p>
     *
     * JavaScript Info:
     * @property optionalServicesFilter
     * @type Array
     * 
     */
    public JsArray getOptionalServicesFilter() {
        return getPolymerElement().getOptionalServicesFilter();
    }
    /**
     * <p>Optional Bluetooth GATT services filter. This implies that if you<br>filter just by name, you must use <code>optionalServicesFilter</code> to get<br>access to any services. You may provide either the full Bluetooth<br>UUID as a string or a short 16- or 32-bit form as integers like<br>0x180d.</p>
     *
     * JavaScript Info:
     * @property optionalServicesFilter
     * @type Array
     * 
     */
    public void setOptionalServicesFilter(JsArray value) {
        getPolymerElement().setOptionalServicesFilter(value);
    }

    /**
     * <p>Bluetooth GATT services filter. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property servicesFilter
     * @type Array
     * 
     */
    public JsArray getServicesFilter() {
        return getPolymerElement().getServicesFilter();
    }
    /**
     * <p>Bluetooth GATT services filter. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property servicesFilter
     * @type Array
     * 
     */
    public void setServicesFilter(JsArray value) {
        getPolymerElement().setServicesFilter(value);
    }

    /**
     * <p>Indicates whether the Web Bluetooth API is supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    public boolean getSupported() {
        return getPolymerElement().getSupported();
    }
    /**
     * <p>Indicates whether the Web Bluetooth API is supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    public void setSupported(boolean value) {
        getPolymerElement().setSupported(value);
    }

    /**
     * <p>Device name filter.</p>
     *
     * JavaScript Info:
     * @property nameFilter
     * @type String
     * 
     */
    public String getNameFilter() {
        return getPolymerElement().getNameFilter();
    }
    /**
     * <p>Device name filter.</p>
     *
     * JavaScript Info:
     * @property nameFilter
     * @type String
     * 
     */
    public void setNameFilter(String value) {
        getPolymerElement().setNameFilter(value);
    }

    /**
     * <p>Device name prefix filter.</p>
     *
     * JavaScript Info:
     * @property namePrefixFilter
     * @type String
     * 
     */
    public String getNamePrefixFilter() {
        return getPolymerElement().getNamePrefixFilter();
    }
    /**
     * <p>Device name prefix filter.</p>
     *
     * JavaScript Info:
     * @property namePrefixFilter
     * @type String
     * 
     */
    public void setNamePrefixFilter(String value) {
        getPolymerElement().setNamePrefixFilter(value);
    }


    // Needed in UIBinder
    /**
     * <p>Current Bluetooth device picked by user.</p>
     *
     * JavaScript Info:
     * @attribute device
     * 
     */
    public void setDevice(String value) {
        Polymer.property(this.getPolymerElement(), "device", value);
    }

    // Needed in UIBinder
    /**
     * <p>Optional Bluetooth GATT services filter. This implies that if you<br>filter just by name, you must use <code>optionalServicesFilter</code> to get<br>access to any services. You may provide either the full Bluetooth<br>UUID as a string or a short 16- or 32-bit form as integers like<br>0x180d.</p>
     *
     * JavaScript Info:
     * @attribute optional-services-filter
     * 
     */
    public void setOptionalServicesFilter(String value) {
        Polymer.property(this.getPolymerElement(), "optionalServicesFilter", value);
    }

    // Needed in UIBinder
    /**
     * <p>Bluetooth GATT services filter. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @attribute services-filter
     * 
     */
    public void setServicesFilter(String value) {
        Polymer.property(this.getPolymerElement(), "servicesFilter", value);
    }


    /**
     * <p>Disconnect GATT Server connection from current bluetooth device.</p>
     *
     * JavaScript Info:
     * @method disconnect
     * 
     * 
     */
    public void disconnect() {
        getPolymerElement().disconnect();
    }

    /**
     * <p>Request a nearby bluetooth device and returns a Promise that will<br>resolve when user picked one Bluetooth device based on filters.</p>
     * <p>It must be called on user gesture.</p>
     *
     * JavaScript Info:
     * @method request
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject request() {
        return getPolymerElement().request();
    }

    /**
     * <p>Reset device to pick a new device.</p>
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    public void reset() {
        getPolymerElement().reset();
    }


    /**
     * <p>Fired when Bluetooth device picked by user gets updated.</p>
     *
     * JavaScript Info:
     * @event device-changed
     */
    public HandlerRegistration addDeviceChangedHandler(DeviceChangedEventHandler handler) {
        return addDomHandler(handler, DeviceChangedEvent.TYPE);
    }

}
