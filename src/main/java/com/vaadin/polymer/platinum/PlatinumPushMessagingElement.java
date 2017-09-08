/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-push-messaging project by The Polymer Authors
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
 * <p><code>&lt;platinum-push-messaging&gt;</code> sets up a <a href="http://updates.html5rocks.com/2015/03/push-notificatons-on-the-open-web">push messaging</a> subscription<br>and allows you to define what happens when a push message is received.</p>
 * <p>The element can be placed anywhere, but should only be used once in a<br>page. If there are multiple occurrences, only one will be active.</p>
 * <h1 id="sample">Sample</h1>
 * <p>For a complete sample that uses the element, see the <a href="https://github.com/notwaldorf/caturday-post">Cat Push<br>Notifications</a> project.</p>
 * <h1 id="requirements">Requirements</h1>
 * <p>Push messaging is currently only available in Google Chrome, which<br>requires you to configure Google Cloud Messaging. Chrome will check that<br>your page links to a manifest file that contains a <code>gcm_sender_id</code> field.<br>You can find full details of how to set all of this up in the <a href="http://updates.html5rocks.com/2015/03/push-notificatons-on-the-open-web">HTML5<br>Rocks guide to push notifications</a>.</p>
 * <h1 id="notification-details">Notification details</h1>
 * <p>The data for how a notification should be displayed can come from one of<br>three places.</p>
 * <p>Firstly, you can specify a URL from which to fetch the message data.</p>
 * <pre><code>&lt;platinum-push-messaging
 *   message-url=&quot;notification-data.json&quot;&gt;
 * &lt;/platinum-push-messaging&gt;
 * </code></pre><p>The second way is to send the message data in the body of<br>the push message from your server. In this case you do not need to<br>configure anything in your page:</p>
 * <pre><code>&lt;platinum-push-messaging&gt;&lt;/platinum-push-messaging&gt;
 * </code></pre><p><strong>Note that this method is not currently supported by any browser</strong>. It<br>is, however, defined in the<br><a href="http://w3c.github.io/push-api/#the-push-event">draft W3C specification</a><br>and this element should use that data when it is implemented in the<br>future.</p>
 * <p>If a message-url is provided then the message body will be ignored in<br>favor of the first method.</p>
 * <p>Thirdly, you can manually define the attributes on the element:</p>
 * <pre><code>&lt;platinum-push-messaging
 *   title=&quot;Application updated&quot;
 *   message=&quot;The application was updated in the background&quot;
 *   icon-url=&quot;icon.png&quot;
 *   click-url=&quot;notification.html&quot;&gt;
 * &lt;/platinum-push-messaging&gt;
 * </code></pre><p>These values will also be used as defaults if one of the other methods<br>does not provide a value for that property.</p>
 * <h1 id="testing">Testing</h1>
 * <p>If you have set up Google Cloud Messaging then you can send push messages<br>to your browser by following the guide in the <a href="https://developer.android.com/google/gcm/http.html">GCM documentation</a>.</p>
 * <p>However, for quick client testing there are two options. You can use the<br><code>testPush</code> method, which allows you to simulate a push message that<br>includes a payload.</p>
 * <p>Or, at a lower level, you can open up chrome://serviceworker-internals in<br>Chrome and use the ‘Push’ button for the service worker corresponding to<br>your app.</p>
 */
@JsType(isNative=true)
public interface PlatinumPushMessagingElement extends HTMLElement {

    @JsOverlay public static final String TAG = "platinum-push-messaging";
    @JsOverlay public static final String SRC = "platinum-push-messaging/platinum-push-messaging.html";


    /**
     * <p>If true then displaying the notification should not cause any<br>vibration or sound to be played.</p>
     *
     * JavaScript Info:
     * @property silent
     * @type Boolean
     * 
     */
    @JsProperty boolean getSilent();
    /**
     * <p>If true then displaying the notification should not cause any<br>vibration or sound to be played.</p>
     *
     * JavaScript Info:
     * @property silent
     * @type Boolean
     * 
     */
    @JsProperty void setSilent(boolean value);

    /**
     * <p>The details of the current push subscription, if any.</p>
     *
     * JavaScript Info:
     * @property subscription
     * @type PushSubscription
     * 
     */
    @JsProperty JavaScriptObject getSubscription();
    /**
     * <p>The details of the current push subscription, if any.</p>
     *
     * JavaScript Info:
     * @property subscription
     * @type PushSubscription
     * 
     */
    @JsProperty void setSubscription(JavaScriptObject value);

