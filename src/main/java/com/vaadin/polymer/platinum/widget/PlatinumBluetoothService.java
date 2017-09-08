/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-bluetooth project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget;

import com.vaadin.polymer.platinum.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>&lt;platinum-bluetooth-service&gt;</code> element is used in conjuction with<br>the <code>&lt;platinum-bluetooth-characteristic&gt;</code> element to <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web">read and write<br>characteristics on nearby bluetooth devices</a> thanks to the young <a href="https://github.com/WebBluetoothCG/web-bluetooth">Web<br>Bluetooth API</a>. It is currently partially implemented<br>behind the experimental flag<br><code>chrome://flags/#enable-web-bluetooth</code>. It is also now<br>available in Chrome 53 as an <a href="https://developers.google.com/web/updates/2015/07/interact-with-ble-devices-on-the-web#available-for-origin-trials">origin trial</a> for Chrome OS,<br>Android M, and Mac.</p>
 * <p><code>&lt;platinum-bluetooth-service&gt;</code> needs to be a child of a<br><code>&lt;platinum-bluetooth-device&gt;</code> element.</p>
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
 */
public class PlatinumBluetoothService extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumBluetoothService() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumBluetoothService(String html) {
        super(PlatinumBluetoothServiceElement.TAG, PlatinumBluetoothServiceElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumBluetoothServiceElement getPolymerElement() {
        return (PlatinumBluetoothServiceElement) getElement();
    }


    /**
     * <p>Required Bluetooth GATT primary service. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property service
     * @type String
     * 
     */
    public String getService() {
        return getPolymerElement().getService();
    }
    /**
     * <p>Required Bluetooth GATT primary service. You may provide either the<br>full Bluetooth UUID as a string or a short 16- or 32-bit form as<br>integers like 0x180d.</p>
     *
     * JavaScript Info:
     * @property service
     * @type String
     * 
     */
    public void setService(String value) {
        getPolymerElement().setService(value);
    }




}
