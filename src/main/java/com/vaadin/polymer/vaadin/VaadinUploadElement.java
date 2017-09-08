/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>&lt;vaadin-upload&gt;</code> is a Polymer element for uploading multiple files with drag and drop support.</p>
 * <p>Example:</p>
 * <pre><code class="lang-html">&lt;vaadin-upload&gt;&lt;/vaadin-upload&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling the component.</p>
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
 * <td><code>--vaadin-upload-drag-ripple</code></td>
 * <td>A mixin that is applied to the ripple animation in the drop area</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-drop-label</code></td>
 * <td>A mixin that is applied to the drop label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-drop-label-dragover</code></td>
 * <td>A mixin that is applied to the drop label when overing the component with files</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-drop-label-icon</code></td>
 * <td>A mixin that is applied to the drop icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-list</code></td>
 * <td>A mixin that is applied to the file list</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-buttons</code></td>
 * <td>A mixin that is applied to the buttons container</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-buttons-primary</code></td>
 * <td>A mixin that is applied to the primary buttons container (left side)</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-buttons-secondary</code></td>
 * <td>A mixin that is applied to the secondary buttons container (right side)</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-button-add</code></td>
 * <td>A mixin that is applied to the upload button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-button-add-disabled</code></td>
 * <td>A mixin that is applied to the upload button when <code>maxFiles</code> limit is reached</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface VaadinUploadElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-upload";
    @JsOverlay public static final String SRC = "vaadin-upload/vaadin-upload.html";


    /**
     * <p>Key-Value map to send to the server. If you set this property as an<br>attribute, use a valid JSON string, for example:</p>
     * <pre><code>&lt;vaadin-upload headers=&#39;{&quot;X-Foo&quot;: &quot;Bar&quot;}&#39;&gt;&lt;/vaadin-upload&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHeaders();
    /**
     * <p>Key-Value map to send to the server. If you set this property as an<br>attribute, use a valid JSON string, for example:</p>
     * <pre><code>&lt;vaadin-upload headers=&#39;{&quot;X-Foo&quot;: &quot;Bar&quot;}&#39;&gt;&lt;/vaadin-upload&gt;
     * </code></pre>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty void setHeaders(JavaScriptObject value);

    /**
     * <p>The object used to localize this component.<br>For changing the default localization, change the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   dropFiles: {
     *    one: &#39;Drop file here...&#39;,
     *    many: &#39;Drop files here...&#39;
     *   },
     *   addFiles: {
     *    one: &#39;Select File&#39;,
     *    many: &#39;Upload Files&#39;
     *   },
     *   cancel: &#39;Cancel&#39;,
     *   error: {
     *    tooManyFiles: &#39;Too Many Files.&#39;,
     *    fileIsTooBig: &#39;File is Too Big.&#39;,
     *    incorrectFileType: &#39;Incorrect File Type.&#39;
     *   },
     *   uploading: {
     *    status: {
     *      connecting: &#39;Connecting...&#39;,
     *      stalled: &#39;Stalled.&#39;,
     *      processing: &#39;Processing File...&#39;
     *    },
     *    remainingTime: {
     *      prefix: &#39;remaining time: &#39;,
     *      unknown: &#39;unknown remaining time&#39;
     *    },
     *    error: {
     *      serverUnavailable: &#39;Server Unavailable&#39;,
     *      unexpectedServerError: &#39;Unexpected Server Error&#39;,
     *      forbidden: &#39;Forbidden&#39;
     *    }
     *   },
     *   units: {
     *    size: [&#39;B&#39;, &#39;kB&#39;, &#39;MB&#39;, &#39;GB&#39;, &#39;TB&#39;, &#39;PB&#39;, &#39;EB&#39;, &#39;ZB&#39;, &#39;YB&#39;]
     *   },
     *   formatSize: function(bytes) {
     *    // returns the size followed by the best suitable unit
     *   },
     *   formatTime: function(seconds, [secs, mins, hours]) {
     *    // returns a &#39;HH:MM:SS&#39; string
     *   }
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getI18n();
    /**
     * <p>The object used to localize this component.<br>For changing the default localization, change the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   dropFiles: {
     *    one: &#39;Drop file here...&#39;,
     *    many: &#39;Drop files here...&#39;
     *   },
     *   addFiles: {
     *    one: &#39;Select File&#39;,
     *    many: &#39;Upload Files&#39;
     *   },
     *   cancel: &#39;Cancel&#39;,
     *   error: {
     *    tooManyFiles: &#39;Too Many Files.&#39;,
     *    fileIsTooBig: &#39;File is Too Big.&#39;,
     *    incorrectFileType: &#39;Incorrect File Type.&#39;
     *   },
     *   uploading: {
     *    status: {
     *      connecting: &#39;Connecting...&#39;,
     *      stalled: &#39;Stalled.&#39;,
     *      processing: &#39;Processing File...&#39;
     *    },
     *    remainingTime: {
     *      prefix: &#39;remaining time: &#39;,
     *      unknown: &#39;unknown remaining time&#39;
     *    },
     *    error: {
     *      serverUnavailable: &#39;Server Unavailable&#39;,
     *      unexpectedServerError: &#39;Unexpected Server Error&#39;,
     *      forbidden: &#39;Forbidden&#39;
     *    }
     *   },
     *   units: {
     *    size: [&#39;B&#39;, &#39;kB&#39;, &#39;MB&#39;, &#39;GB&#39;, &#39;TB&#39;, &#39;PB&#39;, &#39;EB&#39;, &#39;ZB&#39;, &#39;YB&#39;]
     *   },
     *   formatSize: function(bytes) {
     *    // returns the size followed by the best suitable unit
     *   },
     *   formatTime: function(seconds, [secs, mins, hours]) {
     *    // returns a &#39;HH:MM:SS&#39; string
     *   }
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty void setI18n(JavaScriptObject value);

    /**
     * <p>The array of files being processed, or already uploaded.</p>
     * <p>Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a><br>object with a number of extra properties  to track the upload process:</p>
     * <ul>
     * <li><code>uploadTarget</code>: The target URL used to upload this file.</li>
     * <li><code>elapsed</code>: Elapsed time since the upload started.</li>
     * <li><code>elapsedStr</code>: Human-readable elapsed time.</li>
     * <li><code>remaining</code>: Number of seconds remaining for the upload to finish.</li>
     * <li><code>remainingStr</code>: Human-readable remaining time for the upload to finish.</li>
     * <li><code>progress</code>: Percentage of the file already uploaded.</li>
     * <li><code>speed</code>: Upload speed in kB/s.</li>
     * <li><code>size</code>: File size in bytes.</li>
     * <li><code>totalStr</code>: Human-readable total size of the file.</li>
     * <li><code>loaded</code>: Bytes transferred so far.</li>
     * <li><code>loadedStr</code>: Human-readable uploaded size at the moment.</li>
     * <li><code>status</code>: Status of the upload process.</li>
     * <li><code>error</code>: Error message in case the upload failed.</li>
     * <li><code>abort</code>: True if the file was canceled by the user.</li>
     * <li><code>complete</code>: True when the file was transferred to the server.</li>
     * <li><code>uploading</code>: True while trasferring data to the server.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property files
     * @type Array
     * 
     */
    @JsProperty JsArray getFiles();
    /**
     * <p>The array of files being processed, or already uploaded.</p>
     * <p>Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a><br>object with a number of extra properties  to track the upload process:</p>
     * <ul>
     * <li><code>uploadTarget</code>: The target URL used to upload this file.</li>
     * <li><code>elapsed</code>: Elapsed time since the upload started.</li>
     * <li><code>elapsedStr</code>: Human-readable elapsed time.</li>
     * <li><code>remaining</code>: Number of seconds remaining for the upload to finish.</li>
     * <li><code>remainingStr</code>: Human-readable remaining time for the upload to finish.</li>
     * <li><code>progress</code>: Percentage of the file already uploaded.</li>
     * <li><code>speed</code>: Upload speed in kB/s.</li>
     * <li><code>size</code>: File size in bytes.</li>
     * <li><code>totalStr</code>: Human-readable total size of the file.</li>
     * <li><code>loaded</code>: Bytes transferred so far.</li>
     * <li><code>loadedStr</code>: Human-readable uploaded size at the moment.</li>
     * <li><code>status</code>: Status of the upload process.</li>
     * <li><code>error</code>: Error message in case the upload failed.</li>
     * <li><code>abort</code>: True if the file was canceled by the user.</li>
     * <li><code>complete</code>: True when the file was transferred to the server.</li>
     * <li><code>uploading</code>: True while trasferring data to the server.</li>
     * </ul>
     *
     * JavaScript Info:
     * @property files
     * @type Array
     * 
     */
    @JsProperty void setFiles(JsArray value);

    /**
     * <p>Define whether the element supports dropping files on it for uploading.<br>By default it’s enabled in desktop and disabled in touch devices<br>because mobile devices do not support drag events in general. Setting<br>it false means that drop is enabled even in touch-devices, and true<br>disables drop in all devices.</p>
     *
     * JavaScript Info:
     * @property nodrop
     * @type Boolean
     * 
     */
    @JsProperty boolean getNodrop();
    /**
     * <p>Define whether the element supports dropping files on it for uploading.<br>By default it’s enabled in desktop and disabled in touch devices<br>because mobile devices do not support drag events in general. Setting<br>it false means that drop is enabled even in touch-devices, and true<br>disables drop in all devices.</p>
     *
     * JavaScript Info:
     * @property nodrop
     * @type Boolean
     * 
     */
    @JsProperty void setNodrop(boolean value);

    /**
     * <p>Specifies the maximum file size in bytes allowed to upload.<br>Notice that it is a client-side constraint, which will be checked before<br>sending the request. Obviously you need to do the same validation in<br>the server-side and be sure that they are aligned.</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    @JsProperty double getMaxFileSize();
    /**
     * <p>Specifies the maximum file size in bytes allowed to upload.<br>Notice that it is a client-side constraint, which will be checked before<br>sending the request. Obviously you need to do the same validation in<br>the server-side and be sure that they are aligned.</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    @JsProperty void setMaxFileSize(double value);

    /**
     * <p>Limit of files to upload, by default it is unlimited. If the value is<br>set to one, native file browser will prevent selecting multiple files.</p>
     *
     * JavaScript Info:
     * @property maxFiles
     * @type Number
     * 
     */
    @JsProperty double getMaxFiles();
    /**
     * <p>Limit of files to upload, by default it is unlimited. If the value is<br>set to one, native file browser will prevent selecting multiple files.</p>
     *
     * JavaScript Info:
     * @property maxFiles
     * @type Number
     * 
     */
    @JsProperty void setMaxFiles(double value);

    /**
     * <p>Max time in milliseconds for the entire upload process, if exceeded the<br>request will be aborted. Zero means that there is no timeout.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    @JsProperty double getTimeout();
    /**
     * <p>Max time in milliseconds for the entire upload process, if exceeded the<br>request will be aborted. Zero means that there is no timeout.</p>
     *
     * JavaScript Info:
     * @property timeout
     * @type Number
     * 
     */
    @JsProperty void setTimeout(double value);

    /**
     * <p>HTTP Method used to send the files. Only POST and PUT are allowed.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty String getMethod();
    /**
     * <p>HTTP Method used to send the files. Only POST and PUT are allowed.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty void setMethod(String value);

    /**
     * <p>The server URL. The default value is an empty string, which means that<br><em>window.location</em> will be used.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty String getTarget();
    /**
     * <p>The server URL. The default value is an empty string, which means that<br><em>window.location</em> will be used.</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty void setTarget(String value);

    /**
     * <p>Specifies the ‘name’ property at Content-Disposition</p>
     *
     * JavaScript Info:
     * @property formDataName
     * @type String
     * 
     */
    @JsProperty String getFormDataName();
    /**
     * <p>Specifies the ‘name’ property at Content-Disposition</p>
     *
     * JavaScript Info:
     * @property formDataName
     * @type String
     * 
     */
    @JsProperty void setFormDataName(String value);

    /**
     * <p>Specifies the types of files that the server accepts.<br>Syntax: a comma-separated list of MIME type patterns (wildcards are<br>allowed) or file extensions.<br>Notice that MIME types are widely supported, while file extensions<br>are only implemented in certain browsers, so avoid using it.<br>Example: accept=”video/*,image/tiff” or accept=”.pdf,audio/mp3”</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty String getAccept();
    /**
     * <p>Specifies the types of files that the server accepts.<br>Syntax: a comma-separated list of MIME type patterns (wildcards are<br>allowed) or file extensions.<br>Notice that MIME types are widely supported, while file extensions<br>are only implemented in certain browsers, so avoid using it.<br>Example: accept=”video/*,image/tiff” or accept=”.pdf,audio/mp3”</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * 
     */
    @JsProperty void setAccept(String value);


}