    /**
     * <p>When a notification is displayed that has the same <code>tag</code> as an<br>existing notification, the existing one will be replaced. If this<br>flag is true then such a replacement will cause the user to be<br>alerted as though it were a new notification, by vibration or sound<br>as appropriate.</p>
     *
     * JavaScript Info:
     * @property renotify
     * @type Boolean
     * 
     */
    @JsProperty boolean getRenotify();
    /**
     * <p>When a notification is displayed that has the same <code>tag</code> as an<br>existing notification, the existing one will be replaced. If this<br>flag is true then such a replacement will cause the user to be<br>alerted as though it were a new notification, by vibration or sound<br>as appropriate.</p>
     *
     * JavaScript Info:
     * @property renotify
     * @type Boolean
     * 
     */
    @JsProperty void setRenotify(boolean value);

    /**
     * <p>If true then the notification should be sticky, meaning that it is<br>not directly dismissable.</p>
     *
     * JavaScript Info:
     * @property sticky
     * @type Boolean
     * 
     */
    @JsProperty boolean getSticky();
    /**
     * <p>If true then the notification should be sticky, meaning that it is<br>not directly dismissable.</p>
     *
     * JavaScript Info:
     * @property sticky
     * @type Boolean
     * 
     */
    @JsProperty void setSticky(boolean value);

    /**
     * <p>Indicates the status of the element. If true, push messages will be<br>received.</p>
     *
     * JavaScript Info:
     * @property enabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getEnabled();
    /**
     * <p>Indicates the status of the element. If true, push messages will be<br>received.</p>
     *
     * JavaScript Info:
     * @property enabled
     * @type Boolean
     * 
     */
    @JsProperty void setEnabled(boolean value);

    /**
     * <p>Indicates whether the Push and Notification APIs are supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    @JsProperty boolean getSupported();
    /**
     * <p>Indicates whether the Push and Notification APIs are supported by<br>this browser.</p>
     *
     * JavaScript Info:
     * @property supported
     * @type Boolean
     * 
     */
    @JsProperty void setSupported(boolean value);

    /**
     * <p>If true then displaying the notification should not turn the device’s<br>screen on.</p>
     *
     * JavaScript Info:
     * @property noscreen
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoscreen();
    /**
     * <p>If true then displaying the notification should not turn the device’s<br>screen on.</p>
     *
     * JavaScript Info:
     * @property noscreen
     * @type Boolean
     * 
     */
    @JsProperty void setNoscreen(boolean value);

    /**
     * <p>The pattern of vibration that should be used by default when a<br>notification is displayed. See</p>
     *
     * JavaScript Info:
     * @property vibrate
     * @type Array
     * 
     */
    @JsProperty JsArray getVibrate();
    /**
     * <p>The pattern of vibration that should be used by default when a<br>notification is displayed. See</p>
     *
     * JavaScript Info:
     * @property vibrate
     * @type Array
     * 
     */
    @JsProperty void setVibrate(JsArray value);

    /**
     * <p>The URL of a default icon for notifications.</p>
     *
     * JavaScript Info:
     * @property iconUrl
     * @type string
     * 
     */
    @JsProperty String getIconUrl();
    /**
     * <p>The URL of a default icon for notifications.</p>
     *
     * JavaScript Info:
     * @property iconUrl
     * @type string
     * 
     */
    @JsProperty void setIconUrl(String value);

    /**
     * <p>The URL of a default sound file to play when a notification is shown.</p>
     *
     * JavaScript Info:
     * @property sound
     * @type string
     * 
     */
    @JsProperty String getSound();
    /**
     * <p>The URL of a default sound file to play when a notification is shown.</p>
     *
     * JavaScript Info:
     * @property sound
     * @type string
     * 
     */
    @JsProperty void setSound(String value);

    /**
     * <p>The default language to assume for the title and body of the<br>notification. If set this must be a valid<br><a href="https://tools.ietf.org/html/bcp47">BCP 47</a> language tag.</p>
     *
     * JavaScript Info:
     * @property lang
     * @type string
     * 
     */
    @JsProperty String getLang();
    /**
     * <p>The default language to assume for the title and body of the<br>notification. If set this must be a valid<br><a href="https://tools.ietf.org/html/bcp47">BCP 47</a> language tag.</p>
     *
     * JavaScript Info:
     * @property lang
     * @type string
     * 
     */
    @JsProperty void setLang(String value);

    /**
     * <p>The default notification message.</p>
     *
     * JavaScript Info:
     * @property message
     * @type string
     * 
     */
    @JsProperty String getMessage();
    /**
     * <p>The default notification message.</p>
     *
     * JavaScript Info:
     * @property message
     * @type string
     * 
     */
    @JsProperty void setMessage(String value);

    /**
     * <p>A URL from which message information can be retrieved.</p>
     * <p>When a push event happens that does not contain a message body this<br>URL will be fetched. The document will be parsed as JSON, and should<br>result in an object.</p>
     * <p>The valid keys for the object are <code>title</code>, <code>message</code>, <code>url</code>, <code>icon</code>,<br><code>tag</code>, <code>dir</code>, <code>lang</code>, <code>noscreen</code>, <code>renotify</code>, <code>silent</code>, <code>sound</code>,<br><code>sticky</code> and <code>vibrate</code>. For documentation of these values see the<br>attributes of the same names, except that these values override the<br>element attributes.</p>
     *
     * JavaScript Info:
     * @property messageUrl
     * @type string
     * 
     */
    @JsProperty String getMessageUrl();
    /**
     * <p>A URL from which message information can be retrieved.</p>
     * <p>When a push event happens that does not contain a message body this<br>URL will be fetched. The document will be parsed as JSON, and should<br>result in an object.</p>
     * <p>The valid keys for the object are <code>title</code>, <code>message</code>, <code>url</code>, <code>icon</code>,<br><code>tag</code>, <code>dir</code>, <code>lang</code>, <code>noscreen</code>, <code>renotify</code>, <code>silent</code>, <code>sound</code>,<br><code>sticky</code> and <code>vibrate</code>. For documentation of these values see the<br>attributes of the same names, except that these values override the<br>element attributes.</p>
     *
     * JavaScript Info:
     * @property messageUrl
     * @type string
     * 
     */
    @JsProperty void setMessageUrl(String value);

    /**
     * <p>A default tag for the notifications that will be generated by<br>this element. Notifications with the same tag will overwrite one<br>another, so that only one will be shown at once.</p>
     *
     * JavaScript Info:
     * @property tag
     * @type string
     * 
     */
    @JsProperty String getTag();
    /**
     * <p>A default tag for the notifications that will be generated by<br>this element. Notifications with the same tag will overwrite one<br>another, so that only one will be shown at once.</p>
     *
     * JavaScript Info:
     * @property tag
     * @type string
     * 
     */
    @JsProperty void setTag(String value);

    /**
     * <p>The default URL to display when a notification is clicked.</p>
     *
     * JavaScript Info:
     * @property clickUrl
     * @type String
     * 
     */
    @JsProperty String getClickUrl();
    /**
     * <p>The default URL to display when a notification is clicked.</p>
     *
     * JavaScript Info:
     * @property clickUrl
     * @type String
     * 
     */
    @JsProperty void setClickUrl(String value);

    /**
     * <p>The default notification title.</p>
     *
     * JavaScript Info:
     * @property title
     * @type string
     * 
     */
    @JsProperty String getTitle();
    /**
     * <p>The default notification title.</p>
     *
     * JavaScript Info:
     * @property title
     * @type string
     * 
     */
    @JsProperty void setTitle(String value);

    /**
     * <p>The default text direction for the title and body of the<br>notification. Can be <code>auto</code>, <code>ltr</code> or <code>rtl</code>.</p>
     *
     * JavaScript Info:
     * @property dir
     * @type String
     * 
     */
    @JsProperty String getDir();
    /**
     * <p>The default text direction for the title and body of the<br>notification. Can be <code>auto</code>, <code>ltr</code> or <code>rtl</code>.</p>
     *
     * JavaScript Info:
     * @property dir
     * @type String
     * 
     */
    @JsProperty void setDir(String value);

    /**
     * <p>The location of the service worker script required by the element.<br>The script is distributed alongside the main HTML import file for the<br>element, so the location can normally be determined automatically.<br>However, if you vulcanize your project you will need to include the<br>script in your built project manually and use this property to let<br>the element know how to load it.</p>
     *
     * JavaScript Info:
     * @property workerUrl
     * @type String
     * 
     */
    @JsProperty String getWorkerUrl();
    /**
     * <p>The location of the service worker script required by the element.<br>The script is distributed alongside the main HTML import file for the<br>element, so the location can normally be determined automatically.<br>However, if you vulcanize your project you will need to include the<br>script in your built project manually and use this property to let<br>the element know how to load it.</p>
     *
     * JavaScript Info:
     * @property workerUrl
     * @type String
     * 
     */
    @JsProperty void setWorkerUrl(String value);


    /**
     * <p>Programmatically trigger a push message</p>
     *
     * JavaScript Info:
     * @method testPush
     * @param {} message  
     * 
     * 
     */
    void testPush(Object message);

    /**
     * <p>Request push messaging to be disabled.</p>
     *
     * JavaScript Info:
     * @method disable
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject disable();

    /**
     * <p>Request push messaging to be enabled.</p>
     *
     * JavaScript Info:
     * @method enable
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject enable();

}
